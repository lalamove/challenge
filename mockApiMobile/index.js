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

function delay(sec) {
	return new Promise(r => setTimeout(r, sec * 1000))
}

router.get('/deliveries', function* () {
	yield delay(getRandomInt(0, 5))
	if (!getRandomInt(0, 4)) {
		this.status = 500
		return
	}

	this.body = [
		{
			description: 'Deliver documents to Andrio',
			imageUrl: 'https://www.what-dog.net/Images/faces2/scroll0015.jpg',
			location: {
				lat: 22.336093,
				lng: 114.155288,
				address: 'Cheung Sha Wan'
			}
		}, {
			description: 'Deliver parcel to Leviero',
			imageUrl: 'http://www.memoryandjustice.org/wp-content/uploads/2017/10/impossibly-cute-puppy-8.jpg',
			location: {
				lat: 22.319181,
				lng: 114.170008,
				address: 'Mong Kok'
			}
		}, {
			description: 'Deliver documents to Andrio',
			imageUrl: 'https://www.what-dog.net/Images/faces2/scroll0015.jpg',
			location: {
				lat: 22.336093,
				lng: 114.155288,
				address: 'Cheung Sha Wan'
			}
		}, {
			description: 'Deliver parcel to Leviero',
			imageUrl: 'http://www.memoryandjustice.org/wp-content/uploads/2017/10/impossibly-cute-puppy-8.jpg',
			location: {
				lat: 22.319181,
				lng: 114.170008,
				address: 'Mong Kok'
			}
		}, {
			description: 'Deliver documents to Andrio',
			imageUrl: 'https://www.what-dog.net/Images/faces2/scroll0015.jpg',
			location: {
				lat: 22.336093,
				lng: 114.155288,
				address: 'Cheung Sha Wan'
			}
		}, {
			description: 'Deliver parcel to Leviero',
			imageUrl: 'http://www.memoryandjustice.org/wp-content/uploads/2017/10/impossibly-cute-puppy-8.jpg',
			location: {
				lat: 22.319181,
				lng: 114.170008,
				address: 'Mong Kok'
			}
		}, {
			description: 'Deliver documents to Andrio',
			imageUrl: 'https://www.what-dog.net/Images/faces2/scroll0015.jpg',
			location: {
				lat: 22.336093,
				lng: 114.155288,
				address: 'Cheung Sha Wan'
			}
		}, {
			description: 'Deliver parcel to Leviero',
			imageUrl: 'http://www.memoryandjustice.org/wp-content/uploads/2017/10/impossibly-cute-puppy-8.jpg',
			location: {
				lat: 22.319181,
				lng: 114.170008,
				address: 'Mong Kok'
			}
		}, {
			description: 'Deliver documents to Andrio',
			imageUrl: 'https://www.what-dog.net/Images/faces2/scroll0015.jpg',
			location: {
				lat: 22.336093,
				lng: 114.155288,
				address: 'Cheung Sha Wan'
			}
		}, {
			description: 'Deliver parcel to Leviero',
			imageUrl: 'http://www.memoryandjustice.org/wp-content/uploads/2017/10/impossibly-cute-puppy-8.jpg',
			location: {
				lat: 22.319181,
				lng: 114.170008,
				address: 'Mong Kok'
			}
		}, {
			description: 'Deliver documents to Andrio',
			imageUrl: 'https://www.what-dog.net/Images/faces2/scroll0015.jpg',
			location: {
				lat: 22.336093,
				lng: 114.155288,
				address: 'Cheung Sha Wan'
			}
		}, {
			description: 'Deliver parcel to Leviero',
			imageUrl: 'http://www.memoryandjustice.org/wp-content/uploads/2017/10/impossibly-cute-puppy-8.jpg',
			location: {
				lat: 22.319181,
				lng: 114.170008,
				address: 'Mong Kok'
			}
		}, {
			description: 'Deliver documents to Andrio',
			imageUrl: 'https://www.what-dog.net/Images/faces2/scroll0015.jpg',
			location: {
				lat: 22.336093,
				lng: 114.155288,
				address: 'Cheung Sha Wan'
			}
		}, {
			description: 'Deliver parcel to Leviero',
			imageUrl: 'http://www.memoryandjustice.org/wp-content/uploads/2017/10/impossibly-cute-puppy-8.jpg',
			location: {
				lat: 22.319181,
				lng: 114.170008,
				address: 'Mong Kok'
			}
		}, {
			description: 'Deliver documents to Andrio',
			imageUrl: 'https://www.what-dog.net/Images/faces2/scroll0015.jpg',
			location: {
				lat: 22.336093,
				lng: 114.155288,
				address: 'Cheung Sha Wan'
			}
		}, {
			description: 'Deliver parcel to Leviero',
			imageUrl: 'http://www.memoryandjustice.org/wp-content/uploads/2017/10/impossibly-cute-puppy-8.jpg',
			location: {
				lat: 22.319181,
				lng: 114.170008,
				address: 'Mong Kok'
			}
		}, {
			description: 'Deliver documents to Andrio',
			imageUrl: 'https://www.what-dog.net/Images/faces2/scroll0015.jpg',
			location: {
				lat: 22.336093,
				lng: 114.155288,
				address: 'Cheung Sha Wan'
			}
		}, {
			description: 'Deliver parcel to Leviero',
			imageUrl: 'http://www.memoryandjustice.org/wp-content/uploads/2017/10/impossibly-cute-puppy-8.jpg',
			location: {
				lat: 22.319181,
				lng: 114.170008,
				address: 'Mong Kok'
			}
		}, {
			description: 'Deliver documents to Andrio',
			imageUrl: 'https://www.what-dog.net/Images/faces2/scroll0015.jpg',
			location: {
				lat: 22.336093,
				lng: 114.155288,
				address: 'Cheung Sha Wan'
			}
		}, {
			description: 'Deliver parcel to Leviero',
			imageUrl: 'http://www.memoryandjustice.org/wp-content/uploads/2017/10/impossibly-cute-puppy-8.jpg',
			location: {
				lat: 22.319181,
				lng: 114.170008,
				address: 'Mong Kok'
			}
		}
	]
})
 
app
	.use(logger())
	.use(cors())
	.use(router.routes())
	.use(router.allowedMethods())

app.listen(8080)
console.log('Mock server started at port 8080')
