package utskelompoksatu;

public class TiketFilm {
    private final String genre;
    private final int harga;
    private int stok;
    private int jumlahDibeli;
    
    public TiketFilm(String genre, int harga, int stok){
        this.genre = genre;
        this.harga = harga;
        this.stok = stok;
        this.jumlahDibeli = 0;
    }
      
    public String getGenre(){
        return this.genre;
    }
    
    public int getJumlahDibeli(){
        return this.jumlahDibeli;
    }
    
    public int getHargaTotal(){
        return this.harga * this.jumlahDibeli;
    }
    
    public boolean beliTiket(int jumlahDibeli){
        if ((this.stok - jumlahDibeli) < 0){
            return false;
        } else {
            this.stok -= jumlahDibeli;
            this.jumlahDibeli += jumlahDibeli;
            return true;
        }
    }
    
}
