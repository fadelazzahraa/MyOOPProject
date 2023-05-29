package pertemuanduabelas;

public class OperasiPerkalian {
    protected double a,b,c;
    
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
        this.c = this.a * this.b;
        System.out.println("A * B: " + this.c);
    }
}
