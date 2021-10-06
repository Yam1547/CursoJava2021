package modulo3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Pantalla1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNewLabel_2_1;
	private JLabel lblNewLabel_1_1_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla1 window = new Pantalla1();
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
	public Pantalla1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 10));
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Promedio de notas");
		lblNewLabel.setBounds(116, 11, 240, 21);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1_1 = new JLabel("Nota 1");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 89, 56, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		lblNewLabel_1_1_1 = new JLabel("Nota 2");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(10, 127, 56, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		lblNewLabel_1 = new JLabel("Nota 3");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 165, 72, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(63, 87, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(63, 125, 86, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(63, 163, 86, 20);
		frame.getContentPane().add(textField_2);
		
		
		JLabel lblNewLabel_3 = new JLabel("");	
		lblNewLabel_3.setBounds(351, 98, 56, 56);
		frame.getContentPane().add(lblNewLabel_3);
		
		
		JButton btnNewButton = new JButton("Calcular ");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float nota1 = Float.parseFloat(textField.getText());
				float nota2 = Float.parseFloat(textField_1.getText());
				float nota3 = Float.parseFloat(textField_2.getText());
				
				float promedio = (nota1 +nota2 +nota3)/3;
				lblNewLabel_2_1.setText(Float.toString(promedio));
							
				
				if(promedio >=7) {
					lblNewLabel_2_1.setForeground(Color.blue);				
					lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\yjr15\\Downloads\\icons8-koya-bt21-48.png"));
					
				} else {
					lblNewLabel_2_1.setForeground(Color.red);
					lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\yjr15\\Downloads\\icons8-scream-48.png"));
				}
			}
		});
		
		btnNewButton.setBounds(179, 213, 114, 37);
		frame.getContentPane().add(btnNewButton);
		
		
		lblNewLabel_2 = new JLabel("Promedio");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblNewLabel_2.setBounds(259, 88, 72, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_2_1 = new JLabel("Resultado");
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setBackground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(255, 113, 86, 41);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		
		
	}
}
