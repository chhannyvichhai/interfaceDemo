package interfacedemo;

public class Main {
    public static void main(String[] args) {

        BankingService creditAccount = new BankingService(new CreditCardAccount());
        creditAccount.deposit(10000);
        System.out.println("Credit Balance: "+creditAccount.showBalance()+"$");

        BankingService savingAccount = new BankingService(new SavingAccount());
        savingAccount.deposit(500);
        System.out.println("Saving Balance: "+savingAccount.showBalance()+"$");


    }
}
