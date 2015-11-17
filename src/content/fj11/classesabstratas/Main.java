package content.fj11.classesabstratas;

import content.fj11.classesabstratas.entidade.Diretor;
import content.fj11.classesabstratas.entidade.Funcionario;
import content.fj11.classesabstratas.entidade.Gerente;


public class Main {

	public static void main(String[] args) {

//		Funcionario f = new Funcionario(); Impossível, Funcionario é abstrato.
		Funcionario g = new Gerente();		
		g.bonifica(); // usa bonifica de Gerente;
		Funcionario d1 = new Diretor();
		d1.bonifica(); // usa bonifica de Gerente;
		Gerente d2 = new Diretor();
		d2.bonifica(); // usa bonifica de Gerente;
		
		Funcionario[] f = new Funcionario[10];
		f[0] = new Gerente();
		f[1] = new Diretor();
		
		/*f[2] = new Funcionario() { // //essa porra funciona, pesquisar, why (anonymous user type)
			
			@Override
			public double bonifica() {
				return 0;
			}
		};*/
		
	}

}
