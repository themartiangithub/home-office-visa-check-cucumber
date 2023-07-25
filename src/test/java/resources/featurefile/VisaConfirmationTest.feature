@Regression
Feature: Visa Confirmation Test

  As a user I want to check visa status check functionality of Uk Home office website.

  @Smoke
  Scenario: An Australian Coming to UK For Tourism.
    Given I am on visa status page
    When I Click on start button
    And I Select a Nationality "Australia"
    And I Click on Continue button select nationality page
    And I Select reason "Tourism"
    And I Click on Continue button select reason page
    Then I verify result "You will not need a visa to come to the UK"

  @Sanity
  Scenario: A Chilean Coming to the UK For Work And Plans On Staying For Longer Than Six Months.
    Given I am on visa status page
    When I Click on start button
    And I Select a Nationality "Chile"
    And I Click on Continue button select nationality page
    And I Select reason "Work"
    And I Click on Continue button select reason page
    And I Select intendent to stay for "more"
    And I Click on Continue button intendent
    And I Select have planning to work for "Health and care professional"
    And I Click on Continue button planning to work
    Then I verify result "You need a visa to work in health and care"

  @Sanity
  Scenario: A Columbian National Coming to the UK to Join a Partner for a Long Stay They do have an Article10Or20Card.
    Given I am on visa status page
    When I Click on start button
    And I Select a Nationality "Colombia"
    And I Click on Continue button select nationality page
    And I Select reason "Join partner"
    And I Click on Continue button select reason page
    And I Select state My partner of family member have uk immigration status "yes"
    And I Click on Continue button my partner
    Then I verify result "You may need a visa"
