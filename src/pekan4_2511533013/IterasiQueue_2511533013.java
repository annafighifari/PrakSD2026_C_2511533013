package pekan4_2511533013;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;
public class IterasiQueue_2511533013 {
    public static void main(String args[]) {
        Queue<String> queue = new LinkedList<>();
        queue.add ("Praktikum");
        queue.add ("Struktur");
        queue.add ("Data");
        queue.add ("Dan");
        queue.add ("Algoritma");
        Iterator<String> iterator = queue.iterator();
        while ( (iterator.hasNext())) {
            System.out.println(iterator.next()+ "");
        }
    }
}
