import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Restaurant {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurant window = new Restaurant();
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
	public Restaurant() {
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
		
		JLabel lblNewLabel = new JLabel("WELCOME TO TOPASTO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 25));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 22, 416, 55);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Which menu would you like?");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(54, 72, 323, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("ToPasto");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.show(false);
				vegi.main(null);
			}
		});
		btnNewButton.setFont(new Font("Sylfaen", Font.BOLD, 18));
		btnNewButton.setBackground(new Color(0, 128, 0));
		btnNewButton.setBounds(54, 118, 123, 55);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Vegetarian");
		lblNewLabel_2.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(64, 184, 97, 35);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Not vegetarian");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(264, 184, 123, 35);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNopasto = new JButton("NoPasto");
		btnNopasto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.show(false);
				notvegi.main(null);
			}
		});
		btnNopasto.setFont(new Font("Sylfaen", Font.BOLD, 18));
		btnNopasto.setBackground(new Color(0, 128, 0));
		btnNopasto.setBounds(254, 118, 123, 55);
		frame.getContentPane().add(btnNopasto);
	}
}
