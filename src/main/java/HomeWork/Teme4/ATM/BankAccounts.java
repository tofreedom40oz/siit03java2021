package Teme4.ATM;

public class BankAccounts {
    String iBan = "8888888888";
    private double balance;


    public BankAccounts() {
        balance = 0;
    }

    public BankAccounts(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
    // public double checkBalance(){return balance; }

    @Override
    public String toString() {
        return "BankAccounts{" +
                "balance=" + balance +
                '}';
    }
}

//class TestDeposit {
//        private BankAccounts ba;
//
//        @Before
//        public before() {
//            this.ba = new BankAccounts(1000);
//        }
//
//        @Test
//        public metoda_test() {
//            this.ba.deposit(2000);
//            this.ba.getBalance() == 3000
//        }
//    }