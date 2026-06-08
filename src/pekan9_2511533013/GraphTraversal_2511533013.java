package pekan9_2511533013;

import java.util.*;

public class GraphTraversal_2511533013 {

    private static Map<String, List<String>> graph_3013 = new HashMap<>();

    // Menambahkan edge
    public static void addEdge(String node1_3013, String node2_3013) {

        graph_3013.putIfAbsent(node1_3013, new ArrayList<>());
        graph_3013.putIfAbsent(node2_3013, new ArrayList<>());

        graph_3013.get(node1_3013).add(node2_3013);
        graph_3013.get(node2_3013).add(node1_3013);
    }

    // Menampilkan graph
    public void printGraph() {

        System.out.println("Graf Awal (Adjacency List):");

        for (String node_3013 : graph_3013.keySet()) {

            System.out.print(node_3013 + " -> ");

            List<String> neighbors_3013 = graph_3013.get(node_3013);

            System.out.println(String.join(", ", neighbors_3013));
        }

        System.out.println();
    }

    // DFS
    public void dfs(String start_3013) {

        Set<String> visited_3013 = new HashSet<>();

        System.out.println("Penelusuran DFS :");

        dfsHelper(start_3013, visited_3013);

        System.out.println();
    }

    // Helper DFS
    private void dfsHelper(String current_3013,
                           Set<String> visited_3013) {

        if (visited_3013.contains(current_3013)) {
            return;
        }

        visited_3013.add(current_3013);

        System.out.print(current_3013 + " ");

        for (String neighbor_3013 : graph_3013.get(current_3013)) {

            dfsHelper(neighbor_3013, visited_3013);
        }
    }

    // BFS
    public void bfs(String start_3013) {

        Set<String> visited_3013 = new HashSet<>();

        Queue<String> queue_3013 = new LinkedList<>();

        queue_3013.add(start_3013);

        visited_3013.add(start_3013);

        System.out.println("Penelusuran BFS :");

        while (!queue_3013.isEmpty()) {

            String current_3013 = queue_3013.poll();

            System.out.print(current_3013 + " ");

            for (String neighbor_3013 : graph_3013.get(current_3013)) {

                if (!visited_3013.contains(neighbor_3013)) {

                    queue_3013.add(neighbor_3013);

                    visited_3013.add(neighbor_3013);
                }
            }
        }

        System.out.println();
    }

    // Main
    public static void main(String[] args) {

        GraphTraversal_2511533013 graph =
                new GraphTraversal_2511533013();

        // Contoh graph
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "D");
        graph.addEdge("B", "E");

        // Cetak graph
        System.out.println("Graf Awal adalah:");

        graph.printGraph();

        // DFS dan BFS
        graph.dfs("A");

        graph.bfs("A");
    }
}
