@tag
Feature: F3779 - Establish Operational Audit Functionality

  @Regression
  Scenario Outline: US10491 - Admin Screen - Validating records on Grid (TC7460)
    Given an IU user have role of Admin Ops
    When User logs with "<User ID>" as CPT ICD RA into JBPM Application
    Then They should able to click on CPT ICD Link-Admin link under Adminstration tab
    And Screen will be opened in a new tab with title CPTICD Links- Admin
    When RA captures Admin screen data count by executing a Query
    Then The records count in the Admin screen grid should match with the DB count
    Then Logout Application

    Examples: 
      | User ID      |
      | iht_ittest05 |
      
 