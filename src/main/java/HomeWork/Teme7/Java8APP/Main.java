package HomeWork.Teme7.Java8APP;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader();
        fileReader.readFileAndOutput("src/main/resources/Students.TXT", 03, "NewStudentsFile");
    }
}
