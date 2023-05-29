package pertemuansebelas;

public class Balok extends BangunRuang {

    public Balok(double p, double l, double t){
        super(p, l, t);
    }
    
    @Override
    public void hitung(){
        this.vol = this.a * this.b * this.c;
    }
}
