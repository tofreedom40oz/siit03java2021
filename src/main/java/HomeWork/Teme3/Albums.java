package HomeWork.Teme3;

import java.util.Scanner;

    public class Albums extends Book {

        private String calitateaHartiei;

        public Albums(int nrPagini, String nume, String calitateaHartiei) {
            super(nrPagini, nume);
            this.calitateaHartiei = calitateaHartiei;
        }

        public String getCalitateaHartiei() {
            return calitateaHartiei;
        }

        public void setCalitateaHartiei(String calitateaHartiei) {
            this.calitateaHartiei = calitateaHartiei;
        }

        @Override
        public String toString() {
            return "un : ArtAlbum cu " + getNrPagini() + ", cu titlul '" +
                    getNume() + "' si calitatea hartiei este '" + calitateaHartiei + "'";
        }
    }

