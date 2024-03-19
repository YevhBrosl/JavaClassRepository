package lesson_44;

import java.io.File;
import java.io.IOException;

public class IoExample {
    public static void main(String[] args) {
        File pathDir = new File("testDir");

        //Operations with files and directories

        // boolean mkdir() - create a directory. Can only create a directory within an existing directory
//        System.out.println(pathDir.mkdir());
//
//        //File multiPath = new File("/dir1/db/myDir");// the path contains non-existing directories -> mkdir() failed to create a new directory
//        File multiPath = new File("dir1/db/myDir");
//        System.out.println(multiPath.mkdir());
//
//        // boolean mkdirs() - creates a new directory, including all parent directories
//        System.out.println(multiPath.mkdirs());
//
////        File multiPath1 = new File("/dir1/db");
////        System.out.println("delete(): " + multiPath1.delete());
//
//        // delete() - deletes a file or directory
//        System.out.println(multiPath.delete());
//
//        // void deleteOnExit() - a file or directory will be deleted after JVM finishes operation
//
//        File dirToDelete = new File("deleteMe");
//        System.out.println(dirToDelete.mkdir());
//
//        System.out.println("Мафия засыпает");
//        Thread.sleep(5000);
//        System.out.println("Мафия просыпается");
//
//        dirToDelete.deleteOnExit();

        File path = new File("src/lesson_44/db");

        path.mkdirs(); // create parent directories in the path

        File file = new File(path, "text.txt");

        // createNewFile() - creates a new file if a file with this name doesn't exist yet

        // create a file using the path

        try {
            // the file will be created if all parent directories in the path exist (method cannot create parent directories)
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // checking file / directory properties
        // isFile() - returns true is the object is a file
        // isDirectory() - returns true is the object is a directory

        System.out.println("path.isFile(): " + path.isFile());
        System.out.println("path.isDirectory(): " + path.isDirectory());
        System.out.println("file.isFile(): " + file.isFile());

        // isHidden() - checks if a file / directory is hidden
        System.out.println("path.isHidden(): "+ path.isHidden());

        // length
        // lastModified
        // getPath
        // getName

        System.out.println(file.length());
        System.out.println(file.lastModified());
        System.out.println(file.getPath());
        System.out.println(file.getName());

    }
}
