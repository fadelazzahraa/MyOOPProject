package uas;

public class Buku {

    private final int id;
    private final String judul;
    private String jenis = null;
    private boolean status = true; //bisa meminjam
    private int hargaSewa;

    public Buku(int id, String judul) {
        this.id = id;
        this.judul = judul;
    }

    public int getId() {
        return this.id;
    }

    ;
    
    public String getJudul() {
        return this.judul;
    }

    ;
    
    public String getJenis() {
        return this.jenis;
    }

    ;
    
    public boolean getStatus() {
        return this.status;
    }

    ;
    
        public void setStatus(boolean status) {
        this.status = status;
    }

    ;
    
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getHargaSewa() {
        return this.hargaSewa;
    }

    ;
    
    public void setHargaSewa(int hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

}
