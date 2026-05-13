package pekan6_2511533013;

public class Musik_2511533013 {
    Lagu_2511533013 head_3013;
    Lagu_2511533013 tail_3013;

    public void tambahLagu_3013(String judul_3013, String penyanyi_3013) {
        Lagu_2511533013 laguBaru_3013 = new Lagu_2511533013(judul_3013, penyanyi_3013);

        // jika playlist kosong
        if (head_3013 == null) {
            head_3013 = laguBaru_3013;
            tail_3013 = laguBaru_3013;
        } else {
            tail_3013.next_3013 = laguBaru_3013;
            laguBaru_3013.prev_3013 = tail_3013;
            tail_3013 = laguBaru_3013;
        }

        System.out.println("Lagu berhasil ditambahkan!\n");
    }

    public void hapusLaguAwal_3013() {
        if (head_3013 == null) {
            System.out.println("Playlist kosong!\n");
            return;
        }

        if (head_3013 == tail_3013) {
            System.out.println("Lagu " + head_3013.getJudul_3013() + " berhasil dihapus!\n");
            head_3013 = null;
            tail_3013 = null;
        } else {
            System.out.println("Lagu " + head_3013.getJudul_3013() + " berhasil dihapus!\n");
            head_3013 = head_3013.next_3013;
            head_3013.prev_3013 = null;
        }
    }

    // method menampilkan playlist dari awal ke akhir
    public void tampilMaju_3013() {
        // jika playlist kosong
        if (head_3013 == null) {
            System.out.println("Playlist kosong!\n");
            return;
        }

        Lagu_2511533013 bantu_3013 = head_3013;

        System.out.println("=== Playlist Maju ===");
        while (bantu_3013 != null) {
            System.out.println("Judul    : " + bantu_3013.getJudul_3013());
            System.out.println("Penyanyi : " + bantu_3013.getPenyanyi_3013());
            System.out.println();

            bantu_3013 = bantu_3013.next_3013;
        }
    }

    public void tampilMundur_3013() {
        // jika playlist kosong
        if (tail_3013 == null) {
            System.out.println("Playlist kosong!\n");
            return;
        }

        Lagu_2511533013 bantu_3013 = tail_3013;

        System.out.println("=== Playlist Mundur ===");
        while (bantu_3013 != null) {
            System.out.println("Judul    : " + bantu_3013.getJudul_3013());
            System.out.println("Penyanyi : " + bantu_3013.getPenyanyi_3013());
            System.out.println();

            bantu_3013 = bantu_3013.prev_3013;
        }
    }

    // method mencari lagu
    public void cariLagu_3013(String judulCari_3013) {
        // jika playlist kosong
        if (head_3013 == null) {
            System.out.println("Playlist kosong!\n");
            return;
        }

        Lagu_2511533013 bantu_3013 = head_3013;
        boolean ditemukan_3013 = false;

        while (bantu_3013 != null) {
            if (bantu_3013.getJudul_3013().equalsIgnoreCase(judulCari_3013)) {
                System.out.println("Lagu ditemukan!");
                System.out.println("Judul    : " + bantu_3013.getJudul_3013());
                System.out.println("Penyanyi : " + bantu_3013.getPenyanyi_3013());
                System.out.println();
                ditemukan_3013 = true;
                break;
            }

            bantu_3013 = bantu_3013.next_3013;
        }

        if (!ditemukan_3013) {
            System.out.println("Lagu tidak ditemukan!\n");
        }
    }
}