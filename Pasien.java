package proyek1;

import java.util.ArrayList;

public class Pasien extends User {
    private double targetTidur = 8.0;
    private ArrayList<String> riwayatJurnal = new ArrayList<>();

    public Pasien(String nama) {
        super(nama);
    }

    public void setTargetTidur(double jam) { this.targetTidur = jam; }
    public double getTargetTidur() { return targetTidur; }

    public void tambahJurnal(String tgl, String mood, String kegiatan, double tidur) {
        String entri = String.format("[%s] Mood: %s | Tidur: %.1f jam | Kegiatan: %s",
                tgl, mood, tidur, kegiatan);
        riwayatJurnal.add(entri);
    }

    public ArrayList<String> getRiwayat() { return riwayatJurnal; }

    @Override
    public void tampilkanMenu() {
        System.out.println("\n=== MENU KLIEN: " + nama + " ===");
        System.out.println("Target Tidur Anda: " + targetTidur + " jam");
        System.out.println("1. Isi Jurnal & Perasaan");
        System.out.println("2. Lihat Riwayat Jurnal");
        System.out.println("3. Logout");
        System.out.print("Pilih Aksi: ");
    }
}