package pertemuantiga;

public class LatihanProsedur {
    public static void main(String[] args){
        
        Manusia hari = new Manusia();
        hari.nama = "Hari Aspriyono";
        hari.jenisKelamin = "Laki-laki";
        hari.alamat = "Bengkulu";
        
        Manusia tini = new Manusia();
        tini.nama = "Tini Sumarni";
        tini.jenisKelamin = "Perempuan";
        tini.alamat = "Bengkulu Tengah";
        
        hari.tampilInformasi();
        tini.tampilInformasi();
    }
}
