# E-Commerce Automation Testing Project

This project automates the testing of an e-commerce website's **Search** and **Add to Cart** functionalities using **Selenium WebDriver** and **TestNG**. Maven is used as the build and dependency management tool.

## Project Structure
/ecommerce
│
├── src/test/java/com/example/tests/ECommerceTest.java
├── pom.xml
├── testng.xml
├── .classpath
└── .project

markdown
Copy
Edit

## Technologies Used
- Java
- Selenium WebDriver 4.21.0
- TestNG 7.10.2
- Maven
- Spring Boot Starter Test 3.3.0 (for future scope)

## Setup Instructions

### Prerequisites
- JDK 8 or higher installed.
- Maven installed and configured in system path.
- Chrome Browser installed.
- ChromeDriver (compatible with Chrome browser version) downloaded and its path set in system environment variables or configured in code.

### Clone the Project
```bash
git clone <repository-url>
cd ecommerce
Build the Project
bash
Copy
Edit
mvn clean install
Run the Tests
bash
Copy
Edit
mvn test
Or using TestNG suite:

bash
Copy
Edit
mvn clean test -DsuiteXmlFile=testng.xml
Test Cases Covered
Search for Non-Existing Product

Expected: "No results found" message.

Search for Existing Product (e.g., Laptop)

Expected: Product list displayed.

Add Product to Cart

Expected: Product successfully added to the cart.

Important Files
pom.xml : Maven dependencies.

testng.xml : TestNG Suite configuration.

/src/test/java/com/example/tests/ECommerceTest.java : Test scripts.

Notes
Ensure ChromeDriver version matches your installed Chrome browser.

You can update the browser driver path in the test code if needed.

kotlin
Copy
Edit
