import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;


public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField humanField;
	private JTextField dogField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton newHumanButton = new JButton("New human");
		newHumanButton.setBounds(234, 58, 117, 25);
		contentPane.add(newHumanButton);
		
		JLabel lblHumansAndDogs = new JLabel("Humans and dogs");
		lblHumansAndDogs.setBounds(149, 23, 159, 23);
		lblHumansAndDogs.setFont(new Font("Ubuntu", Font.BOLD, 19));
		contentPane.add(lblHumansAndDogs);
		
		JButton buyDogButton = new JButton("Buy dog");
		buyDogButton.setBounds(234, 97, 117, 25);
		contentPane.add(buyDogButton);
		
		JButton showInfoButton = new JButton("Show info");
		showInfoButton.setBounds(234, 134, 117, 25);
		contentPane.add(showInfoButton);
		
		humanField = new JTextField();
		humanField.setBounds(108, 61, 114, 19);
		contentPane.add(humanField);
		humanField.setColumns(10);
		
		dogField = new JTextField();
		dogField.setBounds(108, 100, 114, 19);
		contentPane.add(dogField);
		dogField.setColumns(10); 
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 192, 426, 96);
		contentPane.add(scrollPane);
		
		JTextArea infoArea = new JTextArea();
		scrollPane.setViewportView(infoArea);
	}
}
