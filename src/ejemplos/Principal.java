package ejemplos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Hilo h1 = new Hilo(1);
			Hilo h2 = new Hilo(2);
			Thread t1 = new Thread(h1);
			Thread t2 = new Thread(h2);
			t1.start();
			t2.start();
	}

}
