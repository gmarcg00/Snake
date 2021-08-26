package modelo;

public class Tablero {

	private Casilla [][] tablero;
	private int dimTablero=15;
	private Manzana manzana;
	private Serpiente serpiente;
	private String direccion="Derecha";
	
	public Tablero() {
		tablero=new Casilla[dimTablero][dimTablero];
		manzana=new Manzana();
		serpiente=new Serpiente();
		
		nuevoTablero();
		imprimeTablero();
		//moverse("Derecha");
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
		tablero[cabeza[0]][cabeza[1]].setHead(false);
		tablero[cabeza2[0]][cabeza2[1]].setDireccion("S");
		tablero[cabeza2[0]][cabeza2[1]].setHead(true);;
		
		
		/*if(SerpienteValida()) {
			tablero[serpiente.getFilaCabeza()][serpiente.getColumnaCabeza()]=new Casilla("S",true,false,false);
		}*/
		
		
	}
	
	public boolean moverse() {
		int tamSerpiente=serpiente.getSnake().size();
		switch(direccion) {
		case "Derecha":
			int [] head=serpiente.getSnake().get(tamSerpiente-1);
			int [] newHeadD={head[0],head[1]+1};
			int [] tail=serpiente.getSnake().get(0);
			if((head[0]>14 || (head[1]+1)>14) || tablero[head[0]][head[1]+1].getDireccion().equals("S")) {
				System.out.println("Has perdido");
				return false;
			}else {
				if(tablero[head[0]][head[1]+1].getDireccion().equals("X")) {
					tablero[head[0]][head[1]+1].setDireccion("S");
					tablero[head[0]][head[1]+1].setHead(true);
					tablero[head[0]][head[1]].setHead(false);
				}else {
					tablero[head[0]][head[1]+1].setDireccion("S");
					tablero[head[0]][head[1]+1].setHead(true);
					
					tablero[head[0]][head[1]].setDireccion("S");
					tablero[head[0]][head[1]].setHead(false);
					
					tablero[tail[0]][tail[1]].setDireccion(".");
					tablero[tail[0]][tail[1]].setHead(false);
					serpiente.getSnake().remove(0);	
				}
				serpiente.getSnake().add(newHeadD);
			}
			
			break;
		case "Izquierda":
			head=serpiente.getSnake().get(tamSerpiente-1);
			int [] newHeadI={head[0],head[1]-1};
			tail=serpiente.getSnake().get(0);
			if((head[0]>14 || (head[1]-1)<0) || tablero[head[0]][head[1]-1].getDireccion().equals("S")) {
				System.out.println("Fuera del tablero");
				return false;
			}else {
				if(tablero[head[0]][head[1]-1].getDireccion().equals("X")) {
					tablero[head[0]][head[1]-1].setDireccion("S");
					tablero[head[0]][head[1]-1].setHead(true);
					tablero[head[0]][head[1]].setHead(false);
				}else {
					tablero[head[0]][head[1]-1].setDireccion("S");
					tablero[head[0]][head[1]-1].setHead(true);
					
					tablero[head[0]][head[1]].setDireccion("S");
					tablero[head[0]][head[1]].setHead(false);
					
					tablero[tail[0]][tail[1]].setDireccion(".");
					tablero[tail[0]][tail[1]].setHead(false);
					serpiente.getSnake().remove(0);	
				}
				serpiente.getSnake().add(newHeadI);
			}
			break;
			
		case "Abajo":
			head=serpiente.getSnake().get(tamSerpiente-1);
			int [] newHeadAB={head[0]-1,head[1]};
			tail=serpiente.getSnake().get(0);
			if(((head[0]-1)<0 || head[1]>14) || tablero[head[0]-1][head[1]].getDireccion().equals("S")) {
				System.out.println("Fuera del tablero");
				return false;
			}else {
				if(tablero[head[0]-1][head[1]].getDireccion().equals("X")) {
					tablero[head[0]-1][head[1]].setDireccion("S");
					tablero[head[0]-1][head[1]].setHead(true);
					tablero[head[0]][head[1]].setHead(false);
					
				}else {
					tablero[head[0]-1][head[1]].setDireccion("S");
					tablero[head[0]-1][head[1]].setHead(true);
					
					tablero[head[0]][head[1]].setDireccion("S");
					tablero[head[0]][head[1]].setHead(false);
					
					tablero[tail[0]][tail[1]].setDireccion(".");
					tablero[tail[0]][tail[1]].setHead(false);
					
					serpiente.getSnake().remove(0);	
				}
				serpiente.getSnake().add(newHeadAB);
			}
			
			break;
			
		case "Arriba":
			head=serpiente.getSnake().get(tamSerpiente-1);
			int [] newHeadA={head[0]+1,head[1]};
			tail=serpiente.getSnake().get(0);
			if((head[0]+1)>14 || tablero[head[0]+1][head[1]].getDireccion().equals("S")) {
				System.out.println("Fuera del tablero");
				return false;
			}else {
				if(tablero[head[0]+1][head[1]].getDireccion().equals("X")) {
					tablero[head[0]+1][head[1]].setDireccion("S");
					tablero[head[0]+1][head[1]].setHead(true);
					tablero[head[0]][head[1]].setHead(false);
				}else {
					tablero[head[0]+1][head[1]].setDireccion("S");
					tablero[head[0]+1][head[1]].setHead(true);
					
					tablero[head[0]][head[1]].setDireccion("S");
					tablero[head[0]][head[1]].setHead(false);
					
					tablero[tail[0]][tail[1]].setDireccion(".");
					tablero[tail[0]][tail[1]].setHead(false);
					
					serpiente.getSnake().remove(0);	
				}
				serpiente.getSnake().add(newHeadA);
			}
			break;
		}
		return true;
	}
	
	public boolean existeManzana() {
		for (int i = tablero.length - 1; i >= 0; i--) {
			for (int j = 0; j < tablero[i].length; j++) {
				if(tablero[i][j].getDireccion().equals("X"))
					return true;
			}
		}
		
		return false;
	}
	
	public void nuevaManzana() {
		boolean valido=false;
		int i=0;
		while(!valido && i<serpiente.getSnake().size()-1) {
			this.manzana=new Manzana();
			int [] cuerpo=serpiente.getSnake().get(i);
			if(cuerpo[0]!=manzana.getFila() || cuerpo[0]!=manzana.getColumna()) {
				valido=true;
				tablero[manzana.getFila()][manzana.getColumna()]=new Casilla("X",false,false,true);
			}
		}
	}
	
	public boolean SerpienteValida() {
		if(tablero[serpiente.getFilaCabeza()][serpiente.getColumnaCabeza()].getDireccion()!="X") {
			return true;
		}
		return false;
	}
	
	public boolean hasPerdido() {
		if((serpiente.getSnake().get(serpiente.getSnake().size()-1)[0]>=dimTablero) || serpiente.getSnake().get(serpiente.getSnake().size()-1)[1]>=dimTablero) {
			return true;
		}
		return false;
	}
	
	public int getDimTablero() {
		return dimTablero;
	}

	public void setDimTablero(int dimTablero) {
		this.dimTablero = dimTablero;
	}
	
	public Casilla getCelda(int i, int j) {
		return tablero[i][j];
	}
	
	
	
	
	public void imprimeTablero() {
		for (int i = tablero.length - 1; i >= 0; i--) {
			for (int j = 0; j < tablero[i].length; j++) {
				System.out.print(tablero[i][j]);
			}
			System.out.println();
		}
		
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	

}
