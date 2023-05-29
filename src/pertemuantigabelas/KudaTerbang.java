package pertemuantigabelas;

public class KudaTerbang extends MakhlukHidup implements Aves, Kuda {

    @Override
    void berbicara(){
        System.out.println("Suara kuda terbang..."); ;
    };

    @Override
    public boolean terbang() {
        return sayap;
    }
    
    @Override
    public boolean berjalan() {
        return true;
    }
}
