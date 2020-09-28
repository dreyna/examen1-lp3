package ejemplo3;

public class Carrera {
	static Persona jose;
	static Persona ana;
	static Persona lucas;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		jose = new Persona(1, "J");
		ana = new Persona(2, "A");
		lucas = new Persona(3, "L");
		jose.start();
		ana.start();
		lucas.start();
		jose.join();
		ana.join();
		lucas.join();
	}

}
