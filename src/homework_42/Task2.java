package homework_42;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static homework_42.Transaction.TransactionType.CREDIT;
import static homework_42.Transaction.TransactionType.DEBIT;

//Дан список транзакций (Transaction) с полями amount, type (DEBIT/CREDIT), timestamp. Используя Stream API,
//вычислите общую сумму для дебетовых и кредитных транзакций отдельно, а также найдите транзакцию с максимальной суммой.
public class Task2 {
    public static void main(String[] args) {
        task2();
    }

    private static void task2() {

        List<Transaction> transactions = new ArrayList<>(List.of(
                new Transaction(100.0, CREDIT),
                new Transaction(1265.0, DEBIT),
                new Transaction(420.0, CREDIT),
                new Transaction(25.0, DEBIT),
                new Transaction(1750.0, CREDIT),
                new Transaction(785.0, DEBIT),
                new Transaction(55.0, DEBIT)
        ));

        double totalCredit = transactions.stream()
                .filter(transaction -> transaction.getType() == CREDIT)
                .mapToDouble(Transaction::getAmount)
                .sum();

//        double sumDebit = transactions
//                .stream()
//                .filter(tr -> tr.getType() == TransactionType.DEBIT)
//                .map(Transaction::getAmount)
//                .reduce(0.0, Double::sum);

        System.out.println("totalCredit: " + totalCredit);

        double totalDebit = transactions.stream()
                .filter(transaction -> transaction.getType() == DEBIT)
                .mapToDouble(Transaction::getAmount)
                .sum();

        System.out.println("totalDebit: " + totalDebit);

        Optional<Transaction> maxTransaction = transactions.stream()
                .max(Comparator.comparingDouble(Transaction::getAmount));

        maxTransaction.ifPresent(System.out::println);

//        System.out.println("Сумма DEBIT транзакций: " + sumDebit);
//        System.out.println("Сумма CREDIT транзакций: " + sumCredit);
//
//        System.out.println("Транзакция с максимальной суммой: "+  ((transactionMax.isPresent()) ? transactionMax.get() : " не найдена"));

    }


}
