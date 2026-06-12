package pekan9_2511533013;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class PetaKampus_2511533013 extends JFrame {

    private Map<String, java.util.List<String>> graph_3013 = new LinkedHashMap<>();
    private Map<String, Point> posisi_3013 = new HashMap<>();
    private Set<String> visited_3013 = new HashSet<>();
    private java.util.List<String> path_3013 = new ArrayList<>();

    private JComboBox<String> startBox_3013;
    private JComboBox<String> goalBox_3013;
    private JTextArea hasilArea_3013;
    private GraphPanel_3013 panelGraph_3013;

    public PetaKampus_2511533013() {
        setTitle("Pencarian Jalur BFS dan DFS - 2511533013");
        setSize(950, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        buatGraph_3013();

        JPanel topPanel_3013 = new JPanel();
        topPanel_3013.add(new JLabel("Lokasi Awal:"));
        startBox_3013 = new JComboBox<>(graph_3013.keySet().toArray(new String[0]));
        topPanel_3013.add(startBox_3013);

        topPanel_3013.add(new JLabel("Lokasi Tujuan:"));
        goalBox_3013 = new JComboBox<>(graph_3013.keySet().toArray(new String[0]));
        topPanel_3013.add(goalBox_3013);

        JButton bfsButton_3013 = new JButton("BFS");
        JButton dfsButton_3013 = new JButton("DFS");
        JButton resetButton_3013 = new JButton("RESET");

        topPanel_3013.add(bfsButton_3013);
        topPanel_3013.add(dfsButton_3013);
        topPanel_3013.add(resetButton_3013);

        panelGraph_3013 = new GraphPanel_3013();

        hasilArea_3013 = new JTextArea(7, 30);
        hasilArea_3013.setEditable(false);
        hasilArea_3013.setFont(new Font("Monospaced", Font.PLAIN, 14));

        add(topPanel_3013, BorderLayout.NORTH);
        add(panelGraph_3013, BorderLayout.CENTER);
        add(new JScrollPane(hasilArea_3013), BorderLayout.SOUTH);

        bfsButton_3013.addActionListener(e -> BFS_3013());
        dfsButton_3013.addActionListener(e -> DFS_3013());
        resetButton_3013.addActionListener(e -> resetGraph_3013());
    }

    private void buatGraph_3013() {
        String[] lokasi_3013 = {
                "Gerbang Utama", "Rektorat", "Perpustakaan", "Fakultas Teknik",
                "Fakultas Ekonomi", "Masjid Kampus", "Kantin", "Labor Komputer",
                "Aula", "Parkiran", "Gedung Kuliah", "Lapangan"
        };

        for (String lokasi : lokasi_3013) {
            graph_3013.put(lokasi, new ArrayList<>());
        }

        tambahEdge_3013("Gerbang Utama", "Rektorat");
        tambahEdge_3013("Gerbang Utama", "Parkiran");
        tambahEdge_3013("Rektorat", "Perpustakaan");
        tambahEdge_3013("Rektorat", "Fakultas Ekonomi");
        tambahEdge_3013("Perpustakaan", "Fakultas Teknik");
        tambahEdge_3013("Perpustakaan", "Gedung Kuliah");
        tambahEdge_3013("Fakultas Teknik", "Labor Komputer");
        tambahEdge_3013("Fakultas Teknik", "Aula");
        tambahEdge_3013("Fakultas Ekonomi", "Kantin");
        tambahEdge_3013("Fakultas Ekonomi", "Masjid Kampus");
        tambahEdge_3013("Masjid Kampus", "Kantin");
        tambahEdge_3013("Kantin", "Lapangan");
        tambahEdge_3013("Labor Komputer", "Gedung Kuliah");
        tambahEdge_3013("Aula", "Lapangan");
        tambahEdge_3013("Parkiran", "Masjid Kampus");
        tambahEdge_3013("Parkiran", "Lapangan");

        posisi_3013.put("Gerbang Utama", new Point(80, 250));
        posisi_3013.put("Rektorat", new Point(220, 150));
        posisi_3013.put("Perpustakaan", new Point(400, 90));
        posisi_3013.put("Fakultas Teknik", new Point(620, 90));
        posisi_3013.put("Fakultas Ekonomi", new Point(360, 250));
        posisi_3013.put("Masjid Kampus", new Point(250, 390));
        posisi_3013.put("Kantin", new Point(480, 370));
        posisi_3013.put("Labor Komputer", new Point(750, 170));
        posisi_3013.put("Aula", new Point(730, 300));
        posisi_3013.put("Parkiran", new Point(120, 430));
        posisi_3013.put("Gedung Kuliah", new Point(570, 220));
        posisi_3013.put("Lapangan", new Point(650, 430));
    }

    private void tambahEdge_3013(String a_3013, String b_3013) {
        graph_3013.get(a_3013).add(b_3013);
        graph_3013.get(b_3013).add(a_3013);
    }

    public void BFS_3013() {
        resetData_3013();

        String start_3013 = (String) startBox_3013.getSelectedItem();
        String goal_3013 = (String) goalBox_3013.getSelectedItem();

        Queue<String> queue_3013 = new LinkedList<>();
        Map<String, String> parent_3013 = new HashMap<>();

        queue_3013.add(start_3013);
        visited_3013.add(start_3013);
        parent_3013.put(start_3013, null);

        while (!queue_3013.isEmpty()) {
            String current_3013 = queue_3013.poll();

            if (current_3013.equals(goal_3013)) {
                break;
            }

            for (String neighbor_3013 : graph_3013.get(current_3013)) {
                if (!visited_3013.contains(neighbor_3013)) {
                    visited_3013.add(neighbor_3013);
                    parent_3013.put(neighbor_3013, current_3013);
                    queue_3013.add(neighbor_3013);
                }
            }
        }

        buatPath_3013(parent_3013, start_3013, goal_3013);
        displayPath_3013("BFS");
    }

    public void DFS_3013() {
        resetData_3013();

        String start_3013 = (String) startBox_3013.getSelectedItem();
        String goal_3013 = (String) goalBox_3013.getSelectedItem();

        Stack<String> stack_3013 = new Stack<>();
        Map<String, String> parent_3013 = new HashMap<>();

        stack_3013.push(start_3013);
        parent_3013.put(start_3013, null);

        while (!stack_3013.isEmpty()) {
            String current_3013 = stack_3013.pop();

            if (!visited_3013.contains(current_3013)) {
                visited_3013.add(current_3013);

                if (current_3013.equals(goal_3013)) {
                    break;
                }

                for (String neighbor_3013 : graph_3013.get(current_3013)) {
                    if (!visited_3013.contains(neighbor_3013)) {
                        stack_3013.push(neighbor_3013);
                        if (!parent_3013.containsKey(neighbor_3013)) {
                            parent_3013.put(neighbor_3013, current_3013);
                        }
                    }
                }
            }
        }

        buatPath_3013(parent_3013, start_3013, goal_3013);
        displayPath_3013("DFS");
    }

    private void buatPath_3013(Map<String, String> parent_3013, String start_3013, String goal_3013) {
        path_3013.clear();

        if (!parent_3013.containsKey(goal_3013)) {
            return;
        }

        String current_3013 = goal_3013;
        while (current_3013 != null) {
            path_3013.add(current_3013);
            current_3013 = parent_3013.get(current_3013);
        }

        Collections.reverse(path_3013);
    }

    public void displayPath_3013(String metode_3013) {
        hasilArea_3013.setText("");
        hasilArea_3013.append("Hasil Pencarian Menggunakan " + metode_3013 + "\n");

        if (path_3013.isEmpty()) {
            hasilArea_3013.append("Jalur: Tidak ditemukan\n");
        } else {
            hasilArea_3013.append("Jalur: " + String.join(" -> ", path_3013) + "\n");
        }

        hasilArea_3013.append("Node Dikunjungi: " + visited_3013 + "\n");
        hasilArea_3013.append("Jumlah Node Dieksplorasi: " + visited_3013.size() + "\n");

        displayGraph_3013();
    }

    public void displayGraph_3013() {
        panelGraph_3013.repaint();
    }

    public void resetGraph_3013() {
        resetData_3013();
        hasilArea_3013.setText("Graph dikembalikan ke kondisi awal.\n");
        displayGraph_3013();
    }

    private void resetData_3013() {
        visited_3013.clear();
        path_3013.clear();
    }

    class GraphPanel_3013 extends JPanel {
        protected void paintComponent(Graphics g_3013) {
            super.paintComponent(g_3013);
            setBackground(Color.WHITE);

            Graphics2D g2_3013 = (Graphics2D) g_3013;
            g2_3013.setStroke(new BasicStroke(2));

            for (String node_3013 : graph_3013.keySet()) {
                Point p1_3013 = posisi_3013.get(node_3013);

                for (String tetangga_3013 : graph_3013.get(node_3013)) {
                    Point p2_3013 = posisi_3013.get(tetangga_3013);
                    g2_3013.setColor(Color.GRAY);
                    g2_3013.drawLine(p1_3013.x, p1_3013.y, p2_3013.x, p2_3013.y);
                }
            }

            for (String node_3013 : graph_3013.keySet()) {
                Point p_3013 = posisi_3013.get(node_3013);

                if (path_3013.contains(node_3013)) {
                    g2_3013.setColor(Color.ORANGE);
                } else if (visited_3013.contains(node_3013)) {
                    g2_3013.setColor(Color.GREEN);
                } else {
                    g2_3013.setColor(Color.CYAN);
                }

                g2_3013.fillOval(p_3013.x - 25, p_3013.y - 25, 50, 50);
                g2_3013.setColor(Color.BLACK);
                g2_3013.drawOval(p_3013.x - 25, p_3013.y - 25, 50, 50);
                g2_3013.drawString(node_3013, p_3013.x - 45, p_3013.y + 45);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PetaKampus_2511533013().setVisible(true);
        });
    }
}