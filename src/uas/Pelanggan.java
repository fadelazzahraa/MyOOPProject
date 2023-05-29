package uas;

public class Pelanggan extends Manusia {
    int id;
    int idBuku = 0;

    public Pelanggan(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    @Override
    public String getNama() {
        return this.nama;
    }

    public void setIdBuku(int id) {
        this.idBuku = id;
    }

    public int getIdBuku() {
        return this.idBuku;
    }

}
