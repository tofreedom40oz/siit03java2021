package HomeWork.QUIZZAPP;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

    public class PackageManagement {
        private List<Package> packages = new ArrayList<Package>();
        private List<PackageGroup> groups = new ArrayList<PackageGroup>();

        public PackageManagement(String packagesFile) {
            BufferedReader reader;
            try {
                reader = new BufferedReader(new FileReader(packagesFile));

                String line = reader.readLine();
                while (line != null) {
                    Package p = new Package(line);
                    packages.add(p);
                    line = reader.readLine();
                }

                reader.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            this.createGroups();
        }

        private void createGroups() {
            for (Package p : packages) {
                String date = p.getDate();
                String location = p.getLocation();
                boolean groupExists = false;

                for (PackageGroup g : groups) {
                    if (g.getLocation().equals(location) && g.getDate().equals(date)) {
                        g.addValue(p.getValue());
                        g.addRevenue(p.getDistance());
                        groupExists = true;
                        break;
                    }
                }

                if (groupExists == false) {
                    PackageGroup g = new PackageGroup(location, date, p.getDistance());
                    g.addValue(p.getValue());
                    g.addRevenue(p.getDistance());
                    groups.add(g);
                }
            }

        }

        public void deliverPackages() {
            List<Thread> ts = new ArrayList<Thread>();
            for (PackageGroup g : groups) {
                Runnable r = new DeliveryThread(g);
                Thread t = new Thread(r);
                t.start();
                ts.add(t);
            }

            for (Thread t : ts) {
                try {
                    t.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            int totalValue = 0;
            int totalRevenue = 0;
            for (Package p : packages) {
                totalValue = totalValue + p.getValue();
                totalRevenue = totalRevenue + p.getDistance();
            }

            System.out.println("--------------------------------------------------");
            System.out.println("Total value of all delivered packages: " + totalValue);
            System.out.println("Total value of the revenue computed for all groups delivered " + totalRevenue);
        }
    }

