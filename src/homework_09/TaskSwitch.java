package homework_09;

//Программа, имитирующая систему управления освещением в доме.
//
//У светильника в каждой комнате есть 4 возможных режима работы: выключен - тусклый - средний - яркий
//У пользователя есть пульт управление светом.
//Ев пульте несколько кнопок управления для изменения освещения в доме.
//Пользователь выбирает номер кнопки (в вашей программе вы получаете число от пользователя).
//Каждая кнопка изменяет интенсивность освещения в разных комнатах.
//Режим 1 устанавливает: Гостиная и кухня - яркое свет, спальня - тусклый.
//2: Гостиная - тусклый, кухня и спальня - яркий.
//3: Везде средний свет.
//4: Выключить свет в кухне
//5: Увеличить интенсивность света на 1 гостиная и кухня
//6: Уменьшить интенсивность света на 2 в спальне
//После выбора пользователем режима - вывести в консоль текущее состояние освещения в доме
//P.S. Учесть, что, например, если текущее состояние было "средний",
//то при его увеличении на + 2 состоянии останется максимально ярким.
//Т.е. "яркий" Аналогично с уменьшением интенсивности.

import java.util.Random;
import java.util.Scanner;

public class TaskSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите режим освещения от 1 до 6: ");
            int lightMode = scanner.nextInt();

            if (lightMode == 0 || lightMode > 6) {
                System.out.println("Ошибка. Режим не распознан.");
                break;
            }

            int dimmerSittingroom = 0;
            int dimmerKitchen = 0;
            int dimmerBedroom = 0;


            switch (lightMode) {
                case 1:
                    dimmerSittingroom = 3;
                    dimmerKitchen = 3;
                    dimmerBedroom = 1;
                    break;
                case 2:
                    dimmerSittingroom = 1;
                    dimmerKitchen = 3;
                    dimmerBedroom = 3;
                    break;
                case 3:
                    dimmerSittingroom = 2;
                    dimmerKitchen = 2;
                    dimmerBedroom = 2;
                    break;
                case 4:
                    dimmerKitchen = 0;
                    break;
                case 5:
                    dimmerSittingroom = dimmerSittingroom + 1;
                    dimmerKitchen = dimmerKitchen + 1;
                    break;
                case 6:
                    dimmerBedroom = dimmerBedroom - 2;
                    break;
            }

            if (dimmerSittingroom > 3 || dimmerKitchen > 3 || dimmerBedroom > 3) {
                dimmerSittingroom = 3;
                dimmerKitchen = 3;
                dimmerBedroom = 3;
            } else if (dimmerSittingroom < 0 || dimmerKitchen < 0 || dimmerBedroom < 0) {
                dimmerSittingroom = 0;
                dimmerKitchen = 0;
                dimmerBedroom = 0;
            }

            System.out.println("Режим освещения: " + lightMode);

            if (dimmerSittingroom == 0) {
                System.out.println("Свет в гостиной выключен");
            } else if (dimmerSittingroom == 1) {
                System.out.println("Свет в гостиной тусклый");
            } else if (dimmerSittingroom == 2) {
                System.out.println("Свет в гостиной средний");
            } else if (dimmerSittingroom == 3) {
                System.out.println("Свет в гостиной яркий");
            }

            if (dimmerKitchen == 0) {
                System.out.println("Свет в кухне выключен");
            } else if (dimmerKitchen == 1) {
                System.out.println("Свет в кухне тусклый");
            } else if (dimmerKitchen == 2) {
                System.out.println("Свет в кухне средний");
            } else if (dimmerKitchen == 3) {
                System.out.println("Свет в кухне яркий");
            }

            if (dimmerBedroom == 0) {
                System.out.println("Свет в спальне выключен");
            } else if (dimmerBedroom == 1) {
                System.out.println("Свет в спальне тусклый");
            } else if (dimmerBedroom == 2) {
                System.out.println("Свет в спальне средний");
            } else if (dimmerBedroom == 3) {
                System.out.println("Свет в спальне яркий");
            }
        }

    }
}
