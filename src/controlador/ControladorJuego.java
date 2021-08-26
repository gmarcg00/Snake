package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import modelo.Tablero;
import vista.BoardPanel;
import vista.Casilla;
import vista.VentanaGameOver;



public class ControladorJuego implements KeyListener{
	private BoardPanel vista;
	private Tablero modeloTablero;
	private Casilla [][] tablero;

	public ControladorJuego(BoardPanel vista,Tablero modeloTablero) {
		this.vista=vista;
		this.modeloTablero=modeloTablero;
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
		if(arg0.getKeyCode()==39) {
			if(modeloTablero.moverse("Derecha")) {
				if(!modeloTablero.existeManzana()) {
					modeloTablero.nuevaManzana();
				}
				vista.repaint();
			}else {
				VentanaGameOver ventana=new VentanaGameOver();
				ventana.setVisible(true);
			}
			
		}
		if(arg0.getKeyCode()==37) {
			if(modeloTablero.moverse("Izquierda")) {
				if(!modeloTablero.existeManzana()) {
					modeloTablero.nuevaManzana();
				}
				vista.repaint();
			}else {
				VentanaGameOver ventana=new VentanaGameOver();
				ventana.setVisible(true);
			}
		}
		if(arg0.getKeyCode()==38) {
			if(modeloTablero.moverse("Arriba")) {
				if(!modeloTablero.existeManzana()) {
					modeloTablero.nuevaManzana();
				}
				vista.repaint();
			}else {
				VentanaGameOver ventana=new VentanaGameOver();
				ventana.setVisible(true);
			}
			
		}
		if(arg0.getKeyCode()==40) {
			if(modeloTablero.moverse("Abajo")) {
				if(!modeloTablero.existeManzana()) {
					modeloTablero.nuevaManzana();
				}
				vista.repaint();
			}else {
				VentanaGameOver ventana=new VentanaGameOver();
				ventana.setVisible(true);
			}
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
