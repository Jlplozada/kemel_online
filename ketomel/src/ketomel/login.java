package ketomel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textClave;
	private JTextField textUser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setTitle("KEMEL");
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 270, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textUser = new JTextField();
		textUser.setHorizontalAlignment(SwingConstants.CENTER);
		textUser.setToolTipText("");
		textUser.setBounds(28, 112, 202, 20);
		contentPane.add(textUser);
		textUser.setColumns(10);
		
		textClave = new JTextField();
		textClave.setHorizontalAlignment(SwingConstants.CENTER);
		textClave.setBounds(28, 152, 202, 20);
		contentPane.add(textClave);
		textClave.setColumns(10);
		
		JButton buttonRegistro = new JButton("REGISTRARSE");
		buttonRegistro.setBackground(new Color(95, 28, 35));
		buttonRegistro.setForeground(new Color(255, 255, 255));
		buttonRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonRegistro.setBounds(65, 201, 120, 23);
		contentPane.add(buttonRegistro);
		
		JButton buttonIngresar = new JButton("INGRESAR");
		buttonIngresar.setForeground(new Color(255, 255, 255));
		buttonIngresar.setBackground(new Color(95, 28, 35));
		buttonIngresar.setBounds(65, 176, 120, 23);
		contentPane.add(buttonIngresar);
		
		JLabel labelUsuario = new JLabel("Usuario");
		labelUsuario.setBounds(97, 93, 46, 14);
		contentPane.add(labelUsuario);
		
		JLabel labelClave = new JLabel("Contraseña");
		labelClave.setBounds(91, 136, 69, 14);
		contentPane.add(labelClave);
	}
}
