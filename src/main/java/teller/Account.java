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

    public void deposit(double amountToDeposit) {
        accountBalance += amountToDeposit;
    }

    public void withdrawal(double amountToWithdrawl) {
        accountBalance -= amountToWithdrawl;
    }

    public String checkAccountBalance(){
        if(accountBalance>0){
            return accountBalance +"";
        }
        return "Insufficient Funds";
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
}
