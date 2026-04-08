package pekan3_2511533013;

import java.util.Stack;

public class NilaiMaksimum_2511533013 {
    public static int max_3013(Stack<Integer> s) {
        Stack<Integer> backup_3013 = new Stack<Integer>();
        int maxValue_3013 = s.pop();
        backup_3013.push(maxValue_3013);
        while (!s.isEmpty()) {
            int next = s.pop();
            backup_3013.push(next);
            maxValue_3013 = Math.max(maxValue_3013, next);
        }
        while (!backup_3013.isEmpty()) {
            s.push(backup_3013.pop());
        }
        return maxValue_3013;
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(70);
        s.push(12);
        s.push(20);
        System.out.println("Isi Stack: " + s);
        System.out.println("Stack Teratas: " + s.peek());
        System.out.println("Nilai maksimum: " + max_3013(s));
    }

}
