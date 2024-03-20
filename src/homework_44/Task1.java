package homework_44;
//Дан файл text.txt:
//
//Ваша задача используя классы пакета java.io создать файл с именем 'copy.txt'
//и скопировать в него все данные из файла 'text.txt'

import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        String sourceFile = "src/homework_44/text.txt";
        File targetFile = new File("src/homework_44/copy.txt");

//        try {
//            targetFile.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try (
                BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(targetFile, true));
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
