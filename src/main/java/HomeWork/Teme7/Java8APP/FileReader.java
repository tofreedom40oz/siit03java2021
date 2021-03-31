package HomeWork.Teme7.Java8APP;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReader<T extends String> {
    public void readFileAndOutput(String input, int month, String output) throws IOException {
        String directory = "src/main/resources/Students.TXT";
        String monthString;
        if (month >= 10) {
            monthString = "." + Integer.toString(month);
        } else {
            monthString = ".0" + Integer.toString(month);
        }
        if ((month > 12) || (month < 0)) {
            System.out.println("Invalid month");
        }

        Stream<String> split = Files.lines(Paths.get(input))
                .map(line -> line.split("/"))
                .flatMap(Arrays::stream);

        List<String> sortAndCollect = split.filter(line -> line.contains(monthString))
                .sorted()
                .collect(Collectors.toList());


        Map<String, String> map = new TreeMap<>();

        for (String s : sortAndCollect) {
            String pattern = "\\b([^\\s]+) ([^\\s]+)\\b";

            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(s);

            while (m.find()) {
                map.put(m.group(1), m.group(2));
            }
        }
        StringBuilder s = new StringBuilder();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            s.append(entry.getKey() + "\n");
        }

        Files.write(Paths.get(directory + output + ".TXT"), Collections.singleton(s.toString()));
        System.out.println(s);
    }
}
