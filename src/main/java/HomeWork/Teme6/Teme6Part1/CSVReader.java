package HomeWork.Teme6.Teme6Part1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CSVReader {
    List<Athlete> athletes = new ArrayList<>();


    public void reader(String csvFile) {
        String line = " ";
        String split = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {
                String[] athletess = line.split(split);

                Athlete athlete = new Athlete();
                athlete.setTshirtNumber(athletess[0]);
                athlete.setName(athletess[1]);
                athlete.setCountry(athletess[2]);
                athlete.setMinutes(Integer.parseInt(athletess[3]));
                athlete.setSeconds(Integer.parseInt(athletess[4]));
                athlete.setFirstShooting(athletess[5]);
                athlete.setSecondShooting(athletess[6]);
                athlete.setThirdShooting(athletess[7]);
                athletes.add(athlete);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static int hit(String s) {
        int hit = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'O')
                hit++;
        }
        return hit;
    }

    public String list() {
        List<Athlete> k = new ArrayList<>();
        for (Athlete athletes : athletes) {
            System.out.println(athletes.toString());
            k.add(athletes);
        }
        return k.toString();
    }


    public void calculateTheTime() {
        for (Athlete athlete : athletes) {
            athlete.setSeconds(athlete.getSeconds() +
                    (hit(athlete.getFirstShooting()) +
                            hit(athlete.getSecondShooting()) +
                            hit(athlete.getThirdShooting())) * 10);

            if (athlete.getSeconds() >= 60) {
                while (athlete.getSeconds() >= 60) {
                    athlete.setSeconds(athlete.getSeconds() - 60);
                    athlete.setMinutes(athlete.getMinutes() + 1);
                }
            }

        }
    }

    public static class timeComparator implements Comparator<Athlete> {

        @Override
        public int compare(Athlete o1, Athlete o2) {
            if (o1.getMinutes() == o2.getMinutes() && o1.getSeconds() == o2.getSeconds()) {
                return 0;
            }
            if (o1.getMinutes() == o2.getMinutes() && o1.getSeconds() > o2.getSeconds() || o1.getMinutes() > o2.getMinutes()) {
                return 1;
            } else
                return -1;
        }
    }


    public void sortListByTime() {
        System.out.println("Sorted list based on time");
        Collections.sort(athletes, new timeComparator());
        for (Athlete athletes : athletes) {
            System.out.println(athletes.toString());
        }
    }




}
