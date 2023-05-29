package pertemuantigabelas;

public class Elang extends MakhlukHidup implements Aves {

    @Override
    void berbicara(){
        System.out.println("Suara elang..."); ;
    };

    @Override
    public boolean terbang() {
        return sayap;
    }
    
}
