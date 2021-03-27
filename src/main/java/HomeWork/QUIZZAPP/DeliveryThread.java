package HomeWork.QUIZZAPP;

    public class DeliveryThread implements Runnable {
        private PackageGroup group;

        public DeliveryThread(PackageGroup group) {
            this.group = group;
        }

        public void run() {
            System.out.println("[Delivering for <" +
                    group.getLocation() + "> and date <" +
                    group.getDate() + "> in <" +
                    group.getDistance() + "> seconds]");
        }
    }

