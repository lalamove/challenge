# Mock API Documentation

The Mock API is a stub backend that returns stubbed responses for development for the Lalamove Frontend challenge. You may use the Mock API that we provide, at [https://mock-api.dev.lalamove.com](https://mock-api.dev.lalamove.com), or you may choose to boot up your own.

- [Route](#route)
	* [Submit Routing Request](#submit-routing-request)
	* [Get Route](#get-route)
- [Error Glossary](#error-glossary)

## Route

### Submit Routing Request

Submit a routing request to the backend for processing.

```
POST /route
```

#### Parameters

##### Body Parameters

| Parameter Name | Type   | Presence | Description                    |
|----------------|--------|----------|--------------------------------|
| `origin`       | string | Required | Address of the pickup point.   |
| `destination`  | string | Required | Address of the drop-off point. |

#### Sample Request

```
curl --request POST \
     --header 'Content-Type: application/json' \
     --data '{"origin":"Innocentre, Hong Kong","destination":"Hong Kong International Airport Terminal 1"}' \
     --url https://mock-api.dev.lalamove.com/route
```

#### Sample Response

```
{
  "token": "9d3503e0-7236-4e47-a62f-8b01b5646c16"
}
```

#### Response Definitions

| Element | Description                                      | Type   |
| ------- | ------------------------------------------------ | ------ |
| `token` | Processing token to identify the routing request | string |

---

### Get Route

```
GET /route/{token}
```

Gets the route from the request identified by the processing token from [the `/route` endpoint](#submit-routing-request).

#### Parameters

##### Path Parameters

| Parameter Name | Description                                                         |
| -------------- | ------------------------------------------------------------------- |
| `{token}`      | Refers to the processing token returned from the `/route` endpoint. |

#### Sample Request

```
curl --request GET \
     --url https://mock-api.dev.lalamove.com/route/9d3503e0-7236-4e47-a62f-8b01b5646c16
```

#### Sample Responses

```
{
  "status": "in progress"
}
```

```
{
  "status": "failure",
  "error": "Location not accessible by car"
}
```

```
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

#### Response Definition

| Element          | Description                                                                                                                                                                                                                 | Type                                 |
|------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------|
| `status`         | Current status of the route request on the backend.                                                                                                                                                                         | string                               |
| `error`          | Only exists if an error occurred. The error response from the backend.                                                                                                                                                      | string                               |
| `path`           | Only exists if no error occurred. An array of sets of coordinates. The first set of coordinates is the starting point. The last set of coordinates is the destination. Other sets of coordinates are the waypoints. | array of 2-element arrays of strings |
| `total_distance` | Only exists if no error occurred. The distance. The unit is not important for this challenge.                                                                                                                               | number                               |
| `total_time`     | Only exists if no error occurred. The total it takes to complete the journey. The unit is not important for this challenge.                                                                                                 | number                               |

## Error Glossary

| Response Code | Text                  | Description                      |
|---------------|-----------------------|----------------------------------|
| 500           | Internal Server Error | A generic server error occurred. |
