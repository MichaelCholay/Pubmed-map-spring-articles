# Welcome to Pubmed-map !
 ### Search - Localize - Cooperate
(Spring Microservice article: part 2/4)

Pubmed-map allows localization and mapping of authors of biomedical literature from medline and life science journals of pubmed.gov library (NIH National Library of Medicine and NCBI National Center for Biotechnology Information) in the aim to develop cooperation between scientists. At this time, Pubmed-map API collect articles of the TOP3 of scientific journals (Cell, Nature Reviews Genetics and Nature Reviews Molecular Cell Biology) each day).
 
Pubmed-map is divided into 4 parts available in this Github account :
   
   - [Pubmed-map - API REST]([https://github.com/MichaelCholay/Pubmed-map-Node](https://github.com/MichaelCholay/Pubmed-map-Node)) to send daily requests to the official Pubmed api and to save specific articles' data in MongoDb with NodeJs server.
   - [Pubmed-map - Spring Microservice article]([https://github.com/MichaelCholay/Pubmed-map-spring-articles](https://github.com/MichaelCholay/Pubmed-map-spring-articles)) to send request to Pubmed-map API and to analyze recovered data
   - [Pubmed-map - Spring Microservice authentification]([https://github.com/MichaelCholay/Pubmed-map-spring-jwt](https://github.com/MichaelCholay/Pubmed-map-spring-jwt)) to allow creation of user session and selection of favorite articles in MySQL database. This part is based on JWT authentification tutorial of [grokonez.com](http://www.grokonez.com)
   - [Pubmed-map - Angular]([https://github.com/MichaelCholay/Pubmed-map-Front](https://github.com/MichaelCholay/Pubmed-map-Front)), the front part of this project based on open-source [Leaflet library]([http://www.leafletjs.com](http://www.leafletjs.com))
 

## Technologies for development of Pubmed-map - Spring article
   
   - Java 8
   - Spring boot v2.3.1 ⇒ java-based microservices
   - Apache maven v3.6.3 ⇒ build tool that manage Java projects

## Technologies for CI/CD of Pubmed-map Spring article
   
   - [Heroku](www.heroku.com), Cloud application platform
   - [GitHub actions]([https://fr.github.com/features/actions](https://fr.github.com/features/actions)), CI/CD workflow

## How to use Pubmed-map - Spring microservice article

### Installation
   In your terminal :
   - clone this repository `git clone https://github.com/MichaelCholay/Pubmed-map-spring-articles.git`
   - a new folder **pubmed-map_spring** is created

Then, you can import this maven project in your IDE.

### Configuration
Then, set theses environment variables:
   - PORT: a free port to run the application
   - HOST_NODE: the URL of the pubmed-map API-REST
 
### Run
Command to build the project: `mvn clean package`and run the main class.

### API URL
A Swagger API documentation is available at ${HOST_NODE}:${PORT}/swagger-ui.html
#
