Feature: ADMIN

  @TC_01
  Scenario: Admin:View User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click view user button
    Then Select valid status type "ALL"
    And Select valid user type "ALL"
    Then close the Admin Page

  @TC_02
  Scenario: Admin:View User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click view user button
    Then Enter valid username "Test" in the search box
    And Check name is displayed or not in view user
    Then close the Admin Page

  @TC_03
  Scenario: Admin:View User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click view user button
    Then Click add button in view user
    Then Click action button in view user
    And Click back button in add user
    Then close the Admin Page

  @TC_04
  Scenario: Admin:View User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click view user button
    Then Click add button in view user
    Then Click action button in view user
    And Click save button in add user
    Then Check the alert message details
    Then close the Admin Page

  @TC_05
  Scenario: Admin:View User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click view user button
    Then Click add button in view user
    And Enter all valid details in all field
    Then Click action button in add user
    And Click clear button in add user
    Then close the Admin Page

  @TC_06
  Scenario: Admin:View User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click view user button
    Then Click add button in view user
    And Enter all valid details in all field
    Then Click action button in add user
    And Click save button in add user
    Then close the Admin Page

  @TC_07
  Scenario: Admin:View User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click view user button
    Then Enter valid username "Test" in the search box
    Then Click edit button in view user
    And Click action button in edit user
    And Click back button in edit user
    Then close the Admin Page

  @TC_08
  Scenario: Admin:View User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click view user button
    Then Enter valid username "Test" in the search box
    Then Click edit button in view user
    And Click action button in edit user
    And Click edit user button in action button
    Then Click action button in edit user
    And Click clear button in edit user
    Then close the Admin Page

  @TC_09
  Scenario: Admin:View User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click view user button
    Then Enter valid username "Test" in the search box
    Then Click edit button in view user
    And Click action button in edit user
    And Click edit user button in action button
    Then Remove the first name field in edit user
    And Click action button in edit user
    Then Click update button in edit user
    And Check and accept the confirmation page in edit user
    Then close the Admin Page

  @TC_10
  Scenario: Admin:View User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click view user button
    Then Enter valid username "Test" in the search box
    Then Click edit button in view user
    And Click action button in edit user
    And Click edit user button in action button
    Then Modify the details in edit user
    And Click action button in edit user
    Then Click update button in edit user
    #  And Check and accept the confirmation page in edit user
    Then close the Admin Page

  @TC_11
  Scenario: Admin:View User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click view user button
    Then Enter valid username "Test" in the search box
    Then Click edit button in view user
    And Click profile button in view user
    Then Click upload button in view user
    And Check the alert message in view user
    Then close the Admin Page

  @TC_12
  Scenario: Admin:View User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click view user button
    Then Enter valid username "Test" in the search box
    Then Click edit button in view user
    And Click profile button in view user
    Then Click upload button in view user
    And Upload valid file in profile photo page
    Then Click upload button in view user
    Then close the Admin Page

  @TC_13
  Scenario: Admin:View User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click view user button
    Then Enter valid username "Test" in the search box
    Then Click edit button in view user
    And Click the edit button in email field
    Then Click close button in the update email address
    Then close the Admin Page

  @TC_14
  Scenario: Admin:View User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click view user button
    Then Enter valid username "Test" in the search box
    Then Click edit button in view user
    And Click the edit button in email field
    Then Click update button in the update email address
    And Check the alert message details in the update email address
    Then close the Admin Page

  @TC_15
  Scenario: Admin:View User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click view user button
    Then Enter valid username "Test" in the search box
    Then Click edit button in view user
    And Click the edit button in email field
    Then Enter valid new email id in the update email address
    Then Enter valid OTP details in the update email address
    And Click update button in the update email address
    Then close the Admin Page

  @TC_16
  Scenario: Admin:View User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click view user button
    Then Enter valid username "Test" in the search box
    Then Click edit button in view user
    And Click the edit button in Password field
    Then Click close button in the update Password
    Then close the Admin Page

  @TC_17
  Scenario: Admin:View User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click view user button
    Then Enter valid username "Test" in the search box
    Then Click edit button in view user
    And Click the edit button in Password field
    Then Click reset button in the update Password
    And Check the alert message details in the update Password
    Then close the Admin Page

  @TC_18
  Scenario: Admin:View User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click view user button
    Then Enter valid username "Test" in the search box
    Then Click edit button in view user
    And Click the edit button in Password field
    Then Enter valid new Password "Thirumaran@55" in the update Password
    And Enter valid confirm Password "Thirumaran@55" in the update Password
    And Click reset button in the update Password
    Then close the Admin Page

  @TC_19
  Scenario: Admin:View User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click view user button
    Then Enter valid username "Test" in the search box
    Then Click edit button in view user
    And Click the edit button in status field
    Then Click close button in status field
    Then close the Admin Page

  @TC_20
  Scenario: Admin:View User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click view user button
    Then Enter valid username "Test" in the search box
    Then Click edit button in view user
    And Click the edit button in status field
    Then Click no radio button in status field
    And Click update button in status field
    Then Check the alert message in status field
    Then close the Admin Page

  @TC_21
  Scenario: Admin:View User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click view user button
    Then Enter valid username "Test" in the search box
    Then Click edit button in view user
    And Click the edit button in Two FA field
    Then Click close button in Two FA field
    Then close the Admin Page

  @TC_22
  Scenario: Admin:View User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click view user button
    Then Enter valid username "Test" in the search box
    Then Click edit button in view user
    And Click the edit button in Two FA field
    Then Click no radio button in Two FA field
    And Click update button in Two FA field
    Then Check the alert message in Two FA field
    Then close the Admin Page

  @TC_23
  Scenario: Admin:View User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click view user button
    Then Enter valid username "Test" in the search box
    Then Click edit button in view user
    And Click access rights button in view user
    Then Click the check all button in access rights
    And Click action button in edit user
    Then Click submit button in access rights
    Then close the Admin Page

  @TC_24
  Scenario: Admin:View User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click view user button
    Then Enter valid username "Test" in the search box
    Then Click edit button in view user
    And Click access rights button in view user
    Then Click the clear all button in access rights
    And Click action button in edit user
    Then Click submit button in access rights
    Then close the Admin Page

  @TC_25
  Scenario: Admin:View User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click view user button
    Then Enter valid username "Test" in the search box
    Then Click edit button in view user
    And Click access rights button in view user
    Then Select a checkbox in access rights
    And Click action button in edit user
    Then Click submit button in access rights
    Then close the Admin Page

  @TC_26
  Scenario: Admin:View User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click view user button
    Then Enter valid username "Test" in the search box
    Then Click edit button in view user
    And Click Email Notification button in view user
    Then Click the check all button in Email Notification
    And Click action button in edit user
    Then Click submit button in access rights
    Then close the Admin Page

  @TC_27
  Scenario: Admin:View User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click view user button
    Then Enter valid username "Test" in the search box
    Then Click edit button in view user
    And Click Email Notification button in view user
    Then Click the clear all button in Email Notification
    And Click action button in edit user
    Then Click submit button in access rights
    Then close the Admin Page

  @TC_28
  Scenario: Admin:View User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click view user button
    Then Enter valid username "Test" in the search box
    Then Click edit button in view user
    And Click Email Notification button in view user
    Then Select a checkbox in Email Notification
    And Click action button in edit user
    Then Click submit button in access rights
    Then close the Admin Page

  @TC_29
  Scenario: Admin:View User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click view user button
    Then Enter valid username "Test" in the search box
    Then Click edit button in view user
    And Click Time Sheet Access button in view user
    Then Click enable button in Time Sheet Access
    And Select valid option reporting to dropdown
    And Click action button in edit user
    Then Click submit button in access rights
    Then close the Admin Page

  @TC_30
  Scenario: Admin:Bank User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click Bank setup button
    Then Select valid status type "ALL" in bank user
    And Select valid status type "ENABLED" in bank user
    And Check status is updated in the table in bank user
    Then close the Admin Page

  @TC_31
  Scenario: Admin:Bank User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click Bank setup button
    Then Enter valid bank name "Testing bank 456" in search field in bank user
    And Check bank name is updated in the table in bank user
    Then close the Admin Page

  @TC_32
  Scenario: Admin:Bank User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click Bank setup button
    Then Click add button in bank user
    And Click save button in add bank details
    Then Check the alert message in add bank details
    Then close the Admin Page

  @TC_33
  Scenario: Admin:Bank User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click Bank setup button
    Then Click add button in bank user
    And Enter valid bank name "Test" in add bank details
    Then Enter valid account number "123456789" in add bank details
    And Select valid account group in add bank details
    Then Enter valid location in add bank details
    And Click enable radio button in add bank details
    Then Click yes radio button in authorize .net in add bank details
    And Click clear button in add bank details
    Then close the Admin Page

  @TC_34
  Scenario: Admin:Bank User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click Bank setup button
    Then Click add button in bank user
    And Enter valid bank name "Test" in add bank details
    Then Enter valid account number "123456789" in add bank details
    And Select valid account group in add bank details
    Then Enter valid location in add bank details
    And Click enable radio button in add bank details
    Then Click yes radio button in authorize .net in add bank details
    And Click save button in add bank details
    Then Check the alert toast in add bank details
    Then close the Admin Page

  @TC_35
  Scenario: Admin:Bank User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click Bank setup button
    Then Click add button in bank user
    And Click close button in add bank details
    Then close the Admin Page

  @TC_35
  Scenario: Admin:Bank User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click Bank setup button
    Then Enter valid bank name "Test" in search field in bank user
    Then Click edit button in bank user
    And Click close button in edit bank details
    Then close the Admin Page

  @TC_36
  Scenario: Admin:Bank User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click Bank setup button
    Then Enter valid bank name "Testing" in search field in bank user
    Then Click edit button in bank user
    And Click clear button in edit bank details
    Then close the Admin Page

  @TC_37
  Scenario: Admin:Bank User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click Bank setup button
    Then Enter valid bank name "Testing" in search field in bank user
    Then Click edit button in bank user
    And Click clear button in edit bank details
    Then Click update button in edit bank details
    And Check the alert message in add bank details
    Then close the Admin Page

  @TC_38
  Scenario: Admin:Bank User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click Bank setup button
    Then Enter valid bank name "Testing" in search field in bank user
    Then Click edit button in bank user
    And Modify valid details in edit bank details
    Then Click update button in edit bank details
    Then close the Admin Page

  @TC_39
  Scenario: Admin:Bank User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click Bank setup button
    Then Click add button in bank user
    And Click add account group button in add bank details
    Then Click save button in add account group
    And Check alert message in add account group
    Then close the Admin Page

  @TC_40
  Scenario: Admin:Bank User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click Bank setup button
    Then Click add button in bank user
    And Click add account group button in add bank details
    And Enter valid account group name in add account group
    Then Click clear button in add account group
    Then close the Admin Page

  @TC_41
  Scenario: Admin:Bank User
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click Bank setup button
    Then Click add button in bank user
    And Click add account group button in add bank details
    And Enter valid account group name in add account group
    Then Click save button in add account group
    And Check the alert toast in add bank details
    Then close the Admin Page

  @TC_42
  Scenario: Admin:Authorized .Net
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click Authorized .Net button
    Then Select valid status "All" in Authorized .Net
    And Select valid status "Running" in Authorized .Net
    Then Select valid status "Stop" in Authorized .Net
    Then close the Admin Page

  @TC_43
  Scenario: Admin:Authorized .Net
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click Authorized .Net button
    Then Enter valid name "Test" in search field in Authorized .Net
    Then close the Admin Page

  @TC_44
  Scenario: Admin:Authorized .Net
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click Authorized .Net button
    Then Click add button in Authorized .Net
    And Click save button in Authorized .Net
    Then Check the mandatory message in add Authorized .Net
    Then close the Admin Page

  @TC_45
  Scenario: Admin:Authorized .Net
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click Authorized .Net button
    Then Click add button in Authorized .Net
    And Enter valid name "Test" in add Authorized .Net
    Then Enter valid Transaction Key "Test123" in add Authorized .Net
    And Enter valid Login ID "Test" in add Authorized .Net
    Then Enter valid Notes "Test" in add Authorized .Net
    And Click clear button in Authorized .Net
    Then close the Admin Page

  @TC_45
  Scenario: Admin:Authorized .Net
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click Authorized .Net button
    Then Click add button in Authorized .Net
    And Enter valid name "Test" in add Authorized .Net
    Then Enter valid Transaction Key "Test123" in add Authorized .Net
    And Enter valid Login ID "Test" in add Authorized .Net
    Then Enter valid Notes "Test" in add Authorized .Net
    And Click save button in Authorized .Net
    Then Check the success message in add Authorized .Net
    Then close the Admin Page

  @TC_46
  Scenario: Admin:Authorized .Net
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click Authorized .Net button
    Then Click add button in Authorized .Net
    And Click back button in Authorized .Net
    Then close the Admin Page

  @TC_47
  Scenario: Admin:Authorized .Net
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click Authorized .Net button
    And Enter valid name "Testing" in search field in Authorized .Net
    Then Click edit button in Authorized .Net
    And Click back button in edit Authorized .Net
    Then close the Admin Page

  @TC_48
  Scenario: Admin:Authorized .Net
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click Authorized .Net button
    And Enter valid name "Testing" in search field in Authorized .Net
    Then Click edit button in Authorized .Net
    And Click clear button in Authorized .Net
    Then close the Admin Page

  @TC_49
  Scenario: Admin:Authorized .Net
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click Authorized .Net button
    And Enter valid name "Testing" in search field in Authorized .Net
    Then Click edit button in Authorized .Net
    And Click clear button in Authorized .Net
    Then Click update button in edit Authorized .Net
    And Check the mandatory message in add Authorized .Net
    Then close the Admin Page

  @TC_50
  Scenario: Admin:Authorized .Net
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click Authorized .Net button
    And Enter valid name "Testing" in search field in Authorized .Net
    Then Click edit button in Authorized .Net
    Then Modify valid details in edit Authorized .Net
    Then Click update button in edit Authorized .Net
    And Check the success message in add Authorized .Net
    Then close the Admin Page

  @TC_51
  Scenario: Admin:IP Whitelist
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click IP Whitelist button
    Then Select valid status "ALL" in IP Whitelist
    And Select valid status "ENABLED" in IP Whitelist
    Then Select valid status "DISABLED" in IP Whitelist
    Then close the Admin Page

  @TC_52
  Scenario: Admin:IP Whitelist
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click IP Whitelist button
    Then Enter valid name "192.456.1.45" in search field in IP Whitelist
    Then close the Admin Page

  @TC_53
  Scenario: Admin:IP Whitelist
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click IP Whitelist button
    Then Click add button in IP Whitelist
    And Click save button in IP Whitelist
    Then Check the mandatory message in add IP Whitelist
    Then close the Admin Page

  @TC_54
  Scenario: Admin:IP Whitelist
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click IP Whitelist button
    Then Click add button in IP Whitelist
    And Enter valid IP Address "123.456.789" in add IP Whitelist
    Then Enter valid Responsible Person "Test" in add IP Whitelist
    And Enter valid IP Location "Test" in add IP Whitelist
    Then Enter valid Notes "Test" in add IP Whitelist
    And Click clear button in IP Whitelist
    Then close the Admin Page

  @TC_55
  Scenario: Admin:IP Whitelist
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click IP Whitelist button
    Then Click add button in IP Whitelist
    And Enter valid IP Address "123.456.789" in add IP Whitelist
    Then Enter valid Responsible Person "Test" in add IP Whitelist
    And Enter valid IP Location "Test" in add IP Whitelist
    Then Enter valid Notes "Test" in add IP Whitelist
    And Click save button in IP Whitelist
    Then Check the success message in add IP Whitelist
    Then close the Admin Page

  @TC_56
  Scenario: Admin:IP Whitelist
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click IP Whitelist button
    Then Click add button in IP Whitelist
    And Click close button in IP Whitelist
    Then close the Admin Page

  @TC_57
  Scenario: Admin:IP Whitelist
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click IP Whitelist button
    And Enter valid name "192.456.1.45" in search field in IP Whitelist
    Then Click edit button in IP Whitelist
    And Click close button in edit IP Whitelist
    Then close the Admin Page

  @TC_58
  Scenario: Admin:IP Whitelist
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click IP Whitelist button
    And Enter valid name "192.456.1.45" in search field in IP Whitelist
    Then Click edit button in IP Whitelist
    And Click clear button in IP Whitelist
    Then close the Admin Page

  @TC_59
  Scenario: Admin:IP Whitelist
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click IP Whitelist button
    And Enter valid name "192.456.1.45" in search field in IP Whitelist
    Then Click edit button in IP Whitelist
    And Modify valid details in edit IP Whitelist
    Then Click update button in edit IP Whitelist
    Then Check the success message in add IP Whitelist
    Then close the Admin Page

  @TC_60
  Scenario: Admin:User Log
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click User Log button
    Then Enter valid user name "Thirumaran R" in search box in user log
    Then close the Admin Page

  @TC_61
  Scenario: Admin:User Log
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click User Log button
    Then Click view button in user log
    And Click back button in user log
    Then close the Admin Page

  @TC_62
  Scenario: Admin:User Log
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click User Log button
    Then Click view button in user log
    And Click view button in user log in user log
    Then Click close button in user log in user log
    Then close the Admin Page

  @TC_63
  Scenario: Admin:Event Log
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click Event Log button
    Then Enter valid user name "Admin" in search box in Event log
    Then close the Admin Page

  @TC_64
  Scenario: Admin:Event Log
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click Event Log button
    Then Click view button in Event log
    And Click close button in Event log
    Then close the Admin Page

  @TC_65
  Scenario: Admin:Exception Log
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click Exception Log button
    Then Select valid from date in Exception Log
    Then close the Admin Page

  @TC_66
  Scenario: Admin:Exception Log
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click Exception Log button
    Then Select valid from date in Exception Log
    Then close the Admin Page

  @TC_67
  Scenario: Admin:Exception Log
    Given To Check Admin User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Admin User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Admin
    Then Click the admin button
    And Click Exception Log button
    Then Select valid from date in Exception Log
    Then Click view button in Exception log
    And Click close button in Exception log
    Then close the Admin Page
