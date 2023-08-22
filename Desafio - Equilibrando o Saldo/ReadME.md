Sure! Here is the translation you requested in markdown format:

# Description
For this challenge, consider that you were hired by a banking company to assist in the implementations and improvements of the corporate system. In an initial analysis, the financial team identified the need to develop a solution that allows the client to balance their bank balance. Thus, the program should request an input that represents the employee's current balance, and then be informed of the value of two transactions, being: a deposit and a withdrawal. The program should update the balance based on the transactions and display the final balance.

**Information**: Deposit and withdrawal transactions must be treated as positive and negative values, respectively, to ensure that the final balance calculation is performed correctly.

## Input
- `currentBalance`: a decimal number representing the current balance of the bank account.
- `depositValue`: a decimal number representing the value to be deposited into the account.
- `withdrawalValue`: a decimal number representing the value to be withdrawn from the account.

**Formatting Rule**: Consider only one decimal place for this challenge.

## Output
A decimal number representing the updated balance in the bank account after processing transactions.

## Examples
The table below presents examples with some input data and their respective expected outputs. Make sure to test your program with these examples and other possible cases.

| Input | Output |
|-------|--------|
| 1000<br>500<br>200 | Updated account balance: 1300.0 |
| 100<br>10<br>50 | Updated account balance: 60.0 |
| 4000<br>1500<br>200 | Updated account balance: 5300.0 |