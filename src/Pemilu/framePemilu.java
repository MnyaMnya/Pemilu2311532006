package Pemilu;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class framePemilu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textName;
	private JTextField textAge;
	private JComboBox cbMenikah;
	private JLabel textResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					framePemilu frame = new framePemilu();
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
	public framePemilu() {
		setTitle("Pemilu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Aplikasi");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel.setBounds(192, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nama");
		lblNewLabel_1.setBounds(20, 70, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textName = new JTextField();
		textName.setBounds(75, 67, 321, 20);
		contentPane.add(textName);
		textName.setColumns(10);
		
		textAge = new JTextField();
		textAge.setColumns(10);
		textAge.setBounds(75, 113, 164, 20);
		contentPane.add(textAge);
		
		JLabel lblNewLabel_1_1 = new JLabel("Umur");
		lblNewLabel_1_1.setBounds(20, 116, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		cbMenikah = new JComboBox();
		cbMenikah.setModel(new DefaultComboBoxModel(new String[] {"Ya", "Tidak"}));
		cbMenikah.setBounds(75, 161, 164, 22);
		contentPane.add(cbMenikah);
		
		JLabel lblNewLabel_2 = new JLabel("Menikah");
		lblNewLabel_2.setBounds(20, 165, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel textResult = new JLabel("");
		textResult.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textResult.setHorizontalAlignment(SwingConstants.CENTER);
		textResult.setBounds(20, 194, 404, 65);
		contentPane.add(textResult);
		
		JButton btnProcess = new JButton("Process");
		btnProcess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(textAge.getText())>=17&&cbMenikah.getSelectedIndex()==0) {
					textResult.setText(textName.getText()+" Terdaftar di DPT");
				}
				else if(Integer.parseInt(textAge.getText())<17&&cbMenikah.getSelectedIndex()==0) {
					textResult.setText(textName.getText()+" Terdaftar di DPT");
				}
				else if(Integer.parseInt(textAge.getText())<17&&cbMenikah.getSelectedIndex()==1) {
					textResult.setText(textName.getText()+" Tidak bisa Memilih di pemilu 2024");
				}
					else {
						textResult.setText(textName.getText()+" Tidak Terdaftar di DPT");
					}
			}
		});
		btnProcess.setBounds(20, 280, 89, 23);
		contentPane.add(btnProcess);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAge.setText("");
				textName.setText("");
				cbMenikah.setSelectedIndex(-1);
				textResult.setText("");
			}
		});
		btnReset.setBounds(335, 280, 89, 23);
		contentPane.add(btnReset);
	}
}
