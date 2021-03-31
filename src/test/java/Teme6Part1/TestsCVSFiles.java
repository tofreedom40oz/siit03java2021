package Teme6Part1;
import HomeWork.Teme6.Teme6Part1.CSVReader;
import org.junit.*;
import org.junit.Test;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import static org.junit.Assert.assertEquals;
public class TestsCVSFiles {

    private CSVReader athletReader;

    @Before
    public void setup() {
        athletReader = new CSVReader();
    }

    @Test
    public void readerToString() {
        File file = null;
        try {
            file = File.createTempFile("Athlets", ".csv");
            file.deleteOnExit();
            BufferedWriter out = new BufferedWriter(new FileWriter(file));
            out.write("27,Usain Bolt,JM,18,02,OOOXO,XOOOX,OOOOO \n 27,Popescu Bogdan,JM,18,02,XOXOO,XOXOO,XOXOO \n 27,Popa Adrian,JM,18,02,XOOOO,XXXOO,OOXOO");
            out.close();
        } catch (IOException e) {

        }
        athletReader.reader(file.getAbsolutePath());
        athletReader.calculateTheTime();

        assertEquals("", athletReader.list(),
                "[Athlete{tshirtNumber='27', Name='Usain Bolt', country='JM', minutes=20, seconds=2}, " +
                        "Athlete{tshirtNumber=' 27', Name='Popescu Bogdan', country='JM', minutes=19, seconds=32}, " +
                        "Athlete{tshirtNumber=' 27', Name='Popa Adrian', country='JM', minutes=19, seconds=42}]");
    }

    @Test
    public void calculation() {
        File file2 = null;
        try {
            file2 = File.createTempFile("Athlets", ".csv");
            file2.deleteOnExit();
            BufferedWriter out = new BufferedWriter(new FileWriter(file2));
            out.write("27,Usain Bolt,JM,18,02,OOOXO,XOOOX,OOOOO \n 27,Popescu Bogdan,JM,18,02,XOXOO,XOXOO,XOXOO \n 27,Popa Adrian,JM,18,02,XOOOO,XXXOO,OOXOO");
            out.close();
        } catch (IOException e) {

        }
        athletReader.reader(file2.getAbsolutePath());
        athletReader.calculateTheTime();
        athletReader.sortListByTime();


        assertEquals("", athletReader.list(),
                "[Athlete{tshirtNumber=' 27', Name='Popescu Bogdan', country='JM', minutes=19, seconds=32}, Athlete{tshirtNumber=' 27', Name='Popa Adrian', country='JM', minutes=19, seconds=42}, Athlete{tshirtNumber='27', Name='Usain Bolt', country='JM', minutes=20, seconds=2}]");
    }

}
