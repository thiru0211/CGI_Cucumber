Feature: REPORTS

  @TC_01
  Scenario: Reports:OS Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click OS Report button
    Then Select valid from month in OS Reports page
    And Select valid installer name "Test Client" in OS Reports page
    Then Select valid payment method "LTF" in OS Reports page
    And Select valid payment status "All" in OS Reports page
    Then Close the Reports Page

  @TC_02
  Scenario: Reports:OS Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click OS Report button
    Then Select valid from month in OS Reports page
    And Select valid installer name "Test Client" in OS Reports page
    Then Select valid payment method "All" in OS Reports page
    And Select valid payment status "Pending" in OS Reports page
    Then Close the Reports Page

  @TC_03
  Scenario: Reports:OS Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click OS Report button
    Then Select valid from month in OS Reports page
    And Select valid installer name "Test Client" in OS Reports page
    Then Select valid payment method "All" in OS Reports page
    And Select valid payment status "Paid" in OS Reports page
    Then Close the Reports Page

  @TC_04
  Scenario: Reports:OS Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click OS Report button
    Then Select valid from month in OS Reports page
    And Select valid installer name "Test Client" in OS Reports page
    Then Select valid payment method "All" in OS Reports page
    And Select valid payment status "Paid" in OS Reports page
    Then Enter valid customer name "Aishwarya" in OS Reports page
    And Click view button of the customer in OS Reports page
    Then Close the Reports Page

  @TC_05
  Scenario: Reports:OS Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click OS Report button
    Then Select valid from month in OS Reports page
    And Select valid installer name "Test Client" in OS Reports page
    Then Select valid payment method "All" in OS Reports page
    And Select valid payment status "Pending" in OS Reports page
    Then Click export button in OS Reports page
    Then Close the Reports Page

  @TC_06
  Scenario: Reports:OS Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click OS Report button
    Then Select valid from month in OS Reports page
    And Select valid installer name "Test Client" in OS Reports page
    Then Select valid payment method "All" in OS Reports page
    And Select valid payment status "All" in OS Reports page
    Then Enter valid customer name "Aishwarya" in OS Reports page
    And Click view button of the customer in OS Reports page
    Then Click view log button in OS Reports page
    And Click close button in view log report
    Then Close the Reports Page

  @TC_07
  Scenario: Reports:OS Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click OS Report button
    Then Select valid from month in OS Reports page
    And Select valid installer name "Test Client" in OS Reports page
    Then Select valid payment method "All" in OS Reports page
    And Select valid payment status "All" in OS Reports page
    Then Enter valid customer name "Aishwarya" in OS Reports page
    And Click view button of the customer in OS Reports page
    Then Click action button in OS Reports page
    And Click add recieved payments button in OS Reports page
    Then Click action button in Add Received Payments
    And Click add payment option in Add Received Payments
    Then Click close button in Add Received Payments popup
    Then Close the Reports Page

  @TC_08
  Scenario: Reports:OS Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click OS Report button
    Then Select valid from month in OS Reports page
    And Select valid installer name "Test Client" in OS Reports page
    Then Select valid payment method "All" in OS Reports page
    And Select valid payment status "All" in OS Reports page
    Then Enter valid customer name "Aishwarya" in OS Reports page
    And Click view button of the customer in OS Reports page
    Then Click action button in OS Reports page
    And Click add recieved payments button in OS Reports page
    Then Click action button in Add Received Payments
    And Click add payment option in Add Received Payments
    Then Click submit button in Add Received Payments popup
    And Check mandatory message is displayed or not in Add Received Payments
    Then Close the Reports Page

  @TC_09
  Scenario: Reports:OS Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click OS Report button
    Then Select valid from month in OS Reports page
    And Select valid installer name "Test Client" in OS Reports page
    Then Select valid payment method "All" in OS Reports page
    And Select valid payment status "All" in OS Reports page
    Then Enter valid customer name "Aishwarya" in OS Reports page
    And Click view button of the customer in OS Reports page
    Then Click action button in OS Reports page
    And Click add recieved payments button in OS Reports page
    Then Click action button in Add Received Payments
    And Click add payment option in Add Received Payments
    Then Select valid due month in Add Received Payments popup
    And Select valid transcation date in Add Received Payments popup
    Then Enter valid Transaction Description "Test" in Add Received Payments popup
    And Enter valid amount "1" in Add Received Payments popup
    Then Select valid payment option "Credit" in Add Received Payments popup
    And Select valid mode of payment "ACH" in Add Received Payments popup
    Then Click clear button in Add Received Payments popup
    Then Close the Reports Page

  @TC_10
  Scenario: Reports:OS Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click OS Report button
    Then Select valid from month in OS Reports page
    And Select valid installer name "Test Client" in OS Reports page
    Then Select valid payment method "All" in OS Reports page
    And Select valid payment status "All" in OS Reports page
    Then Enter valid customer name "Aishwarya" in OS Reports page
    And Click view button of the customer in OS Reports page
    Then Click action button in OS Reports page
    And Click add recieved payments button in OS Reports page
    Then Click action button in Add Received Payments
    And Click add payment option in Add Received Payments
    Then Select valid due month in Add Received Payments popup
    And Select valid transcation date in Add Received Payments popup
    Then Enter valid Transaction Description "Test" in Add Received Payments popup
    And Enter valid amount "1" in Add Received Payments popup
    Then Select valid payment option "Credit" in Add Received Payments popup
    And Select valid mode of payment "ACH" in Add Received Payments popup
    Then Click submit button in Add Received Payments popup
    And Check success message is displayed or not in Add Received Payments
    Then Close the Reports Page

  @TC_11
  Scenario: Reports:OS Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click OS Report button
    Then Select valid from month in OS Reports page
    And Select valid installer name "Test Client" in OS Reports page
    Then Select valid payment method "All" in OS Reports page
    And Select valid payment status "All" in OS Reports page
    Then Enter valid customer name "Aishwarya" in OS Reports page
    And Click view button of the customer in OS Reports page
    Then Click action button in OS Reports page
    And Click add recieved payments button in OS Reports page
    Then Click action button in Add Received Payments
    And Click add payment option in Add Received Payments
    Then Select valid due month in Add Received Payments popup
    And Select valid transcation date in Add Received Payments popup
    Then Enter valid Transaction Description "Test" in Add Received Payments popup
    And Enter valid amount "1" in Add Received Payments popup
    Then Select valid payment option "Debit" in Add Received Payments popup
    And Select valid mode of payment "Invoice Pay" in Add Received Payments popup
    Then Click submit button in Add Received Payments popup
    And Check success message is displayed or not in Add Received Payments
    Then Close the Reports Page

  @TC_12
  Scenario: Reports:OS Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click OS Report button
    Then Select valid from month in OS Reports page
    And Select valid installer name "Test Client" in OS Reports page
    Then Select valid payment method "All" in OS Reports page
    And Select valid payment status "All" in OS Reports page
    Then Enter valid customer name "Aishwarya" in OS Reports page
    And Click view button of the customer in OS Reports page
    Then Click action button in OS Reports page
    And Click add recieved payments button in OS Reports page
    Then Click edit button in Add Received Payments
    Then Click close button in Add Received Payments popup
    Then Close the Reports Page

  @TC_13
  Scenario: Reports:OS Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click OS Report button
    Then Select valid from month in OS Reports page
    And Select valid installer name "Test Client" in OS Reports page
    Then Select valid payment method "All" in OS Reports page
    And Select valid payment status "All" in OS Reports page
    Then Enter valid customer name "Aishwarya" in OS Reports page
    And Click view button of the customer in OS Reports page
    Then Click action button in OS Reports page
    And Click add recieved payments button in OS Reports page
    Then Click edit button in Add Received Payments
    Then Click clear button in Add Received Payments popup
    And Check description details is cleared or not in edit Received Payments popup
    Then Close the Reports Page

  @TC_14
  Scenario: Reports:OS Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click OS Report button
    Then Select valid from month in OS Reports page
    And Select valid installer name "Test Client" in OS Reports page
    Then Select valid payment method "All" in OS Reports page
    And Select valid payment status "All" in OS Reports page
    Then Enter valid customer name "Aishwarya" in OS Reports page
    And Click view button of the customer in OS Reports page
    Then Click action button in OS Reports page
    And Click add recieved payments button in OS Reports page
    Then Click edit button in Add Received Payments
    Then Click clear button in Add Received Payments popup
    And Click submit button in edit Received Payments popup
    And Check mandatory message is displayed or not in edit Received Payments
    Then Close the Reports Page

  @TC_15
  Scenario: Reports:OS Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click OS Report button
    Then Select valid from month in OS Reports page
    And Select valid installer name "Test Client" in OS Reports page
    Then Select valid payment method "All" in OS Reports page
    And Select valid payment status "All" in OS Reports page
    Then Enter valid customer name "Aishwarya" in OS Reports page
    And Click view button of the customer in OS Reports page
    Then Click action button in OS Reports page
    And Click add recieved payments button in OS Reports page
    Then Click edit button in Add Received Payments
    Then Modify valid details in edit Received Payments popup
    And Click submit button in edit Received Payment popup
    Then Close the Reports Page

  @TC_16
  Scenario: Reports:OS Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click OS Report button
    Then Select valid from month in OS Reports page
    And Select valid installer name "Test Client" in OS Reports page
    Then Select valid payment method "All" in OS Reports page
    And Select valid payment status "All" in OS Reports page
    Then Enter valid customer name "Aishwarya" in OS Reports page
    And Click view button of the customer in OS Reports page
    Then Click action button in OS Reports page
    And Click add recieved payments button in OS Reports page
    Then Click delete button in add recieved payments
    Then Close the Reports Page

  @TC_17
  Scenario: Reports:OS Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click OS Report button
    Then Select valid from month in OS Reports page
    And Select valid installer name "Test Client" in OS Reports page
    Then Select valid payment method "All" in OS Reports page
    And Select valid payment status "All" in OS Reports page
    Then Enter valid customer name "Aishwarya" in OS Reports page
    And Click view button of the customer in OS Reports page
    Then Click action button in OS Reports page
    And Click Add Manual Pay button in OS Reports page
    Then Click close button in manual payment popup
    Then Close the Reports Page

  @TC_18
  Scenario: Reports:OS Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click OS Report button
    Then Select valid from month in OS Reports page
    And Select valid installer name "Test Client" in OS Reports page
    Then Select valid payment method "All" in OS Reports page
    And Select valid payment status "All" in OS Reports page
    Then Enter valid customer name "Aishwarya" in OS Reports page
    And Click view button of the customer in OS Reports page
    Then Click action button in OS Reports page
    And Click Add Manual Pay button in OS Reports page
    Then Click save button in manual payment popup
    And Check error toast is displayed or not in manual payment popup
    Then Close the Reports Page

  @TC_19
  Scenario: Reports:OS Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click OS Report button
    Then Select valid from month in OS Reports page
    And Select valid installer name "Test Client" in OS Reports page
    Then Select valid payment method "All" in OS Reports page
    And Select valid payment status "All" in OS Reports page
    Then Enter valid customer name "Aishwarya" in OS Reports page
    And Click view button of the customer in OS Reports page
    Then Click action button in OS Reports page
    And Click Add Manual Pay button in OS Reports page
    Then Select valid due month in manual payment popup
    And Enter valid monthly pay "1" in manual payment popup
    Then Enter valid reason "Test" in manual payment popup
    Then Click save button in manual payment popup
    And Check success message is displayed or not in manual payment popup
    Then Close the Reports Page

  @TC_20
  Scenario: Reports:OS Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click OS Report button
    Then Select valid from month in OS Reports page
    And Select valid installer name "Test Client" in OS Reports page
    Then Select valid payment method "All" in OS Reports page
    And Select valid payment status "All" in OS Reports page
    Then Enter valid customer name "Aishwarya" in OS Reports page
    And Click view button of the customer in OS Reports page
    Then Click action button in OS Reports page
    And Click Add Manual Pay button in OS Reports page
    Then Click edit button in manual payment popup
    And Modify valid details in manual payment popup
    Then Click update button in manual payment popup
    Then Close the Reports Page

  @TC_21
  Scenario: Reports:OS Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click OS Report button
    Then Select valid from month in OS Reports page
    And Select valid installer name "Test Client" in OS Reports page
    Then Select valid payment method "All" in OS Reports page
    And Select valid payment status "All" in OS Reports page
    Then Enter valid customer name "Aishwarya" in OS Reports page
    And Click view button of the customer in OS Reports page
    Then Click action button in OS Reports page
    And Click Add Manual Pay button in OS Reports page
    Then Click delete button in manual payment
    Then Close the Reports Page

  @TC_22
  Scenario: Reports:OS Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click OS Report button
    Then Select valid from month in OS Reports page
    And Select valid installer name "Test Client" in OS Reports page
    Then Select valid payment method "All" in OS Reports page
    And Select valid payment status "All" in OS Reports page
    Then Enter valid customer name "Aishwarya" in OS Reports page
    And Click view button of the customer in OS Reports page
    Then Click action button in OS Reports page
    Then Click back button in OS Reports page
    Then Close the Reports Page

  @TC_23
  Scenario: Reports:Tape Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Tape Report button
    Then Select valid from month in Tape Reports page
    And Select valid installer name "Test Client" in Tape Reports page
    Then Select valid group name "All Group" in Tape Reports page
    And Select valid sort by name "None" in Tape Reports page
    Then Click run report button in Tape Reports page
    Then Close the Reports Page

  @TC_24
  Scenario: Reports:Tape Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Tape Report button
    Then Select valid from month in Tape Reports page
    And Select valid installer name "Test Client" in Tape Reports page
    Then Select valid group name "All Group" in Tape Reports page
    And Select valid sort by name "Customer Group" in Tape Reports page
    Then Click run report button in Tape Reports page
    Then Close the Reports Page

  @TC_25
  Scenario: Reports:Tape Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Tape Report button
    Then Select valid from month in Tape Reports page
    And Select valid installer name "Test Client" in Tape Reports page
    Then Select valid group name "All Group" in Tape Reports page
    And Select valid sort by name "State" in Tape Reports page
    Then Click run report button in Tape Reports page
    Then Close the Reports Page

  @TC_26
  Scenario: Reports:Tape Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Tape Report button
    Then Select valid from month in Tape Reports page
    And Select valid installer name "Test Client" in Tape Reports page
    Then Select valid group name "All Group" in Tape Reports page
    And Select valid sort by name "Most Outstanding" in Tape Reports page
    Then Click run report button in Tape Reports page
    Then Close the Reports Page

  @TC_27
  Scenario: Reports:Tape Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Tape Report button
    Then Select valid from month in Tape Reports page
    And Select valid installer name "Test Client" in Tape Reports page
    Then Select valid group name "QA Team" in Tape Reports page
    And Select valid sort by name "None" in Tape Reports page
    Then Click run report button in Tape Reports page
    Then Close the Reports Page

  @TC_28
  Scenario: Reports:Tape Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Tape Report button
    Then Select valid from month in Tape Reports page
    And Select valid installer name "Test Client" in Tape Reports page
    Then Select valid group name "QA Team" in Tape Reports page
    And Select valid sort by name "Customer Group" in Tape Reports page
    Then Click run report button in Tape Reports page
    Then Close the Reports Page

  @TC_29
  Scenario: Reports:Tape Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Tape Report button
    Then Select valid from month in Tape Reports page
    And Select valid installer name "Test Client" in Tape Reports page
    Then Select valid group name "QA Team" in Tape Reports page
    And Select valid sort by name "State" in Tape Reports page
    Then Click run report button in Tape Reports page
    Then Close the Reports Page

  @TC_30
  Scenario: Reports:Tape Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Tape Report button
    Then Select valid from month in Tape Reports page
    And Select valid installer name "Test Client" in Tape Reports page
    Then Select valid group name "QA Team" in Tape Reports page
    And Select valid sort by name "Most Outstanding" in Tape Reports page
    Then Click run report button in Tape Reports page
    Then Close the Reports Page

  @TC_31
  Scenario: Reports:Tape Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Tape Report button
    Then Select valid from month in Tape Reports page
    And Select valid installer name "Test Client" in Tape Reports page
    Then Select valid group name "Tranche 1" in Tape Reports page
    And Select valid sort by name "None" in Tape Reports page
    Then Click run report button in Tape Reports page
    Then Close the Reports Page

  @TC_32
  Scenario: Reports:Tape Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Tape Report button
    Then Select valid from month in Tape Reports page
    And Select valid installer name "Test Client" in Tape Reports page
    Then Select valid group name "Tranche 1" in Tape Reports page
    And Select valid sort by name "Customer Group" in Tape Reports page
    Then Click run report button in Tape Reports page
    Then Close the Reports Page

  @TC_33
  Scenario: Reports:Tape Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Tape Report button
    Then Select valid from month in Tape Reports page
    And Select valid installer name "Test Client" in Tape Reports page
    Then Select valid group name "Tranche 1" in Tape Reports page
    And Select valid sort by name "State" in Tape Reports page
    Then Click run report button in Tape Reports page
    Then Close the Reports Page

  @TC_34
  Scenario: Reports:Tape Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Tape Report button
    Then Select valid from month in Tape Reports page
    And Select valid installer name "Test Client" in Tape Reports page
    Then Select valid group name "Tranche 1" in Tape Reports page
    And Select valid sort by name "Most Outstanding" in Tape Reports page
    Then Click run report button in Tape Reports page
    Then Close the Reports Page

  @TC_35
  Scenario: Reports:Tape Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Tape Report button
    Then Select valid from month in Tape Reports page
    And Select valid installer name "Test Client" in Tape Reports page
    Then Select valid group name "Tranche 2" in Tape Reports page
    And Select valid sort by name "None" in Tape Reports page
    Then Click run report button in Tape Reports page
    Then Close the Reports Page

  @TC_36
  Scenario: Reports:Tape Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Tape Report button
    Then Select valid from month in Tape Reports page
    And Select valid installer name "Test Client" in Tape Reports page
    Then Select valid group name "Tranche 2" in Tape Reports page
    And Select valid sort by name "Customer Group" in Tape Reports page
    Then Click run report button in Tape Reports page
    Then Close the Reports Page

  @TC_37
  Scenario: Reports:Tape Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Tape Report button
    Then Select valid from month in Tape Reports page
    And Select valid installer name "Test Client" in Tape Reports page
    Then Select valid group name "Tranche 2" in Tape Reports page
    And Select valid sort by name "State" in Tape Reports page
    Then Click run report button in Tape Reports page
    Then Close the Reports Page

  @TC_38
  Scenario: Reports:Tape Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Tape Report button
    Then Select valid from month in Tape Reports page
    And Select valid installer name "Test Client" in Tape Reports page
    Then Select valid group name "Tranche 2" in Tape Reports page
    And Select valid sort by name "Most Outstanding" in Tape Reports page
    Then Click run report button in Tape Reports page
    Then Close the Reports Page

  @TC_39
  Scenario: Reports:Tape Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Tape Report button
    Then Select valid from month in Tape Reports page
    And Select valid installer name "Test Client" in Tape Reports page
    Then Select valid group name "Tranche 3" in Tape Reports page
    And Select valid sort by name "None" in Tape Reports page
    Then Click run report button in Tape Reports page
    Then Close the Reports Page

  @TC_40
  Scenario: Reports:Tape Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Tape Report button
    Then Select valid from month in Tape Reports page
    And Select valid installer name "Test Client" in Tape Reports page
    Then Select valid group name "Tranche 3" in Tape Reports page
    And Select valid sort by name "Customer Group" in Tape Reports page
    Then Click run report button in Tape Reports page
    Then Close the Reports Page

  @TC_41
  Scenario: Reports:Tape Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Tape Report button
    Then Select valid from month in Tape Reports page
    And Select valid installer name "Test Client" in Tape Reports page
    Then Select valid group name "Tranche 3" in Tape Reports page
    And Select valid sort by name "State" in Tape Reports page
    Then Click run report button in Tape Reports page
    Then Close the Reports Page

  @TC_42
  Scenario: Reports:Tape Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Tape Report button
    Then Select valid from month in Tape Reports page
    And Select valid installer name "Test Client" in Tape Reports page
    Then Select valid group name "Tranche 3" in Tape Reports page
    And Select valid sort by name "Most Outstanding" in Tape Reports page
    Then Click run report button in Tape Reports page
    Then Close the Reports Page

  @TC_43
  Scenario: Reports:Tape Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Tape Report button
    Then Select valid from month in Tape Reports page
    And Select valid installer name "Test Client" in Tape Reports page
    Then Select valid group name "QA Team" in Tape Reports page
    And Select valid sort by name "Most Outstanding" in Tape Reports page
    Then Click run report button in Tape Reports page
    And Click download report button in Tape Reports page
    Then Close the Reports Page

  @TC_44
  Scenario: Reports:ACH Transaction
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click ACH Transaction button
    Then Select valid installer name "Test Client" in ACH Transaction page
    And Select valid payment status "All" in ACH Transaction page
    And Select valid from month in ACH Transaction page
    Then Close the Reports Page

  @TC_45
  Scenario: Reports:ACH Transaction
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click ACH Transaction button
    Then Select valid installer name "Test Client" in ACH Transaction page
    And Select valid payment status "All" in ACH Transaction page
    And Select valid from month in ACH Transaction page
    Then Click the actions button in ACH Transaction page
    And Click the excel export button in ACH Transaction page
    Then Close the Reports Page

  @TC_46
  Scenario: Reports:ACH Transaction
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click ACH Transaction button
    Then Select valid installer name "Test Client" in ACH Transaction page
    And Select valid payment status "All" in ACH Transaction page
    And Select valid from month in ACH Transaction page
    Then Click the actions button in ACH Transaction page
    And Click back button in ACH Transaction page
    Then Close the Reports Page

  @TC_47
  Scenario: Reports:ACH Transaction
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click ACH Transaction button
    Then Select valid installer name "Test Client" in ACH Transaction page
    And Select valid payment status "All" in ACH Transaction page
    And Select valid from month in ACH Transaction page
    Then Click the actions button in ACH Transaction page
    And Click the file log button in ACH Transaction page
    Then Close the Reports Page

  @TC_48
  Scenario: Reports:ACH Transaction
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click ACH Transaction button
    Then Select valid installer name "Test Client" in ACH Transaction page
    And Select valid payment status "All" in ACH Transaction page
    And Select valid from month in ACH Transaction page
    Then Click the actions button in ACH Transaction page
    And Click the file log button in ACH Transaction page
    Then Select valid installer name "Test Client" in ACH Scheduler Log page
    And Select valid from month in ACH Scheduler Log page
    Then Click view button in ACH Scheduler Log page
    Then Close the Reports Page

  @TC_49
  Scenario: Reports:ACH Transaction
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click ACH Transaction button
    Then Select valid installer name "Test Client" in ACH Transaction page
    And Select valid payment status "All" in ACH Transaction page
    And Select valid from month in ACH Transaction page
    Then Enter valid customer name "Aishwarya" in ACH Transaction page
    Then Close the Reports Page
 
  @TC_50
  Scenario: Reports:ACH Transaction
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click ACH Transaction button
    Then Select valid installer name "Test Client" in ACH Transaction page
    And Select valid payment status "All" in ACH Transaction page
    And Select valid from month in ACH Transaction page
    Then Enter valid customer name "Aishwarya" in ACH Transaction page
    Then Click view button in ACH Transaction page
    Then Close the Reports Page

  @TC_51
  Scenario: Reports:ACH Transaction
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click ACH Transaction button
    Then Select valid installer name "Test Client" in ACH Transaction page
    And Select valid payment status "All" in ACH Transaction page
    And Select valid from month in ACH Transaction page
    Then Enter valid customer name "Aishwarya" in ACH Transaction page
    Then Click view button in ACH Transaction page
    And Click back button in Transaction details page
    Then Close the Reports Page

  @TC_52
  Scenario: Reports:Returned Transaction
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Returned Transaction button
    Then Select valid installer name "Test Client" in Returned Transaction page
    And Select valid payment status "All" in Returned Transaction page
    And Select valid from month in Returned Transaction page
    Then Close the Reports Page

  @TC_53
  Scenario: Reports:Returned Transaction
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Returned Transaction button
    Then Select valid installer name "Test Client" in Returned Transaction page
    And Select valid payment status "Paid" in Returned Transaction page
    And Select valid from month in Returned Transaction page
    Then Close the Reports Page
@Test
  @TC_54
  Scenario: Reports:Returned Transaction
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Returned Transaction button
    Then Select valid installer name "Test Client" in Returned Transaction page
    And Select valid payment status "Initiated" in Returned Transaction page
    And Select valid from month in Returned Transaction page
    Then Close the Reports Page
@Test
  @TC_55
  Scenario: Reports:Returned Transaction
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Returned Transaction button
    Then Select valid installer name "Test Client" in Returned Transaction page
    And Select valid payment status "Returned" in Returned Transaction page
    And Select valid from month in Returned Transaction page
    Then Close the Reports Page
@Test
  @TC_56
  Scenario: Reports:Returned Transaction
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Returned Transaction button
    Then Select valid installer name "Test Client" in Returned Transaction page
    And Select valid payment status "Failed" in Returned Transaction page
    And Select valid from month in Returned Transaction page
    Then Click actions button in Returned Transaction page
    And Click excel export button in Returned Transaction page
    Then Close the Reports Page
@Test
  @TC_57
  Scenario: Reports:Returned Transaction
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Returned Transaction button
    Then Select valid installer name "Test Client" in Returned Transaction page
    And Select valid payment status "Failed" in Returned Transaction page
    And Select valid from month in Returned Transaction page
    Then Click actions button in Returned Transaction page
    And Click back button in Returned Transaction page
    Then Close the Reports Page
@Test
  @TC_58
  Scenario: Reports:Returned Transaction
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Returned Transaction button
    Then Select valid installer name "Test Client" in Returned Transaction page
    And Select valid payment status "All" in Returned Transaction page
    And Select valid from month in Returned Transaction page
    Then Enter valid customer name "Aishwarya" in Returned Transaction page
    Then Close the Reports Page
@Test
  @TC_59
  Scenario: Reports:Returned Transaction
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Returned Transaction button
    Then Select valid installer name "Test Client" in Returned Transaction page
    And Select valid payment status "All" in Returned Transaction page
    And Select valid from month in Returned Transaction page
    Then Click view button in Returned Transaction page
    Then Close the Reports Page

  @TC_60
  Scenario: Reports:Returned Transaction
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Returned Transaction button
    Then Select valid installer name "Test Client" in Returned Transaction page
    And Select valid payment status "All" in Returned Transaction page
    And Select valid from month in Returned Transaction page
    Then Click view button in Returned Transaction page
    And Click back button in Transaction details page
    Then Close the Reports Page
@Test
  @TC_61
  Scenario: Reports:Invoice Log
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Invoice Log button
    Then Select valid installer name "Test Client" in Invoice Log page
    And Select valid payment status "All" in Invoice Log page
    And Select valid from month in Invoice Log page
    Then Close the Reports Page

  @TC_62
  Scenario: Reports:Invoice Log
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Invoice Log button
    Then Select valid installer name "Test Client" in Invoice Log page
    And Select valid payment status "All" in Invoice Log page
    And Select valid from month in Invoice Log page
    Then Enter valid customer name "Rajesh Test 2" in Invoice Log page
    Then Close the Reports Page

  @TC_63
  Scenario: Reports:Invoice Log
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Invoice Log button
    Then Select valid installer name "Test Client" in Invoice Log page
    And Select valid payment status "All" in Invoice Log page
    And Select valid from month in Invoice Log page
    Then Click export button in Invoice Log page
    Then Close the Reports Page
@Test
  @TC_64
  Scenario: Reports:Invoice Log
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Invoice Log button
    Then Select valid installer name "Test Client" in Invoice Log page
    And Select valid payment status "All" in Invoice Log page
    And Select valid from month in Invoice Log page
    Then Click view button in Invoice Log page
    Then Close the Reports Page

  @TC_65
  Scenario: Reports:Invoice Log
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Invoice Log button
    Then Select valid installer name "Test Client" in Invoice Log page
    And Select valid payment status "All" in Invoice Log page
    And Select valid from month in Invoice Log page
    Then Click view button in Invoice Log page
    And Click actions button in Transaction Details page
    Then Click resend invoice button in Transaction Details page
    And Click old copy radio button in Resend Invoice popup
    Then Click submit button in Resend Invoice popup
    Then Close the Reports Page

  @TC_66
  Scenario: Reports:Invoice Log
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Invoice Log button
    Then Select valid installer name "Test Client" in Invoice Log page
    And Select valid payment status "All" in Invoice Log page
    And Select valid from month in Invoice Log page
    Then Click view button in Invoice Log page
    And Click actions button in Transaction Details page
    Then Click resend invoice button in Transaction Details page
    And Click generate new radio button in Resend Invoice popup
    Then Click submit button in Resend Invoice popup
    Then Close the Reports Page

  @TC_67
  Scenario: Reports:Invoice Log
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Invoice Log button
    Then Select valid installer name "Test Client" in Invoice Log page
    And Select valid payment status "All" in Invoice Log page
    And Select valid from month in Invoice Log page
    Then Click view button in Invoice Log page
    And Click actions button in Transaction Details page
    Then Click void invoice button in Transaction Details page
    And Click no button in Resend Invoice popup
    Then Close the Reports Page
@Test
  @TC_68
  Scenario: Reports:Invoice Log
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Invoice Log button
    Then Select valid installer name "Test Client" in Invoice Log page
    And Select valid payment status "All" in Invoice Log page
    And Select valid from month in Invoice Log page
    Then Click view button in Invoice Log page
    And Click actions button in Transaction Details page
    Then Click void invoice button in Transaction Details page
    And Click yes button in Resend Invoice popup
    Then Check mandatory message is displayed or not in Resend Invoice popup
    Then Close the Reports Page
@Test
  @TC_69
  Scenario: Reports:Invoice Log
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Invoice Log button
    Then Select valid installer name "Test Client" in Invoice Log page
    And Select valid payment status "All" in Invoice Log page
    And Select valid from month in Invoice Log page
    Then Click view button in Invoice Log page
    And Click actions button in Transaction Details page
    Then Click void invoice button in Transaction Details page
    And Enter valid confirmation details "Test" in confirmation popup
    And Click yes button in Resend Invoice popup
    Then Close the Reports Page
@Test
  @TC_70
  Scenario: Reports:Invoice Log
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Invoice Log button
    Then Select valid installer name "Test Client" in Invoice Log page
    And Select valid payment status "All" in Invoice Log page
    And Select valid from month in Invoice Log page
    Then Click view button in Invoice Log page
    And Click actions button in Transaction Details page
    Then Click download invoice button in Transaction Details page
    Then Close the Reports Page
@Test
  @TC_71
  Scenario: Reports:Invoice Log
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Invoice Log button
    Then Select valid installer name "Test Client" in Invoice Log page
    And Select valid payment status "All" in Invoice Log page
    And Select valid from month in Invoice Log page
    Then Click view button in Invoice Log page
    And Click actions button in Transaction Details page
    Then Click back button in Invoice Log page
    Then Close the Reports Page

  @TC_72
  Scenario: Reports:Activity Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Activity Report button
    Then Select valid installer name "Test Client" in Activity Report page
    And Select valid from month in Activity Report page
    Then Close the Reports Page

  @TC_73
  Scenario: Reports:Activity Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Activity Report button
    Then Select valid installer name "Test Client" in Activity Report page
    And Select valid from month in Activity Report page
    Then Click view button in Activity Report page
    And Click close button in View Event Log page
    Then Close the Reports Page
@Test
  @TC_74
  Scenario: Reports:Audit Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Audit Report button
    Then Select valid installer name "Test Client" in Audit Report page
    And Select valid status "All" in Audit Report page
    Then Close the Reports Page
@Test
  @TC_75
  Scenario: Reports:Audit Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Audit Report button
    Then Select valid installer name "Test Client" in Audit Report page
    And Select valid status "Active" in Audit Report page
    Then Close the Reports Page
@Test
  @TC_76
  Scenario: Reports:Audit Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Audit Report button
    Then Select valid installer name "Test Client" in Audit Report page
    And Select valid status "Removed" in Audit Report page
    Then Close the Reports Page
@Test
  @TC_77
  Scenario: Reports:Audit Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Audit Report button
    Then Select valid installer name "Test Client" in Audit Report page
    And Select valid status "Swap Out" in Audit Report page
    Then Close the Reports Page
@Test
  @TC_78
  Scenario: Reports:Audit Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Audit Report button
    Then Select valid installer name "Test Client" in Audit Report page
    And Select valid status "All" in Audit Report page
    Then Click the export button in Audit Report page
    Then Close the Reports Page
@Test
  @TC_79
  Scenario: Reports:Audit Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Audit Report button
    Then Select valid installer name "Test Client" in Audit Report page
    And Select valid status "All" in Audit Report page
    Then Enter valid customer name "Aishwarya" in Audit Report page
    Then Close the Reports Page

  @TC_80
  Scenario: Reports:Audit Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Audit Report button
    Then Select valid installer name "Test Client" in Audit Report page
    And Select valid status "All" in Audit Report page
    Then Enter valid customer name "Aishwarya" in Audit Report page
    And Click view button in ACH Account column in Audit Report page
    Then Click close button in View Account Number pop up
    Then Close the Reports Page

  @TC_81
  Scenario: Reports:Audit Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Audit Report button
    Then Select valid installer name "Test Client" in Audit Report page
    And Select valid status "All" in Audit Report page
    Then Enter valid customer name "Aishwarya" in Audit Report page
    And Click view button in ACH Account column in Audit Report page
    Then Click cancel button in View Account Number pop up
    Then Close the Reports Page

  @TC_82
  Scenario: Reports:Audit Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Audit Report button
    Then Select valid installer name "Test Client" in Audit Report page
    And Select valid status "All" in Audit Report page
    Then Enter valid customer name "Aishwarya" in Audit Report page
    And Click view button in ACH Account column in Audit Report page
    Then Click submit button in View Account Number pop up
    And Check mandatory message is displayed or not in Audit Report page
    Then Close the Reports Page

  @TC_83
  Scenario: Reports:Audit Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Audit Report button
    Then Select valid installer name "Test Client" in Audit Report page
    And Select valid status "All" in Audit Report page
    Then Enter valid customer name "Aishwarya" in Audit Report page
    And Click view button in ACH Account column in Audit Report page
    And Enter valid soft token number "Test" in View Account Number pop up
    Then Click submit button in View Account Number pop up
    Then Close the Reports Page

  @TC_84
  Scenario: Reports:Audit Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Audit Report button
    Then Select valid installer name "Test Client" in Audit Report page
    And Select valid status "All" in Audit Report page
    Then Enter valid customer name "Aishwarya" in Audit Report page
    And Click view button in ACH Routing column in Audit Report page
    Then Click close button in View Routing Number pop up
    Then Close the Reports Page

  @TC_85
  Scenario: Reports:Audit Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Audit Report button
    Then Select valid installer name "Test Client" in Audit Report page
    And Select valid status "All" in Audit Report page
    Then Enter valid customer name "Aishwarya" in Audit Report page
    And Click view button in ACH Routing column in Audit Report page
    Then Click cancel button in View Routing Number pop up
    Then Close the Reports Page
@Test
  @TC_86
  Scenario: Reports:Audit Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Audit Report button
    Then Select valid installer name "Test Client" in Audit Report page
    And Select valid status "All" in Audit Report page
    Then Enter valid customer name "Aishwarya" in Audit Report page
    And Click view button in ACH Routing column in Audit Report page
    Then Click submit button in View Routing Number pop up
    And Check mandatory message is displayed or not in Audit Report page
    Then Close the Reports Page
@Test
  @TC_87
  Scenario: Reports:Audit Report
    Given To Check Reports User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Reports User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Reports
    Then Click the Reports button
    And Click Audit Report button
    Then Select valid installer name "Test Client" in Audit Report page
    And Select valid status "All" in Audit Report page
    Then Enter valid customer name "Aishwarya" in Audit Report page
    And Click view button in ACH Routing column in Audit Report page
    And Enter valid soft token number "Test" in View Routing Number pop up
    Then Click submit button in View Routing Number pop up
    Then Close the Reports Page
