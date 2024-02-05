package homework_07;

//Task 3 Распечатать 10 строк: “Task1”. “Task2”. … “Task10”. Используем цикл while

public class Task3 {
    public static void main(String[] args) {

        int counter = 1;
        while (counter <= 10) {
            System.out.println("Task" + counter);
            counter ++; // i увеличивается на 1
        }
        System.out.println("Конец цикла while");
    }
}
