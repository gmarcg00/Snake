
public class Tablero {

	private Casilla [][] tablero;
	private final int dimTablero=15;
	private Manzana manzana;
	private Serpiente serpiente;
	
	public Tablero() {
		tablero=new Casilla[dimTablero][dimTablero];
		manzana=new Manzana();
		serpiente=new Serpiente();
		
		nuevoTablero();
		imprimeTablero();
		moverse("Abajo");
		System.out.println();
		System.out.println();
		imprimeTablero();
		moverse("Abajo");
		System.out.println();
		System.out.println();
		imprimeTablero();
		moverse("Abajo");
		System.out.println();
		System.out.println();
		imprimeTablero();
		

	}
	
	public void nuevoTablero() {
		for (int i = tablero.length - 1; i >= 0; i--) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = new Casilla(".", false, false,false);
			}
		}
		//tablero[manzana.getFila()][manzana.getColumna()]=new Casilla("X",false,false,true);
		tablero[9][5]=new Casilla("X",false,false,true);
		
		int [] cabeza= serpiente.getSnake().get(0);
		int [] cabeza2= serpiente.getSnake().get(1);
		
		tablero[cabeza[0]][cabeza[1]].setDireccion("S");
		tablero[cabeza2[0]][cabeza2[1]].setDireccion("S");
		
		/*if(SerpienteValida()) {
			tablero[serpiente.getFilaCabeza()][serpiente.getColumnaCabeza()]=new Casilla("S",true,false,false);
		}*/
		
		
	}
	
	public void moverse(String dir) {
		int tamSerpiente=serpiente.getSnake().size();
		switch(dir) {
		case "Derecha":
			int [] head=serpiente.getSnake().get(tamSerpiente-1);
			int [] newHeadD={head[0],head[1]+1};
			int [] tail=serpiente.getSnake().get(0);
			if(tablero[head[0]][head[1]+1].getDireccion().equals("X")) {
				tablero[head[0]][head[1]+1].setDireccion("S");
			}else {
				tablero[head[0]][head[1]+1].setDireccion("S");
				tablero[tail[0]][tail[1]].setDireccion(".");
				serpiente.getSnake().remove(0);	
			}
			serpiente.getSnake().add(newHeadD);
			break;
		case "Izquierda":
			head=serpiente.getSnake().get(tamSerpiente-1);
			int [] newHeadI={head[0],head[1]-1};
			tail=serpiente.getSnake().get(0);
			if(tablero[head[0]][head[1]-1].getDireccion().equals("X")) {
				tablero[head[0]][head[1]-1].setDireccion("S");
			}else {
				tablero[head[0]][head[1]-1].setDireccion("S");
				tablero[tail[0]][tail[1]].setDireccion(".");
				serpiente.getSnake().remove(0);	
			}
			serpiente.getSnake().add(newHeadI);
			break;
			
		case "Abajo":
			head=serpiente.getSnake().get(tamSerpiente-1);
			int [] newHeadAB={head[0]-1,head[1]};
			tail=serpiente.getSnake().get(0);
			if(tablero[head[0]-1][head[1]].getDireccion().equals("X")) {
				tablero[head[0]-1][head[1]].setDireccion("S");
			}else {
				tablero[head[0]-1][head[1]].setDireccion("S");
				tablero[tail[0]][tail[1]].setDireccion(".");
				serpiente.getSnake().remove(0);	
			}
			serpiente.getSnake().add(newHeadAB);
			break;
			
		case "Arriba":
			head=serpiente.getSnake().get(tamSerpiente-1);
			int [] newHeadA={head[0]+1,head[1]};
			tail=serpiente.getSnake().get(0);
			if(tablero[head[0]+1][head[1]].getDireccion().equals("X")) {
				tablero[head[0]+1][head[1]].setDireccion("S");
			}else {
				tablero[head[0]+1][head[1]].setDireccion("S");
				tablero[tail[0]][tail[1]].setDireccion(".");
				serpiente.getSnake().remove(0);	
			}
			serpiente.getSnake().add(newHeadA);
			break;
		}
	}
	
	public boolean SerpienteValida() {
		if(tablero[serpiente.getFilaCabeza()][serpiente.getColumnaCabeza()].getDireccion()!="X") {
			return true;
		}
		return false;
	}
	
	
	
	
	public void imprimeTablero() {
		for (int i = tablero.length - 1; i >= 0; i--) {
			for (int j = 0; j < tablero[i].length; j++) {
				System.out.print(tablero[i][j]);
			}
			System.out.println();
		}
		
	}
	


	public Serpiente getSerpiente() {
		return serpiente;
	}

	public void setSerpiente(Serpiente serpiente) {
		this.serpiente = serpiente;
	}
	

}
