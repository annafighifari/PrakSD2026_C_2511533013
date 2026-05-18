package pekan7_2511533013;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class insertionsortGUI_2511533013 extends JFrame {

	private static final long serialVersionUID = 1L;
	private int[] array;
	private JPanel[] labelArray;
	private JButton stepButton, resetButton, setButton;
	private JTextField inputField;
	private JPanel panelArray;
	private JTextArea stepArea;
	
	private int i = 1, j;
	private boolean sorting = false;
	private int stepCount = 1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					insertionsortGUI_2511533013 frame = new insertionsortGUI_2511533013();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public insertionsortGUI_2511533013() {
		setTitle("Insertion Sort Langkah per Langkah");
		setSize(750, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
//		Panel input
		JPanel inputPanel = new JPanel (new FLowLayout());
		inputField = new JTextField(30);
		setButton = new JButton("Set Array");
		inputPanel.add(new JLabel ("Masukkan angka (pisahkan dengan koma) :"));
//		Panel array visual
		panelArray = new JPanel();
		panelArray.setLayout(new FlowLayout());
//		Panel kontrol
		JPanel controlPanel = new JPanel ();
		stepButton = new JButton ("Lagkah Selanjutnya");
		resetButton = new JButton ("Reset");
		stepButton.setEnabled(false);
		controlPanel.add(stepButton);
		controlPanel.add(resetButton);
// 		Area teks untuk log langkah-langkah
		stepArea = new JTextArea(8, 60);
		stepArea.setEditable(false);
		stepArea.setFont (new Font("Monospaced", Font.PLAIN, 14));
		JScrollPane scrollPane = new JScrollPane(stepArea);
// 		Tambahkan panel ke frame
		add(inputPanel, BorderLayout.NORTH);
		add(panelArray, BorderLayout.CENTER);
		add(controlPanel, BorderLayout.SOUTH);
		add(scrollPane, BorderLayout.EAST);
// 		Event Set Array
 		setButton.addActionListener(e-> setArrayFromInput());
// 		Event Langkah Selanjutnya
		stepButton.addActionListener(e-> performStep());
//		Event Reset
		resetButton.addActionListener(e-> resetSorting());
	}

private void reset() {

    // Mengosongkan input field
    inputField.setText("");

    // Menghapus seluruh komponen pada panel array
    panelArray.removeAll();

    // Memperbarui tampilan panel
    panelArray.revalidate();
    panelArray.repaint();

    // Mengosongkan area langkah sorting
    stepArea.setText("");

    // Menonaktifkan tombol step
    stepButton.setEnabled(false);

    // Menghentikan proses sorting
    sorting = false;

    // Mengembalikan indeks awal insertion sort
    i = 1;

    // Mengatur ulang jumlah langkah
    stepCount = 1;
}

	private void performStep() {
    if (i < array.length && sorting) {

        // Menyimpan elemen yang akan disisipkan
        int key = array[i];

        // Menentukan indeks sebelumnya
        j = i - 1;

        // Membuat log langkah sorting
        StringBuilder stepLog = new StringBuilder();
        stepLog.append("Langkah ")
               .append(stepCount)
               .append(": Memasukkan ")
               .append(key)
               .append("\n");

        // Menggeser elemen yang lebih besar dari key
        while (j >= 0 && array[j] > key) {
            array[j + 1] = array[j];
            j--;
        }

        // Menempatkan key pada posisi yang benar
        array[j + 1] = key;

        // Memperbarui tampilan array
        updateLabels();

        // Menampilkan hasil setiap langkah
        stepLog.append("Hasil: ")
               .append(arrayToString(array))
               .append("\n\n");

        stepArea.append(stepLog.toString());

        // Pindah ke elemen berikutnya
        i++;
        stepCount++;

        // Jika sorting selesai
        if (i == array.length) {
            sorting = false;

            // Menonaktifkan tombol step
            stepButton.setEnabled(false);

            // Menampilkan pesan selesai
            JOptionPane.showMessageDialog(this, "Sorting selesai!");
        }
    }
}
	private void updateLabels() {

    // Melakukan perulangan untuk seluruh elemen array
    for (int k = 0; k < array.length; k++) {

        // Mengubah isi label sesuai nilai array
        labelArray[k].setText(String.valueOf(array[k]));
    }
}

private String arrayToString(int[] arr) {

    // Membuat objek StringBuilder
    StringBuilder sb = new StringBuilder();

    // Perulangan untuk menggabungkan isi array menjadi string
    for (int k = 0; k < arr.length; k++) {

        // Menambahkan elemen array ke StringBuilder
        sb.append(arr[k]);

        // Menambahkan koma jika bukan elemen terakhir
        if (k < arr.length - 1)
            sb.append(", ");
    }

    // Mengembalikan hasil string array
    return sb.toString();
}

	private void setArrayFromInput() {
		String text = inputField.getText().trim();
		if (text.isEmpty()) {
			return;
		}
		String[] parts = text.split(",");
		array = new int[parts.length];
			try {
				for (int k = 0; k < parts.length; k++) {
					array[k] = Integer.parseInt(parts[k].trim());
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(this, "Masukkan hanya angka yang dipisahkan " + "dengan koma", JOptionPane.ERROR_MESSAGE);
				return;
			}
		i = 1;
		stepCount = 1;
		sorting = true;
		stepArea.setText("");
		panelArray.removeAll();
		labelArray = new JLabel[array.length];
		for (int k = 0; k < array.length; k++) {
			labelArray[k] = new JLabel(String.valueOf(array[k]));
			labelArray[k].setFont(new Font("Arial", Font.BOLD, 24));
			labelArray[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			labelArray[k].setPreferredSize(new Dimension(50, 50));
			labelArray[k].setHorizontalAlignment(SwingConstants.CENTER);
			panelArray.add(labelArray[k]);
	
		}
		panelArray.revalidate();
		panelArray.repaint();
	}
		updateArrayDisplay();
		stepButton.setEnabled(true);
		sorting = true;
		i = 1;
		j = i - 1;
		stepCount = 1;
		stepArea.setText("");
	}

}
