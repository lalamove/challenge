# Software Engineer Challenge (Backend)

## Introduction

In Lalamove, we are receiving order of delivery day and night. As a software engineer in Lalamove, you have to provide a reliable backend system to clients. Your task here is to implement three endpoints to list/place/take orders.

## Requirement

1. We value a **clean**, **simple** working solution.
2. Candidate must provide a `start.sh` bash script at the root of the project, which should setup all relevant applications. It must work on Ubuntu(We suggest to use Docker). We will run our automated tests again your solution 10 second after start.sh exit with 0.
3. We prefer Golang, but the solution can also be written in one of the following language/platform: PHP, Nodejs, Python, Java and .Net.
4. Candidate must submit the project as a git repository (github.com, bitbucket.com, gitlab.com). Repository must avoid containing words `lalamove` and `challenge`.
5. Having unit/integration tests is a strong bonus.
6. As we run automated tests on your project, you must comply to the requirement.
7. The solution must be production ready.

## Problem Statement

1. Must be a RESTful HTTP API listening to port `8080`
2. The API must implement 3 endpoints with path, method, request and response body as specified
    - One endpoint to create an order (see sample)
        - To create an order, the API client must provide an origin and a destination (see sample)
        - The API responds an object containing the distance and the order ID (see sample)

    - One endpoint to take an order (see sample)
        - An order must not be takable multiple time.
        - An error response should be sent if a client tries to take an order already taken.

    - One endpoint to list orders (see sample)

3. You must use google maps API to get the distance for the order: https://cloud.google.com/maps-platform/routes/
4. A Database must be used (SQL or NoSQL, at Lalamove we use mostly MySQL and MongoDB). The DB installation&initialisation must be done in `start.sh`.


## Api interface example

#### Place order

  - Method: `POST`
  - URL path: `/order`
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
          "status": "UNASSIGN"
      }
      ```
    or

    Header: `HTTP 500`
    Body:
      ```json
      {
          "error": "ERROR_DESCRIPTION"
      }
      ```

#### Take order

  - Method: `PUT`
  - URL path: `/order/:id`
  - Request body:
    ```
    {
        "status":"taken"
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

    Header: `HTTP 409`
    Body:
      ```
      {
          "error": "ORDER_ALREADY_BEEN_TAKEN"
      }
      ```

#### Order list

  - Method: `GET`
  - Url path: `/orders?page=:page&limit=:limit`
  - Response:

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

Questions? We love to answer: techchallenge@lalamove.com
