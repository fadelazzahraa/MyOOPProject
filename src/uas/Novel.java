package uas;

public class Novel extends Buku {

    public Novel(int id, String judul) {
        super(id, judul);
        super.setJenis("Novel");
        super.setHargaSewa(5000);
    }

}
