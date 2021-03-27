package HomeWork.Teme5;

import java.util.Comparator;

public class ComparatorPersoaneNume implements Comparator<Persoane> {

    @Override
    /*
    Returneaza 0 daca cele 2 nume sunt egale
    Returneaza -1 daca sunt diferite si numele p1 < numele p2
    Returneaza 1 daca sunt diferite si numele p1 > numele p2
     */
    public int compare(Persoane p1, Persoane p2) {
        String name = p1.getName();
        String name1= p2.getName();
        return name.compareTo(name1);
    }
}
