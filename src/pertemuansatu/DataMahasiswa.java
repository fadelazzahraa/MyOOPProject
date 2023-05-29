package pertemuansatu;

public class DataMahasiswa {
    private String nama;
    private String prodi;
    private String alamat;
    private String hobi;
    
    public void isi_data(String nama, String prodi, String alamat, String hobi){
        this.nama = nama;
        this.prodi = prodi;
        this.alamat = alamat;
        this.hobi = hobi;
    }
    
    public void tampilkan_data(){
        System.out.println("Nama    : " + this.nama);
        System.out.println("Prodi   : " + this.prodi);
        System.out.println("Alamat  : " + this.alamat);
        System.out.println("Hobi    : " + this.hobi);
    };
}
