package ejemplos;

public class Hilo implements Runnable {
	private int tipo;

	public Hilo(int tipo) {
		this.tipo = tipo;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			switch (tipo) {
			case 1:
				for (int i = 1; i < 30; i++) {
					System.out.println(i);
				}
				break;
			case 2:
				for (char c = 'c'; c < 'z'; c++) {
					System.out.println(c);
				}
				break;
			}
		}

	}

}
