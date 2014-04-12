Feature: Finding products
    Scenario: Finding all products
        Given the available products "Fleece deken groen, Bierplu, 12 inc BBQ rood, Mok Groningen"
        When navigating to the "all products" page
        Then all 4 products should be displayed