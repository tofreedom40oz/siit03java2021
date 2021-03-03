package Teme3;

import java.util.ArrayList;
import java.util.List;


public class LibraryCatalogue {
    public static void main(String[] args) {


        Book nuvela1 = new Novels(120, "Alexandru Lapusneanu", "Istorica");
        Book nuvela2 = new Novels(210, "Intalnire cu Hebe", "SF");
        Book nuvela3 = new Novels(165, "Sarmanul Dionis", "Fantastica");

        Book artAlbum1 = new Albums(34, "Art Africa", "Excelenta");
        Book artAlbum2 = new Albums(83, "Art deco", "Buna");
        Book artAlbum3 = new Albums(27, "Art Gaudi", "Medie");

        List<Book> listaCarti = new ArrayList<>();

        //*** putem obiecte in lista folosind .add();***


        listaCarti.add(nuvela1);
        listaCarti.add(nuvela2);
        listaCarti.add(nuvela3);
        listaCarti.add(artAlbum1);
        listaCarti.add(artAlbum2);
        listaCarti.add(artAlbum3);

        //*** putem sterge obiecte din lista folosind .remove();***

        listaCarti.remove(nuvela2);

        //*** folosim .size() pentru a afla cate obiecte se afla in lista***

        System.out.println("Lista contine : " + listaCarti.size() + " obiecte");

        //*** folsim indexul pentru a parcurge lista***

        for (int i = 0; i < listaCarti.size(); i++) {
            System.out.println("Aceasta este " + listaCarti.get(i).toString());
        }
    }
}