# Lalamove Front-end Software Engineer Challenge
## Introduction
Create a web application that allows user to submit addresses of 1 pickup point and 1 drop-off point.
It should then display the waypoints returned from the backend.
​
## Requirements
### Functional requirements
1. Get the addresses of pickup and drop-off points from user input and submit them to our Mock API backend (you can find the documentation for the Mock API [here](https://github.com/lalamove/challenge/blob/master/mockApi/DOC.md)).
	- Retry logic when the backend is busy (returns `in progress` response).
	- Should stop requesting when the backend returns error.
	- All errors must be handled.
	- Correct Mock API usage in accordance with the documentation.
2. Display waypoints returned from Mock API on an embedded map.
	- Please use a map provider such as Google Maps, Mapbox, or HERE Maps.
	- Waypoints must be displayed on corresponding latitude and longitude.
	- Each waypoint must show its sequence (e.g. 1, 2, 3, or A, B ,C) and in correct order (using image/icon is allowed).

*Please don't include your map provider API key in your submission. Instead, provide instructions on how to apply different API key.*
​
### Non-functional requirements
1. Instructions on starting your application.
2. Use Git version control system.
3. Unit tests (at least for major functions).
4. Browser compatibility: Latest Chrome, Firefox, and Safari.
5. Instructions on creating a production build.
​
### Bonus (optional)
  - Autocomplete for user input.
  - Display a driving route from the Mock API response using your maps provider (actual route where car can pass through).
  - Mobile responsive.
​
## Reference
### Wireframes
These wireframes serve as a **reference** only. You are free to be creative with the UI/UX.  
![Wireframe](assets/llm-frontend-engineer-wireframe.png)
​
## Submission
### **!!Important!!**
If you submit as a public git repository:
- Avoid words like "Lalamove" and "challenge" in your repository.
- Do not copy any part of this file or any part of the Mock API documentation.  

Alternatively, you may also send us a ZIP archive file containing your solution. For fairness’ sake, you must also use Git and include the `.git` directory in the archive if you submit a ZIP archive file.

If you are so inclined, you can deploy the application onto a remote server (e.g. Firebase, Heroku, etc.) in addition to sending us your Git repository.
​
## FAQ
### What frameworks/libraries can I use?
> **Anything**, such as React, Vue, Angular, etc. We still judge your submission on correct API usage and engineering practices (over-engineering will be penalized).
### How much time should I spend on completing this challenge?
> You can work on your own schedule, but a complete solution is expected within 7 days.
### The UI looks ugly. Can I design my own?
> You can be creative with the UI design, also, feel free to implement any additional features that you think will enhance the UX.
### Do I need to deploy somewhere?
> See **Submission** section above.

​

**Questions? Ping us at: [techchallenge@lalamove.com](mailto:techchallenge@lalamove.com)**
