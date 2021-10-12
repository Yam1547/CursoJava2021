package modulo4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractListModel;
import javax.swing.ScrollPaneConstants;

public class PantallaConArray {

	private JFrame frame;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaConArray window = new PantallaConArray();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PantallaConArray() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tablas de multiplicar");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel.setBounds(114, 22, 150, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tabla del:");
		lblNewLabel_1.setBounds(24, 53, 62, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		comboBox = new JComboBox();
		//Definí un array de string
		String strTablas[] = new String[16];
		for(int i = 0; i < strTablas.length; i++){
			strTablas[i] = Integer.toString(i);
		}
		comboBox.setModel(new DefaultComboBoxModel(strTablas));
		comboBox.setEditable(true);
		comboBox.setBounds(96, 60, 156, 22);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tabla = comboBox.getSelectedIndex();
		System.out.println("Eligió el " + tabla);
			}
		});
		btnNewButton.setBounds(270, 157, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setBounds(13, 78, 73, 176);
		frame.getContentPane().add(scrollPane);
		
		JList listResult = new JList();
		scrollPane.setViewportView(listResult);
		listResult.setModel(new AbstractListModel() {
			String[] values = new String[] {"2 x 0 = 0", "2 x 1 = 2", "2 x 2 = 4", "2 x 3 = 6", "2 x 4 = 8", "2 x 5 = 10", "2 x 6 = 12", "2 x 7 = 14", "2 x 8 = 16", "2 x 9 = 18", "2 x 10 = 20"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
	}
}
