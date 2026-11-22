package OnlineOrderSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import java.awt.Color;
import java.awt.Component;
import javax.swing.border.TitledBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JTextField;

public class Food {

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
					Food window = new Food();
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
	public Food() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 474);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Food");
		lblNewLabel.setBackground(new Color(255, 128, 0));
		lblNewLabel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 128, 0)));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 414, 66);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(10, 88, 414, 89);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Food.class.getResource("/images/burger.png")));
		lblNewLabel_1.setBounds(10, 11, 67, 67);
		panel.add(lblNewLabel_1);
		
		JTextPane txtpnCreamyDoubleCheese = new JTextPane();
		txtpnCreamyDoubleCheese.setText("Creamy Double Cheese Burger");
		txtpnCreamyDoubleCheese.setBounds(101, 11, 150, 45);
		panel.add(txtpnCreamyDoubleCheese);
		
		JLabel lblNewLabel_2 = new JLabel("200 BDT");
		lblNewLabel_2.setBounds(101, 67, 78, 14);
		panel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(318, 25, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2_3 = new JLabel("Add Qty");
		lblNewLabel_2_3.setBounds(343, 11, 46, 14);
		panel.add(lblNewLabel_2_3);
		
		JButton btnNewButton_2 = new JButton("Ok");
		btnNewButton_2.setBounds(343, 55, 61, 23);
		panel.add(btnNewButton_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(10, 188, 414, 89);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(Food.class.getResource("/images/pizza.png")));
		lblNewLabel_1_1.setBounds(10, 11, 67, 67);
		panel_1.add(lblNewLabel_1_1);
		
		JTextPane txtpnGrilledChickenPizza = new JTextPane();
		txtpnGrilledChickenPizza.setText("Grilled Chicken Pizza Large");
		txtpnGrilledChickenPizza.setBounds(101, 11, 150, 45);
		panel_1.add(txtpnGrilledChickenPizza);
		
		JLabel lblNewLabel_2_1 = new JLabel("1350 BDT");
		lblNewLabel_2_1.setBounds(101, 64, 80, 14);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_4 = new JLabel("Add Qty");
		lblNewLabel_2_4.setBounds(346, 11, 46, 14);
		panel_1.add(lblNewLabel_2_4);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(318, 24, 86, 20);
		panel_1.add(textField_1);
		
		JButton btnNewButton_2_1 = new JButton("Ok");
		btnNewButton_2_1.setBounds(346, 55, 58, 23);
		panel_1.add(btnNewButton_2_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(192, 192, 192));
		panel_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(10, 288, 414, 89);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon(Food.class.getResource("/images/shake.png")));
		lblNewLabel_1_2.setBounds(10, 11, 67, 67);
		panel_2.add(lblNewLabel_1_2);
		
		JTextPane txtpnOreoMoolkshake = new JTextPane();
		txtpnOreoMoolkshake.setText("Oreo MoolkShake");
		txtpnOreoMoolkshake.setBounds(100, 11, 150, 45);
		panel_2.add(txtpnOreoMoolkshake);
		
		JLabel lblNewLabel_2_2 = new JLabel("150 BDT");
		lblNewLabel_2_2.setBounds(100, 64, 75, 14);
		panel_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_5 = new JLabel("Add Qty");
		lblNewLabel_2_5.setBounds(347, 11, 46, 14);
		panel_2.add(lblNewLabel_2_5);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(318, 25, 86, 20);
		panel_2.add(textField_2);
		
		JButton btnNewButton_2_2 = new JButton("Ok");
		btnNewButton_2_2.setBounds(343, 55, 61, 23);
		panel_2.add(btnNewButton_2_2);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBounds(253, 401, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Pay");
		btnNewButton_1.setBounds(98, 401, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
