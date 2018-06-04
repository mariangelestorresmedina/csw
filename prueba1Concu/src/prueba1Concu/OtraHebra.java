package prueba1Concu;

public class OtraHebra extends Thread{

	private int id;
	private UnaHebra h;
	
	public OtraHebra(int id, UnaHebra h){
		this.id = id;
		this.h = h;
	}
	
	public String toString(){
		return "Otra Hebra " + id;
	}
	
	public void run(){
		for(int i = 0; i < 4; i++){
			h.quienSoy();
		}
	}
}
