# Profiles-Api-Configuration

A simple Spring Boot application demonstrating environment-specific configurations.

## API Endpoints

### GET /api/status

Returns a JSON object with a welcome message and an API URL.

**Example Response (Development):**

```json
{
  "message": "Welcome to the Development Environment!",
  "apiUrl": "http://localhost:5432/dev/api"
}
```

**Example Response (Production):**

```json
{
  "message": "Welcome to the Production Environment!",
  "apiUrl": "https://zisan.dev"
}
```

## Configuration

The application uses a YAML file for configuration. There are two configuration files:

*   `application.yaml`: This is the default configuration file. It is used when the `prod` profile is not active.
*   `application-prod.yaml`: This is the production configuration file. It is used when the `prod` profile is active.

To activate the `prod` profile, you can either uncomment the `spring.profiles.active` property in `application.yaml` or set the `SPRING_PROFILES_ACTIVE` environment variable to `prod`.

## How to Run

To run the application, you can use the following command:

```bash
./gradlew bootRun
```

By default, the application will run in the development environment. To run the application in the production environment, you can use the following command:

```bash
./gradlew bootRun -Dspring.profiles.active=prod
```

## How to Build

To build the application, you can use the following command:

```bash
./gradlew build
```

This will create a JAR file in the `build/libs` directory.
