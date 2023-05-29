package pertemuansebelas;

public class Kubus extends BangunRuang {

    public Kubus(double s){
        super(s, s, 0);
        hitung();
    }
    
    @Override
    public void hitung(){
        this.vol = this.a * this.b;
    }
}
