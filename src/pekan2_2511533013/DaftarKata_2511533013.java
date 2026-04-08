package pekan2_2511533013;

import java.util.ArrayList;

public class DaftarKata_2511533013 {
    private final ArrayList<String> data;

    public DaftarKata_2511533013() {
        this.data = new ArrayList<>();
    }
    public void tambah_2511533013(String elemen) {
        data.add(elemen);
    }
    public void tambahPada_2511533013 (int index, String elemen) {
        data.add(index, elemen);
    }
    public void UbahElemen_2511533013 (int index, String nilaiBaru) {
        data.set(index, nilaiBaru);
    }
    public String hapusElemen_2511533013 (int index) {
        return data.remove(index);
    }
    public void iterasiCetak_2511533013() {
        for (int i = 0; i < data.size(); i++) {
            System.out.print(data.get(i)+ " ");
        }
    }
    public String get(int index) {
        return data.get(index);
    }
    @Override
    public String toString() {
        return data.toString();
    }

}


	