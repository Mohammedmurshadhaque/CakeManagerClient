## CakeManagerClient
Cake Manager Client:
- Is a microservice.
- Is a spring boot application.
- Calls the CakeManager microservice REST Endpoints,
  by using Feign client (More information about Feign Client https://github.com/OpenFeign/feign), 
  which are generatede by https://github.com/Mohammedmurshadhaque/CakeManagerApi.
- Uses the access token with any request to the CakeManger microservice, please see https://github.com/Mohammedmurshadhaque/CakeManager/blob/main/README.md
