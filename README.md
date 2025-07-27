Movie Review Backend

This is the backend server for the Movie Review Application, built using Spring Boot, MongoDB, and Maven.

Features:
- RESTful APIs to manage movies and their reviews
- MongoDB integration using MongoTemplate
- Environment-based configuration
- Built with Maven for easy dependency management

Technologies Used:
- Java 17+
- Spring Boot
- MongoDB Atlas
- Maven

API Endpoints:
-Movies
   GET /api/v1/movies — Get all movies
   GET /api/v1/movies/{imdbId} — Get movie by IMDb ID

-Reviews
   POST /api/v1/reviews — Submit a review
