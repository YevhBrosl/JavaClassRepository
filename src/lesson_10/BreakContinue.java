package lesson_10;

public class BreakContinue {
    public static void main(String[] args) {

        //continue, break
        // continue при вызове завершает текущую итерацию цикла и переходит к следующей

        // перебирать числа от 1 до 10
        for (int i = 1; i < 11; i++) {
            System.out.println("before if: " + i);

            if (i == 4) continue; // переход в блок изменений переменной (счетчика)


            System.out.println("after if: " + i);

            if (i == 8) break; // после вызова полностью завершается выполнение всего цикла,
            // переход в строку 22 (здесь!!!) - за пределы цикла

            System.out.println("after break: " + i);
        } // тело цикла

        System.out.println("после цикла");

        // напечатать все четные числа от 1 до 20

        for (int i = 1; i <= 20; i++) {

            if (i % 2 != 0) continue;
            System.out.println(i);
            // Большой блок
        }

    }
}
