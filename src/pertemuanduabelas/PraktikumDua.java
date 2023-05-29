package pertemuanduabelas;

public class PraktikumDua {
    public static void main(String[] args){
        OperasiPenjumlahan calcplus = new OperasiPenjumlahan();
        OperasiPengurangan calcminus = new OperasiPengurangan();
        OperasiPerkalian calctimes = new OperasiPerkalian();
        OperasiPembagian calcdiv = new OperasiPembagian();
        
        calcplus.set_A(6);
        calcplus.set_B(3);
        calcplus.tampil();
        
        calcminus.set_A(6);
        calcminus.set_B(3);
        calcminus.tampil();
        
        calctimes.set_A(6);
        calctimes.set_B(3);
        calctimes.tampil();
        
        calcdiv.set_A(6);
        calcdiv.set_B(3);
        calcdiv.tampil();
    }
}
