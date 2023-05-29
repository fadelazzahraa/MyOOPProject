package pertemuandelapan;

class Lingkaran extends BangunDatar {
    public double getDiameter() {
        return panjang;
    }
    public void setDiameter(double diameter) {
        super.setPanjang(diameter);
    }
    @Override
    public double getLuas() {
        // rumusnya PI * (r*r) -> r = jari2
        return Math.PI * Math.pow(getDiameter()/2, 2);
    }
}
