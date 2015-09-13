package sys_face;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class search_face {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					search_face window = new search_face();
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
	public search_face() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(177, 59, 122, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("\u8D77\u70B9\uFF1A");
		label.setBounds(124, 59, 43, 16);
		frame.getContentPane().add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(301, 59, 32, 21);
		frame.getContentPane().add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setBounds(177, 129, 122, 21);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_1 = new JLabel("\u7EC8\u70B9\uFF1A");
		label_1.setBounds(124, 129, 43, 16);
		frame.getContentPane().add(label_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(301, 129, 32, 21);
		frame.getContentPane().add(comboBox_1);
		
		JButton button = new JButton("\u67E5\u8BE2");
		button.setBounds(184, 207, 93, 23);
		frame.getContentPane().add(button);
	}
}
