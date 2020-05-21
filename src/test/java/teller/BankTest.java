package teller;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankTest {

    @Test
    public void shouldBeAbleToCreateABank() {
        Bank underTest = new Bank();
    }

    @Test
    public void shouldBeAbleToAddAnAccount() {
        //Arrangement
        Bank underTest = new Bank();
        Account testAccount = new Account("001", "Savings", 20.00);

        //Action
        underTest.openNewAccount(testAccount);

        //Assertion
        Map<String, Account> accounts = underTest.getAccounts();
        assertTrue(accounts.containsValue(testAccount));
    }

    @Test
    public void shouldBeAbleToRetrieveAllAccounts() {
        //Arrangement
        Bank underTest = new Bank();
        Account testAccount = new Account("001", "Savings", 20.00);
        underTest.openNewAccount(testAccount);

        //Action
        Collection<Account> retrievedAccounts = underTest.retrieveAllAccounts();

        //Assertion
        assertTrue(retrievedAccounts.contains(testAccount));
    }
}
