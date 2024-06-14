Feature: learn more Automation

  @alerts
  Scenario:Alert message validation in confirmation box
    Given user click on confirmation box button
    Then user validate the alert message
    And user validate the UI message

    @waits
    Scenario: Change in Text Validation
      Given user clicks on the change text button
      Then user validate the change text value

