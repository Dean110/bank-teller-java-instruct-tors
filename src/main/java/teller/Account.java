package teller;

public class Account {

    private String accountNumber;
    private String accountType;
    private double accountBalance;

    public Account(String accountNumber, String accountType, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void deposit(double amountToDeposit) {
        accountBalance += amountToDeposit;
    }

    public void withdraw(double amountToWithdraw) {
        accountBalance -= amountToWithdraw;
    }

    public String checkAccountBalance() {
        if(accountBalance>0){
            return "" + accountBalance;
        }
        return "Insufficient Funds";
    }
}
