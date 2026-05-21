package pekan7_2511533013;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class SortingGUI_2511533013 extends JFrame {

    JTextField txtNama_3013, txtNim_3013, txtProdi_3013;
    JButton btnTambah_3013, btnHapus_3013, btnSort_3013;
    JComboBox<String> cbSorting_3013;
    JTable table_3013;
    JTextArea areaProses_3013;

    DefaultTableModel model_3013;

    ArrayList<Mahasiswa_2511533013> listMahasiswa_3013 = new ArrayList<>();

    public SortingGUI_2511533013() {
        setTitle("Sorting Mahasiswa GUI");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        JPanel panelInput_3013 = new JPanel(new GridLayout(4, 2));

        panelInput_3013.add(new JLabel("Nama"));
        txtNama_3013 = new JTextField();
        panelInput_3013.add(txtNama_3013);

        panelInput_3013.add(new JLabel("NIM"));
        txtNim_3013 = new JTextField();
        panelInput_3013.add(txtNim_3013);

        panelInput_3013.add(new JLabel("Program Studi"));
        txtProdi_3013 = new JTextField();
        panelInput_3013.add(txtProdi_3013);

        cbSorting_3013 = new JComboBox<>();
        cbSorting_3013.addItem("Insertion Sort");
        cbSorting_3013.addItem("Selection Sort");
        cbSorting_3013.addItem("Bubble Sort");

        panelInput_3013.add(cbSorting_3013);

        JPanel panelButton_3013 = new JPanel();

        btnTambah_3013 = new JButton("Tambah Data");
        btnHapus_3013 = new JButton("Hapus Data");
        btnSort_3013 = new JButton("Mulai Sorting");

        panelButton_3013.add(btnTambah_3013);
        panelButton_3013.add(btnHapus_3013);
        panelButton_3013.add(btnSort_3013);

        model_3013 = new DefaultTableModel();
        model_3013.addColumn("Nama");
        model_3013.addColumn("NIM");
        model_3013.addColumn("Program Studi");

        table_3013 = new JTable(model_3013);

        areaProses_3013 = new JTextArea();
        areaProses_3013.setEditable(false);

        add(panelInput_3013, BorderLayout.NORTH);
        add(new JScrollPane(table_3013), BorderLayout.CENTER);
        add(panelButton_3013, BorderLayout.SOUTH);
        add(new JScrollPane(areaProses_3013), BorderLayout.EAST);

        btnTambah_3013.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tambahData_3013();
            }
        });

        btnHapus_3013.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hapusData_3013();
            }
        });

        btnSort_3013.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sortingData_3013();
            }
        });
    }

    public void tambahData_3013() {
        String nama_3013 = txtNama_3013.getText();
        String nim_3013 = txtNim_3013.getText();
        String prodi_3013 = txtProdi_3013.getText();

        Mahasiswa_2511533013 mhs_3013 = new Mahasiswa_2511533013(nama_3013, nim_3013, prodi_3013);

        listMahasiswa_3013.add(mhs_3013);

        model_3013.addRow(new Object[]{nama_3013, nim_3013, prodi_3013});

        txtNama_3013.setText("");
        txtNim_3013.setText("");
        txtProdi_3013.setText("");
    }

    public void hapusData_3013() {
        int baris_3013 = table_3013.getSelectedRow();

        if (baris_3013 >= 0) {
            listMahasiswa_3013.remove(baris_3013);
            model_3013.removeRow(baris_3013);
        }
    }

    public void sortingData_3013() {
        areaProses_3013.setText("");

        String pilihan_3013 = cbSorting_3013.getSelectedItem().toString();

        if (pilihan_3013.equals("Insertion Sort")) {
            insertionSort_3013();
        } else if (pilihan_3013.equals("Selection Sort")) {
            selectionSort_3013();
        } else {
            bubbleSort_3013();
        }

        tampilTable_3013();
    }

    public void tampilTable_3013() {
        model_3013.setRowCount(0);

        for (Mahasiswa_2511533013 mhs_3013 : listMahasiswa_3013) {
            model_3013.addRow(new Object[]{
                    mhs_3013.getNama_3013(),
                    mhs_3013.getNim_3013(),
                    mhs_3013.getProdi_3013()
            });
        }
    }

    public void insertionSort_3013() {
        areaProses_3013.append("=== INSERTION SORT ===\n");

        for (int i_3013 = 1; i_3013 < listMahasiswa_3013.size(); i_3013++) {

            Mahasiswa_2511533013 key_3013 = listMahasiswa_3013.get(i_3013);
            int j_3013 = i_3013 - 1;

            while (j_3013 >= 0 &&
                    listMahasiswa_3013.get(j_3013)
                            .getNama_3013()
                            .compareToIgnoreCase(key_3013.getNama_3013()) > 0) {

                listMahasiswa_3013.set(j_3013 + 1, listMahasiswa_3013.get(j_3013));
                j_3013--;
            }

            listMahasiswa_3013.set(j_3013 + 1, key_3013);

            areaProses_3013.append("Langkah " + i_3013 + " : " + tampilNama_3013() + "\n");
        }
    }

    public void selectionSort_3013() {
        areaProses_3013.append("=== SELECTION SORT ===\n");

        for (int i_3013 = 0; i_3013 < listMahasiswa_3013.size() - 1; i_3013++) {

            int min_3013 = i_3013;

            for (int j_3013 = i_3013 + 1; j_3013 < listMahasiswa_3013.size(); j_3013++) {

                if (listMahasiswa_3013.get(j_3013)
                        .getNama_3013()
                        .compareToIgnoreCase(
                                listMahasiswa_3013.get(min_3013).getNama_3013()) < 0) {

                    min_3013 = j_3013;
                }
            }

            Mahasiswa_2511533013 temp_3013 = listMahasiswa_3013.get(i_3013);
            listMahasiswa_3013.set(i_3013, listMahasiswa_3013.get(min_3013));
            listMahasiswa_3013.set(min_3013, temp_3013);

            areaProses_3013.append("Pass " + (i_3013 + 1) + " : " + tampilNama_3013() + "\n");
        }
    }

    public void bubbleSort_3013() {
        areaProses_3013.append("=== BUBBLE SORT ===\n");

        for (int i_3013 = 0; i_3013 < listMahasiswa_3013.size() - 1; i_3013++) {

            for (int j_3013 = 0; j_3013 < listMahasiswa_3013.size() - i_3013 - 1; j_3013++) {

                if (listMahasiswa_3013.get(j_3013)
                        .getNama_3013()
                        .compareToIgnoreCase(
                                listMahasiswa_3013.get(j_3013 + 1).getNama_3013()) > 0) {

                    Mahasiswa_2511533013 temp_3013 = listMahasiswa_3013.get(j_3013);
                    listMahasiswa_3013.set(j_3013, listMahasiswa_3013.get(j_3013 + 1));
                    listMahasiswa_3013.set(j_3013 + 1, temp_3013);
                }
            }

            areaProses_3013.append("Pass " + (i_3013 + 1) + " : " + tampilNama_3013() + "\n");
        }
    }

    public String tampilNama_3013() {
        String hasil_3013 = "[";

        for (int i_3013 = 0; i_3013 < listMahasiswa_3013.size(); i_3013++) {

            hasil_3013 += listMahasiswa_3013.get(i_3013).getNama_3013();

            if (i_3013 != listMahasiswa_3013.size() - 1) {
                hasil_3013 += ", ";
            }
        }

        hasil_3013 += "]";

        return hasil_3013;
    }

    public static void main(String[] args) {
        new SortingGUI_2511533013().setVisible(true);
    }
}
