package HomeWork.Teme5;

public class Persoane implements Comparable<Persoane> {

    private String name;
    private int age;
    public Persoane(String name,int age){
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Persoane  p2) {
        return this.name.compareTo(p2.getName());
    }

    @Override
    public String toString() {
        return "Persoane{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

//main
//Persoane p1 = new Persoane("ghita", 55);
//Persoane p2 = new Persoane("andrei", 21);
//Persoane p3 = new Persoane("andrei", 21);
//p1.compareTo(p2);
//p2.compateTo(p3);
//
//ComparatorPersoaneNume comp = new ComparatorPersoaneNume();
//comp.compare(p1, p2);

