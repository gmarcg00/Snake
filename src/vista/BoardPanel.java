package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

import controlador.ControladorJuego;
import modelo.Tablero;
import java.awt.Color;
import java.awt.GridBagLayout;

public class BoardPanel extends JFrame {
	private Tablero modeloTablero;
	private Casilla board[][];
	private JPanel panel;
	private MainWindow ventana;
	
	
	public BoardPanel(Tablero modeloTablero) {
		this.modeloTablero=modeloTablero;
		setTitle("Snake");
		setSize(800,532);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);//Cierra el programa al salir
		getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 786, 495);
		getContentPane().add(panel);
		panel.setLayout(new GridLayout(modeloTablero.getDimTablero(),modeloTablero.getDimTablero()));
		ControladorJuego control=new ControladorJuego(this,modeloTablero);
		inicializar();
		repaint();
		control.setKeyListener();
		
		
		
	
		
		
	}
	
	
	public void inicializar() {
		board=new Casilla[modeloTablero.getDimTablero()][modeloTablero.getDimTablero()];
		for (int i = board.length - 1; i >= 0; i--) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j]=new Casilla(i,j,".");
				panel.add(board[i][j]);
			}
		}
	}
	
	@Override
	public void repaint() {
		for (int i = board.length - 1; i >= 0; i--) {
			for (int j = 0; j < board[i].length; j++) {
				if(modeloTablero.getCelda(i,j).getDireccion().equals(".")) {
					if((i+j)%2==0) {
						board[i][j].setIcon(new ImageIcon("src/imagenes/verdeClaro.jpg"));
					}else{
						board[i][j].setIcon(new ImageIcon("src/imagenes/verdeOscuro.jpg"));
					}
					
				}
				
				if(modeloTablero.getCelda(i, j).getDireccion().equals("X")) {
					board[i][j].setIcon(new ImageIcon("src/imagenes/manzana.png"));
				}
				
				if(modeloTablero.getCelda(i, j).isHead()) {
					board[i][j].setIcon(new ImageIcon("src/imagenes/azul.jpg"));
				}else {
					if(modeloTablero.getCelda(i,j).getDireccion().equals("S")) {
						board[i][j].setIcon(new ImageIcon("src/imagenes/negro.jpg"));
					}
				}
				
				
				
				
				
	
			}
		}
	}
	
	public Casilla[][] getBoard() {
		return board;
	}

	public void setBoard(Casilla[][] board) {
		this.board = board;
	}
	
}
