package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Tablero;
import vista.BoardPanel;
import vista.VentanaGameOver;

public class ControladorFinJuego implements ActionListener{
	private VentanaGameOver ventana;
	
	public ControladorFinJuego(VentanaGameOver ventanaGameOver) {
		this.ventana=ventanaGameOver;
	}
	
	public void setAction() {
		ventana.getBtnNo().addActionListener(this);
		ventana.getBtnSi().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource().equals(ventana.getBtnNo())) {
			System.exit(0);
		}
		
		if(arg0.getSource().equals(ventana.getBtnSi())) {
			Tablero nuevoTablero=new Tablero();
			BoardPanel newGame=new BoardPanel(nuevoTablero);
			newGame.setVisible(true);
		}
		
	}

}
