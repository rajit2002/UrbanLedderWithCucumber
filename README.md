# 🛋️ Urban Ladder Automation with Cucumber & Selenium

This project automates end-to-end testing of the [Urban Ladder](https://www.urbanladder.com/) website using **Selenium WebDriver**, **Cucumber**, and **Java**. It covers key user scenarios like searching for a product, applying filters, adding items to the cart, and proceeding to checkout — all implemented using the BDD (Behavior Driven Development) approach.

---

## 🚀 Objective

To validate the core functionalities of the Urban Ladder website through automated browser tests using Cucumber + Selenium + Java.

---

## ✅ Features Automated

1. **Verify Home Page Loads Successfully**
   - Launch the website and ensure the home page loads correctly.

2. **Search for a Product**
   - Search for `"Sofa"` using the search bar.
   - Verify that search results are displayed.

3. **Filter Search Results**
   - Apply filters like **Price**, **Material**, or **Category**.
   - Validate the updated results after applying filters.

4. **Add a Product to the Cart**
   - Click on a product from the search results.
   - Add it to the cart and confirm successful addition.

5. **Proceed to Checkout**
   - Navigate to the cart.
   - Click the "Checkout" button.
   - Enter dummy shipping details (if prompted).
   - Verify redirection to the payment page (without completing payment).

---

## 🛠️ Tech Stack

- **Java**
- **Selenium WebDriver**
- **Cucumber (BDD)**
- **JUnit / TestNG**
- **Maven**
- **Cucumber Reports** / **Extent Reports**

---

## 📁 Project Structure

```plaintext
UrbanLedderCucumberAssignment/
│
├── src/test/java/
│   ├── stepDefinitions/         # Step definition files
│   ├── runners/                 # Test runner class
│   └── features/                # Gherkin feature files
│
├── pom.xml                      # Maven dependencies
└── README.md                    # Project documentation
