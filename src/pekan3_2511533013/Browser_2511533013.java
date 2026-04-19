package pekan3_2511533013;

import java.util.Scanner;
import java.util.Stack;

public class Browser_2511533013 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Website_2511533013> history = new Stack<>();

        int pilihan;

        do {
            System.out.println("\n=== Browser History ===");
            System.out.println("1. Kunjungi Website (Push)");
            System.out.println("2. Tombol Back (Pop)");
            System.out.println("3. Lihat Halaman Aktif (Peek)");
            System.out.println("4. Cek Status History");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Judul: ");
                    String judul = input.nextLine();
                    System.out.print("URL: ");
                    String url = input.nextLine();

                    history.push(new Website_2511533013(judul, url));
                    System.out.println("Berhasil mengunjungi website!");
                    break;

                case 2:
                    if (!history.isEmpty()) {
                        Website_2511533013 w = history.pop();
                        System.out.println("Kembali dari: " + w.getJudul());
                    } else {
                        System.out.println("History kosong! Tidak bisa back.");
                    }
                    break;

                case 3:
                    if (!history.isEmpty()) {
                        Website_2511533013 w = history.peek();
                        System.out.println("Halaman aktif:");
                        System.out.println("Judul: " + w.getJudul());
                        System.out.println("URL: " + w.getUrl());
                    } else {
                        System.out.println("Tidak ada halaman yang dibuka.");
                    }
                    break;

                case 4:
                    if (history.isEmpty()) {
                        System.out.println("History kosong.");
                    } else {
                        System.out.println("Jumlah history: " + history.size());
                    }
                    break;

                case 5:
                    System.out.println("Keluar program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 5);

        input.close();
    }
}