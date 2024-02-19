package homework_24.payments;

public class Banking {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("DE12345678", "qwerty", 1000);
        account.transferMoney();
        System.out.println("Your current balance is: " + account.checkBalance());
        account.withdrawMoney();
        System.out.println("Your current balance is: " + account.checkBalance());

        System.out.println("=======================================");

        ElectronicWallet paypal = new ElectronicWallet("111@gmail.com", "12345", 1000);
        paypal.transferMoney();
        System.out.println("Your current balance is: " + paypal.checkBalance());
        paypal.withdrawMoney();
        System.out.println("Your current balance is: " + paypal.checkBalance());

    }
}
