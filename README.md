# worldlineTestingAssessment1
Certainly! Here's the content for the `README.md` file in a single file:

```markdown
# WorldLine Assessment

This project contains automated tests for various functionalities of a demo website. It utilizes Selenium WebDriver for automation, TestNG for test management, and Cucumber for behavior-driven development (BDD) tests.

## Steps to Run the Tests

1. **Clone Repository:** Clone this repository to your local machine.

   ```bash
   https://github.com/singhroshnni/worldlineTestingAssessment1.git
   ```

2. **Install Dependencies:**

   - Ensure you have Java Development Kit (JDK) installed on your system.
   - Install Maven for dependency management. Refer to [Maven Installation Guide](https://maven.apache.org/install.html).
   - Download ChromeDriver from [ChromeDriver Downloads](https://sites.google.com/a/chromium.org/chromedriver/downloads) and place it in the project directory or update the path in the code.

3. **Run Tests:**

   - Navigate to the project directory.

   ```bash
   cd worldlineTestingAssessment1

   ```

   - Execute Maven command to run the tests.

   ```bash
   mvn clean test
   ```

## Project Structure

- **src/test/java/WorldLine/Assessment1/RegisterationTest.java** Contains Selenium-based test classes.
- **src/test/java/Features:** Contains Cucumber feature files and step definition classes.

## Dependencies

- Selenium WebDriver: Automation tool for web applications.
- TestNG: Testing framework for organizing and executing tests.
- Cucumber: Tool for BDD testing.
- ChromeDriver: WebDriver implementation for Chrome browser automation.

## Notes

- Ensure you have a stable internet connection to download dependencies during Maven build.
- Modify the ChromeDriver path in the code if required.
- Update email addresses and passwords in the test data according to your test scenarios.
- Ensure the turtleninja website URL is accessible and functional for testing.

