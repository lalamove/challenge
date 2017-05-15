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

router.post('/route', function* () {
	yield delay(getRandomInt(0, 5))
	if (!getRandomInt(0, 4)) {
		this.status = 500
		return
	}

	this.body = {
		"token": "9d3503e0-7236-4e47-a62f-8b01b5646c16"
	}
})

router.get('/route/:token', function* () {
	yield delay(getRandomInt(0, 5))
	const dice = getRandomInt(0, 4)
	if (!dice) {
		this.status = 500
		return
	}

	if (dice === 1) {
		this.body = {
			status: 'in progress'
		}
		return
	}

	if (dice === 2) {
		this.body = {
			status: 'failure',
			error: 'Location not accessible by car'
		}
		return
	}

	this.body = {
		status: 'success',
		path: [
			["22.372081", "114.107877"],
			["22.326442", "114.167811"],
			["22.284419", "114.159510"]
		],
		total_distance: 20000,
		total_time: 1800
	}
})
 
app
	.use(logger())
	.use(cors())
	.use(router.routes())
	.use(router.allowedMethods())

app.listen(8080)
console.log('Mock server started at port 8080')