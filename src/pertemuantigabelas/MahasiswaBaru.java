package pertemuantigabelas;

public class MahasiswaBaru extends Mahasiswa{
    @Override
    protected void isiBiodata(String nama, int nilai){
        this.nama = nama;
        this.nilai = nilai;
        System.out.println("nama " + nama + ", nilai " + nilai);
        this.registrasi();
        this.testMasuk();
    };
    
    public static void main(String args[]){
        MahasiswaBaru mhsnew = new MahasiswaBaru();
        mhsnew.isiBiodata("Andi", 50);
    }
}
