package HomeWork.Teme5;

public class Adresa {
    private String country;
    private String cityName;
    private String streetName;
    private int streetNumber;

    public Adresa(String country, String cityName, String streetName, int streetNumber) {
        this.country = country;
        this.cityName = cityName;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
    }

    @Override
    public String toString() {
        return "Adresa{" +
                "country='" + country + '\'' +
                ", cityName='" + cityName + '\'' +
                ", streetName='" + streetName + '\'' +
                ", streetNumber=" + streetNumber +
                '}';
    }
}
