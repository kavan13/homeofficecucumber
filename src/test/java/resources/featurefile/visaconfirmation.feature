Feature: Visa checks


  Background:
    Given I am on the Check UK visa website
    And I start visa check
@Smoke @Sanity @Regression
  Scenario: An Australian coming to the UK for Tourism.
    When I select a nationality of 'Australia'
    And  I click on continue button
    And I select reason 'Tourism'
    And  I click on continue button
    Then I will be informed 'You will not need a visa to come to the UK'
@Sanity @Regression
  Scenario: A Chilean coming to the UK for Work and plans on staying for longer than 6 months.
    When I select a nationality of 'Chile'
    And  I click on continue button
    And I select reason 'Work'
    And I click on continue button
    And I state I am intending to stay for 'more' than 6 months
    And I click on continue button
    And I state I have planning to work 'health' types of job
    And I click on continue button
    Then I will be informed 'You need a visa to work in health and care'
@Regression
  Scenario: A Columbian national coming to the UK to join a partner for a long stay. They do have an Article 10 or 20 card.
    When I select a nationality of 'Colombia'
    And  I click on continue button
    And I select reason 'family'
    And I click on continue button
    And I state My partner or family member have uk immigration status 'yes'
    And I click on continue button
    Then I will be informed 'You’ll need a visa to join your family or partner in the UK'



