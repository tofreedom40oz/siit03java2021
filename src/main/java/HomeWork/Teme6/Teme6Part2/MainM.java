package HomeWork.Teme6.Teme6Part2;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainM {
    private static String path = "./src/main/resources/abc.TXT";
    private static String pathDesk = "./src/main/resources";
    private static String pathPlain = "./src/main/resources/TOXIC.TXT";
    private static String pathLines = "./src/main/resources/lines.TXT";

    public static void main(String[] args) throws IOException {

        // 1. Implement a method to get a list of all file/directory names from the given.
        getFiles(pathDesk);

        // 2. Implement a method to get specific files by extensions from a specified folder.
        getExtension(pathDesk);

        //3. Implement a method to check if a file or directory specified by pathname exists or not.
        ifExists(path);

        //  4. Implement a method to check if a file or directory has read and write permission.
        pathIsWriteable(path);
        pathIsReadable(path);

        // 5. Implement a method to check if given pathname is a directory or a file.
        ifItIsAFileOrDirectory(pathDesk);

        // 6. Implement a method to get last modified time of a file.
        lastModified(path);

        //7. Implement a method to get file size in bytes, kb, mb.
        checkSize(path);

        //8.Implement a method to read a file line by line and store it into a variable.
        readByLine(path);

        //9. Implement a method to store text file content line by line into an array.
        storeTextFile(path);

        //10.Implement a method to write and read a plain text file.
        readAndWrite(pathPlain);

        //11.Implement a method to append text to an existing file.
        appendToAFile(pathPlain);

        //12. Implement a method to read first 3 lines from a file.
        readFirstThreeLines(pathLines);

        //13.Implement a method to find the longest word in a text file.
        longestWord(pathLines);

        //14.Implement a method to find a specific word in a text file, will return true if exists, false otherwise.
        findWord(pathLines);
    }


    public static boolean pathIsWriteable(String path) {
        File fPath = new File(path);
        if (fPath.canWrite()) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }

    public static boolean pathIsReadable(String path) {
        File fPath = new File(path);
        if (fPath.canRead()) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }

    public static void getFiles(String pathDesk) {
        String[] pathnames;

        File f = new File(pathDesk);
        pathnames = f.list();
        assert pathnames != null;
        for (String pathname : pathnames) {
            System.out.println(pathname);

        }

    }

    public static void getExtension(String pathDesk) {
        File f = new File(pathDesk);
        File[] files = f.listFiles((d, name) -> name.endsWith(".TXT"));
        assert files != null;
        for (File pathname : files) {
            System.out.println(pathname);

        }
    }

    public static void ifExists(String path) {
        File fPath = new File(path);
        if (fPath.exists()) {
            System.out.println("The directory or file exists.\n");
        } else {
            System.out.println("The directory or file does not exist.\n");
        }
    }

    public static void ifItIsAFileOrDirectory(String path) {
        File fPath = new File(path);
        if (fPath.isDirectory()) {
            System.out.println(fPath.getAbsolutePath() + " is a directory.\n");
        } else {
            System.out.println(fPath.getAbsolutePath() + " is not a directory.\n");
        }
        if (fPath.isFile()) {
            System.out.println(fPath.getAbsolutePath() + " is a file.\n");
        } else {
            System.out.println(fPath.getAbsolutePath() + " is not a file.\n");
        }
    }

    public static void lastModified(String path) {
        File fPath = new File(path);
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        System.out.println(" Last modified time : " + sdf.format(fPath.lastModified()));

    }

    public static void checkSize(String path) {

        File fPath = new File(path);

        long fileSize = fPath.length();

        System.out.println("File size in bytes is : " + fileSize);
        System.out.println("File size in KB is : " + (double) fileSize / 1024);
        System.out.println("File size in MB is : " + (double) fileSize / (1024 * 1024));
    }

    public static void readByLine(String path) {
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        String str_data = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while (strLine != null) {
                if (strLine == null)
                    break;
                str_data += strLine;
                strLine = br.readLine();

            }
            System.out.println(str_data);
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }

    public static void storeTextFile(String path) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String str = null;
        ArrayList<String> lines = new ArrayList<>();
        assert in != null;
        while (true) {
            try {
                if ((str = in.readLine()) == null) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            lines.add(str);
        }
        String[] linesArray = lines.toArray(new String[0]);
        System.out.println(Arrays.toString(linesArray));
    }


    public static void readAndWrite(String path) {
        try {
            FileReader reader = new FileReader(path);
            int character;

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileWriter writer = new FileWriter(path, true);
            writer.write("Java Code cool");
            writer.write("\r\n");
            writer.write("ByeBye JAVA CODE");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void appendToAFile(String path) {
        String s = System.getProperty("text.file") + path;
        String text = "Newly Added TEXT";

        try {
            FileWriter fw = new FileWriter(path, true);
            fw.write(text);
            fw.close();
        } catch (IOException ignored) {
        }
    }

    public static void readFirstThreeLines(String path) {
        int n = 0;
        int n2 = 1;
        int n3 = 2;
        try {
            String line = Files.readAllLines(Paths.get(path)).get(n);
            System.out.println(line);
            String line2 = Files.readAllLines(Paths.get(path)).get(n2);
            System.out.println(line2);
            String line3 = Files.readAllLines(Paths.get(path)).get(n3);
            System.out.println(line3);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static String longestWord(String path) throws FileNotFoundException {
        String longestWord = "";
        String current;
        Scanner sc = new Scanner(new File(path));


        while (sc.hasNext()) {
            current = sc.next();
            if (current.length() > longestWord.length()) {
                longestWord = current;
            }

        }
        System.out.println("\n" + longestWord + "\n");
        return longestWord;
    }

    public static void findWord(String path) throws IOException {

        File f1 = new File(path);
        String[] words = null;
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);
        String s;
        String input = "orochimaru";
        int count = 0;
        while ((s = br.readLine()) != null)
        {
            words = s.split(" ");
            for (String word : words) {
                if (word.equals(input))
                {
                    count++;
                }
            }
        }
        if (count != 0)
        {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        fr.close();


    }

}



