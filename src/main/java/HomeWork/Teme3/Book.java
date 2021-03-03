package Teme3;


public class Book {

        private int nrPagini;
        private String nume;

        public Book(int nrPagini, String nume) {
            this.nrPagini = nrPagini;
            this.nume = nume;
        }

        public int getNrPagini() {
            return nrPagini;
        }

        public String getNume() {
            return nume;
        }

        @Override
        public String toString() {
            return " o: Carte cu "
                    + nrPagini + " de pagini, cu titlul '" +
                    nume + '\'';

        }

    }



