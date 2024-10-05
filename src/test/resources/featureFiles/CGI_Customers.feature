Feature: CUSTOMERS

  @TC_01
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid "All" payment status in customer list page
    And Select valid "LTF" payment status in customer list page
    Then Select valid "Manual Pay" payment status in customer list page
    And Select valid "Prepaid" payment status in customer list page
    Then Select valid "All" customer status in customer list page
    And Select valid "Active" customer status in customer list page
    Then Select valid "Removed" customer status in customer list page
    And Select valid "Swap Out" customer status in customer list page
    Then Close the Customers Page

  @TC_02
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Enter valid customer name "vignesh Support" in customer list page
    Then Close the Customers Page

  @TC_03
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Click actions button in customer list page
    And Click add button in customer list page
    Then Click save button in customer list page
    And Check mandatory message is displayed or not in add list page
    Then Close the Customers Page

  @TC_04
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Click actions button in customer list page
    And Click add button in customer list page
    Then Click add button in customer portfolio tab
    And Check mandatory message is displayed or not in customer portfolio tab
    Then Close the Customers Page

  @TC_05
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Click actions button in customer list page
    And Click add button in customer list page
    And Select valid installer "Test Client" in add list page
    Then Click add button in customer portfolio tab
    And Click save button in add portfolio popup
    And Check error toast message is displayed or not in add portfolio popup
    Then Close the Customers Page

  @TC_06
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Click actions button in customer list page
    And Click add button in customer list page
    And Select valid installer "Test Client" in add list page
    Then Click add button in customer portfolio tab
    And Enter valid details "Test" in add portfolio popup
    And Click clear button in add portfolio popup
    Then Close the Customers Page

  @TC_07
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Click actions button in customer list page
    And Click add button in customer list page
    And Select valid installer "Test Client" in add list page
    Then Click add button in customer portfolio tab
    And Enter valid details "Test" in add portfolio popup
    And Click save button in add portfolio popup
    Then Check success message is displayed or not in add list page
    Then Close the Customers Page

  @TC_08
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Click actions button in customer list page
    And Click add button in customer list page
    And Select valid installer "Test Client" in add list page
    Then Select valid Customer Portfolio "Test" in add list page
    Then Click edit button in customer portfolio tab
    And Click clear button in add portfolio popup
    Then Close the Customers Page

  @TC_09
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Click actions button in customer list page
    And Click add button in customer list page
    And Select valid installer "Test Client" in add list page
    Then Select valid Customer Portfolio "Test" in add list page
    Then Click edit button in customer portfolio tab
    And Modify valid details in add portfolio popup
    And Click save button in add portfolio popup
    Then Close the Customers Page

  @TC_10
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Click actions button in customer list page
    And Click add button in customer list page
    Then Click actions button in add list page
    And Click back button in add list page
    Then Close the Customers Page

  @TC_11
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Click actions button in customer list page
    And Click add button in customer list page
    Then Enter valid customer ID in add list page
    And Enter valid customer name in add list page
    Then Select the installer "Test Client" in add list page
    Then Select valid Customer Portfolio "Test" in add list page
    And Click actions button in add list page
    Then Click clear button in add list page
    And Check data is cleared or not in customer name tab
    Then Close the Customers Page

  @TC_12
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Click actions button in customer list page
    And Click add button in customer list page
    Then Enter valid customer ID in add list page
    And Enter valid customer name in add list page
    Then Select the installer "Test Client" in add list page
    Then Select valid Customer Portfolio "Test" in add list page
    And Enter valid monthly payment "10" in add list page
    Then Enter valid total years "2" in add list page
    And Enter valid escalation "2.5" in add list page
    Then Enter valid total contract amount "100" in add list page
    And Enter valid phone number "1234567890" in add list page
    Then Enter valid mail ID "0211thiru@gmail.com" in add list page
    Then Click save button in customer list page
    #And Check success message is displayed or not in customer list page
    Then Close the Customers Page

  @TC_13
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "Test Client" in customer list page
    And Enter valid customer name "New Customer" in customer list page
    Then Click edit button in customer list page
    And Click actions button in customer view page
    Then Click edit customers button in customer view page
    Then Click actions button in edit customer page
    And Click clear button in edit customer page
    Then Click actions button in edit customer page
    And Click update button in edit customer page
    Then Click actions button in edit customer page
    And Click update button in edit customer page
    #And Check mandatory message is displayed or not in edit customer page
    Then Close the Customers Page

  @TC_14
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "Test Client" in customer list page
    And Select valid "All" customer status in customer list page
    And Enter valid customer name "New Customer" in customer list page
    Then Click edit button in customer list page
    And Click actions button in customer view page
    Then Click edit customers button in customer view page
    Then Click actions button in edit customer page
    And Click back button in edit customer page
    Then Close the Customers Page

  @TC_15
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "Test Client" in customer list page
    And Select valid "All" customer status in customer list page
    And Enter valid customer name "New Customer" in customer list page
    Then Click edit button in customer list page
    And Click actions button in customer view page
    Then Click edit customers button in customer view page
    Then Click actions button in edit customer page
    And Click clear button in edit customer page
    And Check data is cleared or not in customer name tab
    Then Close the Customers Page

  @TC_16
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "Test Client" in customer list page
    And Select valid "All" customer status in customer list page
    And Enter valid customer name "New Customer" in customer list page
    Then Click edit button in customer list page
    And Click actions button in customer view page
    Then Click edit customers button in customer view page
    And Modify valid details in edit customer page
    Then Click actions button in edit customer page
    And Click update button in edit customer page
    And Check success message is displayed or not in edit customer page
    Then Close the Customers Page

  @TC_17
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "Test Client" in customer list page
    And Select valid "All" customer status in customer list page
    And Enter valid customer name "New Customer" in customer list page
    Then Click edit button in customer list page
    And Click actions button in customer view page
    Then Click edit Payment Schedule button in customer view page
    Then Click update button in edit Payment Schedule
    And Check success message is displayed or not in edit customer page
    Then Close the Customers Page

  @TC_18
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "Test Client" in customer list page
    And Select valid "All" customer status in customer list page
    And Enter valid customer name "New Customer" in customer list page
    Then Click edit button in customer list page
    And Click actions button in customer view page
    Then Click edit Payment Schedule button in customer view page
    Then Click actions button in customer view page
    And Click back button in edit Payment Schedule page
    Then Close the Customers Page

  @TC_19
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "Test Client" in customer list page
    And Select valid "All" customer status in customer list page
    And Enter valid customer name "Adharsh Support" in customer list page
    Then Click edit button in customer list page
    And Click actions button in customer view page
    Then Click Merge Customer button in customer view page
    And Click the checkbox in Merge Customer
    Then Click merge button in Merge Customer
    And Check error toast is displayed or not in Merge Customer
    Then Close the Customers Page

  @TC_20
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "Test Client" in customer list page
    And Select valid "All" customer status in customer list page
    And Enter valid customer name "New Customer" in customer list page
    Then Click edit button in customer list page
    And Click actions button in customer view page
    Then Click Merge Customer button in customer view page
    Then Click actions button in customer view page
    And Click back button in Merge Customer page
    Then Close the Customers Page

  @TC_21
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "Test Client" in customer list page
    And Select valid "All" customer status in customer list page
    And Enter valid customer name "Adharsh Support" in customer list page
    Then Click edit button in customer list page
    And Click actions button in customer view page
    Then Click Merge Customer button in customer view page
    And Click merge to customer tab in Merge Customer
    And Enter valid customer "Ian Delaura" in Merge Customer
    And Click the checkbox in Merge Customer
    #Then Click merge button in Merge Customer
    #And Check success message is displayed or not in Merge Customer
    Then Close the Customers Page

  @TC_22
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "Test Client" in customer list page
    And Select valid "All" customer status in customer list page
    And Enter valid customer name "New Customer" in customer list page
    Then Click edit button in customer list page
    And Click actions button in customer view page
    Then Click View Received Payments button in customer view page
    Then Click actions button in customer view page
    And Click back button in View Received Payments page
    Then Close the Customers Page

  @TC_23
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "Test Client" in customer list page
    And Select valid "All" customer status in customer list page
    And Enter valid customer name "New Customer" in customer list page
    Then Click edit button in customer list page
    And Click actions button in customer view page
    Then Click Edit Monthly Payments button in customer view page
    Then Click save button in Edit Monthly Payments page
    And Check mandatory message is displayed or not in Edit Monthly Payments page
    Then Close the Customers Page

  @TC_24
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "Test Client" in customer list page
    And Select valid "All" customer status in customer list page
    And Enter valid customer name "New Customer" in customer list page
    Then Click edit button in customer list page
    And Click actions button in customer view page
    Then Click Edit Monthly Payments button in customer view page
    And Click actions button in Edit Monthly Payments page
    Then Click back button in Edit Monthly Payments page
    Then Close the Customers Page

  @TC_25
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "Test Client" in customer list page
    And Select valid "All" customer status in customer list page
    And Enter valid customer name "New Customer" in customer list page
    Then Click edit button in customer list page
    And Click actions button in customer view page
    Then Click Edit Monthly Payments button in customer view page
    And Enter valid amount "12" in monthly pay tab
    Then Select valid date in effective from tab
    And Enter valid reason "Test" in reson tab
    Then Click save button in Edit Monthly Payments page
    And Check success message is displayed or not in Edit Monthly Payments page
    Then Close the Customers Page

  @TC_26
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "Test Client" in customer list page
    And Select valid "All" customer status in customer list page
    And Enter valid customer name "New Customer" in customer list page
    Then Click edit button in customer list page
    And Click actions button in customer view page
    Then Click OS Double Payments button in customer view page
    And Click create schedule button in OS Double Payments page
    Then Check success message is displayed or not in Edit Monthly Payments page
    Then Close the Customers Page

  @TC_27
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "Test Client" in customer list page
    And Select valid "All" customer status in customer list page
    And Enter valid customer name "New Customer" in customer list page
    Then Click edit button in customer list page
    And Click actions button in customer view page
    Then Click OS Double Payments button in customer view page
    And Click actions button in OS Double Payments page
    Then Click back button in OS Double Payments page
    Then Close the Customers Page

  @TC_28
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "Test Client" in customer list page
    And Select valid "All" customer status in customer list page
    And Enter valid customer name "New Customer" in customer list page
    Then Click edit button in customer list page
    And Click actions button in customer view page
    Then Click OS Double Payments button in customer view page
    And Click check all button in OS Double Payments page
    Then Check checkbox is selected or not in OS Double Payments page
    Then Close the Customers Page

  @TC_29
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "Test Client" in customer list page
    And Select valid "All" customer status in customer list page
    And Enter valid customer name "New Customer" in customer list page
    Then Click edit button in customer list page
    And Click actions button in customer view page
    Then Click OS Double Payments button in customer view page
    And Click check all button in OS Double Payments page
    Then Click clear all button in OS Double Payments page
    Then Check checkbox is selected or not in OS Double Payments page
    Then Close the Customers Page

  @TC_30
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "Test Client" in customer list page
    And Select valid "All" customer status in customer list page
    And Enter valid customer name "New Customer" in customer list page
    Then Click edit button in customer list page
    And Click actions button in customer view page
    Then Click OS Double Payments button in customer view page
    And Click check all button in OS Double Payments page
    Then Select valid date in effective from calendar
    Then Click create schedule button in OS Double Payments page
    Then Check success message is displayed or not in Edit Monthly Payments page
    Then Close the Customers Page

  @TC_31
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "Test Client" in customer list page
    And Select valid "All" customer status in customer list page
    And Enter valid customer name "New Customer" in customer list page
    Then Click edit button in customer list page
    And Click actions button in customer view page
    Then Click Document Setup button in customer view page
    And Click the checkbox in document setup
    Then Click save button in document setup
    Then Check error message is displayed or not in document setup page
    Then Close the Customers Page

  @TC_32
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "Test Client" in customer list page
    And Select valid "All" customer status in customer list page
    And Enter valid customer name "New Customer" in customer list page
    Then Click edit button in customer list page
    And Click actions button in customer view page
    Then Click Document Setup button in customer view page
    And Click actions button in Document Setup page
    Then Click back button in document setup
    Then Close the Customers Page

  @TC_33
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "Test Client" in customer list page
    Then Select valid "All" payment status in customer list page
    Then Select valid "All" customer status in customer list page
    And Enter valid customer name "Udhay Support" in customer list page
    Then Click edit button in customer list page
    And Click actions button in customer view page
    Then Click Document Setup button in customer view page
    And Upload valid file in document setup
    And Click the checkbox in document setup
    #Then Click save button in document setup
    Then Close the Customers Page

  @TC_34
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "Test Client" in customer list page
    Then Select valid "All" payment status in customer list page
    And Select valid "All" customer status in customer list page
    And Enter valid customer name "Udhay Support" in customer list page
    Then Click edit button in customer list page
    And Click actions button in customer view page
    Then Click Document Setup button in customer view page
    #And Click download button in Document Setup page
    Then Close the Customers Page

  @TC_35
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "LA SOLAR" in customer list page
    Then Select valid "All" payment status in customer list page
    Then Select valid "All" customer status in customer list page
    Then Click edit button in customer list page
    And Click actions button in customer view page
    Then Click Document Setup button in customer view page
    And Click delete button in Document Setup page
    Then Close the Customers Page

  @TC_36
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "LA SOLAR" in customer list page
    Then Select valid "All" payment status in customer list page
    Then Select valid "All" customer status in customer list page
    # And Enter valid customer name "New Customer" in customer list page
    Then Click edit button in customer list page
    And Click actions button in customer view page
    Then Click Swap Out button in customer view page
    And Click yes button in swap out page
    Then Click the checkbox in swap out page
    And Click save button in swap out page
    And Check the error toast is displayed or not in swap out page
    Then Close the Customers Page

  @TC_37
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "Test Client" in customer list page
    Then Select valid "All" payment status in customer list page
    Then Select valid "All" customer status in customer list page
    And Enter valid customer name "New Customer" in customer list page
    Then Click edit button in customer list page
    And Click actions button in customer view page
    Then Click Swap Out button in customer view page
    And Click actions button in Swap Out page
    Then Click back button in Swap Out page
    Then Close the Customers Page

  @TC_38
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "Test Client" in customer list page
    Then Select valid "All" payment status in customer list page
    Then Select valid "All" customer status in customer list page
    And Enter valid customer name "Rajesh Support" in customer list page
    Then Click edit button in customer list page
    And Click actions button in customer view page
    Then Click Swap Out button in customer view page
    And Click yes button in swap out page
    And Enter valid reason "Test" in swap out page
    Then Click the checkbox in swap out page
    And Click save button in swap out page
    Then Check success message is displayed or not in swap out page
    Then Close the Customers Page

  @TC_39
  Scenario: Customers:List:RollBack
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "Test Client" in customer list page
    Then Select valid "All" payment status in customer list page
    Then Select valid "Swap Out" customer status in customer list page
    And Enter valid customer name "Rajesh Support" in customer list page
    Then Click edit button in customer list page
    And Click actions button in customer view page
    Then Click Swap Out button in customer view page
    And Click yes button in rollback page
    And Enter valid reason "Test" in rollback page
    Then Click the checkbox in rollback page
    And Click save button in rollback page
    Then Check success message is displayed or not in swap out page
    Then Close the Customers Page

  @TC_39
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "Test Client" in customer list page
    Then Select valid "All" payment status in customer list page
    Then Select valid "All" customer status in customer list page
    And Enter valid customer name "New Customer" in customer list page
    Then Click edit button in customer list page
    And Click actions button in customer view page
    Then Click Monitoring CRM Mapping button in customer view page
    Then Click update button in Monitoring CRM Mapping
    Then Close the Customers Page

  @TC_40
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "Test Client" in customer list page
    Then Select valid "All" payment status in customer list page
    Then Select valid "All" customer status in customer list page
    And Enter valid customer name "New Customer" in customer list page
    Then Click edit button in customer list page
    And Click actions button in customer view page
    Then Click Monitoring CRM Mapping button in customer view page
    And Click actions button in Monitoring CRM Mapping page
    Then Click back button in Monitoring CRM Mapping page
    Then Close the Customers Page

  @TC_41
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "Test Client" in customer list page
    Then Select valid "All" payment status in customer list page
    Then Select valid "All" customer status in customer list page
    And Enter valid customer name "New Customer" in customer list page
    Then Click edit button in customer list page
    And Click actions button in customer view page
    Then Click Monitoring CRM Mapping button in customer view page
    And Select valid CRM name "Enphase" in Monitoring CRM Mapping
    Then Select valid Name in CRM "Chun He (2283531) " in Monitoring CRM Mapping
    Then Click update button in Monitoring CRM Mapping
    Then Check success message is displayed or not in Monitoring CRM Mapping page
    Then Close the Customers Page

  @TC_42
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "Test Client" in customer list page
    Then Select valid "All" payment status in customer list page
    Then Select valid "All" customer status in customer list page
    And Enter valid customer name "New Customer" in customer list page
    Then Click edit button in customer list page
    And Click actions button in customer view page
    Then Click Escalation Program button in customer view page
    And Click actions button in Escalation Program page
    Then Click back button in Escalation Program page
    Then Close the Customers Page

  @TC_43
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "Test Client" in customer list page
    Then Select valid "All" payment status in customer list page
    Then Select valid "All" customer status in customer list page
    And Enter valid customer name "New Customer" in customer list page
    Then Click edit button in customer list page
    And Click actions button in customer view page
    Then Click Escalation Program button in customer view page
    And Check the value in year2 field is changed or not after click the calculate button
    Then Close the Customers Page

  @TC_44
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "Test Client" in customer list page
    Then Select valid "All" payment status in customer list page
    Then Select valid "All" customer status in customer list page
    And Enter valid customer name "Rajesh" in customer list page
    Then Click edit button in customer list page
    And Click add notes in customer view page
    Then Click save button in add notes page
    And Check error toast is displayed or not in add notes page
    Then Close the Customers Page

  @TC_45
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "Test Client" in customer list page
    Then Select valid "All" payment status in customer list page
    Then Select valid "All" customer status in customer list page
    And Enter valid customer name "Rajesh" in customer list page
    Then Click edit button in customer list page
    And Click add notes in customer view page
    And Enter valid notes details "Test" in add notes page
    Then Click save button in add notes page
    And Check success message is displayed or not in add notes page
    Then Close the Customers Page

  @TC_46
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "LA SOLAR" in customer list page
    Then Select valid "All" payment status in customer list page
    Then Select valid "All" customer status in customer list page
    And Enter valid customer name "Alfredo Cardenas" in customer list page
    Then Click edit button in customer list page
    And Click download button in Document Setup tab
    Then Close the Customers Page

  @TC_47
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "Test Client" in customer list page
    Then Select valid "All" payment status in customer list page
    Then Select valid "All" customer status in customer list page
    And Enter valid customer name "Adharsh Support" in customer list page
    Then Click edit button in customer list page
    And Click view all button in Recent Activities tab
    Then Click view icon button in view all Recent Activities tab
    And Click close button in view all Recent Activities tab
    Then Close the Customers Page

  @TC_48
  Scenario: Customers:List
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click List button
    Then Select valid installer "Test Client" in customer list page
    Then Select valid "All" payment status in customer list page
    Then Select valid "All" customer status in customer list page
    And Enter valid customer name "Adharsh Support" in customer list page
    Then Click edit button in customer list page
    Then Click view icon button in Recent Activities tab
    Then Close the Customers Page

  @TC_49
  Scenario: Customers:ACH Form
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click ACH Form button
    Then Select valid form type "All" in ACH Form
    And Select valid form type "ACH Pending" in ACH Form
    Then Select valid form type "ACH Released" in ACH Form
    And Select valid form type "ACH Suspended" in ACH Form
    Then Select valid form type "ACH Stopped" in ACH Form
    And Select valid form status "All" in ACH Form
    Then Select valid form status "Requested" in ACH Form
    And Select valid form status "Completed" in ACH Form
    Then Close the Customers Page

  @TC_50
  Scenario: Customers:ACH Form
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click ACH Form button
    Then Select valid installer name "Test Client" in ACH Form
    And Enter valid username "test1" in searchbox in ACH Form
    Then Close the Customers Page

  @TC_51
  Scenario: Customers:ACH Form
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click ACH Form button
    Then Select valid installer name "Test Client" in ACH Form
    And Enter valid username "test1" in searchbox in ACH Form
    Then Click edit button in ACH Form
    And Click view log button in ACH Form
    Then Click close button in ACH Form
    Then Close the Customers Page

  @TC_52
  Scenario: Customers:ACH Form
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click ACH Form button
    Then Select valid installer name "Test Client" in ACH Form
    And Select valid form type "ACH Pending" in ACH Form
    And Enter valid username "Test" in searchbox in ACH Form
    Then Click edit button in ACH Form
    And Click update button in edit ACH form details
    Then Click robot checkbox in ACH Form
    And Click agree checkbox in ACH Form
    Then Click ACH payment checkbox in ACH form
    And Click update button in ACH form
    Then Check mandatory alert message displayed or not in ACH Form
    Then Close the Customers Page

  @TC_53
  Scenario: Customers:ACH Form
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click ACH Form button
    Then Select valid installer name "Test Client" in ACH Form
    And Select valid form type "ACH Pending" in ACH Form
    And Enter valid username "Test" in searchbox in ACH Form
    Then Click edit button in ACH Form
    And Click update button in edit ACH form details
    And Click back button in ACH form
    Then Close the Customers Page

  @TC_54
  Scenario: Customers:ACH Form
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click ACH Form button
    Then Select valid installer name "Test Client" in ACH Form
    And Select valid form type "ACH Pending" in ACH Form
    And Enter valid username "Test" in searchbox in ACH Form
    Then Click edit button in ACH Form
    And Click update button in edit ACH form details
    Then Enter valid bank name "Test Bank" in ACH Form
    And Enter valid bank account number "Test Account" in ACH Form
    Then Enter valid bank routing number "125008547" in ACH Form
    And Select valid date in Effective from in ACH Form
    Then Select valid pay date "29" in ACH Form
    And Select valid CGI Deposit account "(98653221) CGI TEST BANK" in ACH Form
    Then Click robot checkbox in ACH Form
    And Click agree checkbox in ACH Form
    Then Click ACH payment checkbox in ACH form
    And Click update button in ACH form
    Then Close the Customers Page

  @TC_55
  Scenario: Customers:ACH Form
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click ACH Form button
    Then Select valid installer name "Test Client" in ACH Form
    And Select valid form type "ACH Released" in ACH Form
    And Enter valid username "Test" in searchbox in ACH Form
    Then Click edit button in ACH Form
    And Click actions button in ACH Form
    Then Click edit ACH Form in ACH Form
    And Click update button in edit ACH form details
    Then Click uploaded file in ACH Form
    Then Close the Customers Page

  @TC_56
  Scenario: Customers:ACH Form
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click ACH Form button
    Then Select valid installer name "Test Client" in ACH Form
    And Select valid form type "ACH Released" in ACH Form
    And Enter valid username "Test" in searchbox in ACH Form
    Then Click edit button in ACH Form
    And Click actions button in ACH Form
    Then Click send to customer button in action
    And Click Send button in send to customer
    Then Close the Customers Page

  @TC_57
  Scenario: Customers:ACH Form
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click ACH Form button
    Then Select valid installer name "Test Client" in ACH Form
    And Select valid form type "ACH Released" in ACH Form
    And Enter valid username "Test" in searchbox in ACH Form
    Then Click edit button in ACH Form
    And Click actions button in ACH Form
    Then Click send to customer button in action
    And Click Resend button in send to customer
    Then Close the Customers Page

  @TC_58
  Scenario: Customers:ACH Form
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click ACH Form button
    Then Select valid installer name "Test Client" in ACH Form
    And Select valid form type "ACH Released" in ACH Form
    And Enter valid username "Test" in searchbox in ACH Form
    Then Click edit button in ACH Form
    And Click actions button in ACH Form
    Then Click send to sales person button in action
    And Click Send button in send to sales person
    Then Close the Customers Page

  @TC_59
  Scenario: Customers:ACH Form
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click ACH Form button
    Then Select valid installer name "Test Client" in ACH Form
    And Select valid form type "ACH Released" in ACH Form
    And Enter valid username "Test" in searchbox in ACH Form
    Then Click edit button in ACH Form
    And Click actions button in ACH Form
    Then Click send to sales person button in action
    And Click Resend button in send to sales person
    Then Close the Customers Page

  @TC_60
  Scenario: Customers:ACH Form
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click ACH Form button
    Then Select valid installer name "Test Client" in ACH Form
    And Select valid form type "ACH Released" in ACH Form
    And Enter valid username "Test" in searchbox in ACH Form
    Then Click edit button in ACH Form
    And Click actions button in ACH Form
    Then Click change pay date button in action
    And Click change pay date button in ACH Form
    Then Check mandatory message is displayed or not in change pay date
    Then Close the Customers Page

  @TC_61
  Scenario: Customers:ACH Form
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click ACH Form button
    Then Select valid installer name "Test Client" in ACH Form
    And Select valid form type "All" in ACH Form
    And Enter valid username "Test" in searchbox in ACH Form
    Then Click edit button in ACH Form
    And Click actions button in ACH Form
    Then Click change pay date button in action
    And Click actions button in change pay date
    Then Click back button in change pay date
    Then Close the Customers Page

  @TC_62
  Scenario: Customers:ACH Form
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click ACH Form button
    Then Select valid installer name "Test Client" in ACH Form
    And Select valid form type "All" in ACH Form
    And Enter valid username "Test" in searchbox in ACH Form
    Then Click edit button in ACH Form
    And Click actions button in ACH Form
    Then Click change pay date button in action
    And Select valid date in effective from in change pay date
    Then Select valid pay date "31" in change pay date
    And Click change pay date button in ACH Form
    #Then Check success message is displayed or not in change pay date
    Then Close the Customers Page

  @TC_63
  Scenario: Customers:ACH Form
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click ACH Form button
    Then Select valid installer name "Test Client" in ACH Form
    And Select valid form type "ACH Released" in ACH Form
    And Enter valid username "Test" in searchbox in ACH Form
    Then Click edit button in ACH Form
    And Click actions button in ACH Form
    Then Click stop payment button in action
    And Click the agree checbox in stop payments
    Then Click stop payment button in stop payments
    And Check mandatory message is displayed or not in stop payments
    Then Close the Customers Page

  @TC_64
  Scenario: Customers:ACH Form
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click ACH Form button
    Then Select valid installer name "Test Client" in ACH Form
    And Select valid form type "ACH Released" in ACH Form
    And Enter valid username "Test" in searchbox in ACH Form
    Then Click edit button in ACH Form
    And Click actions button in ACH Form
    Then Click stop payment button in action
    And Click the action button in stop payments
    Then Click back button in stop payments
    Then Close the Customers Page

  @TC_65
  Scenario: Customers:ACH Form
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click ACH Form button
    Then Select valid installer name "Test Client" in ACH Form
    And Select valid form type "ACH Released" in ACH Form
    And Enter valid username "Test" in searchbox in ACH Form
    Then Click edit button in ACH Form
    And Click actions button in ACH Form
    Then Click stop payment button in action
    Then Select valid effective from month in stop payments
    And Enter valid reason "Test" in stop payments
    And Click the agree checbox in stop payments
    Then Click stop payment button in stop payments
    And Check success message is displayed or not in stop payments
    Then Close the Customers Page

  @TC_66
  Scenario: Customers:ACH Form
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click ACH Form button
    Then Select valid installer name "Test Client" in ACH Form
    And Select valid form type "ACH Released" in ACH Form
    And Enter valid username "Test" in searchbox in ACH Form
    Then Click edit button in ACH Form
    And Click actions button in ACH Form
    Then Click skip payment button in action
    And Click the agree checbox in skip payments
    Then Click skip payment button in skip payments
    And Check mandatory message is displayed or not in skip payments
    Then Close the Customers Page

  @TC_67
  Scenario: Customers:ACH Form
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click ACH Form button
    Then Select valid installer name "Test Client" in ACH Form
    And Select valid form type "ACH Released" in ACH Form
    And Enter valid username "Test" in searchbox in ACH Form
    Then Click edit button in ACH Form
    And Click actions button in ACH Form
    Then Click skip payment button in action
    And Click the action button in skip payments
    Then Click back button in skip payments
    Then Close the Customers Page

  @TC_68
  Scenario: Customers:ACH Form
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click ACH Form button
    Then Select valid installer name "Test Client" in ACH Form
    And Select valid form type "ACH Released" in ACH Form
    And Enter valid username "Test" in searchbox in ACH Form
    Then Click edit button in ACH Form
    And Click actions button in ACH Form
    Then Click skip payment button in action
    Then Select valid start month in skip payments
    And Select valid end month in skip payments
    And Enter valid reason "Test" in skip payments
    Then Click the agree checbox in skip payments
    Then Click skip payment button in skip payments
    And Check success message is displayed or not in skip payments
    Then Close the Customers Page

  @TC_69
  Scenario: Customers:ACH Form
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click ACH Form button
    Then Select valid installer name "Test Client" in ACH Form
    And Select valid form type "ACH Released" in ACH Form
    And Enter valid username "Test" in searchbox in ACH Form
    Then Click edit button in ACH Form
    And Click change monthly pay button in ACH Form
    Then Enter valid monthly pay "10" in Edit Monthly Payments
    And Select valid effective from month in Edit Monthly Payments
    Then Enter valid reason "Test" in Edit Monthly Payments
    And Click save button in Edit Monthly Payments
    Then Check success message is displayed or not in Edit Monthly Payments
    Then Close the Customers Page

  @TC_70
  Scenario: Customers:ACH Form
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click ACH Form button
    Then Select valid installer name "Test Client" in ACH Form
    And Select valid form type "ACH Stopped" in ACH Form
    And Enter valid username "Test" in searchbox in ACH Form
    Then Click edit button in ACH Form
    And Click actions button in ACH Form
    Then Click start payment button in action
    And Select valid start from in start payments
    Then Select valid reason "Test" in start payments
    And Click the checkox in start payments
    Then Click start payment button in start payments
    And Check success message is displayed or not in start payments
    Then Close the Customers Page

  @TC_71
  Scenario: Customers:ACH Form Upload
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click ACH Form upload button
    Then Click sample file button in ACH Form upload
    Then Close the Customers Page

  @TC_72
  Scenario: Customers:ACH Form Upload
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click ACH Form upload button
    Then Click ACH form setup button in ACH Form upload
    And Check page landed to ACH Form page or not
    Then Close the Customers Page

  @TC_73
  Scenario: Customers:ACH Form Upload
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click ACH Form upload button
    Then Click submit button in ACH Form upload
    And Check error toast message is displayed or not in ACH Form Upload
    Then Close the Customers Page

  @TC_74
  Scenario: Customers:ACH Form Upload
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click ACH Form upload button
    Then Select valid tail "Test Client" in ACH Form upload
    And Upload valid file in ACH Form upload
    Then Click submit button in ACH Form upload
    Then Close the Customers Page

  @TC_75
  Scenario: Customers:ACH Form Upload
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click ACH Form upload button
    Then Click download button in ACH Form Upload
    Then Close the Customers Page

  @TC_76
  Scenario: Customers:Invoice Pay
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Invoice Pay button
    Then Select valid type "All" in Invoice pay
    And Select valid type "Pending" in Invoice pay
    Then Select valid type "Released" in Invoice pay
    And Select valid type "Stopped" in Invoice pay
    Then Select valid type "Suspended" in Invoice pay
    Then Close the Customers Page

  @TC_77
  Scenario: Customers:Invoice Pay
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Invoice Pay button
    Then Select valid installer "Test Client" in Invoice pay
    And Select valid type "All" in Invoice pay
    And Enter valid username "Test" in Invoice pay
    Then Close the Customers Page

  @TC_78
  Scenario: Customers:Invoice Pay
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Invoice Pay button
    Then Select valid installer "Test Client" in Invoice pay
    And Select valid type "All" in Invoice pay
    And Enter valid username "Test" in Invoice pay
    Then Click edit button in Invoice pay
    Then Close the Customers Page

  @TC_79
  Scenario: Customers:Invoice Pay
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Invoice Pay button
    Then Select valid installer "Test Client" in Invoice pay
    And Select valid type "All" in Invoice pay
    And Enter valid username "Test" in Invoice pay
    Then Click edit button in Invoice pay
    And Click actions button in Invoice pay
    Then Click edit payments in Invoice pay
    Then Click back button in edit payments
    Then Close the Customers Page

  @TC_80
  Scenario: Customers:Invoice Pay
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Invoice Pay button
    Then Select valid installer "Test Client" in Invoice pay
    And Select valid type "All" in Invoice pay
    And Enter valid username "Test" in Invoice pay
    Then Click edit button in Invoice pay
    And Click actions button in Invoice pay
    Then Click edit payments in Invoice pay
    Then Clear the customer name in edit payments
    And Click robot checkbox in edit payments
    Then Click agree checkbox in edit payments
    And Click update button in edit payments
    Then Check mandatory message is displayed or not in edit payments
    Then Close the Customers Page

  @TC_81
  Scenario: Customers:Invoice Pay
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Invoice Pay button
    Then Select valid installer "Test Client" in Invoice pay
    And Select valid type "All" in Invoice pay
    And Enter valid username "Test" in Invoice pay
    Then Click edit button in Invoice pay
    And Click actions button in Invoice pay
    Then Click edit payments in Invoice pay
    Then Modify valid details in edit payments
    And Click robot checkbox in edit payments
    Then Click agree checkbox in edit payments
    And Click update button in edit payments
    Then Check success message is displayed or not in edit payments
    Then Close the Customers Page

  @TC_82
  Scenario: Customers:Invoice Pay
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Invoice Pay button
    Then Select valid installer "Test Client" in Invoice pay
    And Select valid type "All" in Invoice pay
    And Enter valid username "Test" in Invoice pay
    Then Click edit button in Invoice pay
    And Click actions button in Invoice pay
    Then Click change invoice date in Invoice pay
    And Click change pay date button in change invoice date
    Then Check mandatory message is displayed or not in change invoice date
    Then Close the Customers Page

  @TC_83
  Scenario: Customers:Invoice Pay
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Invoice Pay button
    Then Select valid installer "Test Client" in Invoice pay
    And Select valid type "All" in Invoice pay
    And Enter valid username "Test" in Invoice pay
    Then Click edit button in Invoice pay
    And Click actions button in Invoice pay
    Then Click change invoice date in Invoice pay
    And Click actions button in change invoice date
    Then Click back button in change invoice date
    Then Close the Customers Page

  @TC_84
  Scenario: Customers:Invoice Pay
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Invoice Pay button
    Then Select valid installer "Test Client" in Invoice pay
    And Select valid type "All" in Invoice pay
    And Enter valid username "Test" in Invoice pay
    Then Click edit button in Invoice pay
    And Click actions button in Invoice pay
    Then Click change invoice date in Invoice pay
    And Select valid effective from date in change invoice date
    Then Select valid pay date "20" in change invoice date
    And Click change pay date button in change invoice date
    Then Check success message is displayed or not in change invoice date
    Then Close the Customers Page

  @TC_85
  Scenario: Customers:Invoice Pay
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Invoice Pay button
    Then Select valid installer "Test Client" in Invoice pay
    And Select valid type "All" in Invoice pay
    And Enter valid username "Test" in Invoice pay
    Then Click edit button in Invoice pay
    And Click actions button in Invoice pay
    Then Click stop invoice payments in Invoice pay
    And Click the checkbox in stop invoice payments
    And Click Stop Payment button in stop invoice payments
    Then Check mandatory message is displayed or not in stop invoice payments
    Then Close the Customers Page

  @TC_86
  Scenario: Customers:Invoice Pay
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Invoice Pay button
    Then Select valid installer "Test Client" in Invoice pay
    And Select valid type "All" in Invoice pay
    And Enter valid username "Test" in Invoice pay
    Then Click edit button in Invoice pay
    And Click actions button in Invoice pay
    Then Click stop invoice payments in Invoice pay
    And Click actions button in stop invoice payments
    Then Click back button in stop invoice payments
    Then Close the Customers Page

  @TC_87
  Scenario: Customers:Invoice Pay
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Invoice Pay button
    Then Select valid installer "Test Client" in Invoice pay
    And Select valid type "All" in Invoice pay
    And Enter valid username "Test" in Invoice pay
    Then Click edit button in Invoice pay
    And Click actions button in Invoice pay
    Then Click stop invoice payments in Invoice pay
    And Select valid effective from date in stop invoice payments
    Then Enter valid reason "Test" in stop invoice payments
    And Click the checkbox in stop invoice payments
    And Click Stop Payment button in stop invoice payments
    Then Check success message is displayed or not in stop invoice payments
    Then Close the Customers Page

  @TC_88
  Scenario: Customers:Invoice Pay
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Invoice Pay button
    Then Select valid installer "Test Client" in Invoice pay
    And Select valid type "All" in Invoice pay
    And Enter valid username "Test" in Invoice pay
    Then Click edit button in Invoice pay
    And Click actions button in Invoice pay
    Then Click quick book upload in Invoice pay
    And Click sample file button in invoice log upload
    Then Close the Customers Page

  @TC_89
  Scenario: Customers:Invoice Pay
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Invoice Pay button
    Then Select valid installer "Test Client" in Invoice pay
    And Select valid type "All" in Invoice pay
    And Enter valid username "Test" in Invoice pay
    Then Click edit button in Invoice pay
    And Click actions button in Invoice pay
    Then Click quick book upload in Invoice pay
    And Click submit button in invoice log upload
    Then Check mandatory message is displayed ot not in invoice log upload
    Then Close the Customers Page

  @TC_90
  Scenario: Customers:Invoice Pay
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Invoice Pay button
    Then Select valid installer "Test Client" in Invoice pay
    And Select valid type "All" in Invoice pay
    And Enter valid username "Test" in Invoice pay
    Then Click edit button in Invoice pay
    And Click actions button in Invoice pay
    Then Click quick book upload in Invoice pay
    And Upload valid file in invoice log upload
    And Click submit button in invoice log upload
    Then Check success message is displayed ot not in invoice log upload
    Then Close the Customers Page

  @TC_91
  Scenario: Customers:Invoice Pay
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Invoice Pay button
    Then Select valid installer "Test Client" in Invoice pay
    And Select valid type "All" in Invoice pay
    And Enter valid username "Test" in Invoice pay
    Then Click edit button in Invoice pay
    And Click actions button in Invoice pay
    Then Click stop invoice payments in Invoice pay
    And Click actions button in stop invoice payments
    Then Click skip payments in stop invoice payments
    And Click agree button checkbox in stop invoice payments
    Then Click skip payment button in stop invoice payments
    Then Close the Customers Page

  @TC_92
  Scenario: Customers:Invoice Pay
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Invoice Pay button
    Then Select valid installer "Test Client" in Invoice pay
    And Select valid type "All" in Invoice pay
    And Enter valid username "Test" in Invoice pay
    Then Click edit button in Invoice pay
    And Click actions button in Invoice pay
    Then Click stop invoice payments in Invoice pay
    And Click actions button in stop invoice payments
    Then Click skip payments in stop invoice payments
    And Click actions button in skip payments
    Then Click back button in skip payments
    Then Close the Customers Page

  @TC_93
  Scenario: Customers:Invoice Pay
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Invoice Pay button
    Then Select valid installer "Test Client" in Invoice pay
    And Select valid type "All" in Invoice pay
    And Enter valid username "Test" in Invoice pay
    Then Click edit button in Invoice pay
    And Click actions button in Invoice pay
    Then Click stop invoice payments in Invoice pay
    And Click actions button in stop invoice payments
    Then Click skip payments in stop invoice payments
    And Select valid start month in skip payments
    Then Select valid end month in skip payments
    And Enter valid reason in Skip Payments
    And Click agree button checkbox in stop invoice payments
    Then Click skip payment button in stop invoice payments
    Then Close the Customers Page
  @TC_94
  Scenario: Customers:Invoice Pay
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Invoice Pay button
    Then Select valid installer "Test Client" in Invoice pay
    And Select valid type "All" in Invoice pay
    And Enter valid username "Test" in Invoice pay
    Then Click edit button in Invoice pay
    And Click change pay date in invoice date tab
    Then Check page landed to change pay date page or not
    Then Close the Customers Page
  @TC_95
  Scenario: Customers:Invoice Pay
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Invoice Pay button
    Then Select valid installer "Test Client" in Invoice pay
    And Select valid type "All" in Invoice pay
    And Enter valid username "Test" in Invoice pay
    Then Click edit button in Invoice pay
    And Click change monthly pay in invoice date tab
    Then Check page landed to Edit Monthly Payments page or not
    Then Close the Customers Page
  @TC_96
  Scenario: Customers:Invoice Pay
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Invoice Pay button
    Then Select valid installer "Test Client" in Invoice pay
    And Select valid type "All" in Invoice pay
    And Enter valid username "Test" in Invoice pay
    Then Click edit button in Invoice pay
    And Click actions button in Invoice pay
    Then Click Start Invoice Payments button in action
    And Select valid start from in start payments
    Then Select valid reason "Test" in start payments
    And Click the checkox in start payments
    Then Click start payment button in start payments
    And Check success message is displayed or not in start payments
    Then Close the Customers Page

  @TC_97
  Scenario: Customers:Create Invoice
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Create Invoice button
    Then Select valid installer "Test Client" in Create Invoice
    And Select valid type "All" in Create Invoice
    Then Select valid type "Manual Pay" in Create Invoice
    And Select valid type "Prepaid" in Create Invoice
    Then Close the Customers Page

  @TC_98
  Scenario: Customers:Create Invoice
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Create Invoice button
    Then Select valid installer "Test Client" in Create Invoice
    And Select valid type "All" in Create Invoice
    Then Enter valid user name "test1" in Create Invoice
    Then Close the Customers Page

  @TC_99
  Scenario: Customers:Create Invoice
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Create Invoice button
    Then Select valid installer "Test Client" in Create Invoice
    And Select valid type "All" in Create Invoice
    Then Enter valid user name "TEST ACH1 CUSTOMER" in Create Invoice
    And Click edit button in create invoice
    Then Click outstanding months radio button in create invoice
    And Click the checkbox in create invoice
    Then Click save button in create invoice
    And Check success message is displayed or not in create invoice
    Then Close the Customers Page

  @TC_100
  Scenario: Customers:Create Invoice
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Create Invoice button
    Then Select valid installer "Test Client" in Create Invoice
    And Select valid type "All" in Create Invoice
    Then Enter valid user name "vignesh Support" in Create Invoice
    And Click edit button in create invoice
    Then Click outstanding months radio button in create invoice
    And Click the first checkbox in create invoice
    Then Click save button in create invoice
    And Check success message is displayed or not in create invoice
    Then Close the Customers Page

  @TC_101
  Scenario: Customers:Create Invoice
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Create Invoice button
    Then Select valid installer "Test Client" in Create Invoice
    And Select valid type "All" in Create Invoice
    Then Enter valid user name "test2" in Create Invoice
    And Click edit button in create invoice
    Then Click manual entry radio button in create invoice
    Then Click save button in manual entry in create invoice
    And Check mandatory message is displayed or not in manual entry in create invoice
    Then Close the Customers Page

  @TC_102
  Scenario: Customers:Create Invoice
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Create Invoice button
    Then Select valid installer "Test Client" in Create Invoice
    And Select valid type "All" in Create Invoice
    Then Enter valid user name "test2" in Create Invoice
    And Click edit button in create invoice
    Then Click manual entry radio button in create invoice
    Then Enter valid description "Test" in add line item in manual entry
    And Enter valid Amount "10" in add line item in manual entry
    And Select valid due month in add line item in manual entry
    Then Click clear button in manual entry in create invoice
    Then Close the Customers Page

  @TC_103
  Scenario: Customers:Create Invoice
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Create Invoice button
    Then Select valid installer "Test Client" in Create Invoice
    And Select valid type "All" in Create Invoice
    Then Enter valid user name "test2" in Create Invoice
    And Click edit button in create invoice
    Then Click manual entry radio button in create invoice
    Then Enter valid description "Test" in add line item in manual entry
    And Enter valid Amount "10" in add line item in manual entry
    And Select valid due month in add line item in manual entry
    Then Click save button in manual entry in create invoice
    And Check success message is displayed or not in manual entry in create invoice
    Then Close the Customers Page

  @TC_104
  Scenario: Customers:Create Invoice
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Create Invoice button
    Then Select valid installer "Test Client" in Create Invoice
    And Select valid type "All" in Create Invoice
    Then Enter valid user name "test2" in Create Invoice
    And Click edit button in create invoice
    Then Click manual entry radio button in create invoice
    Then Enter valid description "Test" in add line item in manual entry
    And Enter valid Amount "10" in add line item in manual entry
    And Select valid due month in add line item in manual entry
    Then Click save button in manual entry in create invoice
    Then Click save button in manual entry in create invoice
    And Check success message is displayed or not in manual entry in create invoice
    Then Click delete button in add line items
    Then Close the Customers Page

  @TC_105
  Scenario: Customers:Create Invoice
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Create Invoice button
    Then Select valid installer "Test Client" in Create Invoice
    And Select valid type "All" in Create Invoice
    Then Enter valid user name "test2" in Create Invoice
    And Click edit button in create invoice
    Then Click manual entry radio button in create invoice
    Then Enter valid description "Test" in add line item in manual entry
    And Enter valid Amount "10" in add line item in manual entry
    And Select valid due month in add line item in manual entry
    Then Click save button in manual entry in create invoice
    Then Click save button in manual entry in create invoice
    And Check success message is displayed or not in manual entry in create invoice
    Then Click preview invoice button in add line items
    And Click edit button in Invoice Month tab in preview invoice page
    Then Click close button in Invoice Month tab in preview invoice page
    Then Click edit button in Due Date tab in preview invoice page
    And Click close button in Due Date tab in preview invoice page
    Then Click send invoice button in preview invoice page
    And Check confirmation message is displayed or not in preview invoice page
    Then Close the Customers Page

  @TC_106
  Scenario: Customers:Create Invoice
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Create Invoice button
    Then Select valid installer "Test Client" in Create Invoice
    And Select valid type "All" in Create Invoice
    Then Enter valid user name "test2" in Create Invoice
    And Click edit button in create invoice
    Then Click manual entry radio button in create invoice
    Then Enter valid description "Test" in add line item in manual entry
    And Enter valid Amount "10" in add line item in manual entry
    And Select valid due month in add line item in manual entry
    Then Click save button in manual entry in create invoice
    Then Click save button in manual entry in create invoice
    And Check success message is displayed or not in manual entry in create invoice
    Then Click actions button in add line items
    And Click back button in add line items
    Then Close the Customers Page

  @TC_107
  Scenario: Customers:Create Invoice
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Create Invoice button
    Then Select valid installer "Test Client" in Create Invoice
    And Select valid type "All" in Create Invoice
    Then Enter valid user name "test2" in Create Invoice
    And Click edit button in create invoice
    Then Click manual entry radio button in create invoice
    Then Enter valid description "Test" in add line item in manual entry
    And Enter valid Amount "10" in add line item in manual entry
    And Select valid due month in add line item in manual entry
    Then Click save button in manual entry in create invoice
    Then Click save button in manual entry in create invoice
    And Check success message is displayed or not in manual entry in create invoice
    Then Click preview invoice button in add line items
    And Click edit button in Invoice Month tab in preview invoice page
    Then Clear the details in Invoice Month tab in preview invoice page
    And Click submit button in Invoice Month tab in preview invoice page
    #And CHeck mandatory message is displayed or not in preview invoice page
    Then Close the Customers Page

  @TC_108
  Scenario: Customers:Create Invoice
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Create Invoice button
    Then Select valid installer "Test Client" in Create Invoice
    And Select valid type "All" in Create Invoice
    Then Enter valid user name "test2" in Create Invoice
    And Click edit button in create invoice
    Then Click manual entry radio button in create invoice
    Then Enter valid description "Test" in add line item in manual entry
    And Enter valid Amount "10" in add line item in manual entry
    And Select valid due month in add line item in manual entry
    Then Click save button in manual entry in create invoice
    Then Click save button in manual entry in create invoice
    And Check success message is displayed or not in manual entry in create invoice
    Then Click preview invoice button in add line items
    And Click edit button in Invoice Month tab in preview invoice page
    Then Modify valid details in Invoice Month tab in preview invoice page
    And Click submit button in Invoice Month tab in preview invoice page
    And CHeck success message is displayed or not in preview invoice page
    Then Close the Customers Page

  @TC_109
  Scenario: Customers:Create Invoice
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Create Invoice button
    Then Select valid installer "Test Client" in Create Invoice
    And Select valid type "All" in Create Invoice
    Then Enter valid user name "test2" in Create Invoice
    And Click edit button in create invoice
    Then Click manual entry radio button in create invoice
    Then Enter valid description "Test" in add line item in manual entry
    And Enter valid Amount "10" in add line item in manual entry
    And Select valid due month in add line item in manual entry
    Then Click save button in manual entry in create invoice
    Then Click save button in manual entry in create invoice
    And Check success message is displayed or not in manual entry in create invoice
    Then Click preview invoice button in add line items
    And Click edit button in Due Date tab in preview invoice page
    And Click submit button in Due Date tab in preview invoice page
    #And CHeck mandatory message is displayed or not in preview invoice page
    Then Close the Customers Page

  @TC_110
  Scenario: Customers:Create Invoice
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Create Invoice button
    Then Select valid installer "Test Client" in Create Invoice
    And Select valid type "All" in Create Invoice
    Then Enter valid user name "test2" in Create Invoice
    And Click edit button in create invoice
    Then Click manual entry radio button in create invoice
    Then Enter valid description "Test" in add line item in manual entry
    And Enter valid Amount "10" in add line item in manual entry
    And Select valid due month in add line item in manual entry
    Then Click save button in manual entry in create invoice
    Then Click save button in manual entry in create invoice
    And Check success message is displayed or not in manual entry in create invoice
    Then Click preview invoice button in add line items
    And Click edit button in Due Date tab in preview invoice page
    Then Modify valid date in Due Date tab in preview invoice page
    And Click submit button in Due Date tab in preview invoice page
    And CHeck success message is displayed or not in preview invoice page
    Then Close the Customers Page

  @TC_111
  Scenario: Customers:Create Invoice
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Create Invoice button
    Then Select valid installer "Test Client" in Create Invoice
    And Select valid type "All" in Create Invoice
    Then Enter valid user name "test2" in Create Invoice
    And Click edit button in create invoice
    Then Click manual entry radio button in create invoice
    Then Enter valid description "Test" in add line item in manual entry
    And Enter valid Amount "10" in add line item in manual entry
    And Select valid due month in add line item in manual entry
    Then Click save button in manual entry in create invoice
    Then Click save button in manual entry in create invoice
    And Check success message is displayed or not in manual entry in create invoice
    Then Click preview invoice button in add line items
    And Click Actions button in preview invoice page
    Then Click back button in preview invoice page
    Then Close the Customers Page

  @TC_112
  Scenario: Customers:Create Invoice
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Create Invoice button
    Then Select valid installer "Test Client" in Create Invoice
    And Select valid type "All" in Create Invoice
    Then Enter valid user name "test2" in Create Invoice
    And Click edit button in create invoice
    Then Click manual entry radio button in create invoice
    Then Enter valid description "Test" in add line item in manual entry
    And Enter valid Amount "10" in add line item in manual entry
    And Select valid due month in add line item in manual entry
    Then Click save button in manual entry in create invoice
    Then Click save button in manual entry in create invoice
    And Check success message is displayed or not in manual entry in create invoice
    Then Click preview invoice button in add line items
    Then Click send invoice button in preview invoice page
    And Check confirmation message is displayed or not in preview invoice page
    Then Click no button in confirmation page
    Then Close the Customers Page

  @TC_113
  Scenario: Customers:Create Invoice
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Create Invoice button
    Then Select valid installer "Test Client" in Create Invoice
    And Select valid type "All" in Create Invoice
    Then Enter valid user name "test2" in Create Invoice
    And Click edit button in create invoice
    Then Click manual entry radio button in create invoice
    Then Enter valid description "Test" in add line item in manual entry
    And Enter valid Amount "10" in add line item in manual entry
    And Select valid due month in add line item in manual entry
    Then Click save button in manual entry in create invoice
    Then Click save button in manual entry in create invoice
    And Check success message is displayed or not in manual entry in create invoice
    Then Click preview invoice button in add line items
    Then Click send invoice button in preview invoice page
    And Check confirmation message is displayed or not in preview invoice page
    Then Click yes button in confirmation page
    Then Close the Customers Page

  @TC_114
  Scenario: Customers:Create Invoice
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Create Invoice button
    Then Select valid installer "Test Client" in Create Invoice
    And Select valid type "All" in Create Invoice
    Then Enter valid user name "test2" in Create Invoice
    And Click edit button in create invoice
    Then Click manual entry radio button in create invoice
    Then Enter valid description "Test" in add line item in manual entry
    And Enter valid Amount "10" in add line item in manual entry
    And Select valid due month in add line item in manual entry
    Then Click save button in manual entry in create invoice
    Then Click save button in manual entry in create invoice
    And Check success message is displayed or not in manual entry in create invoice
    Then Click add line item button in line items
    Then Enter valid description "Test" in add line item in manual entry
    And Enter valid Amount "10" in add line item in manual entry
    And Select valid due month in add line item in manual entry
    Then Click save button in manual entry in create invoice
    Then Click save button in manual entry in create invoice
    And Check success message is displayed or not in manual entry in create invoice
    Then Close the Customers Page

  @TC_115
  Scenario: Customers:Check Payments
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Check Payments button
    Then Select valid installer "Test Client" in Check Payments
    Then Close the Customers Page

  @TC_116
  Scenario: Customers:Check Payments
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Check Payments button
    Then Select valid installer "Test Client" in Check Payments
    Then Enter valid user name "test1" in Check Payments
    Then Close the Customers Page

  @TC_117
  Scenario: Customers:Check Payments
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Check Payments button
    Then Click add button in Check Payments
    And Click search button in Check Payments
    Then Check mandatory message is displayed or not in filter page
    Then Close the Customers Page

  @TC_118
  Scenario: Customers:Check Payments
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Check Payments button
    Then Click add button in Check Payments
    And Select valid installer "Test Client" in filter page
    Then Enter valid customer name "test1" in filter page
    And Click search button in Check Payments
    Then Close the Customers Page

  @TC_119
  Scenario: Customers:Check Payments
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Check Payments button
    Then Click add button in Check Payments
    And Select valid installer "Test Client" in filter page
    Then Enter valid customer name "test1" in filter page
    And Click search button in Check Payments
    And Click the robot checkbox in add check payments page
    Then Click save button in add check payments page
    And Check mandatory message is displayed or not in add check payments page
    Then Close the Customers Page

  @TC_120
  Scenario: Customers:Check Payments
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Check Payments button
    Then Click add button in Check Payments
    And Select valid installer "Test Client" in filter page
    Then Enter valid customer name "test1" in filter page
    And Click search button in Check Payments
    Then Click back button in add check payments page
    Then Close the Customers Page

  @TC_121
  Scenario: Customers:Check Payments
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Check Payments button
    Then Click add button in Check Payments
    And Select valid installer "Test Client" in filter page
    Then Enter valid customer name "test1" in filter page
    And Click search button in Check Payments
    Then Upload valid file in attack check tab
    And Click the attached file in attack check tab
    Then Close the Customers Page

  @TC_122
  Scenario: Customers:Check Payments
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Check Payments button
    Then Click add button in Check Payments
    And Select valid installer "Test Client" in filter page
    Then Enter valid customer name "test1" in filter page
    And Click search button in Check Payments
    Then Click add due month button in deposit details tab
    Then Click add to list button in add due month
    And Click close button in add due month
    # And Check mandatory message is displayed or not in add due month
    Then Close the Customers Page

  @TC_123
  Scenario: Customers:Check Payments
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Check Payments button
    Then Click add button in Check Payments
    And Select valid installer "Test Client" in filter page
    Then Enter valid customer name "test1" in filter page
    And Click search button in Check Payments
    Then Click add due month button in deposit details tab
    And Select valid due month in add due month
    Then Click add to list button in add due month
    And Check success message is displayed or not in add due month
    And Click close button in add due month
    Then Close the Customers Page

  @TC_124
  Scenario: Customers:Check Payments
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Check Payments button
    Then Click add button in Check Payments
    And Select valid installer "Test Client" in filter page
    Then Enter valid customer name "test1" in filter page
    And Click search button in Check Payments
    Then Click add due month button in deposit details tab
    And Select valid due month in add due month
    Then Click add to list button in add due month
    And Select valid due month in add due month
    Then Click add to list button in add due month
    And Check success message is displayed or not in add due month
    And Click close button in add due month
    Then Close the Customers Page

  @TC_125
  Scenario: Customers:Check Payments
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Check Payments button
    Then Click add button in Check Payments
    And Select valid installer "Test Client" in filter page
    Then Enter valid customer name "test1" in filter page
    And Click search button in Check Payments
    Then Upload valid file in attack check tab
    And Enter valid number "123456" in check number tab in check details
    Then Select valid date in check date tab in check details
    And Enter valid amount "10" in check amount tab in check details
    Then Select valid type "Checking" in account type in bank details
    And Enter valid name "Test" in name on account tab in bank details
    Then Enter valid number "1234567890" in bank account number tab in bank details
    And Enter valid number "125008547" in bank routing number tab in bank details
    Then Click add due month button in deposit details tab
    And Select valid due month in add due month
    Then Click add to list button in add due month
    And Click close button in add due month
    And Select valid account "(98653221) CGI TEST BANK" CGI Deposit account in deposit details tab
    Then Click the robot checkbox in confirmation tab
    Then Click save button in add check payments page
    And Check success message is displayed or not in add check payments page
    Then Close the Customers Page

  @TC_126
  Scenario: Customers:Check Payments
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Check Payments button
    And Select valid installer "Test Client" in Check Payments
    Then Enter valid user name "vignesh Support" in Check Payments
    And Click edit button in check payments page
    Then Clear the data in check number field
    And Click the robot checkbox in confirmation tab
    Then Click update button in edit payments page
    And Check mandatory message is displayed or not in add check payments page
    Then Close the Customers Page

  @TC_127
  Scenario: Customers:Check Payments
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Check Payments button
    And Select valid installer "Test Client" in Check Payments
    Then Enter valid user name "vignesh Support" in Check Payments
    And Click edit button in check payments page
    Then Click back button in edit payments page
    Then Close the Customers Page

  @TC_128
  Scenario: Customers:Check Payments
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Check Payments button
    And Select valid installer "Test Client" in Check Payments
    Then Enter valid user name "vignesh Support" in Check Payments
    And Click edit button in check payments page
    And Click add due month button in check payments page
    Then Select june month in check payments page
    Then Click add to list button in add due month
    And Check error toast message is displayed or not in check payments page
    Then Close the Customers Page

  @TC_129
  Scenario: Customers:Check Payments
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Check Payments button
    And Select valid installer "Test Client" in Check Payments
    Then Enter valid user name "vignesh Support" in Check Payments
    And Click edit button in check payments page
    And Click the uploaded file in attach check tab
    Then Close the Customers Page

  @TC_130
  Scenario: Customers:Check Payments
    Given To Check Customers User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Customers User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Customers
    Then Click the Customers button
    And Click Check Payments button
    And Select valid installer "Test Client" in Check Payments
    Then Enter valid user name "vignesh Support" in Check Payments
    And Click edit button in check payments page
    And Modify valid detail in check payments page
    And Click the robot checkbox in confirmation tab
    Then Click update button in edit payments page
    And Check success message is displayed or not in add check payments page
    Then Close the Customers Page
