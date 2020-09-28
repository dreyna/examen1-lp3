package ejemplo3;

public class Persona  extends Thread{
 String  nombre;
 public Persona(int p, String nombre) {
	 this.nombre= nombre;
	 setPriority(p);
 }
 public void run() {
	 for(int i =0; i<30; i++) {
		 System.out.println(nombre);
	 }
	 System.out.println("\nllega "+nombre);
 }
}
