Feature: Buying a phone plan

Narrative:

In order to purchase a new phone
As a Star member,
I want to know available phone plan with prices

Scenario: Find all available phone plans
Given I am a star member
When I request for all types phone deals
Then I should get the list of available deals with prices:
|Phone name | RAM | Plan name      | Price|
|iPhone XI   | 64  | 35$ Plan      | 600  |
|Samsung Galaxy   |32  | 48$ Plan      | 200  |
|Sony   |32  | 48$ Plan      | 0  |


Scenario: Find iOS available phone plans
Given I am a star member
When I request for iOS types phone deals
Then I should get the list of available deals with prices:
|Phone name | RAM | Plan name      | Price|
|iPhone XI   | 64  | 35$ Plan      | 600  |



Scenario: Find android available phone plans
Given I am a star member
When I request for Android types phone deals
Then I should get the list of available deals with prices:
|Phone name | RAM | Plan name      | Price|
|Samsung Galaxy   |32  | 48$ Plan      | 200  |
|Sony   |32  | 48$ Plan      | 0  |

