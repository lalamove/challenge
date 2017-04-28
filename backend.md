# Software Engineer Challenge (Backend)

Build an API to calculate shortest driving path to visit all specified locations, starting from the first in the list.

Implement following endpoints:

	- [POST `/route`: Submit start point and drop-off locations](#submit-start-point-and-drop-off-locations)
	- [GET `/route/<TOKEN>`: Get shortest driving route](#get-shortest-driving-route)

#### Submit start point and drop-off locations

<table>
	<tr>
		<th>Method</th>
		<td><code>POST</code></td>
	</tr>
	<tr>
		<th>URL path</th>
		<td><code>/route</code></td>
	</tr>
	<tr>
		<th>Input body</th>
		<td>
			<pre lang="js">
[
	["ROUTE_START_LATITUDE", "ROUTE_START_LONGITUDE"],
	["DROPOFF_LATITUDE_#1", "DROPOFF_LONGITUDE_#1"],
	...
]</pre>
		</td>
	</tr>
	<tr>
		<th>Response body</th>
		<td>
			HTTP code 200<br/>
			<pre lang="js">{ "token": "TOKEN" }</pre>
		</td>
	</tr>
</table>
	
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

<table>
	<tr>
		<th>Method</th>
		<td><code>GET</code></td>
	</tr>
	<tr>
		<th>URL path</th>
		<td><code>/route/TOKEN</code></td>
	</tr>
	<tr>
		<th>Response body</th>
		<td>
			HTTP 200<br>  
			<pre lang="js">
{
	"path": [
		["ROUTE_START_LATITUDE", "ROUTE_START_LONGITUDE"],
		["DROPOFF_LATITUDE_#1", "DROPOFF_LONGITUDE_#1"],
		...
	],
	"total_distance": DRIVING_DISTANCE_IN_METERS
	"total_time": ESTIMATED_DRIVING_TIME
}</pre><br/>
			or<br/>  
			<pre lang="js">
{
	"status": "in progress"
}</pre><br/>
			or<br/>
			<pre lang="js">
{
	"status": "failure"
	"error": "ERROR_DESCRIPTION"
}</pre>
		</td>
	</tr>
</table>

URL example: `/route/9d3503e0-7236-4e47-a62f-8b01b5646c16`  
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
