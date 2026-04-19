package pekan2_2511533013;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2511533013 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Musik_2511533013> playlist = new ArrayList<>();

        int pilihan;

        do {
            System.out.println("\n=== Playlist Musik ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Lihat Playlist");
            System.out.println("3. Hapus Lagu");
            System.out.println("4. Cek Jumlah Lagu");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Judul: ");
                    String judul = input.nextLine();
                    System.out.print("Penyanyi: ");
                    String penyanyi = input.nextLine();
                    System.out.print("Durasi: ");
                    int durasi = input.nextInt();

                    playlist.add(new Musik_2511533013(judul, penyanyi, durasi));
                    System.out.println("Lagu berhasil ditambahkan!");
                    break;

                case 2:
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist kosong!");
                    } else {
                        for (int i = 0; i < playlist.size(); i++) {
                            Musik_2511533013 m = playlist.get(i);
                            System.out.println((i+1) + ". " + m.getJudul() + " - " 
                                + m.getPenyanyi() + " (" + m.getDurasi() + " detik)");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Masukkan nomor lagu: ");
                    int index = input.nextInt();
                    if (index > 0 && index <= playlist.size()) {
                        playlist.remove(index - 1);
                        System.out.println("Lagu dihapus!");
                    } else {
                        System.out.println("Index tidak valid!");
                    }
                    break;

                case 4:
                    System.out.println("Jumlah lagu: " + playlist.size());
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