Feature: SETUP

  @TC_01
  Scenario: Setup:Installer
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Installer button
    Then Select valid status "All" in Installer Page
    And Select valid status "ENABLED" in Installer Page
    Then Select valid status "DISABLED" in Installer Page
    Then Close the Setup Page

  @TC_02
  Scenario: Setup:Installer
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Installer button
    Then Enter valid installer name "Test" in searchbox in Installer Page
    Then Close the Setup Page

  @TC_03
  Scenario: Setup:Installer
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Installer button
    Then Click add button in Installer Page
    And Click save button in add Installer Page
    Then Check mandatory message is displayed or not in Installer Page
    Then Close the Setup Page

  @TC_04
  Scenario: Setup:Installer
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Installer button
    Then Click add button in Installer Page
    And Enter installer name "Test" in add installer page
    Then Select valid country name "UNITED STATES" in add installer page
    And Select valid state name "Alabama" in add installer page
    Then Enter valid Address1 name "Test" in add installer page
    And Enter valid Address2 name "Test" in add installer page
    Then Enter valid city name "Test" in add installer page
    And Enter valid Zip Code "234567" in add installer page
    Then Enter valid Phone number "1234567890" in add installer page
    And Enter valid Email "0211thiru@gmail.com" in add installer page
    And Click clear button in add Installer Page
    Then Close the Setup Page

  @TC_05
  Scenario: Setup:Installer
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Installer button
    Then Click add button in Installer Page
    And Enter installer name "Test" in add installer page
    Then Select valid country name "UNITED STATES" in add installer page
    And Select valid state name "Alabama" in add installer page
    Then Enter valid Address1 name "Test" in add installer page
    And Enter valid Address2 name "Test" in add installer page
    Then Enter valid city name "Test" in add installer page
    And Enter valid Zip Code "234567" in add installer page
    Then Enter valid Phone number "1234567890" in add installer page
    And Enter valid Email "0211thiru@gmail.com" in add installer page
    And Click save button in add Installer Page
    Then Check success message is displayed or not in add Installer Page
    Then Close the Setup Page

  @TC_06
  Scenario: Setup:Installer
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Installer button
    Then Click add button in Installer Page
    And Click back button in add Installer Page
    Then Close the Setup Page

  @TC_07
  Scenario: Setup:Installer
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Installer button
    And Enter valid installer name "Test" in searchbox in Installer Page
    Then Click edit button in Installer Page
    And Click actions button in Installer Page
    And Click back button in edit Installer Page
    Then Close the Setup Page

  @TC_08
  Scenario: Setup:Installer
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Installer button
    And Enter valid installer name "Test" in searchbox in Installer Page
    Then Click edit button in Installer Page
    And Click actions button in Installer Page
    Then Click edit installer button in Installer Page
    And Click clear button in edit Installer Page
    Then Close the Setup Page

  @TC_09
  Scenario: Setup:Installer
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Installer button
    And Enter valid installer name "Test" in searchbox in Installer Page
    Then Click edit button in Installer Page
    And Click actions button in Installer Page
    Then Click edit installer button in Installer Page
    And Click clear button in edit Installer Page
    Then Click update button in edit Installer Page
    And Check mandatory message is displayed or not in Installer Page
    Then Close the Setup Page

  @TC_10
  Scenario: Setup:Installer
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Installer button
    And Enter valid installer name "Test" in searchbox in Installer Page
    Then Click edit button in Installer Page
    And Click actions button in Installer Page
    Then Click edit installer button in Installer Page
    And Modify valid details in edit Installer Page
    Then Click update button in edit Installer Page
    And Check success message is displayed or not in Installer Page
    Then Close the Setup Page

  @TC_11
  Scenario: Setup:Installer
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Installer button
    And Enter valid installer name "Test" in searchbox in Installer Page
    Then Click edit button in Installer Page
    And Click profile photo button in edit installer page
    Then Click save button in profile photo button in edit installer page
    And Check success message is displayed or not in Installer Page
    Then Close the Setup Page

  @TC_12
  Scenario: Setup:Installer
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Installer button
    And Enter valid installer name "Test" in searchbox in Installer Page
    Then Click edit button in Installer Page
    And Click profile photo button in edit installer page
    Then Click close button in profile photo button in edit installer page
    Then Close the Setup Page

  @TC_13
  Scenario: Setup:Installer
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Installer button
    And Enter valid installer name "Test" in searchbox in Installer Page
    Then Click edit button in Installer Page
    And Click profile photo button in edit installer page
    Then Upload valid profile photo in edit installer page
    Then Click save button in profile photo button in edit installer page
    And Check success message is displayed or not in Installer Page
    Then Close the Setup Page

  @TC_14
  Scenario: Setup:Installer
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Installer button
    And Enter valid installer name "Test" in searchbox in Installer Page
    Then Click edit button in Installer Page
    And Click actions button in Installer Page
    Then Click add investment details in edit installer page
    And Click close button in add investment page
    Then Close the Setup Page

  @TC_15
  Scenario: Setup:Installer
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Installer button
    And Enter valid installer name "Test" in searchbox in Installer Page
    Then Click edit button in Installer Page
    And Click actions button in Installer Page
    Then Click add investment details in edit installer page
    And Click save button in add investment page
    And Check mandatory message is displayed or not in edit Installer Page
    Then Close the Setup Page

  @TC_16
  Scenario: Setup:Installer
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Installer button
    And Enter valid installer name "Test" in searchbox in Installer Page
    Then Click edit button in Installer Page
    And Click actions button in Installer Page
    Then Click add investment details in edit installer page
    And Select valid transaction date in add investment page
    Then Enter valid amount in add investment page
    And Click save button in add investment page
    And Check success message is displayed or not in Installer Page
    Then Close the Setup Page

  @TC_17
  Scenario: Setup:Installer
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Installer button
    And Enter valid installer name "Test" in searchbox in Installer Page
    Then Click edit button in Installer Page
    Then Click edit button in investment details in edit installer page
    And Click clear button in edit investment page
    Then Close the Setup Page

  @TC_18
  Scenario: Setup:Installer
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Installer button
    And Enter valid installer name "Test" in searchbox in Installer Page
    Then Click edit button in Installer Page
    Then Click edit button in investment details in edit installer page
    And Click clear button in edit investment page
    Then Click save button in edit investment page
    And Check mandatory message is displayed or not in edit investment Page
    Then Close the Setup Page

  @TC_19
  Scenario: Setup:Installer
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Installer button
    And Enter valid installer name "Test" in searchbox in Installer Page
    Then Click edit button in Installer Page
    Then Click edit button in investment details in edit installer page
    And Modify valid details in edit investment page
    Then Click save button in edit investment page
    And Check success message is displayed or not in Installer Page
    Then Close the Setup Page

  @TC_20
  Scenario: Setup:Installer
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Installer button
    And Enter valid installer name "Test" in searchbox in Installer Page
    Then Click edit button in Installer Page
    And Click bank setup button in installer page
    Then Select any checkbox in bank setup tab
    And Click update button in bank setup tab
    Then Close the Setup Page

  @TC_21
  Scenario: Setup:Installer
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Installer button
    And Enter valid installer name "Test" in searchbox in Installer Page
    Then Click edit button in Installer Page
    And Click NSF setup button in installer page
    Then Click update button in NSF Setup tab
    And Check success message is displayed or not in Installer Page
    Then Close the Setup Page

  @TC_22
  Scenario: Setup:Installer
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Installer button
    And Enter valid installer name "Test" in searchbox in Installer Page
    Then Click edit button in Installer Page
    And Click NSF setup button in installer page
    Then Click no radio button in enable NSF tab
    And Select number of attempts "2" in NSF Setup tab
    Then Select number of days "3" in NSF Setup tab
    Then Click clear button in NSF Setup tab
    Then Close the Setup Page

  @TC_23
  Scenario: Setup:Installer
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Installer button
    And Enter valid installer name "Test" in searchbox in Installer Page
    Then Click edit button in Installer Page
    And Click NSF setup button in installer page
    Then Click no radio button in enable NSF tab
    And Select number of attempts "2" in NSF Setup tab
    Then Select number of days "3" in NSF Setup tab
    Then Click update button in NSF Setup tab
    And Check success message is displayed or not in Installer Page
    Then Close the Setup Page

  @TC_24
  Scenario: Setup:Installer
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Installer button
    And Enter valid installer name "Test" in searchbox in Installer Page
    Then Click edit button in Installer Page
    And Click NSF setup button in installer page
    Then Click yes radio button in enable NSF tab
    And Enter the amount "10" in NSF Setup tab
    And Select number of attempts "2" in NSF Setup tab
    Then Select number of days "3" in NSF Setup tab
    Then Click update button in NSF Setup tab
    And Check success message is displayed or not in Installer Page
    Then Close the Setup Page

  @TC_25
  Scenario: Setup:Installer
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Installer button
    And Enter valid installer name "Test" in searchbox in Installer Page
    Then Click edit button in Installer Page
    And Click Email Notification button in installer page
    Then Click check all button in email notification tab
    Then Close the Setup Page

  @TC_26
  Scenario: Setup:Installer
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Installer button
    And Enter valid installer name "Test" in searchbox in Installer Page
    Then Click edit button in Installer Page
    And Click Email Notification button in installer page
    Then Click check all button in email notification tab
    And Click clear all button in email notification tab
    Then Close the Setup Page

  @TC_27
  Scenario: Setup:Installer
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Installer button
    And Enter valid installer name "Test" in searchbox in Installer Page
    Then Click edit button in Installer Page
    And Click Email Notification button in installer page
    Then Modify valid details in email notification tab
    Then Click actions button in email notification tab
    And Click udpate button in email notification tab
    Then Check success message is displayed or not in email notification tab
    Then Close the Setup Page

  @TC_28
  Scenario: Setup:Installer
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Installer button
    And Enter valid installer name "Test" in searchbox in Installer Page
    Then Click edit button in Installer Page
    And Click Email Notification button in installer page
    And Click check all button in email notification tab
    Then Select valid signature option "Vignesh S" in email notification tab
    And Enter valid Payment Reminder Days "5" in email notification tab
    Then Enter valid host name "Test Port" in email notification tab
    And Enter valid email address "0211thiru@gmail.com" in email notification tab
    Then Enter valid password "123123123" in email notification tab
    And Enter valid port number "1234" in email notification tab
    Then Click actions button in email notification tab
    And Click udpate button in email notification tab
    Then Check success message is displayed or not in Installer Page
    Then Close the Setup Page
@Test
  @TC_29
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Select valid status "All" in Investor Page
    And Select valid status "ENABLED" in Investor Page
    Then Select valid status "DISABLED" in Investor Page
    Then Close the Setup Page
@Test
  @TC_30
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Close the Setup Page
@Test
  @TC_31
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Click add button in Investor Page
    And Click save button in add Investor Page
    Then Check mandatory message is displayed or not in Investor Page
    Then Close the Setup Page
@Test
  @TC_32
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Click add button in Investor Page
    And Enter valid investor name "Test Investor" in investor name field
    Then Select valid country name "UNITED STATES" in add investor page
    And Select valid state name "Alabama" in add investor page
    And Click clear button in add Investor Page
    Then Close the Setup Page
@Test
  @TC_33
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Click add button in Investor Page
    And Enter valid investor name "Test Investor" in investor name field
    Then Select valid country name "UNITED STATES" in add investor page
    And Select valid state name "Alabama" in add investor page
    And Click save button in add Investor Page
    Then Check success message is displayed or not in Investor Page
    Then Close the Setup Page
@Test
  @TC_34
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Click add button in Investor Page
    And Click back button in add Investor Page
    Then Close the Setup Page
@Test
  @TC_35
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    Then Click actions button in edit investor page
    And Click back button in edit Investor Page
    Then Close the Setup Page
@Test
  @TC_36
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    Then Click actions button in edit investor page
    And Click edit investor button in edit investor page
    And Click clear button in edit Investor Page
    Then Close the Setup Page
@Test
  @TC_37
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    Then Click actions button in edit investor page
    And Click edit investor button in edit investor page
    And Click back button in add Investor Page
    Then Close the Setup Page
@Test
  @TC_38
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    Then Click actions button in edit investor page
    And Click edit investor button in edit investor page
    And Click clear button in edit Investor Page
    Then Click update button in edit Investor Page
    And Check mandatory message is displayed or not in Investor Page
    Then Close the Setup Page
@Test
  @TC_39
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    Then Click actions button in edit investor page
    And Click edit investor button in edit investor page
    And Modify valid details in edit Investor Page
    Then Click update button in edit Investor Page
    And Check success message is displayed or not in Investor Page
    Then Close the Setup Page
@Test
  @TC_40
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    And Click edit button in customer tab
    And Select the checkbox of the customer in customer tab
    Then Click actions button in edit investor page
    And Click update button in action edit investor page
    Then Close the Setup Page
@Test
  @TC_41
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    And Click edit button in customer tab
    Then Enter valid name "Test" in the search box of customer tab
    Then Close the Setup Page
@Test
  @TC_42
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    And Click edit button in customer tab
    Then Click select all check box in customer tab
    Then Close the Setup Page
@Test
  @TC_43
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    And Click edit button in customer tab
    Then Click select all check box in customer tab
    Then Click unselect the check box in customer tab
    Then Close the Setup Page
@Test
  @TC_44
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    And Click edit button in customer tab
    Then Click one check box in customer tab
    Then Click actions button in edit investor page
    And Click update button in action edit investor page
    Then Close the Setup Page
@Test
  @TC_45
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    And Click transaction button in Investor Page
    Then Click actions button in edit investor page
    And Click add transaction button in edit investor page
    Then Click save button in add transaction pages
    And Check mandatory message is displayed or not in Investor Page
    Then Close the Setup Page
@Test
  @TC_46
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    And Click transaction button in Investor Page
    Then Click actions button in edit investor page
    And Click add transaction button in edit investor page
    Then Select valid transaction date in date tab
    And Enter valid amount "10" in amount tab
    Then Upload valid file in the attachement field tab
    Then Click clear button in add transaction page
    Then Close the Setup Page
@Test
  @TC_47
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    And Click transaction button in Investor Page
    Then Click actions button in edit investor page
    And Click add transaction button in edit investor page
    Then Select valid transaction date in date tab
    And Enter valid amount "10" in amount tab
    Then Upload valid file in the attachement field tab
    Then Click save button in add transaction page
    Then Close the Setup Page
@Test
  @TC_48
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    And Click transaction button in Investor Page
    Then Click actions button in edit investor page
    And Click add transaction button in edit investor page
    Then Click back button in add transaction page
    Then Close the Setup Page
@Test
  @TC_49
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    And Click transaction button in Investor Page
    And Click edit transaction button in edit investor page
    Then Click back button in edit transaction page
    Then Close the Setup Page
@Test
  @TC_50
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    And Click transaction button in Investor Page
    And Click edit transaction button in edit investor page
    Then Click clear button in add transaction page
    Then Close the Setup Page
@Test
  @TC_51
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    And Click transaction button in Investor Page
    And Click edit transaction button in edit investor page
    Then Click clear button in edit transaction page
    And Click update button in edit transaction page
    Then Check mandatory message is displayed or not in Investor Page
    Then Close the Setup Page
@Test
  @TC_52
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    And Click transaction button in Investor Page
    And Click edit transaction button in edit investor page
    Then Modify valid details in edit transaction page
    And Click update button in edit transaction page
    Then Check success message is displayed or not in Investor Page
    Then Close the Setup Page
@Test
  @TC_53
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    And Click documents button in Investor Page
    Then Click actions button in edit investor page
    And Click add documents button in edit investor page
    Then Click save button in add transactions page
    Then Check mandatory message is displayed or not in Investor Page
    Then Close the Setup Page
@Test
  @TC_54
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    And Click documents button in Investor Page
    Then Click actions button in edit investor page
    And Click add documents button in edit investor page
    Then Enter valid file name "Test" in add documents
    And Upload valid file in add documents
    Then Click save button in add transaction page
    Then Close the Setup Page
@Test
  @TC_55
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    And Click documents button in Investor Page
    Then Click actions button in edit investor page
    And Click add documents button in edit investor page
    Then Click back button in add transaction page
    Then Close the Setup Page
@Test
  @TC_56
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    And Click documents button in Investor Page
    And Click edit documents button in edit investor page
    Then Click back button in edit transaction page
    Then Close the Setup Page
@Test
  @TC_57
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    And Click documents button in Investor Page
    And Click edit documents button in edit investor page
    Then Click clear details in edit transaction page
    And Click update button in edit transaction page
    Then Check mandatory message is displayed or not in Investor Page
    Then Close the Setup Page
@Test
  @TC_58
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    And Click documents button in Investor Page
    And Click edit documents button in edit investor page
    Then Modify valid detail in edit transaction page
    And Click update button in edit transaction page
    Then Check success message is displayed or not in Investor Page
    Then Close the Setup Page
@Test
  @TC_59
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    And Click news feeds button in Investor Page
    Then Click actions button in edit investor page
    And Click add news feeds button in edit investor page
    Then Click save button in add news feeds page
    Then Check mandatory message is displayed or not in add news feeds Page
    Then Close the Setup Page
@Test
  @TC_60
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    And Click news feeds button in Investor Page
    Then Click actions button in edit investor page
    And Click add news feeds button in edit investor page
    Then Enter valid title name "Test" in add news feeds page
    And Enter valid news feeds "Test" in add news feeds page
    Then Click save button in add news feeds page
    Then Check success message is displayed or not in Investor Page
    Then Close the Setup Page
@Test
  @TC_61
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    And Click news feeds button in Investor Page
    And Click edit feeds button in edit investor page
    Then Clear the title details in edit investor page
    Then Click upload button in add news feeds page
    Then Check mandatory message is displayed or not in add news feeds Page
    Then Close the Setup Page
@Test
  @TC_62
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    And Click news feeds button in Investor Page
    And Click edit feeds button in edit investor page
    Then Modify valid details in edit news feeds page
    Then Click upload button in add news feeds page
    Then Check success message is displayed or not in Investor Page
    Then Close the Setup Page
@Test
  @TC_63
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    And Click Investor Representative button in Investor Page
    Then Click check all button in Investor Representative page
    Then Close the Setup Page
@Test
  @TC_64
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    And Click Investor Representative button in Investor Page
    Then Click clear all button in Investor Representative page
    Then Close the Setup Page
@Test
  @TC_65
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    And Click Investor Representative button in Investor Page
    Then Select valid checkbox in Investor Representative page
    Then Click actions button in edit investor page
    And Click submit button in Investor Representative page
    Then Close the Setup Page

  @TC_66
  Scenario: Setup:Customer Group
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Customer Group button
    Then Select valid status "All" in Customer Group Page
    And Select valid status "Enabled" in Customer Group Page
    Then Select valid status "Disabled" in Customer Group Page
    Then Close the Setup Page

  @TC_67
  Scenario: Setup:Customer Group
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Customer Group button
    Then Enter valid name "Test" in searchbox in Customer Group Page
    Then Close the Setup Page

  @TC_68
  Scenario: Setup:Customer Group
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Customer Group button
    Then Click add button in Customer Group Page
    And Click close button in Add Customer Group Page
    Then Close the Setup Page

  @TC_69
  Scenario: Setup:Customer Group
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Customer Group button
    Then Click add button in Customer Group Page
    And Click save button in Add Customer Group Page
    Then Check mandatory message is displayed or not in Add Customer Group Page
    Then Close the Setup Page

  @TC_70
  Scenario: Setup:Customer Group
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Customer Group button
    Then Click add button in Customer Group Page
    And Select valid installer "Test Client" name in Add Customer Group Page
    Then Enter valid group name "Test" in Add Customer Group Page
    And Click clear button in Add Customer Group Page
    Then Check group name is clear or not in Add Customer Group Page
    Then Close the Setup Page

  @TC_71
  Scenario: Setup:Customer Group
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Customer Group button
    Then Click add button in Customer Group Page
    And Select valid installer "Test Client" name in Add Customer Group Page
    Then Enter valid group name "Test" in Add Customer Group Page
    And Click save button in Add Customer Group Page
    Then Check success message is displayed or not in Add Customer Group Page
    Then Close the Setup Page

  @TC_72
  Scenario: Setup:Customer Group
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Customer Group button
    Then Enter valid name "Test" in searchbox in Customer Group Page
    Then Click edit button in Customer Group Page
    And Click clear button in edit Customer Group Page
    Then Check group name is clear or not in edit Customer Group Page
    Then Close the Setup Page

  @TC_73
  Scenario: Setup:Customer Group
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Customer Group button
    Then Enter valid name "Test" in searchbox in Customer Group Page
    Then Click edit button in Customer Group Page
    And Click clear button in edit Customer Group Page
    Then Click update button in edit Customer Group Page
    Then Check mandatory message is displayed or not in edit Customer Group Page
    Then Close the Setup Page

  @TC_74
  Scenario: Setup:Customer Group
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Customer Group button
    Then Enter valid name "Test" in searchbox in Customer Group Page
    Then Click edit button in Customer Group Page
    And Modify valid details in edit Customer Group Page
    Then Click update button in edit Customer Group Page
    Then Check success message is displayed or not in edit Customer Group Page
    Then Close the Setup Page

  @TC_75
  Scenario: Setup:API Setup
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click API Setup button
    Then Select valid status "All" in API Setup Page
    And Select valid status "Enabled" in API Setup Page
    Then Select valid status "Disabled" in API Setup Page
    Then Close the Setup Page

  @TC_76
  Scenario: Setup:API Setup
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click API Setup button
    Then Enter valid name "Test" in searchbox in API Setup Page
    Then Close the Setup Page

  @TC_77
  Scenario: Setup:API Setup
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click API Setup button
    Then Click add button in API Setup Page
    And Click close button in Add CRM Setup Details popup
    Then Close the Setup Page

  @TC_78
  Scenario: Setup:API Setup
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click API Setup button
    Then Click add button in API Setup Page
    And Click save button in Add CRM Setup Details popup
    #  Then Check mandatory message is displayed or not in Add CRM Setup Details popup
    Then Close the Setup Page

  @TC_79
  Scenario: Setup:API Setup
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click API Setup button
    Then Click add button in API Setup Page
    And Select valid installer "Test Client" name in Add CRM Setup Details popup
    Then Select valid CRM name "Test" in Add CRM Setup Details popup
    And Upload valid file in Add CRM Setup Details popup
    And Click clear button in Add CRM Setup Details popup
    Then Check group name is clear or not in Add CRM Setup Details popup
    Then Close the Setup Page

  @TC_80
  Scenario: Setup:API Setup
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click API Setup button
    Then Click add button in API Setup Page
    And Select valid installer "Test Client" name in Add CRM Setup Details popup
    Then Select valid CRM name "Test" in Add CRM Setup Details popup
    And Upload valid file in Add CRM Setup Details popup
    And Click save button in Add Customer Group Page
    Then Check success message is displayed or not in Add CRM Setup Details popup
    Then Close the Setup Page

  @TC_81
  Scenario: Setup:API Setup
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click API Setup button
    Then Click add button in API Setup Page
    Then Click add button in CRM name field
    And Click close button in Add CRM name
    Then Close the Setup Page

  @TC_82
  Scenario: Setup:API Setup
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click API Setup button
    Then Click add button in API Setup Page
    Then Click add button in CRM name field
    And Enter valid CRM Name in CRM name field
    And Click clear button in Add CRM name pop up
    Then Close the Setup Page

  @TC_83
  Scenario: Setup:API Setup
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click API Setup button
    Then Click add button in API Setup Page
    Then Click add button in CRM name field
    And Enter valid CRM Name in CRM name field
    And Click save button in Add CRM name pop up
    Then Close the Setup Page

  @TC_84
  Scenario: Setup:API Setup
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click API Setup button
    Then Click add button in API Setup Page
    And Select valid CRM name "Test" in Add CRM Setup Details popup
    Then Click edit button in CRM name field
    And Modify valid details in edit CRM name field
    And Click save button in edit CRM name pop up
    Then Close the Setup Page

  @TC_85
  Scenario: Setup:API Setup
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click API Setup button
    Then Click edit button in API Setup Page
    And Click API Key button in API Setup Page
    Then Click clear button in API key tab
    Then Close the Setup Page

  @TC_86
  Scenario: Setup:API Setup
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click API Setup button
    Then Click edit button in API Setup Page
    And Click API Key button in API Setup Page
    Then Click clear button in API key tab
    And Click update button in API key tab
    Then Check mandatory message is displayed or not in API key tab
    Then Close the Setup Page

  @TC_87
  Scenario: Setup:API Setup
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click API Setup button
    Then Click edit button in API Setup Page
    And Click API Key button in API Setup Page
    Then Modify valid details in API key tab
    And Click update button in API key tab
    Then Check mandatory message is displayed or not in API key tab
    Then Close the Setup Page

  @TC_88
  Scenario: Setup:API Setup
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click API Setup button
    Then Click edit button in API Setup Page
    And Click Application Login button in API Setup Page
    Then Click clear button in Application Login tab
    Then Close the Setup Page

  @TC_89
  Scenario: Setup:API Setup
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click API Setup button
    Then Click edit button in API Setup Page
    And Click Application Login button in API Setup Page
    Then Click clear button in Application Login tab
    And Click update button in Application Login tab
    Then Check mandatory message is displayed or not in Application Login tab
    Then Close the Setup Page

  @TC_90
  Scenario: Setup:API Setup
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click API Setup button
    Then Click edit button in API Setup Page
    And Click Application Login button in API Setup Page
    Then Modify valid details in Application Login tab
    And Click update button in Application Login tab
    Then Check mandatory message is displayed or not in Application Login tab
    Then Close the Setup Page

  @TC_91
  Scenario: Setup:API Setup
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click API Setup button
    Then Click edit button in API Setup Page
    And Click Data Refresh button in API Setup Page
    Then Modify the details in Data Refresh
    And Click save button in Data Refresh
    Then Check success message is displayed or not in Data Refresh
    Then Close the Setup Page

  @TC_92
  Scenario: Setup:API Setup
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click API Setup button
    Then Click edit button in API Setup Page
    And Click Data Refresh button in API Setup Page
    Then Click view log button in data refresh
    And Click close button in data refresh
    Then Close the Setup Page

  @TC_93
  Scenario: Setup:API Setup
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click API Setup button
    Then Click edit button in API Setup Page
    And Click Scheduler log button in API Setup Page
    Then Select valid from date in Scheduler log
    Then Close the Setup Page

  @TC_94
  Scenario: Setup:API Setup
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click API Setup button
    Then Click edit button in API Setup Page
    And Click Customers button in API Setup Page
    And Click edit button in customers
    Then Click Sync Customer button in customers
    # Then Check success message is displayed or not in Sync Customer
    Then Close the Setup Page

  @TC_95
  Scenario: Setup:API Setup
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click API Setup button
    Then Click edit button in API Setup Page
    And Click Customers button in API Setup Page
    And Click edit button in customers
    Then Click Deactivate API Call button in customers
    And Click close button in confirmation pop up
    Then Close the Setup Page

  @TC_96
  Scenario: Setup:API Setup
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click API Setup button
    Then Click edit button in API Setup Page
    And Click Customers button in API Setup Page
    And Click edit button in customers
    Then Click Deactivate API Call button in customers
    And Click yes button in confirmation pop up
    Then Check mandatory message is displayed or not in Sync Customer
    Then Close the Setup Page

  @TC_97
  Scenario: Setup:API Setup
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click API Setup button
    Then Click edit button in API Setup Page
    And Click Customers button in API Setup Page
    And Click edit button in customers
    Then Enter valid "1" details in first year production
    And Enter valid "1" details in Product Escalation
    Then Click Deactivate API Call button in customers
    And Click no button in confirmation pop up
    Then Close the Setup Page

  @TC_98
  Scenario: Setup:API Setup
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click API Setup button
    Then Click edit button in API Setup Page
    And Click Customers button in API Setup Page
    And Click edit button in customers
    Then Enter valid "1" details in first year production
    And Enter valid "1" details in Product Escalation
    Then Click Deactivate API Call button in customers
    And Click yes button in confirmation pop up
    Then Check success message is displayed or not in Sync Customer
    Then Close the Setup Page

     @TC_99
  Scenario: Setup:API Setup
    Given To Check Setup User is navigating to CGI URL is "https://www.hedgeonline.us/RCGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@1234"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click API Setup button
    Then Click edit button in API Setup Page
    And Click action button in API Setup Page
    Then Click back button in API Setup Page
    Then Close the Setup Page