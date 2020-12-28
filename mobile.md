# Lalamove Mobile Developer Technical Challenge

## Business requirements

As a user I want to be able to see a list of my deliveries, including the receiver's photo and the item description. I also want to be able to see the delivery details when I click on the delivery item.

## API Specification

### Get list of deliveries

* **Protocol** `HTTPS`
* **Hostname** `mock-api-mobile.dev.lalamove.com`
* **Method** `GET`
* **Endpoint** `/v2/deliveries`
* **Query String Parameters**
  * `offset`
    * Description: Starting index.
    * Data type: Integer.
  * `limit`
    * Description: Number of items requested
    * Data type: Integer.

#### Response example: `HTTP code 200`

```javascript
[
  {
    "id": "5dd5f3a7156bae72fa5a5d6c",
    "remarks": "Minim veniam minim nisi ullamco consequat anim reprehenderit laboris aliquip voluptate sit.",
    "pickupTime": "2014-10-06T10:45:38-08:00",
    "goodsPicture": "https://loremflickr.com/320/240/cat?lock=9953",
    "deliveryFee": "$92.14",
    "surcharge": "$136.46",
    "route": {
      "start": "Noble Street",
      "end": "Montauk Court"
    },
    "sender": {
      "phone": "+1 (899) 523-3905",
      "name": "Harding Welch",
      "email": "hardingwelch@comdom.com"
    }
  },
  {
    "id": "5dd5f3a787c49789dca0b43f",
    "remarks": "Minim deserunt nisi qui veniam est amet pariatur voluptate ea est exercitation cupidatat sit ea.",
    "pickupTime": "2018-11-22T07:06:05-08:00",
    "goodsPicture": "https://loremflickr.com/320/240/cat?lock=28542",
    "deliveryFee": "$104.23",
    "surcharge": "$288.13",
    "route": {
      "start": "Henry Street",
      "end": "Clinton Street"
    },
    "sender": {
      "phone": "+1 (942) 512-3379",
      "name": "Kendra Guthrie",
      "email": "kendraguthrie@comdom.com"
    }
  },
  // ...
]
```

## User Requirements

* Retrieve list of deliveries from the API
* Display list of deliveries
* Show details when user select an item in the list
* Price displayed in both deliver list and detail = `deliveryFee` + `surcharge`
* In details screen, show a toggle button to let user favourite/un-favourite the delivery
  * If user marked a delivery favourite and go back to delivery list, show a favourite indicator in the list item
  * If user un-favourite and go back to delivery list, hide the favourite indicator
  * Favourite status for each item should be persistent

### What we expect from you?

Production ready solution that you are proud of.

## Technical Requirements

* Source code must be stored in a Git repository (you can send us GitHub or BitBucket repo link)
  * We only accept GitHub and BitBucket repositories, other Git repo hosting services or ZIP archives are not accepted
* App should cache deliveries (either use local database or local persistent storage)
* Should implement pagination, retrieve up to 20 items per page
* Code should be testable
* Candidates are free to use any libraries

### iOS Engineer

* Storyboard or XIB is not allowed (Create UI with code only)
* Must write in the latest Swift version

### Android Engineer

* Must write in Kotlin
* Allowing screen rotation is required
* Display the `Price` in 2 decimal places
* Project must be able to compile with `./gradlew build`
* You may submit your own project as a replacement. However, it is discretionary-based and we might ask you to make additional changes to your project

#### Areas we will assess (for Android Engineer only)

1. Architecture, not to include everything inside `Activity` or `Fragment`
2. Use of dependency injection
3. Good code style & formatting
4. Automated test cases (nice to have, no need to make it 100% coverage)

## Wireframe

*For reference only, you can be creative with design and UI/UX features.*

![Wireframe](assets/mobile-engineer-wireframe-v2.png)

## Bonus Points

* Automation test
* Additional features that you think will enhance the user experience

## Submission

* For public repos:
  * Avoid words `lalamove` and `challenge`
  * Do not copy-paste any part of this file (task, API documentation, etc.)
  * This is needed to prevent other candidates from finding your solution
* For private repos access:
  * Github: Please add [techchallenge-lalamove](https://github.com/techchallenge-lalamove) as project collaborator
  * Bitbucket: Please give read access to `techchallenge@lalamove.com` ([lalachallenge](https://bitbucket.org/lalachallenge/))

Once you have shared the repository, please drop us an email (see the email addresses below) and specify your name, job title you are applying and also the repository link. Otherwise we will not start reviewing your submission.

**Questions? We love to answer:**

* <techchallenge+ios@lalamove.com> (iOS Engineer)
* <techchallenge+android@lalamove.com> (Android Engineer)
