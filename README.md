# demo-spring-sql-docker

Demo of Spring Boot, MySQL and Docker deployment based on the following materials:

https://www.javainuse.com/devOps/docker/docker-mysql

https://www.youtube.com/watch?v=3nwAVCGxGno&t=272s&ab_channel=JavaInUse

This tutorial gives you a very basic understanding of how you build a docker image/container and run your application

Things differ from the original source:
- Added a configuration file called JpaConfig so that data source can be modified by myself

- Diabled autoconfigration for datasource by Spring by the following code
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})

For people using Docker for Windows, you need to manually create a table on a container running MySQL or it will give you an error when you send a POST/GET request to localhost:8080.

Make sure you install MySQL and have your server running when you test your application before moving into the docker part.
