package pertemuansembilan;

public class Dosen extends Pegawai {
    private final String NIDN;
    private final int tunjanganPegawai = 1500000;
    private final int tunjanganFungsional = 1700000;
    
    public Dosen(String id, String nama, int golongan, String NIDN){
        super(id, nama, golongan);
        this.NIDN = NIDN;
    }
    
    @Override
    public int getGaji() {
        return this.gajiPokok + this.tunjanganPegawai + this.tunjanganFungsional;
    }
    
}
