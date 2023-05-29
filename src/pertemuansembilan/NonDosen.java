package pertemuansembilan;

public class NonDosen extends Pegawai{
    private final int tunjanganPegawai = 3000000;
    
    public NonDosen(String id, String nama, int golongan){
        super(id, nama, golongan);
    }
    
    @Override
    public int getGaji() {
        return this.gajiPokok + this.tunjanganPegawai;
    }   
}
