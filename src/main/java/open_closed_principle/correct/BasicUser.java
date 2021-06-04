package open_closed_principle.correct;

import single_responsibility_principle.correct.Account;

public class BasicUser implements User{
    public Account account;
    public AccountType accountType = new BasicAccount();
}
