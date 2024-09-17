Feature: SETUP

  @TC_01
  Scenario: Setup:Installer
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Installer button
    Then Select valid status "All" in Installer Page
    And Select valid status "ENABLED" in Installer Page
    Then Select valid status "DISABLED" in Installer Page
    Then Close the Setup Page

  @TC_02
  Scenario: Setup:Installer
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Installer button
    Then Enter valid installer name "Test" in searchbox in Installer Page
    Then Close the Setup Page

  @TC_03
  Scenario: Setup:Installer
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Installer button
    Then Click add button in Installer Page
    And Click save button in add Installer Page
    Then Check mandatory message is displayed or not in Installer Page
    Then Close the Setup Page

  @TC_04
  Scenario: Setup:Installer
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Installer button
    Then Click add button in Installer Page
    And Click back button in add Installer Page
    Then Close the Setup Page

  @TC_07
  Scenario: Setup:Installer
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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

  @TC_29
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Select valid status "All" in Investor Page
    And Select valid status "ENABLED" in Investor Page
    Then Select valid status "DISABLED" in Investor Page
    Then Close the Setup Page

  @TC_30
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Close the Setup Page

  @TC_31
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Click add button in Investor Page
    And Click save button in add Investor Page
    Then Check mandatory message is displayed or not in Investor Page
    Then Close the Setup Page

  @TC_32
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Click add button in Investor Page
    And Enter valid investor name "Test Investor" in investor name field
    Then Select valid country name "UNITED STATES" in add investor page
    And Select valid state name "Alabama" in add investor page
    And Click clear button in add Investor Page
    Then Close the Setup Page

  @TC_33
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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

  @TC_34
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Click add button in Investor Page
    And Click back button in add Investor Page
    Then Close the Setup Page

  @TC_35
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    Then Click actions button in edit investor page
    And Click back button in edit Investor Page
    Then Close the Setup Page

  @TC_36
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    Then Click actions button in edit investor page
    And Click edit investor button in edit investor page
    And Click clear button in edit Investor Page
    Then Close the Setup Page

  @TC_37
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    Then Click actions button in edit investor page
    And Click edit investor button in edit investor page
    And Click back button in add Investor Page
    Then Close the Setup Page

  @TC_38
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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

  @TC_39
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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

  @TC_40
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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

  @TC_41
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    And Click edit button in customer tab
    Then Enter valid name "Test" in the search box of customer tab
    Then Close the Setup Page

  @TC_42
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    And Click edit button in customer tab
    Then Click select all check box in customer tab
    Then Close the Setup Page

  @TC_43
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    And Click edit button in customer tab
    Then Click select all check box in customer tab
    Then Click unselect the check box in customer tab
    Then Close the Setup Page

  @TC_44
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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

  @TC_45
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    And Click transaction button in Investor Page
    Then Click actions button in edit investor page
    And Click add transaction button in edit investor page
    Then Click save button in add transaction page
    And Check mandatory message is displayed or not in Investor Page
    Then Close the Setup Page

  @TC_46
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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

  @TC_47
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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

  @TC_48
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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

  @TC_49
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    And Click transaction button in Investor Page
    And Click edit transaction button in edit investor page
    Then Click back button in edit transaction page
    Then Close the Setup Page

  @TC_50
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    And Click transaction button in Investor Page
    And Click edit transaction button in edit investor page
    Then Click clear button in add transaction page
    Then Close the Setup Page

  @TC_51
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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

  @TC_52
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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

  @TC_53
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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

  @TC_54
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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

  @TC_55
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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

  @TC_56
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    And Click documents button in Investor Page
    And Click edit documents button in edit investor page
    Then Click back button in edit transaction page
    Then Close the Setup Page

  @TC_57
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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

  @TC_58
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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

  @TC_59
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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

  @TC_60
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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

  @TC_61
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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

    @TC_62
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    And Click news feeds button in Investor Page
    And Click edit feeds button in edit investor page
    Then Clear the title details in edit investor page
    Then Modify valid details in edit news feeds page
    Then Click upload button in add news feeds page
    Then Check success message is displayed or not in Investor Page
    Then Close the Setup Page

    @TC_63
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    And Click Investor Representative button in Investor Page
    Then Click check all button in Investor Representative page
   Then Close the Setup Page

    @TC_64
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Setup
    Then Click the Setup button
    And Click Investor button
    Then Enter valid Investor name "Test" in searchbox in Investor Page
    Then Click edit button in Investor Page
    And Click Investor Representative button in Investor Page
    Then Click clear all button in Investor Representative page
    Then Close the Setup Page

    @TC_65
  Scenario: Setup:Investor
    Given To Check Setup User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Setup User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
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
