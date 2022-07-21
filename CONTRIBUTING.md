This is awesome that you are looking to contribute! We accept any type of contribution, whether it be big or small!

If you see a issue, whether it be a typo in our [wiki](https://github.com/LlamasOnTheRun/Star-Wars-Rebellion-Component-Info-API/wiki), a requested feature for the API, or general questions or need of consultation, please raise it in our [Issues Tab](https://github.com/LlamasOnTheRun/Star-Wars-Rebellion-Component-Info-API/issues). We will do our best to get back to you on your issue within 2 weeks time.

If you wish to go a step further, try making code changes to the project itself. Feel free to fork this repo and raise a PR to `main` branch when your change is ready. Also refer to our [How to Test and Run](https://github.com/LlamasOnTheRun/Star-Wars-Rebellion-Component-Info-API/wiki/How-to-Run-and-Test) wiki section to understand how to setup and test the application in your local enviornment. One thing we ask when you make your change is to ensure every new code block or data entry is tested through JUnit. 

To understand where to place your test, we currently house three levels of testing and use them to accomplish various tasks:

- Controller
  - Tests here should handle requests with ONE valid data for each attribute for the given endpoint. We are looking to see each endpoint is accepted for every search scenerio. This is a sort of integration test for our happy path testing.
- Specification
  - Tests here need to test both negative and positive flows for a given request attribute, such as passing in null or blank values. If the given predicate/criteria builder is complex (such as finding the title of a card with one word only), we ask testing is done to account for each scenerio possible.
- Repository 
  - Tests here are about testing ALL data attributes that are avaliable for use. For example, controller test may have a test for attribute `faction` for `IMPERIAL` which fits considering it is testing ONE valid data type. However, repository should test for every possible scenerio, such that it should test for `IMPERIAL` and `REBEL`. We want to ensure the count for each data group is accurate and recorded within our [constants](https://github.com/LlamasOnTheRun/Star-Wars-Rebellion-Component-Info-API/blob/LlamasOnTheRun-patch-1/Component-Info-API/src/main/java/com/starwars/rebellion/ComponentInfoAPI/utils/APIConstants.java) file when performing assertions. However, testing for every scenerio may not be applicable such as testing every card title is present. A good rule of thumb is to create a test for each scenerio if number of scenerios is less than 10.
