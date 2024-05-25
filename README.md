Please add in Room class if the room is available 
isAvailable : true

Please add in application.properties a method for encrypt
the password and user.

In class Feedback add value of min and max number for
rating.

# **Hotel Reservation Management Web Application**

A comprehensive web application for managing hotel reservations with user-friendly features, built with Java Spring Boot, Angular, and SQL.

## Key Features:

* **Hotel Search by Radius:** Users can specify a radius in kilometers to find nearby hotels.
* **Hotel Listings:** Display all found hotels in a list format.
* **Room Availability:** View all available rooms and their prices for a selected hotel.
* **Booking System:** Book one or multiple rooms with ease.
* **Reservation Management:** Cancel or change booked rooms at least two hours before check-in.
* **Feedback System:** Leave feedback on services, cleanliness, and more.

## Technologies Used

* **Frontend:** Angular, HTML, CSS
* **Backend:** Java with Spring Boot
* **Database:** SQL (SQL Workbench)
* **APIs:** Google Maps API for location-based searches

### Getting Started

1. **Clone the Repository:**

`git clone https://github.com/madalinbleoca/Hotel-Reservation-Management.git`

2. **Backend Setup:**

* Navigate to the backend directory.
* Install dependencies and run the Spring Boot application:

`mvn install` <br>
`mvn spring-boot:run`

3. **Frontend Setup:**

* Navigate to the frontend directory.
* Install dependencies and start the Angular application:

`npm install` <br>
`ng serve`

4. **Database Setup:**

* Use SQL Workbench to set up your database schema.
* Update application properties with your database connection details.

5. **Run the Application:**

* Open your browser and navigate to http://localhost:4200.

### Contributions

Feel free to fork this repository, submit issues, and send pull requests. **We welcome all contributions!**