package content.fj11.polimorfismo;

import content.fj11.polimorfismo.entidade.ControleBonificacao;
import content.fj11.polimorfismo.entidade.Diretor;
import content.fj11.polimorfismo.entidade.Funcionario;

public class Main {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Diretor();
		
		//Funcionario
		System.out.println("Funcionario");
		f1.setSalario(1000);
		System.out.println(f1.bonifica());
		ControleBonificacao.registra(f1);
		System.out.println(ControleBonificacao.getTotalBonificacao());
		
		//Diretor
		System.out.println("Diretor");
		f2.setSalario(1000);
		//f2.getSalarioDiretor(); NÃO FUNCIONA
		System.out.println(f2.bonifica());
		ControleBonificacao.registra(f2);
		System.out.println(ControleBonificacao.getTotalBonificacao());
		
		
		Diretor diretor = new Diretor();
		
		diretor.setSalario(1000);
		// HERDA BONIFICA PADRÃO DE FUNCIONARIO (CASO NÃO TENHA MÉTODO BONIFICA @OVERRIDE).
		System.out.println(diretor.bonifica());
		System.out.println(diretor.bonificaSuper());
		System.out.println(diretor.bonificaThis());
	}

}
