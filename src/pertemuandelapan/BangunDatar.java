package pertemuandelapan;

class BangunDatar {
    // dibuat protected agar bisa diturunkan ke class anak
    protected double panjang, lebar;
    // getter dan setter panjang
    public double getPanjang() {
        return panjang;
    }
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    // getter dan setter lebar
    public double getLebar() {
        return lebar;
    }
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    // method getLuas
    public double getLuas() {
        return panjang * lebar;
    }
}