package pertemuansebelas;

public class BangunRuang {

    double a, b, c, vol = 0;

    public BangunRuang(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public void hitung() {
        this.vol = 0;
    }

    public double getVol() {
        return this.vol;
    }
}
