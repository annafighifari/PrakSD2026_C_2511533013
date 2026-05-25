package pekan8_2511533013;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
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
import javax.swing.SwingUtilities;

public class BubbleSortGUI_2511533013 extends JFrame {
	private static final long serialVersionUID = 1L;
	private int[] array_3013;
	private JLabel[] labelArray_3013;
	private JButton stepButton_3013, resetButton_3013, setButton_3013;
	private JTextField inputField_3013;
	private JPanel panelArray_3013;
	private JTextArea stepArea_3013;
	
	private int i_3013 = 1, j_3013;
	private boolean sorting_3013 = false;
	private int stepCount_3013 = 1;
	

	/**
	 * Create the frame.
	 */
	public BubbleSortGUI_2511533013() {
	    setTitle("Bubble Sort Langkah per Langkah");
	    setSize(772, 400);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLocationRelativeTo(null);
	    getContentPane().setLayout(new BorderLayout());

	    // Panel input
	    JPanel inputPanel_3013 = new JPanel(new FlowLayout());
	    inputField_3013 = new JTextField(30);
	    setButton_3013 = new JButton("Set Array");
	    inputPanel_3013.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
	    inputPanel_3013.add(inputField_3013);
	    inputPanel_3013.add(setButton_3013);

	    // Panel array visual
	    panelArray_3013 = new JPanel();
	    panelArray_3013.setLayout(new FlowLayout());

	    // Panel kontrol
	    JPanel controlPanel_3013 = new JPanel();
	    stepButton_3013 = new JButton("Langkah Selanjutnya");
	    resetButton_3013 = new JButton("Reset");
	    stepButton_3013.setEnabled(false);
	    controlPanel_3013.add(stepButton_3013);
	    controlPanel_3013.add(resetButton_3013);
	    // Area teks untuk log langkah-langkah
	    stepArea_3013 = new JTextArea(8, 60);
	    stepArea_3013.setEditable(false);
	    stepArea_3013.setFont(new Font("Monospaced", Font.PLAIN, 14));
	    JScrollPane scrollPane_3013 = new JScrollPane(stepArea_3013);

	    // Tambahkan panel ke frame
	    getContentPane().add(inputPanel_3013, BorderLayout.NORTH);
	    getContentPane().add(panelArray_3013, BorderLayout.CENTER);
	    getContentPane().add(controlPanel_3013, BorderLayout.SOUTH);
	    getContentPane().add(scrollPane_3013, BorderLayout.EAST);

	    // Event Set Array
	    setButton_3013.addActionListener(e -> setArrayFromInput());

	    // Event Langkah Selanjutnya
	    stepButton_3013.addActionListener(e -> performStep());

	    // Event Reset
	    resetButton_3013.addActionListener(e -> reset());
	}
	private void setArrayFromInput() {
	    String text_3013 = inputField_3013.getText().trim();
	    if (text_3013.isEmpty()) return;
	    String[] parts_3013 = text_3013.split(",");
	    array_3013 = new int[parts_3013.length];
	    try {
	        for (int k_3013 = 0; k_3013 < parts_3013.length; k_3013++) {
	            array_3013[k_3013] = Integer.parseInt(parts_3013[k_3013].trim());
	        }
	    } catch (NumberFormatException e) {
	        JOptionPane.showMessageDialog(this, "Masukkan hanya angka "
	                + "yang dipisahkan koma!", "Error", JOptionPane.ERROR_MESSAGE);
	        return;
	    }
	    i_3013 = 0;
	    j_3013 = 0;
	    stepCount_3013 = 1;
	    sorting_3013 = true;
	    stepButton_3013.setEnabled(true);
	    stepArea_3013.setText("");
	    panelArray_3013.removeAll();
	    labelArray_3013 = new JLabel[array_3013.length];
	    for (int k_3013 = 0; k_3013 < array_3013.length; k_3013++) {
	        labelArray_3013[k_3013] = new JLabel(String.valueOf(array_3013[k_3013]));
	        labelArray_3013[k_3013].setFont(new Font("Arial", Font.BOLD, 24));
	        labelArray_3013[k_3013].setOpaque(true);
	        labelArray_3013[k_3013].setBackground(Color.WHITE);
	        labelArray_3013[k_3013].setBorder(BorderFactory.createLineBorder(Color.BLACK));
	        labelArray_3013[k_3013].setPreferredSize(new Dimension(50, 50));
	        labelArray_3013[k_3013].setHorizontalAlignment(SwingConstants.CENTER);
	        panelArray_3013.add(labelArray_3013[k_3013]);
	    }

	    panelArray_3013.revalidate();
	    panelArray_3013.repaint();
	}
	private void performStep() {
	    if (!sorting_3013 || i_3013 >= array_3013.length - 1) {
	        sorting_3013 = false;
	        stepButton_3013.setEnabled(false);
	        JOptionPane.showMessageDialog(this, "Sorting selesai!");
	        return;
	    }
	    resetHighlights();
	    StringBuilder stepLog_3013 = new StringBuilder();
	    labelArray_3013[j_3013].setBackground(Color.CYAN);
	    labelArray_3013[j_3013 + 1].setBackground(Color.CYAN);
	    if (array_3013[j_3013] > array_3013[j_3013 + 1]) {
	        // Swap
	        int temp_3013 = array_3013[j_3013];
	        array_3013[j_3013] = array_3013[j_3013 + 1];
	        array_3013[j_3013 + 1] = temp_3013;
	        labelArray_3013[j_3013].setBackground(Color.RED);
	        labelArray_3013[j_3013 + 1].setBackground(Color.RED);
	        stepLog_3013.append("Langkah ").append(stepCount_3013).append(": Menukar elemen ke-")
	                .append(j_3013).append(" (").append(array_3013[j_3013 + 1]).append(") dengan ke-")
	                .append(j_3013 + 1).append(" (").append(array_3013[j_3013]).append(")\n");
	    } else {
	        stepLog_3013.append("Langkah ").append(stepCount_3013).append(": Tidak ada pertukaran antara ke-")
	                .append(j_3013).append(" dan ke-").append(j_3013 + 1).append("\n");
	    }
	    stepLog_3013.append("Hasil: ").append(arrayToString(array_3013)).append("\n\n");
	    stepArea_3013.append(stepLog_3013.toString());
	    updateLabels();
	    j_3013++;
	    if (j_3013 >= array_3013.length - i_3013 - 1) {
	        j_3013 = 0;
	        i_3013++;
	    }
	    stepCount_3013++;
	    if (i_3013 >= array_3013.length - 1) {
	        sorting_3013 = false;
	        stepButton_3013.setEnabled(false);
	        JOptionPane.showMessageDialog(this, "Sorting selesai!");
	    }
	}
	private void updateLabels() {
	    for (int k_3013 = 0; k_3013 < array_3013.length; k_3013++) {
	        labelArray_3013[k_3013].setText(String.valueOf(array_3013[k_3013]));
	    }
	}

	private void resetHighlights() {
	    for (JLabel label_3013 : labelArray_3013) {
	        label_3013.setBackground(Color.WHITE);
	    }
	}

	private void reset() {
	    inputField_3013.setText("");
	    panelArray_3013.removeAll();
	    panelArray_3013.revalidate();
	    panelArray_3013.repaint();
	    stepArea_3013.setText("");
	    stepButton_3013.setEnabled(false);
	    sorting_3013 = false;
	    i_3013 = 0;
	    j_3013 = 0;
	    stepCount_3013 = 1;
	}

	private String arrayToString(int[] arr_3013) {
	    StringBuilder sb_3013 = new StringBuilder();
	    for (int k_3013 = 0; k_3013 < arr_3013.length; k_3013++) {
	        sb_3013.append(arr_3013[k_3013]);
	        if (k_3013 < arr_3013.length - 1) sb_3013.append(", ");
	    }
	    return sb_3013.toString();
	}
	public static void main(String[] args) {
    	SwingUtilities.invokeLater(() -> {
    		BubbleSortGUI_2511533013 gui_3013 = new BubbleSortGUI_2511533013();
    		gui_3013.setVisible(true);
    	});
    }
}