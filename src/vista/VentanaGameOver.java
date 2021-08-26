package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import controlador.ControladorFinJuego;

import javax.swing.JButton;

public class VentanaGameOver extends JFrame{
	
	private JButton btnSi;
	private JButton btnNo;
	
	public VentanaGameOver() {
		getContentPane().setLayout(null);
		
		setSize(450,300);
		setTitle("Fin del juego");
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 436, 55);
		getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Game Over");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 32));
		lblNewLabel.setForeground(Color.RED);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
		panel_1.setForeground(Color.GREEN);
		panel_1.setBounds(0, 267, 436, -213);
		getContentPane().add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("\u00BFJugar otra vez?");
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.PLAIN, 23));
		lblNewLabel_1.setBounds(137, 81, 173, 55);
		getContentPane().add(lblNewLabel_1);
		
		btnSi = new JButton("S\u00ED");
		btnSi.setBackground(Color.GREEN);
		btnSi.setFont(new Font("Sylfaen", Font.PLAIN, 10));
		btnSi.setBounds(109, 146, 85, 21);
		getContentPane().add(btnSi);
		
		btnNo = new JButton("No");
		btnNo.setBackground(Color.RED);
		btnNo.setFont(new Font("Sylfaen", Font.PLAIN, 10));
		btnNo.setBounds(225, 146, 85, 21);
		getContentPane().add(btnNo);
		
		ControladorFinJuego control=new ControladorFinJuego(this);
		control.setAction();
	}

	public JButton getBtnSi() {
		return btnSi;
	}

	public void setBtnSi(JButton btnSi) {
		this.btnSi = btnSi;
	}

	public JButton getBtnNo() {
		return btnNo;
	}

	public void setBtnNo(JButton btnNo) {
		this.btnNo = btnNo;
	}
}
