package HomeWork.Teme6.Teme6Part1;

public class Athlete {
    private String tshirtNumber;
    private String Name;
    private String country;
    private int minutes;
    private int seconds;

    private String firstShooting;
    private String secondShooting;
    private String thirdShooting;


    public void setTshirtNumber(String tshirtNumber) {
        this.tshirtNumber = tshirtNumber;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public String getFirstShooting() {
        return firstShooting;
    }

    public void setFirstShooting(String firstShooting) {
        this.firstShooting = firstShooting;
    }

    public String getSecondShooting() {
        return secondShooting;
    }

    public void setSecondShooting(String secondShooting) {
        this.secondShooting = secondShooting;
    }

    public String getThirdShooting() {
        return thirdShooting;
    }

    public void setThirdShooting(String thirdShooting) {
        this.thirdShooting = thirdShooting;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "tshirtNumber='" + tshirtNumber + '\'' +
                ", Name='" + Name + '\'' +
                ", country='" + country + '\'' +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }
}
