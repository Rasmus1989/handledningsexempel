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
	private JTextField dogField;
	private ArrayList<Human> humanList;
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
		
		humanList = new ArrayList<Human>();
		
		humanField = new JTextField();
		humanField.setBounds(108, 61, 114, 19);
		contentPane.add(humanField);
		humanField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 192, 426, 80);
		contentPane.add(scrollPane);
		
		infoArea = new JTextArea();
		scrollPane.setViewportView(infoArea);
		
		JButton newHumanButton = new JButton("New human");
		newHumanButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = humanField.getText();
				if(name.length() > 2) {
					humanList.add(new Human(name));
					infoArea.append("Human added!\n");
				} else {
					infoArea.append("Human name must be at least 3 characters!\n");
				}
			}
		});
		newHumanButton.setBounds(234, 58, 117, 25);
		contentPane.add(newHumanButton);
		
		dogField = new JTextField();
		dogField.setBounds(108, 100, 114, 19);
		contentPane.add(dogField);
		dogField.setColumns(10); 
		
		JLabel lblHumansAndDogs = new JLabel("Humans and dogs");
		lblHumansAndDogs.setBounds(149, 23, 159, 23);
		lblHumansAndDogs.setFont(new Font("Ubuntu", Font.BOLD, 19));
		contentPane.add(lblHumansAndDogs);
		
		JButton buyDogButton = new JButton("Buy dog");
		buyDogButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(humanList.size() != 0) {
					Human lastHuman = humanList.get(humanList.size() - 1);
					if(!lastHuman.hasDog()) {
						String dogName = dogField.getText();
						lastHuman.buyDog(new Dog(dogName));
						infoArea.append("Dog added!\n");
					} else {
						infoArea.append("Human already has dog!\n");
					}
				}
			}
		});
		buyDogButton.setBounds(234, 97, 117, 25);
		contentPane.add(buyDogButton);
		
		JButton showInfoButton = new JButton("Print info");
		showInfoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String info = "";
				for(Human human : humanList) {
					info += human.getInfo() + "\n";
				}
				infoArea.append(info);
			}
		});
		showInfoButton.setBounds(234, 134, 117, 25);
		contentPane.add(showInfoButton);

	}
}
