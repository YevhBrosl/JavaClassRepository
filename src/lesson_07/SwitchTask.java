package lesson_07;

import java.util.Random;

public class SwitchTask {
    public static void main(String[] args) {
        Random random = new Random();
        int note = random.nextInt(5) + 1;
        System.out.println("Оценка: " + note);
        int money = 100;

        switch (note) {
            case 5:
                money += 20;
                //System.out.println("У ребенка сейчас " + (100 + 20) + " денег");
                break;
            case 4:
                money += 10;
                //System.out.println("У ребенка сейчас " + (100 + 10) + " денег");
                break;
            case 3:
                //System.out.println("У ребенка сейчас " + (100 + 0) + " денег");
                break;
            case 2:
                money -= 20;
                //System.out.println("У ребенка сейчас " + (100 - 20) + " денег");
                break;
            case 1:
                money = 0;
                break;
                //System.out.println("У ребенка сейчас " + (100 - 100) + " денег");
            default:
                System.out.println("Таких оценок не бывает");

            }
        System.out.println("У ребенка сейчас " + money + " денег");

        }
    }

