Feature: hotel reservations
  As a user
  I need to find the cheapest hotel

  Scenario Outline: book cheap hotel
    Given the user search the destination
      | location   | checkIn   | checkOut   | rooms   | adults   | children   |
      | <location> | <checkIn> | <checkOut> | <rooms> | <adults> | <children> |
    When select the cheapest hotel
    Then validate the reservation price on days <checkIn> and <checkOut>

    Examples:
      | location    | checkIn    | checkOut   | rooms | adults | children |
      | Los Angeles | 02/24/2021 | 02/25/2021 | 1     | 1      | 0        |