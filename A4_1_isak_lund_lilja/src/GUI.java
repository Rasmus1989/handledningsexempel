import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField humanField;
	JTextArea logArea;
	private JTextField dogField;
	Human human;
	JTextArea infoArea;

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
		
		humanField = new JTextField();
		humanField.setBounds(109, 15, 114, 19);
		contentPane.add(humanField);
		humanField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 224, 426, 48);
		contentPane.add(scrollPane);
		
		infoArea = new JTextArea();
		scrollPane.setViewportView(infoArea);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 154, 426, 48);
		contentPane.add(scrollPane_1);
		
		logArea = new JTextArea();
		scrollPane_1.setViewportView(logArea);
		
		JButton newHumanButton = new JButton("New human");
		newHumanButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = humanField.getText();
				if(name.length() > 2) {
					human = new Human(name);
					logArea.append("new human!\n");
				} else {
					logArea.append("Human name must be at least 3 characters!\n");
				}
			}
		});
		newHumanButton.setBounds(235, 12, 117, 25);
		contentPane.add(newHumanButton);
		
		dogField = new JTextField();
		dogField.setBounds(109, 54, 114, 19);
		contentPane.add(dogField);
		dogField.setColumns(10);
		
		JButton buyDogButton = new JButton("Buy dog");
		buyDogButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(human != null) {
					if(!human.hasDog()) {
						String dogName = dogField.getText();
						human.buyDog(new Dog(dogName));
						logArea.append("buy dog!\n");
					} else {
						logArea.append("Human already has dog!\n");
					}
				} else {
					logArea.append("no human \n");
				}
			}
		});
		buyDogButton.setBounds(235, 51, 117, 25);
		contentPane.add(buyDogButton);
		
		JButton showInfoButton = new JButton("Print info");
		showInfoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(human != null) {
					infoArea.append(human.getInfo());
				} else {
					logArea.setText("no human \n");
				}
			}
		});
		showInfoButton.setBounds(235, 88, 117, 25);
		contentPane.add(showInfoButton);
		


	}
}
