# Validation des logigicels 2 - exercice 11

### Exercice 11 : Cucumber for BankAccount

Mes tests passent :

```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.imt.mines.bank.bdd.RunBankAccountCucumberTest

Scenario: A new account has zero balance # src/test/resources/features/bank_account_basic.feature:2
  Given I have a new bank account        # com.imt.mines.bank.bdd.BankAccountBasicSteps.i_have_a_new_bank_account()
  When I check its balance               # com.imt.mines.bank.bdd.BankAccountBasicSteps.i_check_its_balance()
  Then the balance should be 0           # com.imt.mines.bank.bdd.BankAccountBasicSteps.the_balance_should_be(java.lang.Integer)
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.373 sec
Running com.imt.mines.BankAccountTest
Error reading file
Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.008 sec

Results :

Tests run: 7, Failures: 0, Errors: 0, Skipped: 0
```