package HomeWork.Teme5;
import java.util.List;

public class Hobby {
    private String hobbyName;
    private int frequency;
    private List<Adresa> address;

    public Hobby(String hobbyName, int frequency, List<Adresa> address) {
        this.hobbyName = hobbyName;
        this.frequency = frequency;
        this.address = address;
    }

    public String getHobbyName() {
        return hobbyName;
    }

    public List<Adresa> getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "hobbyName='" + hobbyName + '\'' +
                ", frequency=" + frequency +
                ", address=" + address +
                '}';
    }
}
