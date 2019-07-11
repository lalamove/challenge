# Lalamove Mobile Developer Technical Challenge

### Business requirement
As an user I want to be able to see a list of my deliveries, including receivers photo and item description. I also want to be able to see the delivery location on the map and full description when I click on the delivery item.

### API Specification

**Get list of deliveries**
  * Protocol
    `HTTPS`
  * Hostname
    `mock-api-mobile.dev.lalamove.com`
  * Method
    `GET`
  * Endpoint
    `/deliveries`
  * Query String Parameters
    * `offset`
      * Description: Starting index.
      * Data type: Integer.
    * `limit`
      * Description: Number of items requested
      * Data type: Integer.
  * Response example:
    `HTTP code 200`
    ```json
    [
        {
            "id": 0,
            "description": "Deliver documents to Andrio",
            "imageUrl": "https://s3-ap-southeast-1.amazonaws.com/lalamove-mock-api/images/pet-8.jpeg",
            "location": {
                "lat": 22.336093,
                "lng": 114.155288,
                "address": "Cheung Sha Wan"
            }
        }, {
            "id": 1,
            "description": "Deliver parcel to Leviero",
            "imageUrl": "https://s3-ap-southeast-1.amazonaws.com/lalamove-mock-api/images/pet-0.jpeg",
            "location": {
                "lat": 22.319181,
                "lng": 114.170008,
                "address": "Mong Kok"
            }
        },
        ...
    ]
    ```

### User Requirements
- Retrieve list of deliveries from the API
- Display list of deliveries.
- Show details when user select an item in the list.
- Add marker on the map based on the provided lat/lng. 
  - NOTE: if you use Google Maps, you don't have to provide actual API key to us, just describe in the README how to use a custom key with your solution.

### What we expect from you?
Production ready solution that you are proud of.

## Technical Requirement
- Source code must be stored in a Git repository (you can send us github or bitbucket link)
- For public repos:
	- Avoid words `lalamove` and `challenge`
	- Do not copy-paste any part of this file (task, API documentation, etc.)
	- This is needed to prevent other candidates from finding your solution
- For private repos access: 
	- Github: Please add [techchallenge-lalamove](https://github.com/techchallenge-lalamove) as project collaborator
	- Bitbucket: Please give read access to "techchallenge@lalamove.com"
- App should cache deliveries (Cached deliveries should be available offline)
- Should implement pagination, retrieve up to 20 items per page
- Candidates are free to use any libraries

* ### iOS Engineer
	- Storyboard or XIB is not allowed (Create UI with code only)
	- Must write in the latest Swift version

* ### Android Engineer
	- Project must compile `./gradlew build`

## Wireframe
*For reference only, you can be creative with design and UI/UX features.*
![Wireframe](assets/mobile-engineer-wireframe.png)

## Bonus Points
- Automation test.
- Additional features that you think will enhance the user experience.

**Questions? We love to answer: <techchallenge@lalamove.com>**
