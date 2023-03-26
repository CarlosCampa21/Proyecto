import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	
	public Ventana() {
		this.setVisible(true);//VENTANA VISIBLE
		this.setSize(500, 500);//TAMAÑO DE LA VENTANA
		this.setLocationRelativeTo(null);//UBICACION DE LA VENTANA	
		this.setTitle("Hola mundo");
		
		this.setResizable(true);//PERMITIR LA MODIFICACION DEL TAMAÑO DE LA VENTANA
		this.setLayout(null);//DIVIDE EL PANEL EN SECCIONES PARA ACOMODAR LOS ELEMENTOS DENTRO DE LA VENTANA
		
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//CERRAR LA VENTANA AL FINAL DE EJECUTARLO
		
	
			
			
			JLabel tito= new JLabel("Panel de Usuario",JLabel.CENTER);
			tito.setSize(200,40);//TAMAÑO DEL BOTON
			tito.setLocation(150,20);//UBICAR LA POSICION DEL BOTON
			tito.setOpaque(true);//HABILITAR EL CAMBIO DE ALGUNOS COLORES
			tito.setBackground(Color.RED);//CAMBIO DE COLORES
			tito.setForeground(Color.blue);
	
			this.add(tito);//APARECER BOTÓN EN LA VENTANA

			JTextField username = new JTextField();
			username.setSize(250,40);
			username.setLocation(120,80);
			this.add(username);
			
			JPasswordField password = new JPasswordField();
			password.setSize(250,40);
			password.setLocation(120,120);
			this.add(password);
			JButton acceder = new JButton("Acceder");
			acceder.setSize(100,40);
			acceder.setLocation(200,190);
			this.add(acceder);

			JButton b1 = new JButton("ACCEDER");
			b1.setSize(135,40);
			b1.setLocation(225,310);
			b1.setBackground(Color.orange);
			this.add(b1);
			
			b1.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					/*JDialog v2 = new JDialog();
					v2.setVisible(true);
					v2.setTitle("Sub ventana");
					v2.setLocation(200,200);
					v2.setLocationRelativeTo(b1);
					*/
					JOptionPane.showMessageDialog(b1,"Usuario y/o contraseña incorrecta","TITULO",JOptionPane.QUESTION_MESSAGE);
				}
			});
			
		this.repaint();/*PINTA TODOS LOS ELEMENTOS DENTRO DE LA VENTANA,
		VA A LO ULTIMO DE LOS ELEMENTOS (SIN LA NECESIDAD DE REFRESCAR LA VENTANA MANUALMENTE)*/
	}
}
