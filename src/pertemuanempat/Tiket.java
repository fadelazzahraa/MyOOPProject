package pertemuanempat;

public class Tiket {
    private String tujuan;
    private int harga;
    
    public Tiket(String inputTujuan, int inputHarga){
        this.tujuan = inputTujuan;
        this.harga = inputHarga;
    }
    
    public void setTujuan(String inputTujuan){
        this.tujuan = inputTujuan;
    }
    
    public String getTujuan(){
        return this.tujuan;
    }
    
    public void setHarga(int inputHarga){
        this.harga = inputHarga;
    }
    
    public int getHarga(){
        return this.harga;
    }
}
