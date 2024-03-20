package homework_44;
//Дан файл с историей поступлений денег на счета пользователей за некий период времени:
//
//Данные в виде: <имяПользователя>:<суммаПоступления>.
//
//Ваше задание прочитать данные из файла и обработать их.
//
//Результат обработки должен быть записан в два файла:
//
//less.txt список тех, кому в сумме перечисленно меньше 2000
//more.txt список тех, кому в сумме перечисленно 2000 и больше
//
//Output:
//
//less.txt
// user2:1950
//user3:1800
//
//more.txt:
// user1:5050
//user4:2100

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Map<String, List<Integer>> map = new HashMap<>();
        String sourceFile = "src/homework_44/credit.txt";
        File targetFile1 = new File("src/homework_44/less.txt");
        File targetFile2 = new File("src/homework_44/more.txt");

//        try {
//            targetFile1.createNewFile();
//            targetFile2.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try (
                BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(targetFile1, true));
                BufferedWriter writer1 = new BufferedWriter(new FileWriter(targetFile2, true));

        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userCredits = line.split(":");
                String key = userCredits[0];
                int value = Integer.parseInt(userCredits[1]);
                if (map.containsKey(key)) {
                    map.get(key).add(value);
                } else {
                    List<Integer> credits = new ArrayList<>();
                    credits.add(value);
                    map.put(key, credits);
                }
            }
            for (String key : map.keySet()) {
                int totalCredits = 0;
                for (int credit : map.get(key)) {
                    totalCredits += credit;
                }
                if (totalCredits > 2000) {
                    writer1.write(key + ":" + totalCredits);
                    writer1.newLine();
                } else {
                    writer.write(key + ":" + totalCredits);
                    writer.newLine();
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try (
//                BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
//                BufferedWriter writer = new BufferedWriter(new FileWriter(targetFile1, true));
//                BufferedWriter writer1 = new BufferedWriter(new FileWriter(targetFile2, true));
//        ) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                String[] userCredits = line.split(":");
//                map.computeIfAbsent(userCredits[0], k -> new ArrayList<>()).add(Integer.parseInt(userCredits[1]));
//            }
//            for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
//                int totalCredits = entry.getValue()
//                        .stream()
//                        .mapToInt(Integer::intValue)
//                        .sum();
//                BufferedWriter currentWriter = totalCredits > 2000 ? writer1 : writer;
//                currentWriter.write(entry.getKey() + ":" + totalCredits);
//                currentWriter.newLine();
//            }
//
//        }  catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}
