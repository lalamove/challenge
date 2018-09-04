'use strict'
const app = require('koa')()
const cors = require('koa-cors')
const logger = require('koa-logger')
const router = require('koa-router')()

// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/random#Getting_a_random_integer_between_two_values
function getRandomInt(min, max) {
	min = Math.ceil(min);
	max = Math.floor(max);
	return Math.floor(Math.random() * (max - min)) + min;
}

function getRandomDeliveryLocation() {
    let locs = [
        { lat: 22.319181, lng: 114.170008, address: 'Mong Kok' },
        { lat: 22.336093, lng: 114.155288, address: 'Cheung Sha Wan' },
        { lat: 22.335538, lng: 114.176169, address: 'Kowloon Tong' }
    ]

    return locs[ getRandomInt( 0, locs.length ) ]
}

function getRandomDeliveryDescription( index ) {
    if ( index % 3 === 0 ) {
        return 'Deliver documents to Andrio'
    }

    let desp = [
        'Deliver documents to Andrio',
        'Deliver parcel to Leviero',
        'Deliver pets to Alan',
        'Deliver food to Eric',
        'Deliver wine to Kenneth',
        'Deliver toys to Luqman'
    ]
    return desp[ getRandomInt( 0, desp.length ) ]
}

function getRandomDeliveryItem( index ) {
    return {
            id: index,
			description: getRandomDeliveryDescription( index ),
		    imageUrl: 'https://s3-ap-southeast-1.amazonaws.com/lalamove-mock-api/images/pet-' + getRandomInt( 0, 9 ) + '.jpeg',
			location: getRandomDeliveryLocation()
    }
}

function delay(sec) {
	return new Promise(r => setTimeout(r, sec * 1000))
}

router.get('/deliveries', function* () {

    let cap = 70
    let offset = parseInt( this.query.offset, 10 )
    let limit = parseInt( this.query.limit, 10 )
    if ( isNaN( offset ) || isNaN( limit ) || offset < 0 || limit < 0 ) {
        this.status = 400
        return
    }

	yield delay(getRandomInt(0, 5))
	if (!getRandomInt(0, 9)) {
		this.status = 500
		return
	}

    this.body = []
    for ( let i = offset; i < offset + limit && i < cap; i++ ) {
        this.body.push( getRandomDeliveryItem( i ) )
    }

})
 
app
	.use(logger())
	.use(cors())
	.use(router.routes())
	.use(router.allowedMethods())

app.listen(8080)
console.log('Mock server started at port 8080')
