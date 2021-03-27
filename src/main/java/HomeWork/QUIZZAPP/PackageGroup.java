package HomeWork.QUIZZAPP;

public class PackageGroup {
        private String location;
        private String date;
        private int groupValue;
        private int groupRevenue;
        private int distance;

        public PackageGroup(String location, String date, int distance) {
            this.location = location;
            this.date = date;
            this.groupRevenue = 0;
            this.groupValue = 0;
            this.distance = distance;
        }

        public int getDistance() {
            return distance;
        }

        public String getLocation() {
            return location;
        }

        public String getDate() {
            return date;
        }

        public int getGroupValue() {
            return groupValue;
        }

        public int getGroupRevenue() {
            return groupRevenue;
        }

        public void addValue(int value) {
            this.groupValue = this.groupValue + value;
        }

        public void addRevenue(int revenue) {
            this.groupRevenue = this.groupRevenue + revenue;
        }

        @Override
        public String toString() {
            return "PackageGroup{" +
                    "location='" + location + '\'' +
                    ", date='" + date + '\'' +
                    ", groupValue=" + groupValue +
                    ", groupRevenue=" + groupRevenue +
                    '}';
        }
    }

