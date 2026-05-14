package proyek1;

public class Psikolog extends User {
    private final String passwordTetap = "admin123";

    public Psikolog(String nama) {
        super(nama);
    }

    public boolean cekPassword(String input) {
        return passwordTetap.equals(input);
    }

    @Override
    public void tampilkanMenu() {
        System.out.println("\n=== DASHBOARD PSIKOLOG: dr. " + nama + " ===");
        System.out.println("1. Pantau Jurnal Semua Klien");
        System.out.println("2. Atur Target Tidur Klien");
        System.out.println("3. Hapus Data Klien");
        System.out.println("4. Logout");
        System.out.print("Pilih Aksi: ");
    }
}