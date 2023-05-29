package kuispertemuanempatbelas;

public class User {

    private String nama;
    private int passHash;

    public User(String nama, String password) {
        this.nama = nama;
        this.passHash = password.hashCode();
    }

    public String getNama() {
        return this.nama;
    }

    public boolean checkPassword(String password) {
        return (this.passHash) == password.hashCode();
    }
}
