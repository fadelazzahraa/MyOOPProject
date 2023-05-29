package pertemuansebelas;

public class B extends A {
    private int d;
    
    public B(int a, int b){
        super(a, b);
        this.d = this.a + this.b + this.c;
    };
    
    public int getD(){
        return this.d;
    }
}
