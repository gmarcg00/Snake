
public class Manzana {
	private boolean isEated;
	private int fila;
	private int columna;
	
	public Manzana() {
		this.isEated=false;
		//this.setFila(generaNumeroAleatorio(0,14));
		//this.setColumna(generaNumeroAleatorio(0,14));
		this.setFila(11);
		this.setColumna(11);
	}
	
	public static int generaNumeroAleatorio(int minimo,int maximo){
       int num=(int)Math.floor(Math.random()*(maximo-minimo+1)+(minimo));
       return num;
	}
	
	public boolean compruebaManzana() {
		//TODO
		return isEated;
		
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}
}
