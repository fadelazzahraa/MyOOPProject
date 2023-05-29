package pertemuanduabelas;

public class LatihanVirtualMethodInvocation {
    public static void main(String[] args){
        A a = new B();
        System.out.println(a.x);
        a.fungsiA();
    }
}
