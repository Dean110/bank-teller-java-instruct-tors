package teller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Bank {

    private Map<String, Account> accounts = new HashMap<>();

    public void openNewAccount(Account accountToAdd) {
        accounts.put(accountToAdd.getAccountNumber(),accountToAdd);
    }

    public Map<String, Account> getAccounts() {
        return accounts;
    }

    public Collection<Account> retrieveAllAccounts() {
        return accounts.values();
    }
}
