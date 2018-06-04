package prueba1Concu;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnaHebra h = new UnaHebra(0);
		OtraHebra o = new OtraHebra(1,h);
		h.start();
		o.start();
	}

}
