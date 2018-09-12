# Lalamove "Software Engineer in Test (iOS/Android)" Technical Challenge
1. Analyze product requirement
2. Plan what should be automated
3. Write automated tests (using UI Automator 2.0 tests on Android and XCUITest tests in Swift on iOS)
4. Unit tests are out of scope
5. Run automation tests on emulator and generate test report

# Product requirement
Image-1A  
![Image-1A](https://s3-ap-southeast-1.amazonaws.com/lalamove-mock-api/images/tc-01a.jpg)

Image-1B  
![Image-1B](https://s3-ap-southeast-1.amazonaws.com/lalamove-mock-api/images/tc-01b.jpg)

Image-1C  
![Image-1C](https://s3-ap-southeast-1.amazonaws.com/lalamove-mock-api/images/tc-01c.jpg)

Image-2A  
![Image-2A](https://s3-ap-southeast-1.amazonaws.com/lalamove-mock-api/images/tc-02a.jpg)

Image-2B  
![Image-2B](https://s3-ap-southeast-1.amazonaws.com/lalamove-mock-api/images/tc-02b.jpg)

#### Functionality
- [Image-1A] Landing page of the app shows Delivery List with maximum 20 records when first opened.
- [Image-1A] Scrolling up will retrieve more items, each time 20 records are appended at the end of the list.
- [Image-1A] Shows icon, description and location. Parcels are for Leviero and documents are for Andrio.
- [Image-1A] Long press on an item, and it will be deleted.
- [Image-1B] This error shows either when opening the app or when refreshing the page.
- [Image-1C] This error shows when trying to retrieve more items from the server.
- [Image-2A] Click any item from Delivery List and Delivery Details page shows.
- [Image-2A] Information should be shown correctly based on the item details from [Image-1A] (refer to attached mockup).
- [Image-2A] Map pin shows and centred to that pin for that delivery.
- [Image-2B] Shows when clicking the 14th record from Delivery List.

**We are happy to answer any questions: <techchallenge@lalamove.com>**

