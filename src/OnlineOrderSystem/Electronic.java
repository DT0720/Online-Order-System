package OnlineOrderSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTextArea;

public class Electronic {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Electronic window = new Electronic();
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
	public Electronic() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 440, 471);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Electronic Devices");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 404, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(20, 64, 394, 89);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Electronic.class.getResource("/images/tv.png")));
		lblNewLabel_1.setBounds(10, 11, 67, 67);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("50,000 BDT");
		lblNewLabel_4.setBounds(87, 70, 107, 14);
		panel.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(298, 24, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Add Qty");
		lblNewLabel_7.setBounds(324, 11, 46, 14);
		panel.add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.setBounds(324, 55, 60, 23);
		panel.add(btnNewButton);
		
		JTextPane txtpnLgSmartTv = new JTextPane();
		txtpnLgSmartTv.setText("LG Smart TV size 36''\r\nFull Color TV\r\n4K UHD Resolution\r\n");
		txtpnLgSmartTv.setBounds(87, 11, 170, 55);
		panel.add(txtpnLgSmartTv);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(20, 176, 394, 89);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Electronic.class.getResource("/images/computer.png")));
		lblNewLabel_2.setBounds(10, 11, 67, 67);
		panel_1.add(lblNewLabel_2);
		
		JTextPane txtpnIntelthGen = new JTextPane();
		txtpnIntelthGen.setText("Intel 12th Gen\r\nCore i5-12400F \r\nGaming Desktop PC");
		txtpnIntelthGen.setBounds(87, 11, 170, 56);
		panel_1.add(txtpnIntelthGen);
		
		JLabel lblNewLabel_5 = new JLabel("80,000 BDT");
		lblNewLabel_5.setBounds(87, 70, 107, 14);
		panel_1.add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setBounds(298, 24, 86, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Add Qty");
		lblNewLabel_8.setBounds(316, 11, 46, 14);
		panel_1.add(lblNewLabel_8);
		
		JButton btnNewButton_1 = new JButton("Ok");
		btnNewButton_1.setBounds(324, 55, 60, 23);
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBackground(new Color(192, 192, 192));
		panel_2.setBounds(20, 288, 394, 89);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Electronic.class.getResource("/images/ac.png")));
		lblNewLabel_3.setBounds(10, 11, 67, 67);
		panel_2.add(lblNewLabel_3);
		
		JTextPane txtpnXiaomiViomiA = new JTextPane();
		txtpnXiaomiViomiA.setText("Xiaomi Viomi A1 1 Ton Split Type Smart Air Conditioner (AC)");
		txtpnXiaomiViomiA.setBounds(87, 11, 170, 55);
		panel_2.add(txtpnXiaomiViomiA);
		
		JLabel lblNewLabel_6 = new JLabel("60,000 BDT");
		lblNewLabel_6.setBounds(87, 70, 110, 14);
		panel_2.add(lblNewLabel_6);
		
		textField_2 = new JTextField();
		textField_2.setBounds(298, 24, 86, 20);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Add Qty");
		lblNewLabel_9.setBounds(317, 11, 46, 14);
		panel_2.add(lblNewLabel_9);
		
		JButton btnNewButton_2 = new JButton("Ok");
		btnNewButton_2.setBounds(324, 55, 60, 23);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Back");
		btnNewButton_3.setBounds(252, 398, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Pay");
		btnNewButton_4.setBounds(104, 398, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
	}
}
