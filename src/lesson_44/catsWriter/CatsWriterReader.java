package lesson_44.catsWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CatsWriterReader {
    public static void main(String[] args) {
        List<Catty> cats = new ArrayList<>(List.of(
                new Catty("Cat", 9, true),
                new Catty("John", 2, true),
                new Catty("Boris", 7, true),
                new Catty("Hanna", 4, false),
                new Catty("Maria", 6, false),
                new Catty("Max", 3, true)
        ));

        File path = new File("src/lesson_44/catsWriter");
        path.mkdirs();

        File file = new File(path, "cats.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // write cat list to file
        //writeCatsToFile(cats, file);

        // read the cat list from file and collect to a new list
        List<Catty> cattyList = readCatsFromFile(file);

        cattyList.forEach(System.out::println);
    }

    private static List<Catty> readCatsFromFile(File file) {
        List<Catty> cats = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            // cycle reading lines from while while there are lines in a file
            while ((line = reader.readLine()) != null) {
                Catty cat = parseCatFromString(line);
                cats.add(cat);
            }

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return cats;
    }

    private static Catty parseCatFromString(String line) {
        // Cat|9|true
        String[] strings = line.split("\\|");
        //System.out.println(Arrays.toString(strings));

        return new Catty(strings[0], Integer.parseInt(strings[1]), Boolean.parseBoolean(strings[2]));

    }

    private static void writeCatsToFile(List<Catty> cats, File file) {

        // delete a file if it already exists to clear the contents away
        file.delete();

        for (Catty cat : cats) {

            try (
                    // permission to add new entry to a file. If a file already contains some symbols the file is not cleared out
                    FileWriter fileWriter = new FileWriter(file, true);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            ) {
                file.createNewFile();

                // Cat|9|true
                String toWrite = cat.getName() + "|" + cat.getAge() + "|" + cat.isMale();
                bufferedWriter.write(toWrite);
                bufferedWriter.newLine(); // moves cursor to a new line
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
