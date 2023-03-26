import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Ventana extends JFrame{
	
	private String anterior = "login";
	private String actual = "login";
	public JPanel panel = null;
	
	public Ventana() {
			
		this.setVisible(true);
		this.setSize(500, 600);
		this.setLocationRelativeTo(null);
		this.setTitle("Hola mundo");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.cyan);
		
		limpiarVentana();
		
		this.repaint();
		this.revalidate();
		
	}
	
	public void limpiarVentana() {
		
		if(panel!= null) {
			this.remove(panel);
		}
		
		if(actual.equals("login")){
			panel = login(); 
			
			this.add(panel);
			
			this.repaint();
			this.revalidate();
		}
		
		if(actual.equals("registro")){
			panel = registro();
			
			this.add(panel);
			
			this.repaint();
			this.revalidate();
		}
		
	}
	
	public JPanel login()
	{
		
		anterior = actual;
		actual = "login";
		
		JPanel jp1 = new JPanel();
		jp1.setSize(500, 600);
		jp1.setLocation(0, 0);
		jp1.setLayout(null);
		jp1.setBackground(Color.decode("#5ED6DF"));
		
		//titulo
		JLabel title = new JLabel("Registro nuevo usuario",JLabel.CENTER);
		title.setFont(new Font("Comic Sans", Font.BOLD,20));
		title.setSize(280, 40);
		title.setLocation(100, 20);
		title.setOpaque(true);
		title.setBackground(Color.green);
		jp1.add(title);
		
		JLabel tag1 = new JLabel("Ingrese el nombre de usuario: ",JLabel.CENTER);
		tag1.setSize(250, 20);
		tag1.setLocation(120, 80);
		tag1.setOpaque(true);
		tag1.setBackground(Color.black);
		tag1.setForeground(Color.white);
		jp1.add(tag1);
		
		JTextField username = new JTextField("");
		username.setSize(250, 40);
		username.setLocation(120, 100);
		jp1.add(username);
		
		JLabel tag2 = new JLabel("Ingrese la contraseña: ",JLabel.CENTER);
		tag2.setSize(250, 20);
		tag2.setLocation(120, 140);
		tag2.setOpaque(true);
		tag2.setBackground(Color.black);
		tag2.setForeground(Color.white);
		jp1.add(tag2);
		
		JPasswordField password = new JPasswordField();
		password.setSize(250, 40);
		password.setLocation(120, 160);
		jp1.add(password);
		
		JButton btnAccess = new JButton("A C C E D E R");
		btnAccess.setSize(250,40);
		btnAccess.setLocation(120,205);
		jp1.add(btnAccess);
		
		btnAccess.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				anterior = actual;
				actual = "registro";
				
				limpiarVentana();
				
			}
			
		});
		
		this.add(jp1);
		return jp1;
		
	}

	public JPanel registro() {
		
		anterior = actual;
		actual = "registro";
		
		JPanel jp2 = new JPanel();
		jp2.setSize(500, 700);
		jp2.setLocation(0, 0);
		jp2.setLayout(null);
		jp2.setBackground(Color.decode("#C45EDF"));
		
		//titulo
		JLabel titleR = new JLabel("Registro nuevo usuario",JLabel.CENTER);
		titleR.setFont(new Font("Comic Sans", Font.BOLD,20));
		titleR.setSize(280, 40);
		titleR.setLocation(100, 20);
		titleR.setOpaque(true);
		titleR.setBackground(Color.green);
		jp2.add(titleR);
		
		JLabel tag1R = new JLabel("Ingrese el nombre de usuario: ",JLabel.CENTER);
		tag1R.setSize(250, 20);
		tag1R.setLocation(120, 80);
		tag1R.setOpaque(true);
		tag1R.setBackground(Color.black);
		tag1R.setForeground(Color.white);
		jp2.add(tag1R);
		
		JTextField usernameR = new JTextField("");
		usernameR.setSize(250, 40);
		usernameR.setLocation(120, 100);
		jp2.add(usernameR);
		
		JLabel tag2R = new JLabel("Ingrese el correo electrónico: ",JLabel.CENTER);
		tag2R.setSize(250, 20);
		tag2R.setLocation(120, 140);
		tag2R.setOpaque(true);
		tag2R.setBackground(Color.black);
		tag2R.setForeground(Color.white);
		jp2.add(tag2R);
		
		JPasswordField passwordR = new JPasswordField();
		passwordR.setSize(250, 40);
		passwordR.setLocation(120, 160);
		jp2.add(passwordR);
		
		JLabel tag3 = new JLabel("Ingrese el nombre: ",JLabel.CENTER);
		tag3.setSize(250, 20);
		tag3.setLocation(120, 210);
		tag3.setOpaque(true);
		tag3.setBackground(Color.black);
		tag3.setForeground(Color.white);
		jp2.add(tag3);
		
		JTextField name = new JTextField("");
		name.setSize(250, 40);
		name.setLocation(120, 250);
		jp2.add(name);
		
		JLabel tag4 = new JLabel("Ingrese el nombre: ",JLabel.CENTER);
		tag4.setSize(250, 20);
		tag4.setLocation(120, 300);
		tag4.setOpaque(true);
		tag4.setBackground(Color.black);
		tag4.setForeground(Color.white);
		jp2.add(tag4);
		
		JTextField lastname = new JTextField("");
		lastname.setSize(250, 40);
		lastname.setLocation(120, 340);
		jp2.add(lastname);
		
		JButton btnAdd = new JButton("R E G I S T R O");
		btnAdd.setSize(250,40);
		btnAdd.setLocation(120, 390);
		jp2.add(btnAdd);
		
		btnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				anterior = actual;
				actual = "login";
				
				limpiarVentana();
				
			}
			
		});
		
		return jp2;
	}
}