package content.fj11.exercicio77;

import content.fj11.exercicio77.entidade.AtualizadorDeContas;
import content.fj11.exercicio77.entidade.Conta;
import content.fj11.exercicio77.entidade.ContaCorrente;
import content.fj11.exercicio77.entidade.ContaPoupanca;

public class Main {

	public static void main(String[] args) {

		Conta c = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
//		ContaCorrente cc = new ContaCorrente();
//		ContaPoupanca cp = new ContaPoupanca();
		
//		cc.setNome("Gabriel");
//		System.out.println(cc.getNome());
//		cc.exclusivoCcTransferirPoupanca();
		
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		
		c.atualiza(0.01);
		cc.atualiza(0.01);
		cp.atualiza(0.01);
		
		System.out.println(c.getSaldo());
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		System.out.println();
		
		AtualizadorDeContas adc = new AtualizadorDeContas(5.00);
		
		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);
	}

}
