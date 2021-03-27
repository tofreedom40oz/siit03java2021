package HomeWork.Teme5;

import java.util.Comparator;

public class CompparatorPersoaneAge implements Comparator<Persoane> {

    @Override
    /*
    intoarce 0, daca varsa p1 = varsta p2
    intoarce 1, daca varsta p1 > varsta p2
    intoarce -1, daca varsta p1 < varsta p2
     */
    public int compare(Persoane p1, Persoane p2) {
        int age = p1.getAge();
        int age2 = p2.getAge();
        if (age == age2) {
            return 0;
        } else if (age > age2) {
            return 1;
        }
        return -1;
    }
}