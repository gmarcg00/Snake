import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Serpiente {
	private Map<Integer, Integer> cuerpo = new HashMap<Integer, Integer>();
	private int filaCabeza;
	private int columnaCabeza;
	private List<int[]> snake=new ArrayList<int[]>();
	
	public List<int[]> getSnake() {
		return snake;
	}

	public void setSnake(List<int[]> snake) {
		this.snake = snake;
	}

	public Serpiente() {

		//int [] cabeza={generaNumeroAleatorio(0,14),generaNumeroAleatorio(0,14)};
		int [] cabeza={11,4};
		int [] cabeza2={11,5};
		this.snake.add(cabeza);
		this.snake.add(cabeza2);
		
		
		this.setFilaCabeza(10);
		this.setColumnaCabeza(11);
	}
	
	public static int generaNumeroAleatorio(int minimo,int maximo){
       int num=(int)Math.floor(Math.random()*(maximo-minimo+1)+(minimo));
       return num;
	}
	
	
	public int getFilaCabeza() {
		return filaCabeza;
	}
	
	public void setFilaCabeza(int filaCabeza) {
		this.filaCabeza = filaCabeza;
	}
	
	public int getColumnaCabeza() {
		return columnaCabeza;
	}
	
	public void setColumnaCabeza(int columnaCabeza) {
		this.columnaCabeza = columnaCabeza;
	}

	public Map<Integer, Integer> getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(Map<Integer, Integer> cuerpo) {
		this.cuerpo = cuerpo;
	}
	
}
