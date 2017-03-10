import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Point;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;

public class login extends JFrame {

	private JPanel contentPane;
	public static JTextField txtUser;
	public static JPasswordField txtPass;

	
	public login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\Pictures\\mi logo\\Pack de iconos\\all_icons_by_Icons8_free\\iOS7\\PNG\\25\\User_Interface\\login_rounded_right-25.png"));
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 393, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INICIAR SESION");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 21));
		lblNewLabel.setBounds(108, 25, 166, 31);
		contentPane.add(lblNewLabel);
		
		txtUser = new JTextField();
		txtUser.setBounds(93, 121, 181, 20);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 15));
		lblNewLabel_1.setBounds(156, 77, 59, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Calibri", Font.BOLD, 15));
		lblContrasea.setBounds(140, 158, 107, 32);
		contentPane.add(lblContrasea);
		final datosUsuario data = new datosUsuario();
		final ventana2 window = new ventana2();
		
		JButton btnIniciar = new JButton("Iniciar Sesion");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(data.probarPass()==1){
					
					window.setVisible(true);
					dispose();
					
				}else{
					JOptionPane.showMessageDialog(null, "error usuario o contraseña incorrectos");
				}
			}
		});
		btnIniciar.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\mi logo\\Pack de iconos\\all_icons_by_Icons8_free\\iOS7\\PNG\\25\\Data\\transfer_between_users-25.png"));
		btnIniciar.setBorder(new LineBorder(Color.GREEN, 2, true));
		btnIniciar.setBounds(39, 261, 115, 31);
		contentPane.add(btnIniciar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setIconTextGap(3);
		btnSalir.setMinimumSize(new Dimension(15, 15));
		btnSalir.setMaximumSize(new Dimension(15, 15));
		btnSalir.setLocation(new Point(1, 3));
		btnSalir.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\mi logo\\Pack de iconos\\all_icons_by_Icons8_free\\windows10\\PNG\\16\\User_Interface\\exit-16.png"));
		btnSalir.setAlignmentX(Component.RIGHT_ALIGNMENT);
		btnSalir.setBackground(Color.WHITE);
		btnSalir.setBorder(new LineBorder(Color.RED, 2, true));
		btnSalir.setBounds(230, 261, 115, 31);
		contentPane.add(btnSalir);
		
		txtPass = new JPasswordField();
		txtPass.setBounds(93, 211, 181, 20);
		contentPane.add(txtPass);
	}
}
