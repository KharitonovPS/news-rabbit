## Project Structure

org.kharitonov.messaging.consumer: Contains RabbitMQ consumers.

RabbitMQConsumer: Listens to a simple text message from RabbitMQ.
RabbitMQJsonConsumer: Listens to JSON messages (e.g., News objects) from RabbitMQ.

org.kharitonov.messaging.controller: Includes REST controllers for message publishing.

MessageController: Allows publishing simple text messages.
MessageJsonController: Allows publishing JSON messages (e.g., News objects).
org.kharitonov.messaging.dto: Defines data transfer objects used in the project.

News: Represents a news object with id, title, and publisher.

org.kharitonov.messaging.publisher: Contains RabbitMQ producers.

RabbitMQProducer: Publishes simple text messages to RabbitMQ.
RabbitMQJsonProducer: Publishes JSON messages (e.g., News objects) to RabbitMQ.

application.yaml: Configuration file for Spring Boot, including RabbitMQ settings.

compose.yaml: Docker Compose file for setting up RabbitMQ as a Docker service.


## Prerequisites
Ensure Docker is installed on your system.
