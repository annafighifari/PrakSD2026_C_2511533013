package pekan5_2511533013;

import java.util.Scanner;

public class RumahSakit_2511533013 {

    static Pasien_2511533013 head_3013 = null;
    static int counter_3013 = 0;

    // Insert at Tail
    public static void daftarkanPasien_3013(String nama_3013, String penyakit_3013) {

        counter_3013++;

        Pasien_2511533013 pasienBaru_3013 = new Pasien_2511533013(
                nama_3013,
                penyakit_3013,
                counter_3013);

        // klw list kosong
        if (head_3013 == null) {

            head_3013 = pasienBaru_3013;

        } else {

            // Traversal ke node terakhir
            Pasien_2511533013 bantu_3013 = head_3013;

            while (bantu_3013.next_3013 != null) {
                bantu_3013 = bantu_3013.next_3013;
            }

            // nyambungin node terakhir dgn node baru
            bantu_3013.next_3013 = pasienBaru_3013;
        }

        System.out.println("Pasien berhasil didaftarkan!");
        System.out.println("Nomor Antrian : " + counter_3013);
    }

    // hpus head
    public static void panggilPasien_3013() {

        if (head_3013 == null) {

            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("Pasien Dipanggil:");
        System.out.println("Nomor Antrian : "
                + head_3013.getNomorAntrian_3013());

        System.out.println("Nama : "
                + head_3013.getNamaPasien_3013());

        System.out.println("Keluhan : "
                + head_3013.getPenyakit_3013());

        // geser head
        head_3013 = head_3013.next_3013;
    }

    // display
    public static void tampilkanAntrian_3013() {

        if (head_3013 == null) {

            System.out.println("Antrian masih kosong!");
            return;
        }

        Pasien_2511533013 bantu_3013 = head_3013;
        int posisi_3013 = 1;

        System.out.println("\n=== Daftar Antrian Pasien ===");

        while (bantu_3013 != null) {

            System.out.println("Posisi : " + posisi_3013);

            System.out.println("Nomor Antrian : "
                    + bantu_3013.getNomorAntrian_3013());

            System.out.println("Nama Pasien : "
                    + bantu_3013.getNamaPasien_3013());

            System.out.println("Keluhan : "
                    + bantu_3013.getPenyakit_3013());

            System.out.println("---------------------------");

            bantu_3013 = bantu_3013.next_3013;
            posisi_3013++;
        }
    }

    // cari
    public static void cariPasien_3013(String namaCari_3013) {

        if (head_3013 == null) {

            System.out.println("Antrian kosong!");
            return;
        }

        Pasien_2511533013 bantu_3013 = head_3013;
        boolean ditemukan_3013 = false;

        while (bantu_3013 != null) {

            if (bantu_3013.getNamaPasien_3013()
                    .equalsIgnoreCase(namaCari_3013)) {

                System.out.println("Pasien ditemukan!");
                System.out.println("Nomor Antrian : "
                        + bantu_3013.getNomorAntrian_3013());

                System.out.println("Nama : "
                        + bantu_3013.getNamaPasien_3013());

                System.out.println("Keluhan : "
                        + bantu_3013.getPenyakit_3013());

                ditemukan_3013 = true;
                break;
            }

            bantu_3013 = bantu_3013.next_3013;
        }

        if (!ditemukan_3013) {
            System.out.println("Pasien tidak ditemukan!");
        }
    }

    // status antrian
    public static void cekStatusAntrian_3013() {

        if (head_3013 == null) {

            System.out.println("Antrian kosong!");
            return;
        }

        Pasien_2511533013 bantu_3013 = head_3013;
        int jumlah_3013 = 0;

        while (bantu_3013 != null) {

            jumlah_3013++;
            bantu_3013 = bantu_3013.next_3013;
        }

        System.out.println("Jumlah Pasien : "
                + jumlah_3013);

        System.out.println("Pasien Terdepan:");
        System.out.println("Nomor Antrian : "
                + head_3013.getNomorAntrian_3013());

        System.out.println("Nama : "
                + head_3013.getNamaPasien_3013());

        System.out.println("Keluhan : "
                + head_3013.getPenyakit_3013());
    }

    // Main Program
    public static void main(String[] args) {

        Scanner input_3013 = new Scanner(System.in);

        int pilihan_3013;

        do {

            System.out.println("\n=== Antrian Rumah Sakit ===");
            System.out.println("1. Daftarkan Pasien");
            System.out.println("2. Panggil Pasien");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Cari Pasien");
            System.out.println("5. Cek Status Antrian");
            System.out.println("6. Keluar");

            System.out.print("Pilihan : ");
            pilihan_3013 = input_3013.nextInt();
            input_3013.nextLine();

            switch (pilihan_3013) {

                case 1:

                    System.out.print("Masukkan Nama Pasien : ");
                    String nama_3013 = input_3013.nextLine();

                    System.out.print("Masukkan Keluhan : ");
                    String keluhan_3013 = input_3013.nextLine();

                    daftarkanPasien_3013(
                            nama_3013,
                            keluhan_3013);

                    break;

                case 2:

                    panggilPasien_3013();
                    break;

                case 3:

                    tampilkanAntrian_3013();
                    break;

                case 4:

                    System.out.print("Masukkan Nama Pasien : ");
                    String cari_3013 = input_3013.nextLine();

                    cariPasien_3013(cari_3013);
                    break;

                case 5:

                    cekStatusAntrian_3013();
                    break;

                case 6:

                    System.out.println("Program selesai.");
                    break;

                default:

                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan_3013 != 6);

        input_3013.close();
    }
}