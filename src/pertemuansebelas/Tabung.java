package pertemuansebelas;

public class Tabung extends BangunRuang {

    public Tabung(double r, double t){
        super(r, t, 3.14);
    }
    
    @Override
    public void hitung(){
        this.vol = this.a * this.a * this.c * this.b;
    }
}
