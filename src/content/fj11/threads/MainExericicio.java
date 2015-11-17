package content.fj11.threads;

import java.util.ArrayList;
import java.util.Collection;

import content.fj11.threads.exercicio.entidade.ProduzMensagem;

public class MainExericicio {

	public static void main(String[] args) throws InterruptedException {
		//Vector = thread safe (demora +);
		//ArrayList = unsafe thread (precisa colocar locker (synchronized)
		Collection<String> c = new ArrayList<String>();

		Thread t1 = new Thread(new ProduzMensagem(0, 15000, c));
		Thread t2 = new Thread(new ProduzMensagem(15000, 30000, c));
		Thread t3 = new Thread(new ProduzMensagem(30000, 35000, c));

		t1.start();
		t2.start();
		t3.start();

		// Espera que a Thread que roda o main aguarde;
		t1.join();
		t2.join();
		t3.join();

		System.out.println("Thread produtoras de Mensagens finalizadas!");

		// Verifica se todas as mensagens foram guardadas
		for (int i = 0; i < 15000; i++) {
			if (!c.contains("MENSAGEM " + i))
				throw new IllegalStateException("Não encontrado mensagem: " + i);
		}
		if (c.contains(null))
			throw new IllegalStateException("Não deveria estar nulo");
		System.out.println("Fim da execucao");
	}
}
