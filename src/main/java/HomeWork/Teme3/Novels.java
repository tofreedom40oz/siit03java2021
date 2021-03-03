package Teme3;

import java.util.Scanner;

    public class Novels extends Book {

        private String type;

        public Novels(int nrPagini, String nume, String type) {
            super(nrPagini, nume);
            this.type = type;

        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "o : Nuvela " + this.type + " cu "
                    + getNrPagini() + " de pagini, cu titlul '" +
                    getNume() + '\'';

        }
    }


