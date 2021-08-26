package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import modelo.Movimiento;
import modelo.Tablero;
import vista.BoardPanel;
import vista.Casilla;
import vista.VentanaGameOver;



public class ControladorJuego implements KeyListener{
	private BoardPanel vista;
	private Tablero modeloTablero;
	private Casilla [][] tablero;
	private Thread hiloMovimiento;

	public ControladorJuego(BoardPanel vista,Tablero modeloTablero, Thread hilo) {
		this.vista=vista;
		this.modeloTablero=modeloTablero;
		this.hiloMovimiento=hilo;
	}
	
	public void setKeyListener() {
		this.tablero=vista.getBoard();
		for (int i = tablero.length - 1; i >= 0; i--) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j].addKeyListener(this);
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getKeyCode()){
			case 37:
				modeloTablero.setDireccion("Izquierda");
				break;
			case 38:
				modeloTablero.setDireccion("Arriba");
				break;
				
			case 39:
				modeloTablero.setDireccion("Derecha");
				break;
			case 40:
				modeloTablero.setDireccion("Abajo");
				break;
			case 27:
				//SUSPEND NO RECOMENDADO
				hiloMovimiento.suspend();
				//VENTANA PAUSA
				break;
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	

	

}
