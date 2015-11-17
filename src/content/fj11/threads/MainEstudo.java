package content.fj11.threads;

import content.fj11.threads.estudo.entidade.BarraProgresso;
import content.fj11.threads.estudo.entidade.Programa;

public class MainEstudo {

	public static void main(String[] args) throws InterruptedException {
		
		//BarraProgresso Extende Thread, posso chamar o método run diretamente (NOT TOO GOOD, recebemos varios métodos p/ usar apenas 1 (run))
		BarraProgresso bp = new BarraProgresso();
		bp.run();
		
		//Acao Implementa Runnable, tive que implementar e sobrescrever o método (GOOD CHOICE)
		Thread programa1 = new Thread(new Programa(1));
		Thread programa2 = new Thread(new Programa(2));
		
		programa1.setPriority(Thread.MAX_PRIORITY); //SUGERE MAX PRIORITY P/ THREAD 1
		programa2.setPriority(Thread.MIN_PRIORITY); //SUGERE MIN PRIORITY P/ THREAD 2
		
		programa1.start();
		programa2.start();
		
		//programa1.stop(); não usei isso... é perigoso!
		//programa1.interrupt(); isso aqui, é ok.
	}
}
