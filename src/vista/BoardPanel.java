package vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import modelo.Tablero;

public class BoardPanel extends JFrame {
	private Tablero modeloTablero;
	
	public BoardPanel(Tablero modeloTablero) {
		setBounds(130, 130, 524, 319);
		setTitle("Snake");
		getContentPane().setLayout(null);
		this.modeloTablero=modeloTablero;
		inicializar();
	}
	
	public void inicializar() {
		for(int i=0;i<modeloTablero.getDimTablero();i++) {
			for(int j=0;j<modeloTablero.getDimTablero();j++) {
				JLabel label=new JLabel(""+i+j,SwingConstants.CENTER);
				this.getContentPane().add(label);
			}
		}
	}
	
}
