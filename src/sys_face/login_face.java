package sys_face;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class login_face {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login_face window = new login_face();
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
	public login_face() {
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
		
		JLabel label = new JLabel("\u7528\u6237\u540D\uFF1A");
		label.setBounds(111, 62, 54, 15);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setBounds(171, 62, 122, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("\u5BC6  \u7801\uFF1A");
		label_1.setBounds(111, 123, 52, 15);
		frame.getContentPane().add(label_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(171, 123, 122, 20);
		frame.getContentPane().add(passwordField);
		
		JRadioButton radioButton = new JRadioButton("\u53F8\u673A");
		radioButton.setBounds(249, 176, 121, 23);
		frame.getContentPane().add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("\u7BA1\u7406\u5458");
		radioButton_1.setBounds(126, 176, 121, 23);
		frame.getContentPane().add(radioButton_1);
		
		JButton button = new JButton("\u767B\u9646");
		button.setBounds(165, 217, 93, 23);
		frame.getContentPane().add(button);
	}
}
