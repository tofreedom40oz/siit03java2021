package Teme4.ATM;

public class ATM {


    public static void main(String[] args) {

        BankAccounts b1 = new BankAccounts();
        BankAccounts b2 = new BankAccounts(1000);

        Cards c1 = new Cards("565656", "1234", b2);
        Cards c2 = new Cards("88887777", "3333", b2);

        User u1 = new User();
        u1.addCard(c1);
        u1.addCard(c2);

        System.out.println(u1);
        u1.changePin("565656", "0000");
        System.out.println(u1);

        u1.deposit("565656", 5000);
        u1.deposit("88887777",500);
        System.out.println(u1);
        System.out.println(u1);

        u1.withDraw("565656", 1000);
        System.out.println(u1);

        System.out.println("b2 balance = "+ b2.getBalance());
        System.out.println("b2 balance = " +b2.getBalance());

    }

}





