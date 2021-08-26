package modelo;

import vista.BoardPanel;
import vista.VentanaGameOver;

public class Movimiento implements Runnable{
	private Tablero modeloTablero;
	private BoardPanel vista;
	private boolean parar=false;
	
	
	public Movimiento(Tablero modeloTablero, BoardPanel vista) {
		this.modeloTablero=modeloTablero;
		this.vista=vista;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(!parar) {
			if(modeloTablero.moverse()) {
				if(!modeloTablero.existeManzana()) {
					modeloTablero.nuevaManzana();
				}
				vista.repaint();
			}else {
				VentanaGameOver ventana=new VentanaGameOver();
				ventana.setVisible(true);
				parar();
			}
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void parar() {
		this.parar=true;
	}
		
		
		

	

}
