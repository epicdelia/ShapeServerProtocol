import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class DialogGUI extends JFrame {

	private JPanel contentPane;
	private JTextField ip_address;
	private JTextField port_number;
	private JTextField n;
	private JTextField post_string;

	private JTextArea result;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogGUI frame = new DialogGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Constructor
	 * @return 
	 */
	public void Server() {
		
		
		post_string = new JTextField();
		post_string.setEditable(false);
		post_string.addActionListener(
				
				new ActionListener(){
					
					public void actionPerformed(ActionEvent event){
					
						sendMessage(event.getActionCommand());
						post_string.setText("");
						
				}
				
				}		
			
				);

		post_string.setColumns(10);
		post_string.setBounds(533, 137, 191, 33);
		contentPane.add(post_string);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 765, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGet = new JButton("GET");
		btnGet.setBounds(44, 189, 334, 39);
		contentPane.add(btnGet);
		
		JButton POSTbutton = new JButton("POST");
		POSTbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		POSTbutton.setBounds(419, 189, 305, 39);
		contentPane.add(POSTbutton);
		
		JLabel lblServerIpAddress = new JLabel("Server IP address:");
		lblServerIpAddress.setBounds(44, 33, 216, 33);
		contentPane.add(lblServerIpAddress);
		
		ip_address = new JTextField();
		ip_address.setBounds(187, 33, 191, 33);
		contentPane.add(ip_address);
		ip_address.setColumns(10);
		
		JLabel lblPortNumber = new JLabel("Port Number:");
		lblPortNumber.setBounds(419, 33, 216, 33);
		contentPane.add(lblPortNumber);
		
		port_number = new JTextField();
		port_number.setColumns(10);
		port_number.setBounds(533, 33, 191, 33);
		contentPane.add(port_number);
		
		n = new JTextField();
		n.setColumns(10);
		n.setBounds(187, 137, 191, 33);
		contentPane.add(n);
		
		JLabel label_2 = new JLabel("String N:");
		label_2.setBounds(44, 137, 216, 33);
		contentPane.add(label_2);
		
		JLabel lblSendToServer = new JLabel("Send to Server:");
		lblSendToServer.setBounds(419, 137, 216, 33);
		contentPane.add(lblSendToServer);
		
		JButton button = new JButton("CONNECT");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBounds(44, 82, 334, 39);
		contentPane.add(button);
		
		JButton button_1 = new JButton("DISCONNECT");
		button_1.setBounds(419, 82, 305, 39);
		contentPane.add(button_1);
		
		JLabel lblResult = new JLabel("Result:");
		lblResult.setBounds(44, 271, 216, 33);
		contentPane.add(lblResult);
		
		JTextArea result = new JTextArea();
		result.setBounds(130, 249, 594, 71);
		contentPane.add(result);
	}
}
