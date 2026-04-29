package pekan4_2511533013;

import java.util.Scanner;

public class AntrianLoket_2511533013 {
    String[] queue_3013;
    int front_3013, rear_3013, max_3013;

    public AntrianLoket_2511533013(int max_3013) {
        this.max_3013 = max_3013;
        queue_3013 = new String[max_3013];
        front_3013 = -1;
        rear_3013 = -1;
    }

    boolean isEmpty_3013() {
        return rear_3013 == -1;
    }

    boolean isFull_3013() {
        return rear_3013 == max_3013 - 1;
    }

    void enqueue_3013(String data_3013) {
        if (isFull_3013()) {
            System.out.println("Antrian penuh!");
        } else {
            if (isEmpty_3013()) {
                front_3013 = 0;
            }
            rear_3013++;
            queue_3013[rear_3013] = data_3013;
            System.out.println("Data berhasil ditambahkan ke antrian");
        }
    }

    void dequeue_3013() {
        if (isEmpty_3013()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println(queue_3013[front_3013] + " telah dilayani");

            if (front_3013 == rear_3013) {
                front_3013 = rear_3013 = -1;
            } else {
                front_3013++;
            }
        }
    }

    void display_3013() {
        if (isEmpty_3013()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Isi antrian:");
            for (int i_3013 = front_3013; i_3013 <= rear_3013; i_3013++) {
                System.out.println((i_3013 - front_3013 + 1) + ". " + queue_3013[i_3013]);
            }
        }
    }

    void reverse_3013() {
        if (isEmpty_3013()) {
            System.out.println("Antrian kosong!");
        } else {
            int start_3013 = front_3013;
            int end_3013 = rear_3013;

            while (start_3013 < end_3013) {
                String temp_3013 = queue_3013[start_3013];
                queue_3013[start_3013] = queue_3013[end_3013];
                queue_3013[end_3013] = temp_3013;

                start_3013++;
                end_3013--;
            }

            System.out.println("Antrian berhasil dibalik!");
            display_3013();
        }
    }

    public static void main(String[] args) {
        Scanner input_3013 = new Scanner(System.in);
        AntrianLoket_2511533013 antrian_3013 = new AntrianLoket_2511533013(5);

        int pilihan_3013;
        do {
            System.out.println("\n=== PROGRAM ANTRIAN LOKET ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Reverse");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan_3013 = input_3013.nextInt();
            input_3013.nextLine();

            switch (pilihan_3013) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama_3013 = input_3013.nextLine();
                    antrian_3013.enqueue_3013(nama_3013);
                    break;
                case 2:
                    antrian_3013.dequeue_3013();
                    break;
                case 3:
                    antrian_3013.display_3013();
                    break;
                case 4:
                    antrian_3013.reverse_3013();
                    break;
                case 5:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan_3013 != 5);

        input_3013.close();
    }
}