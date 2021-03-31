package HomeWork.Teme6.Teme6Part1;

    public class Main {

        public static void main(String[] args) {
            CSVReader csvReader = new CSVReader();
            csvReader.reader("D:\\projects\\national-java03\\siit03java2021\\src\\main\\java\\HomeWork\\Teme6\\Teme6Part1\\Competitors.csv");
            csvReader.list();
            csvReader.calculateTheTime();
            csvReader.sortListByTime();

            System.out.println("The Winner is: " + csvReader.athletes.get(0) + "\nThe Runner-up is: " +
                    csvReader.athletes.get(1) + "\nThird Place is: " +
                    csvReader.athletes.get(2));
        }

    }

