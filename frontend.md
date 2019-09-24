# Lalamove Software Engineer Challenge - Frontend
## Introduction
This application should allow the user to submit the addresses of one pickup point and one drop-off point.
It should then display the way points returned from the backend.
​
## Requirements
### Functional
1. Get the addresses of pickup and drop off point from user input and submit to our [MockAPI](#mock-api).
	- Retry logic only when the backend is busy (`in progress`).
	- Should stop requesting when error.
	- Errors must be handled.
	- Correct API usage in accordance with the documentation.
2. Display waypoints returned from Mock API on an embedded map,
	- Please use a map provider such as Google Maps, Mapbox, or HERE Maps.
	- Way points must displayed on corresponding LatLng
	- Way points must show its sequence (e.g. 1,2,3/ A,B,C) (image is ok) and in correct order 

Please don't include your API key in your submission. Instead, provide instructions on how to apply different API KEY.
​
### Bonus:
  - Autocomplete for user input
  - Display a driving routes from the Mock API response using your maps provider (actual routes where car can pass though)
​
### Other
1. Instructions on starting your application
2. Use git
3. Test cases (at least unit tests for major functions)
4. Browser compatibility: Latest 2 versions Chrome, Firefox and Safari
5. Instructions on creating a production build
​
## Reference
### Wireframes
These wireframes serve as a `reference` for UI. We are open mind with any creative UI/UX.  
![Wireframe](assets/llm-frontend-engineer-wireframe.png)
​
### Mock API
Our MockAPI (backend) can be accessed though [https://mock-api.dev.lalamove.com](https://mock-api.dev.lalamove.com),
where you can find the documentation [here](https://github.com/lalamove/challenge/blob/master/mockApi/DOC.md).  
Alternatively, you can also boot up [Mock API](https://github.com/lalamove/challenge/tree/master/mockApi).
However, please do not include any part of the Mock API in your submission.
​
## Submission
### **!!!!Important!!!!**
If you submit as a public git repository:
- `Avoid words like “Lalamove” and “challenge” in your repository.`
- `Do not copy any part of this file or any part of the Mock API.`  

Alternatively, you may also send us a ZIP archive file containing your solution. For fairness’ sake, you must also use Git and include the `.git` directory in the archive if you submit a ZIP archive file.

If you are so inclined, you can deploy the application onto a remote server (e.g. heroku) in addition to sending us your Git repository.
​
## FAQ
### What frameworks/libraries can I use?
> **Anything**, such as React/Vue/Angular, etc. We still judge your submission on correct API usage and engineering practices (over-engineering will be penalized).
### How much time should I spend on completing this challenge?
> You can work on your own schedule, but a complete solution is expected within seven days.
### The UI looks very ugly. Can I design my own?
> Feel free implement any additional features that you think will enhance the user experience.
​
**Questions? Ping us at: [techchallenge@lalamove.com](mailto:techchallenge@lalamove.com)**