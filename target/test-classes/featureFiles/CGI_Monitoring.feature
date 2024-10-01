Feature: MONITORING

  @TC_01
  Scenario: Monitoring:Overall Status
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Overall Status button
    Then Select valid installer name "LA SOLAR" in overall status page
    And Select valid month in the overall status page
    Then Close the Monitoring Page

  @TC_02
  Scenario: Monitoring:Production Status
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Production Status button
    Then Select valid installer name "LA SOLAR" in Production Status page
    And Select valid status "Current Year" in Production Status page
    Then Select valid month in Production Status page
    And Click export button in Production Status page
    Then Close the Monitoring Page

  @TC_03l
  Scenario: Monitoring:Production Status
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Production Status button
    Then Select valid installer name "LA SOLAR" in Production Status page
    And Select valid status "Life Time" in Production Status page
    And Click export button in Production Status page
    Then Close the Monitoring Page

  @TC_04
  Scenario: Monitoring:Production Status
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Production Status button
    Then Select valid installer name "LA SOLAR" in Production Status page
    And Select valid status "Current Year" in Production Status page
    Then Select valid month in Production Status page
    And Click export button in Production Status page
    Then Close the Monitoring Page

  @TC_05
  Scenario: Monitoring:Production Status
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Production Status button
    Then Select valid installer name "LA SOLAR" in Production Status page
    And Select valid production percentage "<=" in Production Status page
    Then Enter valid delta percentage "100" in Production Status page
    And Select valid state "All" in Production Status page
    Then Click apply button in Production Status page
    Then Close the Monitoring Page

  @TC_06
  Scenario: Monitoring:Production Status
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Production Status button
    Then Select valid installer name "LA SOLAR" in Production Status page
    And Select valid production percentage "<=" in Production Status page
    Then Enter valid delta percentage "100" in Production Status page
    And Select valid state "Working" in Production Status page
    Then Click apply button in Production Status page
    Then Close the Monitoring Page

  @TC_07
  Scenario: Monitoring:Production Status
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Production Status button
    Then Select valid installer name "LA SOLAR" in Production Status page
    And Select valid production percentage "<=" in Production Status page
    Then Enter valid delta percentage "100" in Production Status page
    And Select valid state "Issues" in Production Status page
    Then Click apply button in Production Status page
    Then Close the Monitoring Page

  @TC_08
  Scenario: Monitoring:Production Status
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Production Status button
    Then Select valid installer name "LA SOLAR" in Production Status page
    And Select valid production percentage ">=" in Production Status page
    Then Enter valid delta percentage "100" in Production Status page
    And Select valid state "All" in Production Status page
    Then Click apply button in Production Status page
    Then Close the Monitoring Page

  @TC_09
  Scenario: Monitoring:Production Status
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Production Status button
    Then Select valid installer name "LA SOLAR" in Production Status page
    And Select valid production percentage ">=" in Production Status page
    Then Enter valid delta percentage "100" in Production Status page
    And Select valid state "Working" in Production Status page
    Then Click apply button in Production Status page
    Then Close the Monitoring Page

  @TC_10
  Scenario: Monitoring:Production Status
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Production Status button
    Then Select valid installer name "LA SOLAR" in Production Status page
    And Select valid production percentage ">=" in Production Status page
    Then Enter valid delta percentage "100" in Production Status page
    And Select valid state "Issues" in Production Status page
    Then Click apply button in Production Status page
    Then Close the Monitoring Page

  @TC_10a
  Scenario: Monitoring:Production Status
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Production Status button
    Then Select valid installer name "LA SOLAR" in Production Status page
    And Select valid production percentage "=" in Production Status page
    Then Enter valid delta percentage "100" in Production Status page
    And Select valid state "All" in Production Status page
    Then Click apply button in Production Status page
    Then Close the Monitoring Page

  @TC_11
  Scenario: Monitoring:Production Status
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Production Status button
    Then Select valid installer name "LA SOLAR" in Production Status page
    And Select valid production percentage "=" in Production Status page
    Then Enter valid delta percentage "100" in Production Status page
    And Select valid state "Working" in Production Status page
    Then Click apply button in Production Status page
    Then Close the Monitoring Page

  @TC_12
  Scenario: Monitoring:Production Status
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Production Status button
    Then Select valid installer name "LA SOLAR" in Production Status page
    And Select valid production percentage "=" in Production Status page
    Then Enter valid delta percentage "100" in Production Status page
    And Select valid state "Issues" in Production Status page
    Then Click apply button in Production Status page
    Then Close the Monitoring Page

  @TC_13
  Scenario: Monitoring:Production Status
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Production Status button
    Then Select valid installer name "LA SOLAR" in Production Status page
    And Select valid production percentage "<=" in Production Status page
    Then Enter valid delta percentage "100" in Production Status page
    And Select valid state "All" in Production Status page
    And Enter valid customer name "Affan Uygan" in Production Status page
    Then Click apply button in Production Status page
    Then Close the Monitoring Page

  @TC_14
  Scenario: Monitoring:Production Status
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Production Status button
    Then Select valid installer name "LA SOLAR" in Production Status page
    And Select valid production percentage "<=" in Production Status page
    Then Enter valid delta percentage "100" in Production Status page
    And Select valid state "All" in Production Status page
    And Enter valid customer name "Affan Uygan" in Production Status page
    Then Click apply button in Production Status page
    And Click the customer name in the grid in Production Status page
    Then Close the Monitoring Page

  @TC_15
  Scenario: Monitoring:Customer Status
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Customer Status button
    Then Select valid installer name "LA SOLAR" in filter page
    And Enter the customer name "Aaron Kaplowitz(E2Y4JDBt2Pm)" in filter page
    Then Click search button in filter page
    Then Click actions button in customer status
    And Click change filter option in customer status
    Then Close the Monitoring Page

  @TC_16
  Scenario: Monitoring:Customer Status
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Customer Status button
    Then Select valid installer name "LA SOLAR" in filter page
    And Enter the customer name "Aaron Kaplowitz(E2Y4JDBt2Pm)" in filter page
    Then Click search button in filter page
    Then Click actions button in customer status
    And Click Life Time Statement option in the action button in customer status
    Then Close the Monitoring Page

  @TC_17
  Scenario: Monitoring:Customer Status
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Customer Status button
    Then Select valid installer name "LA SOLAR" in filter page
    And Enter the customer name "Aaron Kaplowitz(E2Y4JDBt2Pm)" in filter page
    Then Click search button in filter page
    Then Click actions button in customer status
    And Click second option in the action button in customer status
    Then Close the Monitoring Page

  @TC_18
  Scenario: Monitoring:Customer Status
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Customer Status button
    Then Select valid installer name "LA SOLAR" in filter page
    And Enter the customer name "Aaron Kaplowitz(E2Y4JDBt2Pm)" in filter page
    Then Click search button in filter page
    Then Click actions button in customer status
    And Click third option in the action button in customer status
    Then Close the Monitoring Page

  @TC_19
  Scenario: Monitoring:Customer Status
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Customer Status button
    Then Select valid installer name "LA SOLAR" in filter page
    And Enter the customer name "Aaron Kaplowitz(E2Y4JDBt2Pm)" in filter page
    Then Click search button in filter page
    Then Click actions button in customer status
    And Click fourth option in the action button in customer status
    Then Close the Monitoring Page

  @TC_20
  Scenario: Monitoring:Customer Status
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Customer Status button
    Then Select valid installer name "LA SOLAR" in filter page
    And Enter the customer name "Aaron Kaplowitz(E2Y4JDBt2Pm)" in filter page
    Then Click search button in filter page
    Then Click actions button in customer status
    And Click fifth option in the action button in customer status
    Then Close the Monitoring Page

  @TC_21
  Scenario: Monitoring:Customer Status
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Customer Status button
    Then Select valid installer name "LA SOLAR" in filter page
    And Enter the customer name "Aaron Kaplowitz(E2Y4JDBt2Pm)" in filter page
    Then Click search button in filter page
    Then Click actions button in customer status
    And Click Get Production details option in the action button in customer status
    Then Close the Monitoring Page

  @TC_22
  Scenario: Monitoring:Customer Status
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Customer Status button
    Then Select valid installer name "LA SOLAR" in filter page
    And Enter the customer name "Aaron Kaplowitz(E2Y4JDBt2Pm)" in filter page
    Then Click search button in filter page
    Then Click add notes button in customer status
    And Click close button in add notes in customer status
    Then Close the Monitoring Page

  @TC_23
  Scenario: Monitoring:Customer Status
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Customer Status button
    Then Select valid installer name "LA SOLAR" in filter page
    And Enter the customer name "Aaron Kaplowitz(E2Y4JDBt2Pm)" in filter page
    Then Click search button in filter page
    Then Click add notes button in customer status
    Then Enter valid notes "Test" in add notes in customer status
    And Click clear button in add notes in customer status
    Then Close the Monitoring Page

  @TC_24
  Scenario: Monitoring:Customer Status
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Customer Status button
    Then Select valid installer name "LA SOLAR" in filter page
    And Enter the customer name "Aaron Kaplowitz(E2Y4JDBt2Pm)" in filter page
    Then Click search button in filter page
    Then Click add notes button in customer status
    Then Enter valid notes "Test" in add notes in customer status
    And Click save button in add notes in customer status
    Then Close the Monitoring Page

  @TC_25
  Scenario: Monitoring:Customer Status
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Customer Status button
    Then Select valid installer name "LA SOLAR" in filter page
    And Enter the customer name "Aaron Kaplowitz(E2Y4JDBt2Pm)" in filter page
    Then Click search button in filter page
    Then Click delete button in add notes in customer status
    Then Close the Monitoring Page

  @TC_26
  Scenario: Monitoring:Customer Status
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Customer Status button
    Then Select valid installer name "LA SOLAR" in filter page
    And Enter the customer name "Aaron Kaplowitz(E2Y4JDBt2Pm)" in filter page
    Then Click search button in filter page
    Then Click customer name arrow button in customer status
    Then Close the Monitoring Page

  @TC_27
  Scenario: Monitoring:Invertor
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Invertor button
    Then Enter valid invertor name "Tesla 153400" in invertor page
    Then Close the Monitoring Page

  @TC_28
  Scenario: Monitoring:Invertor
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Invertor button
    Then Click add button in Invertor page
    And Click back button in Add Invertor page
    Then Close the Monitoring Page

  @TC_29
  Scenario: Monitoring:Invertor
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Invertor button
    Then Click add button in Invertor page
    And Click save button in Add Invertor page
    Then Check mandatory message is displayed or not in Add Invertor page
    Then Close the Monitoring Page

  @TC_30
  Scenario: Monitoring:Invertor
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Invertor button
    Then Click add button in Invertor page
    And Enter valid title "Test" in Add Invertor page
    Then Enter valid Model "Test" in Add Invertor page
    And Enter valid Rating AC "5" in Add Invertor page
    And Click clear button in Add Invertor page
    Then Close the Monitoring Page

  @TC_31
  Scenario: Monitoring:Invertor
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Invertor button
    Then Click add button in Invertor page
    And Enter valid title "Test" in Add Invertor page
    Then Enter valid Model "Test" in Add Invertor page
    And Enter valid Rating AC "5" in Add Invertor page
    And Click save button in Add Invertor page
    Then Check success message is displayed or not in Add Invertor page
    Then Close the Monitoring Page

  @TC_32
  Scenario: Monitoring:Invertor
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Invertor button
    Then Enter valid invertor name "Tesla 153400" in invertor page
    And Click edit button in Invertor page
    Then Click back button in edit Invertor page
    Then Close the Monitoring Page

  @TC_33
  Scenario: Monitoring:Invertor
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Invertor button
    Then Enter valid invertor name "Tesla 153400" in invertor page
    And Click edit button in Invertor page
    Then Click clear button in edit Invertor page
    And Click update button in edit Invertor page
    Then Check mandatory message is displayed or not in edit Invertor page
    Then Close the Monitoring Page

  @TC_34
  Scenario: Monitoring:Invertor
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Invertor button
    Then Enter valid invertor name "Tesla 153400" in invertor page
    And Click edit button in Invertor page
    Then Modify valid detail in title tab in edit Invertor page
    And Click update button in edit Invertor pages
    Then Check success message is displayed or not in edit Invertor page
    Then Close the Monitoring Page

  @TC_35
  Scenario: Monitoring:Panel
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Panel button
    Then Enter valid panel name "Sun Power (320 Watts)" in panel page
    Then Close the Monitoring Page

  @TC_36
  Scenario: Monitoring:Panel
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Panel button
    Then Click add button in panel page
    And Click back button in add panel page
    Then Close the Monitoring Page

  @TC_37
  Scenario: Monitoring:Panel
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Panel button
    Then Click add button in panel page
    And Click save button in add panel page
    Then Check mandatory message is displayed or not in add panel page
    Then Close the Monitoring Page

  @TC_38
  Scenario: Monitoring:Panel
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Panel button
    Then Click add button in panel page
    And Enter valid title "Test" in add panel page
    Then Enter valid Model "Sample" in add panel page
    And Enter valid Watt STC "5" in add panel page
    And Click clear button in add panel page
    Then Close the Monitoring Page

  @TC_39
  Scenario: Monitoring:Panel
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Panel button
    Then Click add button in panel page
    And Enter valid title "Test" in add panel page
    Then Enter valid Model "Sample" in add panel page
    And Enter valid Watt STC "5" in add panel page
    And Click save button in add panel pages
    Then Check success message is displayed or not in add panel page
    Then Close the Monitoring Page

  @TC_40
  Scenario: Monitoring:Panel
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Panel button
    Then Enter valid panel name "Sun Power (320 Watts)" in panel page
    And Click edit button in panel page
    Then Click clear button in edit panel page
    And Check data is cleared or not in title tab in edit panel page
    Then Close the Monitoring Page

  @TC_41
  Scenario: Monitoring:Panel
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Panel button
    Then Enter valid panel name "Sun Power (320 Watts)" in panel page
    And Click edit button in panel page
    Then Modify valid details in edit panel page
    And Click update button in edit panel pages
    And Check success message is displayed or not in edit panel page
    Then Close the Monitoring Page

  @TC_42
  Scenario: Monitoring:Panel
    Given To Check Monitoring User is navigating to CGI URL is "http://192.168.1.36/CGI/auth"
    When To Check Monitoring User Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@55"
    And click the Signin button To Check Monitoring
    Then Click the Monitoring button
    And Click Panel button
    Then Enter valid panel name "Sun Power (320 Watts)" in panel page
    And Click edit button in panel page
    And Click back button in edit panel page
    Then Close the Monitoring Page
