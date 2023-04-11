package BankAccount;

public class MainBankAcc {

    public static void main(String[] args) {


//        System.out.println("Calling main bank account");

        BankAccount acc1 = new BankAccount("123456", 100.00, "Ram", "Ram@apple.com", "123-435-3455");
        acc1.AddFunds(0.00);

        acc1.WithDrawFunds(500.00);
    }
}
