package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorJuego;
import modelo.Tablero;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;

public class MainWindow extends JFrame {

	private JPanel contentPane;
	private JButton btnJugar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
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
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 450, 300);
		setTitle("Snake");
		
		
		//IMAGEN DE FONDO
		ImagenFondo imagen=new ImagenFondo();
		getContentPane().add(imagen);
		imagen.setLayout(null);
		
		btnJugar = new JButton("Jugar");
		btnJugar.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnJugar.setBounds(181, 196, 85, 21);
		imagen.add(btnJugar);
		setControlador();
		/*
		btnJugar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		*/
		
		Tablero tab1=new Tablero();
	}
	
	public void setControlador() {
		ControladorJuego controlador=new ControladorJuego(this);
		controlador.setActionBoton();
	}
	
	public JButton getBtnJugar() {
		return this.btnJugar;
	}
}
