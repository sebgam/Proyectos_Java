import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.org.apache.bcel.internal.generic.NEW;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Toolkit;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.ComponentOrientation;
import javax.swing.ImageIcon;
import java.awt.Window.Type;
import java.util.Locale;

public class ventana2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtSalario;
	private ButtonGroup botones = new ButtonGroup();
	
	public ventana2() {
		setLocale(new Locale("es", "CO"));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\Pictures\\mi logo\\Pack de iconos\\all_icons_by_Icons8_free\\windows10\\PNG\\16\\Programming\\edit_property-16.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 295);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(76, 37, 46, 14);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBorder(new LineBorder(Color.BLACK, 2, true));
		txtNombre.setBounds(147, 34, 220, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(76, 62, 46, 14);
		contentPane.add(lblEdad);
		
		final JComboBox cbEdad = new JComboBox();
		cbEdad.setModel(new DefaultComboBoxModel(new String[] {"15-25", "26-35", "36-45", "46-55", "56-65"}));
		cbEdad.setBounds(147, 65, 75, 20);
		contentPane.add(cbEdad);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(76, 109, 46, 14);
		contentPane.add(lblSexo);
		
				
		JRadioButton rbMasculino = new JRadioButton("Masculino");
		rbMasculino.setBounds(136, 105, 109, 23);
		contentPane.add(rbMasculino);
		
		JRadioButton rbFemenino = new JRadioButton("Femenino");
		rbFemenino.setBounds(136, 131, 109, 23);
		contentPane.add(rbFemenino);
		
		botones.add(rbMasculino);
		botones.add(rbFemenino);
		
		JLabel lblNewLabel = new JLabel("Salario");
		lblNewLabel.setBounds(76, 182, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtSalario = new JTextField();
		txtSalario.setBounds(136, 183, 86, 20);
		contentPane.add(txtSalario);
		txtSalario.setColumns(10);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\mi logo\\Pack de iconos\\all_icons_by_Icons8_free\\office\\PNG\\16\\Data\\edit_row-16.png"));
		btnIngresar.setBackground(Color.WHITE);
		btnIngresar.setBorder(new LineBorder(Color.GREEN, 2, true));
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String mensaje,sexo;
				if(rbMasculino.isSelected()){
					sexo="masculino";
				}else{
					if(rbFemenino.isSelected()){
						sexo= "Femenino";
					}else{
						sexo="";
					}
				}
				mensaje = txtNombre.getText() + " tiene un rango de edad entre " + cbEdad.getSelectedItem() + " tu sexo es " + sexo + " y tiene un salario de $" + txtSalario.getText();
				JOptionPane.showMessageDialog(null,mensaje);
				
			}
		});
		btnIngresar.setBounds(312, 182, 89, 23);
		contentPane.add(btnIngresar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\mi logo\\Pack de iconos\\all_icons_by_Icons8_free\\windows10\\PNG\\16\\User_Interface\\exit-16.png"));
		btnSalir.setBorder(new LineBorder(Color.RED, 2, true));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(312, 212, 89, 23);
		contentPane.add(btnSalir);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(76, 98, 291, 11);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(76, 172, 291, -8);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(75, 162, 292, 2);
		contentPane.add(separator_2);
	}
}
