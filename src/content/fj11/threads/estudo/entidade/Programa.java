package content.fj11.threads.estudo.entidade;

//Acao Implementa Runnable, tive que implementar e sobrescrever o método (GOOD CHOICE)
public class Programa implements Runnable {

	private int id;

	public Programa(int id){
		this.id = id;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("Programa " + this.id + ", valor " + i);
		}
	}

}
