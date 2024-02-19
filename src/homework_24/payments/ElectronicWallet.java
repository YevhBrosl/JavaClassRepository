package homework_24.payments;

import java.util.Scanner;

public class ElectronicWallet implements PaymentSystem {

    private String eMail;
    private String password;
    private double currentBalance;

    public ElectronicWallet(String eMail, String password, double currentBalance) {
        this.eMail = eMail;
        this.password = password;
        this.currentBalance = currentBalance;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void transferMoney() {
        Scanner scanner = new Scanner(System.in);
        boolean isEmailValid = false;
        while (!isEmailValid) {
            System.out.println("Enter your e-mail: ");
            String eMail = scanner.nextLine();
            if (eMail.equals(this.eMail)) {
                isEmailValid = true;
                boolean isPasswordValid = false;
                System.out.println("Enter your password: ");
                while (!isPasswordValid) {
                    String password = scanner.nextLine();
                    if (password.equals(this.password)) {
                        isPasswordValid = true;
                        System.out.println("What amount would you like to transfer? ");
                        int sum = scanner.nextInt();
                        if (sum < checkBalance()) {
                            System.out.println("The amount of " + sum + " has been transferred from your e-wallet.");
                            currentBalance -= sum;
                        } else {
                            System.out.println("Insufficient funds. Transfer cannot be completed.");
                        }
                    } else {
                        System.out.println("Invalid e-mail. PLease try again.");
                    }
                }
            } else {
                System.out.println("Invalid password. PLease try again.");
            }
        }

    }

    @Override
    public void withdrawMoney() {
        System.out.println("Invalid operation. Withdrawal from e-wallet cannot be completed.");
    }


    @Override
    public double checkBalance() {
        return getCurrentBalance();
    }
}
