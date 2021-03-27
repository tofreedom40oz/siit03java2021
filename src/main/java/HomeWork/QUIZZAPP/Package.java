package HomeWork.QUIZZAPP;

    public class Package {

        String location;
        int distance;
        int value;
        String date;

        public Package(String csv) {
            String[] componente = csv.split(",");
            this.location = componente[0];
            this.distance = Integer.parseInt(componente[1]);
            this.value = Integer.parseInt(componente[2]);
            this.date = componente[3];
        }

        public Package(String location, int distance, int value, String date) {
            this.location = location;
            this.distance = distance;
            this.value = value;
            this.date = date;
        }

        public String getLocation() {
            return location;
        }

        public int getDistance() {
            return distance;
        }

        public int getValue() {
            return value;
        }

        public String getDate() {
            return date;
        }

        @Override
        public String toString() {
            return "Package{" +
                    "location='" + location + '\'' +
                    ", distance=" + distance +
                    ", value=" + value +
                    ", date=" + date +
                    '}';
        }
    }

