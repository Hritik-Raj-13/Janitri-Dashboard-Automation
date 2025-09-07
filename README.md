
---

```markdown
# Janitri Dashboard Login Page Automation

This project automates the **Login Page UI** of the [Janitri Dashboard](https://dev-dash.janitri.in)  
using **Java, Selenium WebDriver, TestNG, and the Page Object Model (POM) design pattern**.

---

## 📌 Project Overview
The goal of this project is to validate the **UI and functionality** of the Janitri login page with automated test cases.  
It covers **positive and negative scenarios**, including login button behavior, invalid credential handling,  
password masking toggle, and presence of essential page elements.

---

##  Project Structure


---

## ⚙️ Tools & Technologies
- **Java 17**
- **Selenium WebDriver 4.x**
- **TestNG 7.x**
- **Maven** (Dependency management & build tool)
- **WebDriverManager** (Handles browser driver binaries)
- **Page Object Model (POM)** (Design pattern for reusability)

---

##  Setup Instructions

### 1. Clone Repository
```bash
git clone https://github.com/<your-username>/JanitriLoginAutomation.git
cd JanitriLoginAutomation
````

### 2. Install Dependencies

```bash
mvn clean install
```

### 3. Run Tests

Run all tests with TestNG:

```bash
mvn test
```

Or run a specific test class:

```bash
mvn -Dtest=LoginTests test
```

---

## 🧪 Automated Test Scenarios

1. **Blank Fields Validation** – Verify login button is disabled when fields are empty.
2. **Invalid Login Attempt** – Enter random credentials and verify error message.
3. **Password Masking Toggle** – Check that password is hidden by default and visible when eye icon is clicked.
4. **UI Validation** – Ensure presence of all essential elements:

   * Email field
   * Password field
   * Login button
   * Password visibility toggle

---

## 📝 Locators Used

* **Email Field** → `#formEmail`
* **Password Field** → `#formPassword`
* **Login Button** → `.login-button`
* **Password Toggle (Eye Icon)** → `.password-visible`
* **Error Message** → `.invalid-credential-div`

---

## 📊 Sample TestNG Report

After test execution, TestNG generates an HTML report at:

```
/test-output/index.html
```

Open it in a browser to view detailed test results.

---

## 📌 Notes

* The framework is kept **simple (no BDD/Cucumber)** to focus on Selenium + TestNG + POM.
* You may extend it with **Allure Reports** or **Jenkins CI/CD integration** later.
* Make sure to update **browser drivers** or use **WebDriverManager** for smooth execution.



---
Do you want me to also include a **TestNG XML suite file** example in the README so anyone cloning your repo can run all tests without touching code?
```
