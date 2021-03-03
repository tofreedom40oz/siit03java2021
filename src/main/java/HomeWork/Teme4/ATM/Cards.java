package Teme4.ATM;

public class Cards {
    String cardNumber ;
    String expirationDate = "18/25";
    String cardPin;
    private BankAccounts bankAcc;
    //int k;

    public String getCardNumber() {
        return cardNumber;
    }

    public void changePin(String cardPin){
        this.cardPin=cardPin;
    }

    public void withDraw(double amount){
        bankAcc.withdraw(amount);
    }
    public void dePosit(double amount){
        bankAcc.deposit(amount);
    }
    public double checkBalance(){
        return bankAcc.getBalance();
    }

    public Cards(String cardNumber, String cardPin,BankAccounts bnkacc1) {
        this.cardNumber = cardNumber;
        this.cardPin = cardPin;
        this.bankAcc = bnkacc1;
    }

    @Override
    public String toString() {
        return "Cards{" +
                "cardNumber='" + cardNumber + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                ", cardPin='" + cardPin + '\'' +
                ", bankAcc=" + bankAcc +
                '}';
    }
}

