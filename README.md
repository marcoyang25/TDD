# TDD Java Example Project

This project demonstrates Test-Driven Development (TDD) practices in Java using JUnit 5. It features a simple domain with orders, umbrellas, and weather-based logic, and is structured for easy testing and extension.

## Features
- **Order Processing**: Place an order and send a notification email to the customer.
- **Weather-Dependent Pricing**: Umbrella price is discounted on sunny days.
- **Test Doubles**: Includes examples of mocks and stubs for unit testing.
- **JUnit 5**: Uses modern testing framework for Java.

## Project Structure
```
src/
  main/java/org/example/
    Order.java         # Handles order logic
    Umbrella.java      # Calculates umbrella price
    Weather.java       # Weather implementation
    IWeather.java      # Weather interface
    EmailUtil.java     # Email sending implementation
    IEmailUtil.java    # Email utility interface
    Main.java          # Entry point
  test/java/org/example/
    OrderTest.java     # Unit tests for Order
    UmbrellaTest.java  # Unit tests for Umbrella
```

## Getting Started
### Prerequisites
- Java 17 or higher
- Gradle (wrapper included)

### Build and Test
```sh
./gradlew build
```

### Run Tests
```sh
./gradlew test
```

### Run the Application
```sh
./gradlew run
```

## Example
- When you order an umbrella, the system checks the weather:
  - If it is sunny, you get a 10% discount.
  - An email is sent to the customer.

## Continuous Integration
- GitHub Actions workflow is included for CI with Gradle and Java 21.

## License
This project is licensed under the Apache License 2.0.
