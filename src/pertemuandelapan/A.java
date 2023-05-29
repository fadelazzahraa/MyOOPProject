package pertemuandelapan;

public class A {
    protected int nilai = 10;
    
    protected void cetakA(String nama){
        System.out.println("Haloo"+nama);
        System.out.println("Ini adalah method dari kelas A \n");
    }
    
    private void cetakAP(){
        System.out.println("Method private kelas A");
    }
    public void cetakKelas(){
        System.out.println("Kelas A");
    }
}
