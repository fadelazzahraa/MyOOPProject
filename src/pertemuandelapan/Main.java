package pertemuandelapan;

public class Main {
    public static void main(String[] args) {
        BangunDatar pp = new BangunDatar();
        pp.setLebar(5);
        pp.setPanjang(10);
        System.out.println("Luas balok: " + pp.getLuas());
        SegiTiga st = new SegiTiga();
        st.setAlas(5);
        st.setTinggi(7);
        System.out.println("Luas segitiga: " + st.getLuas());
        Lingkaran l = new Lingkaran();
        l.setDiameter(10);
        System.out.println("Luas lingkaran: " + l.getLuas());
    }
}
