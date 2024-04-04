import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vegi {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_6;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vegi window = new vegi();
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
	public vegi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 128, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to the vegetarian menu");
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(50, 20, 311, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Choose what your wish to eat");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(60, 46, 284, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Pasto il roca");
		rdbtnNewRadioButton.setActionCommand("Pasto il roca");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		rdbtnNewRadioButton.setBounds(50, 80, 111, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Pasto il hoja");
		rdbtnNewRadioButton_1.setActionCommand("Pasto il hoja");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		rdbtnNewRadioButton_1.setBounds(233, 80, 111, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter quantity");
		lblNewLabel_2.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(30, 124, 96, 32);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(136, 127, 123, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Status: ");
		lblNewLabel_3.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(77, 164, 49, 27);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Not Ordered");
		lblNewLabel_4.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(136, 166, 131, 23);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Final price: ");
		lblNewLabel_5.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(30, 214, 96, 27);
		frame.getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("0000");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(100, 212, 111, 31);
		frame.getContentPane().add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Prepare my order");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(buttonGroup.getSelection().getActionCommand().equals("Pasto il roca")) {
					int a=0;
					int total;
					a= Integer.parseInt(textField.getText());
					
					total=a*20000;
					
					lblNewLabel_4.setText("Ordered");
					lblNewLabel_6.setText("$"+total);
				}
				if(buttonGroup.getSelection().getActionCommand().equals("Pasto il hoja")) {
					int a=0;
					int total;
					a= Integer.parseInt(textField.getText());
					
					total= a*15000;
					
					lblNewLabel_4.setText("Ordered");
					lblNewLabel_6.setText("$"+total);
				}
			}
		});
		btnNewButton.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		btnNewButton.setBounds(233, 176, 181, 65);
		frame.getContentPane().add(btnNewButton);
	}
}
