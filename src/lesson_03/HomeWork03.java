package lesson_03;

import java.util.Random;

public class HomeWork03 {
    public static void main(String[] args) {

        String Name = "Yevheniia";
        int age = 44;
        double milkPrice = 1.09;
        System.out.println("Ваше имя - " + Name);
        System.out.println("Возраст - " + age);
        System.out.println("Цена 1л молока - " + milkPrice);

        int var1 = 0;
        int var2 = 1;
        int var3 = 2;
        int var4 = 3;
        int var5 = 4;
        int var6 = 5;
        int var7 = 6;
        int var8 = 7;
        int var9 = 8;
        int var10 = 9;
        int result = (var1 + var2 + var3 + var4 + var5 + var6 + var7 + var8 + var9 + var10) / 10;
        System.out.println("Среднее арифметическое = " + result);
        int remResult = (var1 + var2 + var3 + var4 + var5 + var6 + var7 + var8 + var9 + var10) % 10;
        System.out.println("Остаток от деления = " + remResult);

        double priceA = 1000;
        double priceB = 500;
        int discountPercent = 10;
        double discount = (priceA + priceB) * discountPercent / 100;
        System.out.println("Сумма скидки = " + discount);
        double discountCost = priceA + priceB - discount;
        System.out.println("Стоимость товараA + товараB со скидкой = " + discountCost);

        int dayTemp08 = -4;
        int dayTemp09 = -3;
        int dayTemp10 = -1;
        int dayTemp11 = 0;
        int dayTemp12 = 1;
        int dayTemp13 = 3;
        int dayTemp14 = 4;
        double AvDayTemp = (dayTemp08 + dayTemp09 + dayTemp10 + dayTemp11 + dayTemp12 + dayTemp13 + dayTemp14) / (double) 7;
        int nightTemp08 = -10;
        int nightTemp09 = -9;
        int nightTemp10 = -8;
        int nightTemp11 = -2;
        int nightTemp12 = 0;
        int nightTemp13 = 1;
        int nightTemp14 = 0;
        double AvNightTemp = (nightTemp08 + nightTemp09 + nightTemp10 + nightTemp11 + nightTemp12 + nightTemp13 + nightTemp14) / (double) 7;
        double AvTemp = (AvDayTemp + AvNightTemp) / 2;
        System.out.println("Средняя температура в Берлине с 08.01.2024 по 14.01.2024 составила " + AvTemp + " градуса");


        int a = 3;
        int b = 2;
        int c;
        c = a % b;
        System.out.println("остаток1 = " + c);
        int a1 = 5;
        c = a1 % b;
        System.out.println("остаток2 = " + c);
        int a2 = 73;
        c = a2 % b;
        System.out.println("остаток3 = " + c);

        // остаток деления на 2 всегда равен 1

        int k;
        k = 4;
        int l = 3;
        int m;
        m = k % l;
        System.out.println("остаток1 = " + m);
        k = 5;
        m = k % l;
        System.out.println("остаток2 = " + m);
        k = 187;
        m = k % l;
        System.out.println("остаток3 = " + m);

        // остаток деления на 3 равен 1 или 2

        Random random = new Random();
        int rand = random.nextInt(10);
        System.out.println("rand: " + rand);
        System.out.println(rand % 3);



    }
}
