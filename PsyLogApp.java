package proyek1;

import java.util.ArrayList;
import java.util.Scanner;

public class PsyLogApp {
    private static ArrayList<Pasien> daftarKlien = new ArrayList<>();
    private static Psikolog dokter = new Psikolog("Kristian Natalis, M.Psi");
    private static Scanner moon = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n======= MIND JOURNAL LOGIN =======");
            System.out.println("1. Login as Client");
            System.out.println("2. Login as Psychologist");
            System.out.println("3. Exit");
            System.out.print("Pilih Login: ");
            int pil = moon.nextInt(); moon.nextLine();

            if (pil == 1) menuLoginKlien();
            else if (pil == 2) menuLoginPsikolog();
            else break;
        }
    }

    private static void menuLoginKlien() {
        System.out.print("Masukkan Nama Anda: ");
        String nama =moon.nextLine();
        Pasien p = cariKlien(nama);

        if (p == null) {
            System.out.print("Nama belum terdaftar. Buat akun baru? (y/n): ");
            if (moon.nextLine().equalsIgnoreCase("y")) {
                p = new Pasien(nama);
                daftarKlien.add(p);
            } else return;
        }

        boolean loop = true;
        while (loop) {
            p.tampilkanMenu();
            int aksi = moon.nextInt(); moon.nextLine();
            if (aksi == 1) {
                System.out.print("Tanggal: "); String tgl = moon.nextLine();
                System.out.print("Mood: "); String mood = moon.nextLine();
                System.out.print("Kegiatan: "); String keg = moon.nextLine();
                System.out.print("Jam Tidur: "); double jam = moon.nextDouble();
                p.tambahJurnal(tgl, mood, keg, jam);
            } else if (aksi == 2) {
                System.out.println("Riwayat: " + p.getRiwayat());
            } else loop = false;
        }
    }

    private static void menuLoginPsikolog() {
        System.out.print("Masukkan Password: ");
        if (dokter.cekPassword(moon.nextLine())) {
            boolean loop = true;
            while (loop) {
                dokter.tampilkanMenu();
                int aksi = moon.nextInt(); moon.nextLine();
                if (aksi == 1) {
                    for (Pasien p : daftarKlien) System.out.println(p.getNama() + ": " + p.getRiwayat());
                } else if (aksi == 2) {
                    System.out.print("Nama proyek1.Pasien: "); Pasien p = cariKlien(moon.nextLine());
                    if (p != null) { System.out.print("Target Baru: "); p.setTargetTidur(moon.nextDouble()); }
                } else if (aksi == 3) {
                    System.out.print("Hapus proyek1.Pasien: "); String n = moon.nextLine();
                    daftarKlien.removeIf(p -> p.getNama().equalsIgnoreCase(n));
                } else loop = false;
            }
        } else System.out.println("Password Salah!");
    }

    private static Pasien cariKlien(String nama) {
        for (Pasien p : daftarKlien) if (p.getNama().equalsIgnoreCase(nama)) return p;
        return null;
    }
}