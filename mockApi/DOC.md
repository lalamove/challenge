# Mock API Documentation

​
The Mock API is a stub backend for the Lalamove Frontend challenge, and served at [https://sg-mock-api.lalamove.com](https://sg-mock-api.lalamove.com).
You are welcome to boot it up in your local machine.
​

## APIs

​
The actual API you should integrate with Lalamove Frontend challenge.
​

### POST /route

​
Submit a routing request to the backend for processing.
​

```js
/**
 * @api {POST} /route
 * @apiParam {String} origin      Address of the pickup point.
 * @apiParam {String} destination Address of the drop-off point.
 *
 * @apiSuccess {String} token     Processing token to identify the routing request
 * @apiSuccessExample {json} Success Response
 *    HTTP/1.1 200 OK
 *    { "token": "9d3503e0-7236-4e47-a62f-8b01b5646c16" }
 *
 * @apiErrorExample {String} Error Response:
 *    HTTP/1.1 500 Internal Server Error
 *    Internal Server Error
 *
 * @apiExample {curl} Example Usage:
 *  curl --request POST \
      --header 'Content-Type: application/json' \
      --data '{"origin":"Innocentre, Hong Kong","destination":"Hong Kong International Airport Terminal 1"}' \
      --url https://sg-mock-api.lalamove.com/route
 * /
```

​

### GET /route/:token

​
Gets the route from the request identified by the processing token from `POST /route`.
​

```js
/**
 * @api {GET} /route/:token
 * @apiParam {String} token Refers to the processing token returned from the `/route` endpoint.
 *
 * @apiSuccess (Busy) {String} status Current status of the route request on the backend.
 * @apiSuccessExample (Busy) {json}
 *    HTTP/1.1 200 OK
 *    { "status": "in progress" }
 * @apiSuccess (Failure) {String} status Current status of the route request on the backend.
 * @apiSuccess (Failure) {String} error  Only exists if an error occurred. The error response from the backend.
 * @apiSuccessExample (Failure) {json}
 *    HTTP/1.1 200 OK
 *    {
 *      "status": "failure",
 *      "error": "Location not accessible by car"
 *    }
 * @apiSuccess (Success) {String} status         Current status of the route request on the backend.
 * @apiSuccess (Success) {Array[]} path          An array of sets of coordinates, where start point, end point also included in ascending order
 * @apiSuccess (Success) {String} path.0         latitude
 * @apiSuccess (Success) {String} path.1         longitude
 * @apiSuccess (Success) {Number} total_distance The distance. The unit is not important for this challenge.
 * @apiSuccess (Success) {Number} total_time     The total it takes to complete the journey. The unit is not important for this challenge.
 * @apiSuccessExample (Success) {json}
 *    HTTP/1.1 200 OK
 *    {
 *      "status": "success",
 *      "path": [
 *        ["22.372081", "114.107877"],
 *        ["22.326442", "114.167811"],
 *        ["22.284419", "114.159510"]
 *      ],
 *      "total_distance": 20000,
 *      "total_time": 1800
 *    }
 *
 * @apiErrorExample {String} Error Response:
 *    HTTP/1.1 500 Internal Server Error
 *    Internal Server Error
 *
 * @apiExample {curl} Example Usage:
 *  curl --request GET \
     --url https://sg-mock-api.lalamove.com/route/9d3503e0-7236-4e47-a62f-8b01b5646c16
 * /
```

​

## APIs (for testing purposes)

​
These are endpoints with deterministic responses to help with your development.
​

### POST /mock/route/500

```
HTTP/1.1 500 Internal Server Error
Internal Server Error
```

​

### POST /mock/route/success

```
HTTP/1.1 200 OK
{ "token": "9d3503e0-7236-4e47-a62f-8b01b5646c16" }
```

​

### GET /mock/route/500

```
HTTP/1.1 500 Internal Server Error
Internal Server Error
```

​

### GET /mock/route/inprogress

```
HTTP/1.1 200 OK
{ "status": "in progress" }
```

​

### GET /mock/route/failure

```
HTTP/1.1 200 OK
{
  "status": "failure",
  "error": "Location not accessible by car"
}
```

​

### GET /mock/route/success

```
HTTP/1.1 200 OK
{
  "status": "success",
  "path": [
    ["22.372081", "114.107877"],
    ["22.326442", "114.167811"],
    ["22.284419", "114.159510"]
  ],
  "total_distance": 20000,
  "total_time": 1800
}
```
