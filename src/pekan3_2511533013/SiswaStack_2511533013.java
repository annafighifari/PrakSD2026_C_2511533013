package pekan3_2511533013;
import java.util.ArrayList;

class Siswa_2511533013 {
    String nama;
    int nim;

    public Siswa_2511533013(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    @Override
    public String toString(){
        return "Nim: " + nim + ", Nama: " + nama;
    }
}

public class SiswaStack_2511533013 {
    private ArrayList<Siswa_2511533013> stack;

    public SiswaStack_2511533013() {
        stack = new ArrayList<>();
    }

    public void push(Siswa_2511533013 mhs) {
        stack.add(mhs);
    }

    public Siswa_2511533013 pop() {
        if (isEmpty()) {
            return null;
        }
        return stack.remove(stack.size() - 1);
    }

    public Siswa_2511533013 peek() {
        if (isEmpty()) {
            return null;
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void tampilkanSiswa_3013() {
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
    }

    public static void main(String[] args) {
        SiswaStack_2511533013 studentStack = new SiswaStack_2511533013();

        Siswa_2511533013 mhs1 = new Siswa_2511533013("Annafi", 1);
        Siswa_2511533013 mhs2 = new Siswa_2511533013("Boby", 2);
        Siswa_2511533013 mhs3 = new Siswa_2511533013("Charles", 3);

        studentStack.push(mhs1);
        studentStack.push(mhs2);
        studentStack.push(mhs3);

        System.out.println("Siswa di dalam stack:");
        studentStack.tampilkanSiswa_3013();

        System.out.println("\nSiswa teratas: " + studentStack.peek());
        System.out.println("\nMengeluarkan siswa teratas: " + studentStack.pop());

        System.out.println("\nDaftar siswa setelah di pop:");
        studentStack.tampilkanSiswa_3013();
    }
}