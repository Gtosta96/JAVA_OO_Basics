package content.fj11.threads.exercicio.entidade;

import java.util.Collection;

public class ProduzMensagem implements Runnable {

	private int comeco;
	private int fim;
	private Collection<String> mensagem;

	public ProduzMensagem(int comeco, int fim, Collection<String> mensagem) {
		this.comeco = comeco;
		this.fim = fim;
		this.mensagem = mensagem;
	}

	@Override
	public void run() {
		synchronized (mensagem) {
			for (int i = this.comeco; i < this.fim; i++)
				mensagem.add("MENSAGEM " + i);
		}
	}

}
