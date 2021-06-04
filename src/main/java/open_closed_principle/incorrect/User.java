package open_closed_principle.incorrect;

import single_responsibility_principle.correct.Account;

public class User {
    public Account account;
    public AccountType accountType;

    public User(Account account, AccountType accountType) {
        this.account = account;
        this.accountType = generateAccountType(account);
    }

    private AccountType generateAccountType(Account account) {
        switch (accountType) {
            case BASIC: {
                generateBasicAccount();
                break;
            }
            case PREMIUM: {
                generatePremiumAccount();
                break;
            }
        }
        return accountType;
    }

    private void generateBasicAccount() {
        //basic account code goes here
    }

    private void generatePremiumAccount() {
        //premium account code goes here
    }
}