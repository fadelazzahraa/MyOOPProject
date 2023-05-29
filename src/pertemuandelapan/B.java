package pertemuandelapan;

public class B extends A {
    protected char huruf='A';
    
    protected void cetakB(String nama){
        cetakA("Kelas B");
        System.out.println("Hallo"+nama);
        System.out.println("Ini adalah methid dari kelas B \n");
    }
    private void cetakBP(){
        System.out.println("Method provate kelas B"); 
   }
    public void cetakKelas(){
        System.out.println("Kelas B");
    }
}