# Software Engineer Challenge (Backend)

Build an API to calculate shortest driving path and estimated driving time to visit all specified locations, starting from the first in the list.  
Note that we expect shortest **driving** distance (and estimated travel time), so you may want to use [Google Maps API](https://developers.google.com/maps/)  

**Prefered languages** (you are **not** required to pick from them):
 - Node.js
 - PHP

**Solution requirements:**
 - Source code must be stored in git repository (you can send it as github or bitbucket link, dropbox/google drive public folder, etc. **NOTE: email servers will reject .zip files with source code**)
 - For public repos avoid words `lalamove` and `challenge` to prevent other candidates from finding your solution
 - Blackbox. Must build/run in Docker container(s). `docker-compose.yml` must be provided
 - Must be asynchronous
 - Must be horizontally scalable
 - There is no specific requirements regarding documentation, architecture, etc. but **we expect your solution to be production ready**

**Task:**

Implement the following HTTP endpoints:

- [POST `/route`: Submit start point and drop-off locations](#submit-start-point-and-drop-off-locations)
- [GET `/route/<TOKEN>`: Get shortest driving route](#get-shortest-driving-route)

### Submit start point and drop-off locations

Method:  
 - `POST`

URL path:  
 - `/route`

Input body:  

```json
[
	["ROUTE_START_LATITUDE", "ROUTE_START_LONGITUDE"],
	["DROPOFF_LATITUDE_#1", "DROPOFF_LONGITUDE_#1"],
	...
]
```

Response body:  
 - `HTTP code 200`  

```json
{ "token": "TOKEN" }
```

or

```json
{ "error": "ERROR_DESCRIPTION" }
```

---

Input body example:

```json
[
	["22.372081", "114.107877"],
	["22.284419", "114.159510"],
	["22.326442", "114.167811"]
]
```

Response example:

```json
{ "token": "9d3503e0-7236-4e47-a62f-8b01b5646c16" }
```

### Get shortest driving route
Get shortest driving route for submitted locations (sequence of `[lat, lon]` values starting from start location resulting in shortest path)

Method:  
- `GET`

URL path:  
- `/route/<TOKEN>`

Response body:  
- HTTP 200  

```json
{
	"status": "success",
	"path": [
		["ROUTE_START_LATITUDE", "ROUTE_START_LONGITUDE"],
		["DROPOFF_LATITUDE_#1", "DROPOFF_LONGITUDE_#1"],
		...
	],
	"total_distance": DRIVING_DISTANCE_IN_METERS,
	"total_time": ESTIMATED_DRIVING_TIME_IN_SECONDS
}
```  
or  

```json
{
	"status": "in progress"
}
```  
or  

```json
{
	"status": "failure",
	"error": "ERROR_DESCRIPTION"
}
```

---

URL example:  
 - `/route/9d3503e0-7236-4e47-a62f-8b01b5646c16`

Response example:  
```json
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

**Questions? We love to answer: <techchallenge@lalamove.com>**
