package pertemuantigabelas;

public abstract class Mahasiswa {
    protected String nama;
    protected int nilai;
    
    protected abstract void isiBiodata(String nama, int nilai);
    
    protected void registrasi(){
        System.out.println("nama " + this.nama + " telah melakukan registrasi");
    }
    
    protected void testMasuk(){
        System.out.println("nilai test anda " + this.nilai);
    }
}
