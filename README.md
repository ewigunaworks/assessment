# MEKARI Java Developer Assessment Project

This assessment project is an application that can fetch tweets regularly from Twitter and
store those tweets in database. Spring Boot based project, using Thymeleaf and Bootstrap, PostgreSQL and Twitter API.
## Requirements
1. Apache Maven 3.6.2
2. JDK 1.8
3. Apache Tomcat 9.0.27

## Installation

1. Clone the project from repository, https://erwinwiguna@bitbucket.org/erwinwiguna/erwin-assessment.git
2. Create new database in PostgreSQL
    ```bash
    default configuration :
        database name = postgres
        database username = postgres
        database password = password
    ```
3. Create new table in PostgreSQL, the schema.sql is store in /src/resources/schema.sql
    ```bash
        CREATE TABLE public.tweets (
            id serial NOT NULL,
            tweet_id varchar null,
            "name" varchar NULL,
            tweet varchar NULL,
            screen_name varchar NULL,
            tweet_date_at timestamp NULL,
            created_at timestamp NULL,
            updated_at timestamp NULL,
            created_by int4 NULL,
            updated_by int4 NULL
        );
    ```

## How To Run
##### Run Development
1. Run maven with goals
   ```bash
    spring-boot:run
   ```
##### Run Unit Test
1. Right click, and choose Run Test File
2. Or Click Run on menu bar, and choose Run Test File
