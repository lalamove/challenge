# Software Engineer Challenge (Backend)

## Introduction

In Lalamove, we are receiving order of delivery day and night. As a software engineer in Lalamove, you have to provide a reliable backend system to clients. Your task here is to implement three endpoints to list/place/take orders.

## Requirement

1. We value a **clean**, **simple** working solution.
2. The application must be run in Docker, candidate must provide `docker-compose.yml` and `start.sh` bash script at the root of the project, which should setup all relevant services/applications.
3. We prefer Golang, but the solution can also be written in one of the following language/platform: PHP, Node.js.
4. Candidate must submit the project as a git repository (github.com, bitbucket.com, gitlab.com). Repository must avoid containing words `lalamove` and `challenge`.
5. Having unit/integration tests is a strong bonus.
6. As we run automated tests on your project, you must comply to the requirement. You can assume Docker is already installed in the test machine.
7. The solution must be production ready.

## Problem Statement

1. Must be a RESTful HTTP API listening to port `8080` (or you can use another port instead and describe in the README)
2. The API must implement 3 endpoints with path, method, request and response body as specified
    - One endpoint to create an order (see sample)
        - To create an order, the API client must provide an origin and a destination (see sample)
        - The API responds an object containing the distance and the order ID (see sample)

    - One endpoint to take an order (see sample)
        - An order must not be takable multiple time.
        - An error response should be sent if a client tries to take an order already taken.

    - One endpoint to list orders (see sample)

3. You must use one of the following APIs to get the distance for the order:
- Google Maps API (https://cloud.google.com/maps-platform/routes/)
- Similar API from Mapbox or HERE Maps
- **NOTE:** if you use Google Maps, you don't have to provide actual API key to us, just describe in the README how to use a custom key with your solution.
4. A Database must be used (SQL or NoSQL, at Lalamove we use mostly MySQL). The DB installation & initialisation must be done in `start.sh`.
5. All responses should be in json format no matter in success or failure situations.


## Api interface example

#### Place order

  - Method: `POST`
  - URL path: `/orders`
  - Request body:

    ```
    {
        "origin": ["START_LATITUDE", "START_LONGTITUDE"],
        "destination": ["END_LATITUDE", "END_LONGTITUDE"]
    }
    ```

  - Response:

    Header: `HTTP 200`
    Body:
      ```
      {
          "id": <order_id>,
          "distance": <total_distance>,
          "status": "UNASSIGNED"
      }
      ```
    or

    Header: `HTTP <HTTP_CODE>`
    Body:

      ```
      {
          "error": "ERROR_DESCRIPTION"
      }
      ```

  - Tips:

    - coordinates in request should be an array of strings
    - order id in response should be unique, it can be an auto-incremental integer or uuid string
    - distance in response should be integer in meters


#### Take order

  - Method: `PATCH`
  - URL path: `/orders/:id`
  - Request body:
    ```
    {
        "status": "TAKEN"
    }
    ```
  - Response:
    Header: `HTTP 200`
    Body:
      ```
      {
          "status": "SUCCESS"
      }
      ```
    or

    Header: `HTTP <HTTP_CODE>`
    Body:
      ```
      {
          "error": "ERROR_DESCRIPTION"
      }
      ```

  - Tips:

    Be mindful of race condition, when there are concurrency requests, we expect only one can take the order


#### Order list

  - Method: `GET`
  - Url path: `/orders?page=:page&limit=:limit`
  - Response:
    Header: `HTTP 200`
    Body:
      ```
      [
          {
              "id": <order_id>,
              "distance": <total_distance>,
              "status": <ORDER_STATUS>
          },
          ...
      ]
      ```

    or

    Header: `HTTP <HTTP_CODE>` Body:

    ```
    {
        "error": "ERROR_DESCRIPTION"
    }
    ```

  - Tips:

    - If page or limit is not valid integer then you should return error response
    - If there is no result, then you should return an empty array json in response body

Questions? We love to answer: techchallenge@lalamove.com
