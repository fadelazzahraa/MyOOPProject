package uas;

public class Komik extends Buku {

    public Komik(int id, String judul) {
        super(id, judul);
        super.setJenis("Komik");
        super.setHargaSewa(4000);

    }

}
