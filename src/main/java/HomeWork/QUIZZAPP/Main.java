package HomeWork.QUIZZAPP;

    public class Main {
        public static void main(String[] args) {
            PackageManagement pkgManagement = new PackageManagement("src\\addr\\addr.txt");
            pkgManagement.deliverPackages();
        }
    }

