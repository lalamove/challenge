# Software Engineer in Test (iOS/Android) - Technical Challenge

## Introduction

At Lalamove, we are rapidly growing and want to ensure our mobile apps are production ready with good test coverage.
You are thus being asked to write automated tests for the provided app in this tech challenge.
The app is developed to meet the following functional requirements:
  - Landing page with list of items to be delivered (with infinity scroll).
  - Long press on an item will delete it.
  - Clicking an item will take you to its item details page.
  - Support for devices running iOS 9/Android 5.0 onwards.

## Deliverables
  - Write tests that cover all the functional requirements.
  - Test report should be generated after a test run on the emulator.
  - Provide instructions for setting up the environment and running the tests.
  - Submit the project as a git repo (github.com, bitbucket.com, gitlab.com). Please avoid words containing lalamove and challenge if it's a public repo.

## Bonus
  - Write performance tests for app stability.
  - Write tests that cover edge cases.

## Notes
  - You could choose any test framework. (We prefer UI Automator 2.0 for Android or XCUITest (with Swift) for iOS).
  - Choose one platform (iOS/Android) most appropriate for you.
  - Unit tests are out of scope.

## App functionality in depth
- [Image-1A] Landing page of the app shows Delivery List with maximum 20 records when first opened.
- [Image-1A] Scrolling up will retrieve more items, each time 20 records are appended at the end of the list.
- [Image-1A] Shows icon, description and location. Parcels are for Leviero and documents are for Andrio.
- [Image-1A] Long press on an item, and it will be deleted.
- [Image-2A] Click any item from Delivery List and Delivery Details page shows.
- [Image-2A] Information should be shown correctly based on the item details from [Image-1A] (refer to attached mockup).
- [Image-2A] Map pin shows and centred to that pin for that delivery.
- [Image-2B] Shows when clicking the 14th record from Delivery List.

### Ref images
Image-1A  
![Image-1A](https://s3-ap-southeast-1.amazonaws.com/lalamove-mock-api/images/tc-01a.jpg)

Image-2A  
![Image-2A](https://s3-ap-southeast-1.amazonaws.com/lalamove-mock-api/images/tc-02a.jpg)

Image-2B  
![Image-2B](https://s3-ap-southeast-1.amazonaws.com/lalamove-mock-api/images/tc-02b.jpg)


## Apps to test
  * Android
  `https://s3-ap-southeast-1.amazonaws.com/lalamove-mock-api/testable-app/app-tech-android-challenge-20180918.apk`
  * iOS
  `https://s3-ap-southeast-1.amazonaws.com/lalamove-mock-api/testable-app/app-tech-ios-challenge-20180918.zip`

**We are happy to answer any questions/Submission: <techchallenge@lalamove.com>**

