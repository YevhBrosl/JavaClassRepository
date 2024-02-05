package homework_07;

//Task 2 Реализовать с использованием switch
//Ваш ребенок принес оценку за контрольную работу по математике.
//В школе 12 бальная система. Запишите в переменную случайное число
//от 0 до 12. Вы разрешаете ребенку смотреть телевизор не более 60 минут
//в день. (Оставшееся время не может быть больше 1 часа)
//На сегодня у него осталось 45 минут. (записать в переменную)
//
//Если оценка от 10 до 12 баллов -> Скажите ему,
//как вы рады и добавьте к оставшемуся на сегодня времени 1 час
//от 7 до 9 -> Слова похвалы на экран + ко времени 45 минут от 4
//до 6 -> Нейтральные слова + ко времени 15 минут 3 -> Огорчитесь.
//        Минус 30 минут ко времени оценка меньше -> Трагедия.
//Сегодня ТВ смотреть запрещено
//
//Выведите на экран оставшееся на сегодня время для просмотра ТВ
//
//P.S. Реализовать с использованием switch

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        int tvTime = 45;
        int count = 0;
        while (count < 2) {
        int note = random.nextInt(12) + 1;
        System.out.println("Оценка: " + note);

            switch (note) {
                case 12:
                case 11:
                case 10:
                    System.out.println("Я очень рада!");
                    tvTime += 60;
                    break;
                case 9:
                case 8:
                case 7:
                    System.out.println("Хорошо, молодец.");
                    tvTime += 45;
                    break;
                case 6:
                case 5:
                case 4:
                    System.out.println("Ну что ж, неплохо.");
                    tvTime += 15;
                    break;
                case 3:
                    System.out.println("Жаль.");
                    tvTime -= 30;
                    break;
                case 2:
                case 1:
                    System.out.println("Очень плохо. Сегодня тебе запрещено смотреть телевизор.");
                    tvTime = 0;
                    break;
                default:
                    System.out.println("Таких оценок не бывает");

            }

            if (tvTime > 60) {
                tvTime = 60;
            } else if (tvTime < 0) {
                tvTime = 0;
            }
            System.out.println("Оставшееся время:" + tvTime);
            count++;
        }
    }
}

