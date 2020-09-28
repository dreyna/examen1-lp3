package ejemplo2;

import java.util.Scanner;

public class Ejemplo2 extends Thread{
Scanner sc = new Scanner(System.in);
String n, d; double h;
public Ejemplo2(String nombre, String dia, double hora) {
	n = nombre;
	d = dia;
	h = hora;
	System.out.println("ingresar nombre: ");
	n = sc.next();
	System.out.println("ingresar dia: ");
	d = sc.next();
	System.out.println("ingresar hora: ");
	h = sc.nextDouble();
}
public void run() {
	if(h>8.00) {
		System.out.println(n+"llego tarde el dia "+ d);
	}else {
		System.out.println(n+"llego temprano el dia "+ d);
	}
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			Thread u1 = new Ejemplo2("","",0);
			u1.start();
			Thread.sleep(3000);
			Thread u2 = new Ejemplo2("","",0);
			u2.start();
	}

}
