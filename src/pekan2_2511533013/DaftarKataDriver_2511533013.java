package pekan2_2511533013;

public class DaftarKataDriver_2511533013 {

public static void main(String[] args) {
    DaftarKata_2511533013 al = new DaftarKata_2511533013();

    al.tambah_2511533013("Kami");
    al.tambah_2511533013("Informatika");

    al.tambahPada_2511533013(1, "Mahasiswa");
    System.out.println("Awal : " + al);
    
    al.UbahElemen_2511533013(1, "Departemen");
    System.out.println("Setelah Ubah : " + al);

    String terhapus = al.hapusElemen_2511533013(0);
    System.out.println("Terhapus : " + terhapus);
    System.out.println("Setelah Hapus : " + al);

    System.out.print("Iterasi : ");
    al.iterasiCetak_2511533013();
    System.out.println();
}
}