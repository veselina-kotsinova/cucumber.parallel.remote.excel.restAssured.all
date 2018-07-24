Feature: Assert all buttons

  @test
  Scenario Outline: Successful find all buttons from Homepage
    Given browser "<browser>"
    When website loaded this address: "https://progressbg.net"
    Then I should verify all buttons
    And I should verify contact title

    Examples:
      | browser |
      | chrome  |
#      | firefox |




