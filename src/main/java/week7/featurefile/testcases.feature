Feature: LeafTaps

Scenario: CreateLead



Given click on Leads
And click on CreateLead
And Enter the CompanyName
And Enter the FirstName
And Enter the LastName
And Enter the phoneNumber
And Enter the mail Id
When click CreateLeadButton
Then verify the FirstName



