package teller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void shouldBeAbleToCreateAccount(){
        Account underTest = new Account("434241", "Checking", 20.13);
    }

    @Test
    public void shouldBeAbleToDeposit(){
        //arrange
        Account underTest = new Account("434241", "Checking", 20.13);
        //action
        underTest.deposit(5.67);
        //assertion
        double accountBalance = underTest.getAccountBalance();
        assertEquals(25.80, accountBalance, 0.0001);
    }

    @Test
    public void shouldBeAbleToWithdraw(){
        //arrange
        Account underTest = new Account("434241", "Checking", 20.13);
        //action
        underTest.withdraw(21.13);
        //assertion
        double accountBalance = underTest.getAccountBalance();
        assertEquals(-1.0, accountBalance, 0.0001);
    }
    @Test
    public void shouldBeAbleToCheckAccountBalance(){
        //arrange
        Account underTest = new Account("434241", "Checking", 20.13);
        //action
        String availableFunds = underTest.checkAccountBalance();
        //assertion
        assertEquals("20.13", availableFunds);
    }
    @Test
    public void shouldReturnMessageInsufficientFundsIfAccountBalanceIsNegative(){
        //arrange
        Account underTest = new Account("434241", "Checking", 20.13);
        underTest.withdraw(50.00);
        //action
        String availableFunds = underTest.checkAccountBalance();
        //assertion
        assertEquals("Insufficient Funds", availableFunds);
    }
}
