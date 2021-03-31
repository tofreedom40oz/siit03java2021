package HomeWork.Teme4.ATM;


import java.util.Arrays;

public class User {
    String name="John";
    private Cards [] card1 = new Cards [10];

    int j = 0;

    public void changePin(String cardNumber,String cardPin){
        for (int i = 0; i < j; i++){
            if(card1[i].getCardNumber().equals(cardNumber)){
                card1[i].changePin(cardPin);
            }
        }

    }
    public void withDraw(String cardNumber,double qty){
        for (int i = 0; i < j; i++){
            if(card1[i].getCardNumber().equals(cardNumber)){
                card1[i].withDraw(qty);
            }

            }
    }
    public void deposit(String cardNumber,double qty){
        for (int i = 0; i < j; i++) {
            if (card1[i].getCardNumber().equals(cardNumber)) {
                card1[i].dePosit(qty);
            }
        }
    }
    public double checkBalance(String cardNumber){
        for (int i = 0; i < j; i++){
            if(card1[i].getCardNumber().equals(cardNumber)){
                return card1[i].checkBalance();
            }
        }
        return 0;
    }
    public void addCard(Cards card){
        card1[j]=card;
        j++;


        }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", card1=" + Arrays.toString(card1) +
                '}';
    }
}





