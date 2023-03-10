# Cinema Service  📽️
- - - -
## Project description:  📖

Web application for buying movie tickets🔖. Make order🧾 
on a movie session🎞️ 
in a particular cinema hall🏛️ and just put it in your
shopping cart. But first you need to register and create your password for further entry.
In app implemented also Admin role. The app wrote according to all SOLID principles and supported all CRUD operations.

- - - -
## Features  🚀


### Features for User🙍‍♂️
* Registration
* Get all cinema halls
* Get all movies
* Get all movie sessions
* Get my orders
* Complete my orders
* Add movie session to shopping cart
* Get my shopping carts

### Additional features for Admin 👮
* Add cinema halls
* Add movies
* Add, Update, Delete movie sessions
* Get all users

- - - -
## 🌏 Available endpoints:

* POST: /register - all

* GET: /cinema-halls - user/admin

* POST: /cinema-halls - admin
* GET: /movies - user/admin
* POST: /movies - admin
* GET: /movie-sessions/available - user/admin
* POST: /movie-sessions - admin
* PUT: /movie-sessions/{id} - admin
* DELETE: /movie-sessions/{id} - admin
* GET: /orders - user
* POST: /orders/complete - user
* PUT: /shopping-carts/movie-sessions - user
* GET: /shopping-carts/by-user - user
* GET: /users/by-email - admin

- - - -
## 💻 Technologies:
* JDK 17
* Maven 3.1.1
* MySQL 8.0.22
* TomCat 9.0.69
* Spring security 5.7.3
* Spring Web 6.0.3
* Spring 6.0.3
* Hibernate 6.1.6

- - - -
## Start the program
1. Install JDK
2. Install Tomcat server
3. Clone the project from GitHub
4. Configure [db.properties](https://github.com/marchTooMuch/my-cinema-app/blob/main/src/main/resources/db.properties) file
5. Configure Tomcat server
6. At the start created default admin with login: __admin@gmail.com__ password: __admin__
                    

- - - -
## UML Models Diagram

![img.png](img/img.png)


