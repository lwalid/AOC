package nounou.memento;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	int current=-1;
	Createur createur= new Createur();
	Consierge consierge = new Consierge();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
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
	public Frame() {


		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setBounds(51, 34, 514, 201);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton save = new JButton("save");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				createur.SetArticle(textField.getText());
				consierge.addMemento(createur.storeInMemento());
				current++;
				System.out.println("current = "+current);

			}
		});
		save.setBounds(43, 313, 117, 25);
		contentPane.add(save);

		JButton annuler = new JButton("annuler");
		annuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(current>=0){	
					if(current==0)
						textField.setText(consierge.getMemento(current).getSavedArticle());
					else{
						current--;
						textField.setText(consierge.getMemento(current).getSavedArticle());
						System.out.println(consierge.getMemento(current).getSavedArticle());
					}

				}
				else{
					annuler.setEnabled(false);
				}
			}
		});
		annuler.setBounds(249, 313, 117, 25);
		contentPane.add(annuler);


	}
}
