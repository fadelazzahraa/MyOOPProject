package uas;

public class ProsesPenyewaan {

    public int sewaBuku(Pelanggan pelanggan, Buku buku) {
        if (buku.getStatus()) {
            if (pelanggan.getIdBuku() == 0) {
                pelanggan.setIdBuku(buku.getId());
                buku.setStatus(false);
                return buku.getHargaSewa();
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    public boolean kembalikanBuku(Pelanggan pelanggan, Buku buku) {
        if (pelanggan.getIdBuku() != 0) {
            pelanggan.setIdBuku(0);
            buku.setStatus(true);
            return true;
        } else {
            return false;
        }
    }
}
