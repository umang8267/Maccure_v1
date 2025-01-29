# Selenium Java Automation Framework for Maccure Project

## Overview
This is a simple yet powerful automation framework designed to test the Maccure healthcare website, where users can book appointments with doctors. Using **Selenium** and **Java**, the framework ensures high test coverage by combining the **Page Object Model (POM)** with both **Data-Driven** and **Keyword-Driven** approaches.

## Why This Framework?
- **Purpose-Built for Healthcare:** Focused on automating critical flows like doctor bookings and form submissions.
- **Flexible Testing:** The hybrid approach combines the best of data-driven testing for handling multiple datasets and keyword-driven testing for easy reusability.
- **Structured Design:** The Page Object Model ensures tests are clean, maintainable, and modular.

## Features
- **Cross-Browser Testing:** Easily run tests on different browsers like Chrome, Firefox, and Edge.
- **Detailed Reporting:** Generates reports using Extent Reports to keep track of test results.
- **Scalable & Modular:** Easy to add new features or update existing ones with the modular project structure.
- **Integration with TestNG:** Efficient test execution and grouping through TestNG XML configurations.

## Project Structure
Here’s how the project is organized to keep things clean and easy to maintain:

```
Maccure_v1/
├── TestData/            # Test data files (like Excel or JSON)
├── reports/             # Folder for generated reports
├── src/
│   └── test/
│       ├── java/
│       │   ├── pages/          # POM classes for web pages
│       │   ├── testcases/      # Scripts for test cases
│       │   ├── utilities/      # Common utility functions
│       │   └── dataproviders/  # Data provider classes for TestNG
├── target/              # Compiled files and build artifacts
├── test-output/         # TestNG default output folder
├── pom.xml              # Maven dependencies and configurations
└── testng.xml           # Main TestNG suite configuration file
```

## Getting Started
### Prerequisites
Before running the tests, make sure you have the following installed:
- **Java JDK 8 or higher**
- **Selenium WebDriver (latest version)**
- **TestNG testing framework**
- **Apache Maven**
- **IDE (IntelliJ IDEA or Eclipse)**
- **Browser Drivers (e.g., ChromeDriver)**

### Steps to Run
1. **Clone the Repository:**
   ```bash
   git clone https://github.com/umang8267/Maccure_v1.git
   ```

2. **Import the Project:**
   Open the project in your IDE as a Maven project.

3. **Set Up Test Data:**
   Add or modify test data in the `TestData` folder to suit your test scenarios.

4. **Run Tests:**
   Use Maven to execute the test cases:
   ```bash
   mvn test
   ```

5. **View Test Reports:**
   After execution, navigate to the `reports` folder to check detailed test results.

## Dependencies
Here are the main dependencies used in this project:
```xml
<dependencies>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.x.x</version>
    </dependency>
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.x.x</version>
    </dependency>
    <dependency>
        <groupId>com.aventstack</groupId>
        <artifactId>extentreports</artifactId>
        <version>5.x.x</version>
    </dependency>
</dependencies>
```

## Contributing
We welcome contributions to make this framework even better. Here’s how you can help:
1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Commit your changes and create a pull request.
