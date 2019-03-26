# Lalamove Software Engineer Challenge - Frontend

- [Functional Requirements](#functional-requirements)
- [Other Requirements](#other-requirements)
- [Nice-to-Haves (Optional Features)](#nice-to-haves-optional-features)
- [Wireframes](#wireframes)
- [Using the Mock API](#using-the-mock-api)
- [Frameworks and Libraries](#frameworks-and-libraries)
- [Expectations](#expectations)
- [Submission](#submission)

## Functional Requirements

1. Get one pickup location and one drop-off location from the user and submit them to the Mock API. Refer to the [Using the Mock API](#using-the-mock-api) section.
	- API usage must be in accordance with the documentation.
	- Errors must be handled.
	- Automatic retries when the backend is busy.
2. Addresses must autocomplete.
3. Display the driving route returned from the API, **in the correct order**, on an embedded map from one of these providers:
	- [Google Maps](https://developers.google.com/maps/)
	- Mapbox
	- HERE Maps

	In the case of Google Maps, please do not include your API key in your submission. Instead, provide instructions on how we can use our own API key with your solution.

## Other Requirements

1. Major functionalities must be covered by tests.
2. Support for modern browsers. There is no need to support legacy browsers.
3. Instructions on producing a production build are included.
4. Git is used.

## Nice-to-Haves (Optional Features)

1. The autocomplete fields are pre-filled with previous inputs when you close and re-open the page
2. Progressive Web App
3. Mobile responsiveness
4. Deploy the application onto a remote server
5. Additional features that you think will enhance the user experience

## Wireframes

We include wireframes only as a reference for the UI of your application. Please be creative with UI/UX and additional features.

![Wireframe](assets/llm-frontend-engineer-wireframe.png)

## Using the Mock API

You are free to use the Mock API provided by us to work on your solution, at [https://mock-api.dev.lalamove.com](https://mock-api.dev.lalamove.com). Alternatively, you can also boot up the [Mock API](https://github.com/lalamove/challenge/tree/master/mockApi), also in this repository, by yourself. Please do not include the Mock API in your submission if you choose the latter.

Please find the documentation for the Mock API [here](https://github.com/lalamove/challenge/blob/master/mockApi/DOC.md).

## Frameworks and Libraries

We use React at Lalamove and we have been gradually transitioning jQuery projects to React, as well. However, you are free to use whatever framework or library that you are familiar with or prefer.

Feel free to use any CSS framework of choice, if you want to. We would prefer you to write some CSS to customize the framework if you do.

## Expectations

- This challenge should take around four hours to complete.
- You can work on your own schedule, but a complete solution is expected within seven days.
- Your code should be modular. Each module should focus on doing one thing well.
- We aim for reusable components and a maintainable codebase as our projects are worked on by developers from different teams.
- Avoid over-engineering. Over-engineering will be penalized.
- Be frugal in the use of third-party libraries. (Don’t include a 300 KB library just for one helper function, for example.)

## Submission

Please send us a link to your Git repository. If your repository is public, please take note of the following points to prevent other candidates from finding your solution:

- Avoid words like “Lalamove” and “challenge” in your repository.
- Do not copy any part of this file or any part of the Mock API.

Alternatively, you may also send us a ZIP archive file containing your solution. For fairness’ sake, you must also use Git and include the `.git` directory in the archive if you submit a ZIP archive file.

Please provide instructions on starting your application and configuring the API keys, if any, in the form of a `README.md` file.

**Questions? Ping us at: [techchallenge@lalamove.com](mailto:techchallenge@lalamove.com)**
