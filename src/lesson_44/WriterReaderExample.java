package lesson_44;

import java.io.*;
import java.util.Arrays;

public class WriterReaderExample {
    public static void main(String[] args) {

        // create a directory / directories
        File path = new File("src/lesson_44/db");
        path.mkdirs();

        // set a file name and path
        File fileName = new File(path, "test.txt");

        try {
            // create a file on disk
            fileName.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            // create a writer sample
            FileWriter fileWriter = new FileWriter(fileName);
            // write in file
            fileWriter.write("Hello, Java");

            // close the resource
            fileWriter.close();
            System.out.println("Writing in file completed");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // reading from file
        // Buffered classes do not work directly with files
        // They are wrappers. While creating a buffer we must transfer to a constructor a class object, that can read from (write in) file

        // try with resources ->

        try (
                // resources opened in parentheses will be closed automatically after the code finishes working with them

                // create an object able to read from file
                FileReader fileReader = new FileReader(fileName);
                // create a buffer and transfer a reader to its constructor
                BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            String line;
            line = bufferedReader.readLine();
            System.out.println("Line reading completed");
            System.out.println("line: " + line);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //String[] list() - returns a list of file and directory names
        String[] names = path.list();
        System.out.println("names: " + Arrays.toString(names));

        // File[] listFiles() - returns an array of File type objects representing files and directories
        File[] files = path.listFiles();
        for (File file1 : files) {
            System.out.println("Is it a file? " + file1.isFile());
            System.out.println(file1.getName() + " | " + file1.getPath());
        }


    }
}
