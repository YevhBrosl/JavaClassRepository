package lesson_44;

import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        File path = new File("src/lesson_44/task1");
        path.mkdirs();

        for (int i = 1; i < 11; i++) {
            File fileName = new File(path, "test_" + i + ".txt");
            try (FileWriter writer = new FileWriter(fileName)){
                fileName.createNewFile();
                writer.write("Java" + i);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        File[] files = path.listFiles();
        for (File file : files) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                String line = bufferedReader.readLine();

                if (line != null && line.contains("Java7")) {
                    System.out.println("File is found: " + file.getName());
                }

            }catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
