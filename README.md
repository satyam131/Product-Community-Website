PROJECT NAME :-
---------------
Product Community Website with Angular, Spring boot, JWT Authentication and RESTful APIs.
-----------------------------------------------------------------------------------------

The Product Community Website is an advanced web application that enables customers to visit, register, browse products, request reviews, and post reviews for products. The project consists of two applications: a backend application with RESTful APIs and a frontend application using Angular.

Backend Application (REST API - No UI, Only Backend):
-----------------------------------------------------

1.User Authentication API: This REST API handles user authentication using JSON Web Tokens (JWT). It supports successful and unsuccessful user validation, generating JWT tokens upon successful authentication.

2.User Registration API: This API allows new users to register on the platform, providing validation for email addresses, password policies, and mandatory fields. After successful registration, users receive a JWT token for subsequent authentication.

3.Search Product API: The API enables customers to search for products using one or more parameters like product name, brand, and product code. The API endpoints are protected with JWT token authentication.

4.Post Reviews API: This API allows registered users to post new reviews for products, including ratings, headings, and reviews. The API endpoints are secured with JWT token authentication.

5.Approve Review API: A REST API that enables the administrator to approve reviews. Only approved reviews will be visible on the storefront, and average ratings are calculated from approved reviews. The API endpoints are protected with JWT token authentication.

6.Request Review API: This API allows customers to request reviews for a product by submitting a simple form with product details. The API endpoints are secured with JWT token authentication.

7.Stats API: The API provides statistics to be shown on the homepage, including the number of registered users, products, and reviews. The API endpoints are secured with JWT token authentication.

Frontend Application (Using Angular):
-------------------------------------

1.Homepage: The landing page displays links for registration and login. It also shows essential statistics such as the number of registered users, products, and reviews.

2.Login Page: The application has a login page where users can authenticate themselves using their credentials. Proper error handling is implemented to display error messages in case of invalid authentication.

3.Registration Page: The application offers a registration page where users can register with validations for email address, password policy, and mandatory fields.

4.Product Search Page: The search screen allows customers to search for products by name, code, or brand. The results are displayed using the REST API from the backend application with JWT token authentication.

5.Results Page: The page displays the search results, including average ratings and the number of reviews for each product. 

6.Ask for Reviews: Customers can raise requests for reviews on a product by submitting a simple form with product details. 

7.Product Details: Customers can view all reviews provided for a selected product.

8.Post a Review: Users can post reviews for products by submitting a simple form with ratings (1-5), headings, and reviews. The API endpoints for posting reviews are secured with JWT token authentication.

9.Admin: Logged-in administrators can view all new reviews and approve or reject them. Only approved reviews will be visible on the storefront, and average ratings will be calculated from approved reviews. The API endpoints for approving reviews are protected with JWT token authentication.

10.Logout: Users are provided with an option to logout from the application. The JWT token is invalidated upon logout.

Overall, the Product Community Website with Angular, JWT Authentication, and RESTful APIs provides a secure and interactive platform for users to explore, review, and request reviews for various products. The integration of JWT for authentication ensures enhanced security and user privacy. The application's responsive design, user-friendly interface, and efficient data communication through RESTful APIs make it a valuable tool for customer engagement and product community building.


TECNOLOGY USED :-
------------------
ANGULAR </br>
SPRINGBOOT </br>
REST APIs </br>
MYSQL (DATABASE)</br>
JWT (JSON web token) </br>

# Product-Community-Website
The Product Community Website is a full-fledged web application that allows customers to visit, register, browse products, request reviews, and post reviews for products. The project consists of two applications: one backend application with Spring boot and RESTful APIs and the other frontend application using Angular.

STEPS TO CLONE:-
-----------------
a. backend

    - Maven -> Update Project
    - Using MySQL create database "exittest"
    - Run as Spring Boot Project (Running at PORT - 9090)

b. frontend

    - npm install
    - ng serve (Running at PORT - 4200)

c. Configure Admin

    - Both Frontend and Backend should be running.
    - Create Admin User (Use Signup Form to Register as a normal user), to set id of user as Admin use SQL Query
    - Run as Spring Boot Project (Running at PORT - 9090)
    

PROJECT SCREENSHOTS:-
----------------------
1.LOGIN PAGE
<img width="917" alt="login page product website" src="https://github.com/satyam131/Product-Community-Website/assets/73646662/ae72dbc7-c098-436e-8958-4b2661473575">



2.PRODUCT ADD PAGE
<img width="911" alt="add product product website" src="https://github.com/satyam131/Product-Community-Website/assets/73646662/910cb21b-cfff-47d5-9d15-dc77424b1a3c">



3.PRODUCT VIEW PAGE
<img width="916" alt="view products product website" src="https://github.com/satyam131/Product-Community-Website/assets/73646662/c2b7ed4c-7644-450a-a0f0-3fd582ddc92d">




4.PRODUCT SEARCH PAGE
<img width="914" alt="product search product website" src="https://github.com/satyam131/Product-Community-Website/assets/73646662/70cf2b16-0f3f-4fa0-aac0-382fa8bd0499">




5.ADMINISTRATOR PRODUCT REVIEW (APPROVE AND DISAPPROVE)
<img width="905" alt="admin side product (approve-disapprove) product website" src="https://github.com/satyam131/Product-Community-Website/assets/73646662/e9e84162-f8f1-4b8e-bb88-9fb02706492a">




6.ADDING REVIEW IN PRODUCTS
<img width="913" alt="adding review in products by admin product website" src="https://github.com/satyam131/Product-Community-Website/assets/73646662/c86ac108-31d9-4c1a-b968-888a8ce42297">




7. PRODUCTS VIEW AND ITS REVIEW PAGE.
<img width="920" alt="view products and its review product website" src="https://github.com/satyam131/Product-Community-Website/assets/73646662/b9f1edad-df59-4716-9f6f-55eb6b6a5cfb">
