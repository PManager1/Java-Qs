package BankAccount;

public class MainBankAcc {

    public static void main(String[] args) {


//        System.out.println("Calling main bank account");

        BankAccount acc1 = new BankAccount("123456", 12000.00, "Ram", "Ram@apple.com", "123-435-3455");
        acc1.AddFunds(1000.00);

        acc1.WithDrawFunds(500.00);
    }
}
