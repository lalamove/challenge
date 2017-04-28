# Software Enginner Challenge (Backend)

Build an API to calculate shortest driving path to visit all specified locations, starting from the first in the list.
Implement following endpoints:

1. Submit start point and drop-off locations

<table>
	<tr>
		<th>Method</th>
		<td>`POST`</td>
	</tr>
	<tr>
		<th>URL path</th>
		<td>`/locations`</td>
	</tr>
	<tr>
		<th>Input body</th>
		<td>
			```json
				[
					[<route start latitude>, <route start longitude>],
					[<drop-off #1 latitude>, <drop-off #1 longitude>],
					...
				]
			```
		</td>
	</tr>
	<tr>
		<th>Response body</th>
		<td>
			HTTP code 200  
			```json
				{ "request_token": <token> }
			```
		</td>
	</tr>
</table>
	
Input body example:
```json
	[
		['22.372081', '114.107877'],
		['22.284419', '114.159510'],
		['22.326442', '114.167811']
	]
```
Response example:
```json
	{ request_token: '9d3503e0-7236-4e47-a62f-8b01b5646c16' }
```

2. Get shortest driving route for submitted locations (sequence of [lat, lon] values starting from start location resulting in shortest location)

<table>
	<tr>
		<th>Method</th>
		<td>`GET`</td>
	</tr>
	<tr>
		<th>URL path</th>
		<td>`/route/<token>`</td>
	</tr>
	<tr>
		<th>Response body</th>
		<td>
			HTTP 200  
			```json
				{
					path: [
						[<route start latitude>, <route start longitude>],
						[<drop-off #1 latitude>, <drop-off #1 longitude>],
						...
					],
					total_distance: <driving distance in meters>
					total_time: <estimated driving time>
				}
			```  
			or  
			```json
				{
					status: "in progress"
				}
			```
			or  
			```json
				{
					status: "failure"
					error: "..."
				}
			```
		</td>
	</tr>
</table>

URL example: `/route/9d3503e0-7236-4e47-a62f-8b01b5646c16`
Response example:
```json
	{
		path: [
			['22.372081', '114.107877'],
			['22.326442', '114.167811'],
			['22.284419', '114.159510']
		],
		total_distance: 20000,
		total_time: 1800
	}
```
