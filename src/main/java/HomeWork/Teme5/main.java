package HomeWork.Teme5;
import com.sun.source.util.Trees;

import java.util.*;

public class main {
    public static void main(String[] args) {
        ComparatorPersoaneNume comp = new ComparatorPersoaneNume();
        TreeSet<Persoane> pers = new TreeSet<Persoane>(comp);
        Persoane p1 = new Persoane("Geecs", 55);
        Persoane p2 = new Persoane("Elo", 32);
        Persoane p3 = new Persoane("Relu", 12);
        pers.add(p1);
        pers.add(p2);
        pers.add(p3);

        for (Persoane per : pers) {
            System.out.print(per + " | ");
        }
        System.out.println();

        CompparatorPersoaneAge com = new CompparatorPersoaneAge();
        TreeSet<Persoane> peers = new TreeSet<Persoane>(com);
        peers.add(p1);
        peers.add(p2);
        peers.add(p3);

        for (Persoane value : peers)
            System.out.print(value + ", ");
        System.out.println();

        Adresa a1= new Adresa("Slovenia","Bucale","Novak",23);
        Adresa a2= new Adresa("BG","Florenza","Cosice",11);
        Adresa a3= new Adresa("GB","London","Picadilly",18);
        ArrayList<Adresa> adrss = new ArrayList<>();
        adrss.add(a1);
//        adrss.add(a2);
//        adrss.add(a3);

        Hobby hob = new Hobby("Tenis",2,adrss);
        Hobby hob1 = new Hobby ("fotbal",1,adrss);
        List<Hobby> hoblist = new ArrayList<>();
        hoblist.add(hob1);
        hoblist.add(hob);

        HashMap<Persoane,List<Hobby>> mapp = new HashMap<>();
        mapp.put(p1,hoblist);
        mapp.put(p2,hoblist);

        List<Hobby> h2 = mapp.get(p2);
        System.out.println(h2);
    }

}

