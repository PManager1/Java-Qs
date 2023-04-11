package BankAccount;

public class BankAccount {
    private String accountNumber;
    private Double accountBalance;
    private String customerName;
    private String Email;
    private String PhoneNumber;

    public BankAccount() {
    }

    public BankAccount(String accountNumber, Double accountBalance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        Email = email;
        PhoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getaccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    //    Metjod to deposit funds in the account.
    public void AddFunds(Double Amount) {
        accountBalance += Amount;
        System.out.println("The Balance =" + accountBalance);

    }

    //    Method to Withdraw funds in the account.
    public void WithDrawFunds(Double Amount) {
        if (accountBalance - Amount < 0) {
            System.out.println("Negative Balance Asshole");
        } else {
            accountBalance -= Amount;
            System.out.println("The Balance =" + accountBalance);
        }
    }
}