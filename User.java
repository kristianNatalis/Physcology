package proyek1;

public abstract class User {
    protected String nama;

    public User(String nama) {
        this.nama = nama;
    }

    public String getNama() { return nama; }

    // Polimorfisme: Setiap peran punya menu berbeda
    public abstract void tampilkanMenu();
}
