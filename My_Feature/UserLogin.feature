Feature: Logged in TestMeApp using multiple user

  Scenario Outline: Login with multiple user
    Given Application launched by user
    Then Click on login link
    Then enter username "<username>"
    Then enter password "<password>"
    Then click on login button
    Then verify  the user

    Examples: 
      | username | password    |
      | Lalitha  | Password123 |
      | Rick     | Rick123     |
      | Andrew   | Andrew123   |
