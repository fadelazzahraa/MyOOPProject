package pertemuanduabelas;

public class OperasiBilangan {
    protected double a,b;
    
    protected void set_A(double a){
        this.a = a;
    }
    
    protected void set_B(double b){
        this.b = b;
    }
    
    protected double get_A(){
        return this.a;
    }
    
    protected double get_B(){
        return this.b;
    }
    
    protected void tampil(){
        System.out.println("A: " + this.a + "B: " + this.b);
    }
}
