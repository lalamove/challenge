# Lalamove Software Engineer Challenge - Frontend

- [Overview](#overview)
- [Functional Requirements](#functional-requirements)
- [Other Requirements](#other-requirements)
- [Frameworks and Libraries](#frameworks-and-libraries)
- [Using the Mock API](#using-the-mock-api)
- [Implementation Notes](#implementation-notes)
- [Wireframes](#wireframes)
- [Submission](#submission)

## Overview

This application should allow the user to submit the addresses of one pickup point and one drop-off point. It should then display the driving route returned from the backend.

## Functional Requirements

1. Get the addresses of the pickup point and the drop-off point the user inputs. Submit them to the Mock API. Refer to the [Using the Mock API](#using-the-mock-api) section.
	- API usage must be in accordance with the documentation.
	- Errors must be handled.
	- When the backend is busy (returns `in progress`), the application must retry automatically.
2. Display the driving route returned from the API in the correct order on an embedded map from a map provider, such as [Google Maps](https://developers.google.com/maps/), Mapbox, or HERE Maps.

	In the case of Google Maps, please do not include your API key in your submission. Instead, provide instructions on how we can use our own API key with your solution.

## Other Requirements

1. Major functionalities are covered by tests.
2. Support for modern browsers. There is no need to support legacy browsers.
3. Instructions on producing a production build are included.
4. Git is used.

## Frameworks and Libraries

We use React at Lalamove and we have been gradually transitioning jQuery projects to React, as well. However, you are free to use whatever framework or library that you are familiar with or prefer.

You are also free to use any libraries to help you with implementing the map. For example, if you are using Google Maps and React, you can use:

- [react-google-maps](https://github.com/tomchentw/react-google-maps)
- [google-map-react](https://github.com/google-map-react/google-map-react)

## Using the Mock API

The Mock API has been deployed at [https://mock-api.dev.lalamove.com](https://mock-api.dev.lalamove.com). You may use it when developing your own solution.

Alternatively, you can also boot up the [Mock API](https://github.com/lalamove/challenge/tree/master/mockApi), also in this repository, by yourself. Please do not include any part of the Mock API in your submission if you choose the latter.

The documentation for the Mock API is available [here](https://github.com/lalamove/challenge/blob/master/mockApi/DOC.md).

## Implementation Notes

- You can work on your own schedule, but a complete solution is expected within seven days.
- Your code should be modular. Each module should focus on doing one thing well.
- We aim for reusable components and a maintainable codebase as our projects are worked on by developers from different teams.
- Be frugal in the use of third-party libraries. (Don’t include a 300 KB library just for one helper function, for example.)
- Avoid over-engineering. Over-engineering will be penalized.
- You can implement any additional features that you think will enhance the user experience.

## Wireframes

These wireframes serve as a reference for the UI of your application. You can be creative with UI/UX and additional features.

![Wireframe](assets/llm-frontend-engineer-wireframe.png)

## Submission

Please send us a link to your Git repository. If your repository is public, please take note of the following points to prevent other candidates from finding your solution:

- Avoid words like “Lalamove” and “challenge” in your repository.
- Do not copy any part of this file or any part of the Mock API.

Alternatively, you may also send us a ZIP archive file containing your solution. For fairness’ sake, you must also use Git and include the `.git` directory in the archive if you submit a ZIP archive file.

Please provide instructions on starting your application and configuring the API keys, if any, in the form of a `README.md` file.

If you are so inclined, you can deploy the application onto a remote server in addition to sending us your Git repository.

**Questions? Ping us at: [techchallenge@lalamove.com](mailto:techchallenge@lalamove.com)**
