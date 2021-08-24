package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Tablero;
import vista.BoardPanel;
import vista.MainWindow;

public class ControladorJuego implements ActionListener{
	private MainWindow vistaJuego;
	private Tablero modeloTablero;
	
	public ControladorJuego(MainWindow panel) {
		this.vistaJuego=panel;
	}
	
	public void setActionBoton() {
		vistaJuego.getBtnJugar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		modeloTablero=new Tablero();
		BoardPanel ventanaJuego=new BoardPanel(modeloTablero);
		ventanaJuego.setVisible(true);
		
	}
}
