Feature: Amazon E2E Test Feature

# Navigate to amazon webpage (https://www.amazon.co.uk/)
# If there are cookies - accept
# Login with your own credentials
# Create a shopping list
# Select a category from the tab next to the search bar
# Verify the category is selected
# Search for a product e.g., "hp"
# Verify that the results message contains the searched text (hp)
# Click first product from the search result list
# Add the product to the shopping list you created
# Delete list
# Logout
  @wip
  Scenario: Amazon E2E Test Scenario
    Given the user is on the login page
    And the user logs in successfully
    And the user creates a list named as "My Shopping List"


