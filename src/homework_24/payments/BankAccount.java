package homework_24.payments;

import java.util.Scanner;

public class BankAccount implements PaymentSystem {

    private final String IBAN;

    private String password;

    private double currentBalance;

    public BankAccount(String IBAN, String password, double currentBalance) {
        this.IBAN = IBAN;
        this.password = password;
        this.currentBalance = currentBalance;
    }

    public String getIBAN() {
        return IBAN;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }


    @Override
    public void transferMoney() {
        Scanner scanner = new Scanner(System.in);
        boolean isPasswordValid = false;
        while (!isPasswordValid) {
            System.out.println("Enter your password: ");
            String password = scanner.nextLine();
            if (password.equals(this.password)) {
                isPasswordValid = true;
                boolean isIBANValid = false;
                System.out.println("Enter recipient's IBAN: ");
                while (!isIBANValid) {
                    String IBAN = scanner.nextLine();
                    if (IBAN.equals(this.IBAN)) {
                        isIBANValid = true;
                        System.out.println("What amount would you like to transfer? ");
                        int sum = scanner.nextInt();
                        if (sum < checkBalance()) {
                            System.out.println("The amount of " + sum + " has been transferred.");
                            currentBalance -= sum;
                        } else {
                            System.out.println("Insufficient balance. Transfer cannot be completed.");
                        }
                    } else {
                        System.out.println("IBAN not found");
                        break;
                    }
                }
            } else {
                System.out.println("Invalid password. PLease try again.");
            }
        }

    }

    @Override
    public void withdrawMoney() {
        Scanner scanner = new Scanner(System.in);
        boolean isPasswordValid = false;
        while (!isPasswordValid) {
            System.out.println("Enter your password: ");
            String password = scanner.nextLine();
            if (password.equals(this.password)) {
                isPasswordValid = true;
                System.out.println("What amount would you like to withdraw? ");
                int sum = scanner.nextInt();
                if (sum < checkBalance()) {
                    System.out.println("The amount of " + sum + " has been successfully withdrawn.");
                    currentBalance -= sum;
                } else {
                    System.out.println("Insufficient balance. Withdrawal cannot be completed.");
                }
            } else {
                System.out.println("Invalid password. PLease try again.");
            }
        }
    }


    @Override
    public double checkBalance() {
        return getCurrentBalance();
    }
}
