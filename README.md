<div align="center">
 <img  src="https://user-images.githubusercontent.com/68038931/147390936-c6228337-9787-4aab-b5d6-826bc8e4e4a3.gif" alt="test-light" width="1000" height="250" />
 </div>

<div align="center">
      <h1>  📲 Mobile Test Automation for "Sauce labs" mobile APK 📲 </h1>
  
 ![Screenshot 2023-04-27 205939](https://user-images.githubusercontent.com/68038931/234965123-d83a5fa8-bd9f-46ab-9d32-2ecfb7d25387.png) 
</div>
<br>
<div align="center">
</div>
 
- ### ⚙️ The main Frameworks included in the project:
	<a href="https://shafthq.github.io/" target="_blank"><img src="https://github.com/ShaftHQ/SHAFT_ENGINE/raw/main/src/main/resources/images/shaft.png" alt="SHAFT logo" width="100" height="50" id="logo"></a>
   <img src="https://github.com/ahmedkhaled14/SHAFT_Demo/assets/68038931/8b0d22b6-9909-4612-a1db-00c58c7e8717)"  width="100" height="50"/>
   <img src="https://github.com/ahmedkhaled14/SHAFT_Demo/assets/68038931/f0e8488b-d8ea-45c6-a978-5dc7058ed9f9)" width="100" height="50"/>
   <img src="https://github.com/ahmedkhaled14/SHAFT_Demo/assets/68038931/3a93afbf-067d-4ccc-9464-2a93ac83d08c)" width="100" height="50"/>
 
 ### 🏗️ Project Design:

 * Page Object Model (POM) design pattern
 * Fluent design approach
 * Data Driven framework
 * Java Docs

### 🏬 project Structure:
<img width="281" alt="Screenshot 2023-08-18 011751" src="https://github.com/ahmedkhaled14/SHAFT_Demo/assets/68038931/67894bff-1407-4f45-b92e-027d484fd8ee">

 
 ### 🗃️ Documentation
* **[Appium Docs](http://appium.io/docs/en/2.0/quickstart/)**
* **[SHAFT Engine Docs](https://shafthq.github.io/docs/Getting_Started/Prerequisites)**
 
 ### 🚧 Requirements & Setup

* install Java JDK-17 &  `set JAVA_HOME: C:\Users\yourUserName\jdk-17.0.8_windows-x64_bin\jdk-17.0.8 `
* Appium 2.0   `npm install -g appium@next`
* Maven ` 1-install maven  2-open Environment variables  3-open path and add  C:\Users\yourUserName\apache-maven-3.9.4-bin\apache-maven-3.9.4\bin `
* Android Emulator `you can use Android Studio`
* set new Environment variable: `ANDROID_HOME: C:\android-studio\data\sdk`
* Add 3 variables to the path in user variables:
`%ANDROID_HOME%\bin`
`%ANDROID_HOME%\tools`
`%ANDROID_HOME%\platform-tools`
 ### 🚀 Running Tests

* Start appium server: `appium` 
* start android emulator `use Android Studio AVD Manager `
### 🛸 Run tests open a terminal on the project root path:
* to run a specific testclass: `mvn test -Dtest="PackageName.TestClassName"`       
* to run all the test classes in the package: `mvn test -Dtest="PackageName**"`       
* to run a specific test case:  ` mvn test -Dtest="PackageName.TestClassName#TestMethodName"` 

* 🗃 Generate reports:
Summary Report & Allure Report will open automatically after Execution.

<div align="center">
      <h1>  📊 Allure Report 📊 </h1>
  </div>

<img width="921" alt="allure" src="https://github.com/ahmedkhaled14/SHAFT_Demo/assets/68038931/6fe4b50c-7806-4319-99c4-b4b575a3e00d">
<img width="921" alt="allure2" src="https://github.com/ahmedkhaled14/SHAFT_Demo/assets/68038931/3e1f91c1-3d6d-4f3d-93a5-09d2d5ffbcc7">

<div align="center">
      <h1>  📊 Summary Report  📊 </h1>
  </div>

<img width="921" alt="summary1" src="https://github.com/ahmedkhaled14/SHAFT_Demo/assets/68038931/8eebae33-57f4-434c-8484-e855c9076a98">
<img width="921" alt="summary2" src="https://github.com/ahmedkhaled14/SHAFT_Demo/assets/68038931/7f5601a7-afe0-4326-bcbb-a61b8445fea6">


 <div>
        </h5>
        <br>
        <hr class="rounded">
     <div align="center">
<h3 style="display:inline;">Test Cases Details</h3>  
        <div class="limiter">
        <div class="container-table100">
        <div class="wrap-table100">
        <div class="table100 ver5 m-b-110">
        <div class="table100-head">
          </div>
        <b>
        	<input class="rcorner" id="search" type="text" placeholder="Search for test cases.. ">
        </b>
        <select id='searchDropDown'>
            <option value="">Status</option>
          <center>
        	<option value='&#9989; PASSED'>&#9989; PASSED</option>
        	<option value='&#10060; FAILED'>&#10060; FAILED</option>
        	<option value='&#128679; SKIPPED'>&#128679; SKIPPED</option>
        </select>
        <br>
        </div>
        <div class="table100-body js-pscroll ps ps--active-y">
        <table>
        <thead>
        <tr class="row100 head">
        <th class="cell100 column1">Id</th>
        <th class="cell100 column2">Suite</th>
        <th class="cell100 column3">Name</th>
        <th class="cell100 column4">Error</th>
        <th class="cell100 column5">Status</th>
        <th class="cell100 column6">Has issue</th>
        </tr>
        </thead>
        <tbody id="table"><tr class="row100 body"><td class="cell100 column1">1</td><td class="cell100 column2">sauceLabsTests.LoginFeatureTest</td><td class="cell100 column3">TC1: login Using Valid Email And Password</td><td class="cell100 column4"></td><td class="cell100 column5">&#9989; PASSED</td><td class="cell100 column6">No</td></tr><tr class="row100 body"><td class="cell100 column1">2</td><td class="cell100 column2">sauceLabsTests.LoginFeatureTest</td><td class="cell100 column3">TC2: login Using Invalid Email or Password/td><td class="cell100 column4"></td><td class="cell100 column5">&#9989; PASSED</td><td class="cell100 column6">No</td></tr><tr class="row100 body"><td class="cell100 column1">3</td><td class="cell100 column2">sauceLabsTests.CartFeatureTest</td><td class="cell100 column3">TC3: Add Item To The Cart And Validate Title And Price Of The Item</td><td class="cell100 column4"></td><td class="cell100 column5">&#9989; PASSED</td><td class="cell100 column6">No</td></tr><tr class="row100 body"><td class="cell100 column1">4</td><td class="cell100 column2">sauceLabsTests.CartFeatureTest</td><td class="cell100 column3">TC4: Removing Items From The Cart And Validate That The Cart Is Empty</td><td class="cell100 column4"></td><td class="cell100 column5">&#9989; PASSED</td><td class="cell100 column6">No</td></tr><tr class="row100 body"><td class="cell100 column1">5</td><td class="cell100 column2">sauceLabsTests.CartFeatureTest</td><td class="cell100 column3">TC5: Online Ordering E2E Scenario</td><td class="cell100 column4"></td><td class="cell100 column5">&#9989; PASSED</td><td class="cell100 column6">No</td></tr></tbody>
        </table>
        <div class="ps__rail-x" style="left: 0px; bottom: 0px;"><div class="ps__thumb-x" tabindex="0" style="left: 0px; width: 0px;"></div></div></div>
        <br>
        </div>
        </div>
        </div>
        </div>
        <br><br>
    </div>


