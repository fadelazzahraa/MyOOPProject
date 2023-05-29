package pertemuansatu;

public class Main {

    public static void main(String[] args) {
        DataMahasiswa mahasiswaA = new DataMahasiswa();
        mahasiswaA.isi_data("Fadel Azzahra", 
                            "Rekayasa Perangkat Lunak Kripto", 
                            "Bogor, Jawa Barat, Indonesia", 
                            "Renang, Bermain Kartu");
        mahasiswaA.tampilkan_data();
    }
    
}

