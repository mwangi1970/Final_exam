Feature: testing techfios.com/test/101 site for background color changes

  Scenario: changing background color to sky blue
    Given 'Set SkyBlue Background' button exists
    When I click on the Sky Blue background button
    Then the background color will change to sky blue

  Scenario: changing background color to white
    Given 'Set White Background' button exists
    When I click on the White background button
    Then the background color will change to white