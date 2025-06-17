## Test automation project using Appium, Cucumber and Java
<br/>
<p>This repository contains Appium-Cucumber-Java project to perform test automation on Example mobile app.</p>

---
<br/>

## Pre-requisites (Installations):
- JDK 17.0.1+
- Maven
- IntelliJ IDE
- Allure
- Appium
- Node.js
- Appium Inspector


## Dependencies:
- cucumber-java 7.2.3
- cucumber-testng 7.2.3
- cucumber-junit 7.2.3
- selenium-java 4.1.3
- appium java-client 7.6.0
- allure-cucumber7-jvm 2.17.3
- cucumber-compiler-plugin 3.10.1
- maven-surefire-plugin 3.0.0.M6
<br/>

## Running the Tests:
- Open project in IntelliJ IDE.
- Run TestNg.xml file.

## Reports:
Allure reports are generated in xml, html and json formats which are saved in allure-reports folder.
<br/>

After running the tests, open "Terminal" in IntelliJ IDE and write command allure serve allure-report to generate allure report using allure server.

```cmd
allure serve
```
<br/>

## Sample Test Reports:
<br/> 

<img src="./allure-results/Screenshots/Overview.png" width="600px;">
<br/><br/>

<img src="./allure-results/Screenshots/Graphs.png" width="600px;">

<br/><br/>

## Author:
This project was developed by Aldo Lim, and forked from [Tariful Islam Abir](https://github.com/tarif-qups).
