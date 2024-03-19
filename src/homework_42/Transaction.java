package homework_42;

import java.time.LocalDateTime;

public class Transaction {

    public enum TransactionType {
        DEBIT,
        CREDIT
    }

    private double amount;
    private TransactionType type;
    private LocalDateTime timestamp;

    public Transaction(double amount, TransactionType type) {
        this.amount = amount;
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public TransactionType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", type=" + type +
                '}';
    }
}
