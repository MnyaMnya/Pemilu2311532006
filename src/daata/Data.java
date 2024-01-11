package daata;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Data {

	private JFrame frame;
	private JTextField namefield;
	private JTextField nimfield;
	private JTextField jurusanfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Data window = new Data();
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
	public Data() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 347);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		namefield = new JTextField();
		namefield.setBounds(60, 65, 311, 20);
		frame.getContentPane().add(namefield);
		namefield.setColumns(10);
		
		nimfield = new JTextField();
		nimfield.setColumns(10);
		nimfield.setBounds(60, 110, 311, 20);
		frame.getContentPane().add(nimfield);
		
		jurusanfield = new JTextField();
		jurusanfield.setColumns(10);
		jurusanfield.setBounds(60, 156, 311, 20);
		frame.getContentPane().add(jurusanfield);
		
		JLabel lblNewLabel = new JLabel("Nama");
		lblNewLabel.setBounds(4, 68, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNim = new JLabel("NIM");
		lblNim.setBounds(4, 113, 46, 14);
		frame.getContentPane().add(lblNim);
		
		JLabel lblJurusan = new JLabel("Jurusan");
		lblJurusan.setBounds(4, 159, 46, 14);
		frame.getContentPane().add(lblJurusan);
		
		JLabel result = new JLabel("tolong input kan text");
		result.setVerticalAlignment(SwingConstants.TOP);
		result.setBounds(32, 234, 339, 67);
		frame.getContentPane().add(result);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(namefield.getText()+" dengan NIM : "+nimfield.getText() +" dengan jurusan: "+jurusanfield.getText());
			}
		});
		btnNewButton.setBounds(67, 194, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				namefield.setText("");
				nimfield.setText("");
				jurusanfield.setText("");
			}
		});
		btnReset.setBounds(288, 194, 89, 23);
		frame.getContentPane().add(btnReset);
	}
}
