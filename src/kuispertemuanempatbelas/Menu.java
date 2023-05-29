package kuispertemuanempatbelas;

public class Menu {

    private String nama;
    private int harga;

    public Menu(String namaMenu, int hargaMenu) {
        this.nama = namaMenu;
        this.harga = hargaMenu;
    }

    public String getNama() {
        return this.nama;
    }

    public int getHarga() {
        return this.harga;
    }
}
