package dataCenter;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class AuthenticationForm extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5586229190291319884L;
	private JPanel contentPane;
	private JTextField txtUserName;
	private JPasswordField txtPassCode;
	private JButton btnLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AuthenticationForm frame = new AuthenticationForm();
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
	public AuthenticationForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbluserName = new JLabel("Username:");
		lbluserName.setBounds(158, 58, 62, 16);
		contentPane.add(lbluserName);
		
		txtUserName = new JTextField();
		txtUserName.setBounds(158, 73, 133, 20);
		txtUserName.setToolTipText("Enter Username");
		contentPane.add(txtUserName);
		txtUserName.setColumns(10);
		
		JLabel lblpassCode = new JLabel("Password:");
		lblpassCode.setBounds(158, 104, 59, 16);
		contentPane.add(lblpassCode);
		
		txtPassCode = new JPasswordField();
		txtPassCode.setBounds(158, 123, 133, 20);
		contentPane.add(txtPassCode);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if()
				dispose();
			}
		});
		btnLogin.setBounds(158, 150, 133, 20);
		contentPane.add(btnLogin);
	}
}
