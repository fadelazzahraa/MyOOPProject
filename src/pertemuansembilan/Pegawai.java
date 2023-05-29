package pertemuansembilan;

public class Pegawai {
    private final String id;
    private final String nama;
    private final int golongan;
    protected int gajiPokok;
    
    public Pegawai (String id, String nama, int golongan){
        this.id = id;
        this.nama = nama;
        this.golongan = golongan;
        if (this.golongan==1){
            this.gajiPokok = 3500000;
        } else if (this.golongan==2) {
            this.gajiPokok = 5000000;
        }
    };
    
    public int getGaji() {
        return this.gajiPokok;
    }
    
    public String getDetail(){
        return (this.id + ", " + this.nama  + ", " + this.golongan);
    }
     
}
