package pekan6_2511533013;

import java.util.Scanner;

public class MainPlaylist_2511533013 {
    public static void main(String[] args) {
        Scanner input_3013 = new Scanner(System.in);
        Musik_2511533013 playlist_3013 = new Musik_2511533013();

        int pilihan_3013;

        do {
            System.out.println("=== Playlist Musik NIM: 2511533013 ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Hapus Lagu Pertama");
            System.out.println("3. Lihat Playlist (Maju)");
            System.out.println("4. Lihat Playlist (Mundur)");
            System.out.println("5. Cari Lagu");
            System.out.println("6. Keluar");
            System.out.print("Pilihan : ");
            pilihan_3013 = input_3013.nextInt();
            input_3013.nextLine();

            switch (pilihan_3013) {
                case 1:
                    System.out.print("Judul Lagu : ");
                    String judul_3013 = input_3013.nextLine();

                    System.out.print("Penyanyi   : ");
                    String penyanyi_3013 = input_3013.nextLine();

                    playlist_3013.tambahLagu_3013(judul_3013, penyanyi_3013);
                    break;

                case 2:
                    playlist_3013.hapusLaguAwal_3013();
                    break;

                case 3:
                    playlist_3013.tampilMaju_3013();
                    break;

                case 4:
                    playlist_3013.tampilMundur_3013();
                    break;

                case 5:
                    System.out.print("Masukkan judul lagu yang dicari : ");
                    String cari_3013 = input_3013.nextLine();

                    playlist_3013.cariLagu_3013(cari_3013);
                    break;

                case 6:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!\n");
            }

        } while (pilihan_3013 != 6);

        input_3013.close();
    }
}