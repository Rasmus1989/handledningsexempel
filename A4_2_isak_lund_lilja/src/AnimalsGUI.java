import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JLabel;


public class AnimalsGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalsGUI frame = new AnimalsGUI();
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
	public AnimalsGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 27, 440, 240);
		contentPane.add(scrollPane);
		
		JTextArea animalsList = new JTextArea();
		scrollPane.setViewportView(animalsList);
		
		JLabel lblA = new JLabel("Animals");
		lblA.setBounds(5, 0, 70, 15);
		contentPane.add(lblA);
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(new Dog("canis latrans", 3, true, "noname"));
		animalList.add(new Dog("canis latrans", 3, true, "karo"));
		Cat cat = new Cat("lynx lynx", 5, 4);
		cat.setFriendlyName("missen");
		animalList.add(cat);
		animalList.add(new Cat("lynx lynx", 5, 4));
		animalList.add(new Snake("python regius", true));
		
		for(Animal animal : animalList) {
			animalsList.append(animal.getInfo() + "\n");
		}
	}
}
