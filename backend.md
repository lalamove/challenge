# Software Engineer Challenge (Backend)

Build an API to calculate shortest driving path to visit all specified locations, starting from the first in the list.

Implement following endpoints:

- [POST `/route`: Submit start point and drop-off locations](#submit-start-point-and-drop-off-locations)
- [GET `/route/<TOKEN>`: Get shortest driving route](#get-shortest-driving-route)

#### Submit start point and drop-off locations

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

#### Get shortest driving route
Get shortest driving route for submitted locations (sequence of `[lat, lon]` values starting from start location resulting in shortest path)

Method:  
- `GET`

URL path:  
- `/route/<TOKEN>`

Response body:  
- HTTP 200  

```json
    {
    	"path": [
    		["ROUTE_START_LATITUDE", "ROUTE_START_LONGITUDE"],
    		["DROPOFF_LATITUDE_#1", "DROPOFF_LONGITUDE_#1"],
    		...
    	],
    	"total_distance": DRIVING_DISTANCE_IN_METERS,
    	"total_time": ESTIMATED_DRIVING_TIME
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
    	"path": [
    		["22.372081", "114.107877"],
    		["22.326442", "114.167811"],
    		["22.284419", "114.159510"]
    	],
    	"total_distance": 20000,
    	"total_time": 1800
    }
```
