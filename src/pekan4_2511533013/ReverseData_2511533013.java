package pekan4_2511533013;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseData_2511533013 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        // Menambahkan elemen ke dalam queue
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println("Sebelum Reverse" + queue);

            while (!queue.isEmpty()) { // Q -> S
            stack.push(queue.remove());
        }

        while (!stack.isEmpty()) { // S-> Q
            queue.add(stack.pop());
        }
        System.out.println("Sesudah Reverse: " + queue); // [3, 2, 1]
    }
}
