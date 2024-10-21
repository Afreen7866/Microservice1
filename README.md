# Microservice1
Create a spring boot application with three rest endpoints namely create retrieval and a health check endpoint to check if the backend call is getting success or not. Use h2 db as backend.
Implement proper loggers in all the layers. 
Use JDBC Template instead of JPA Repositry
Layer Structure-controller->service->BO->EO->DAO
Note-all classes should follow interfaces and its implementation class.
All constants should be in util package in constants class.
Use mapstruct to map pojo classes to new vo in service layer.
Do basic validations like not null, min and max value for retrieval endpoint using annotations.
Use gradle as build tool.
Use Git and implement branching strategy
Project Structure: using STS
Working layer : model -> Dao -> Eo -> Bo -> Mapper -> service -> controller
