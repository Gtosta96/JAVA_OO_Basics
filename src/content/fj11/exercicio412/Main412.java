package content.fj11.exercicio412;

import content.fj11.exercicio412.entidade.Funcionario;


public class Main412 {

	public static void main(String[] args) {

	//---------------------------------------4.12--------------------------------------------//

	//---------------------------------------FUNCIONARIO 1--------------------------------------------//
		Funcionario funcionario1 = new Funcionario();
		
		funcionario1.nome = "Gabriel";
		funcionario1.salario = 3000;
		funcionario1.dataEntrada ="05/01/2015";
		funcionario1.mostraSalario();
		funcionario1.recebeAumento(500);
		funcionario1.mostraSalario();
		
		funcionario1.mostraTudo();
		
		//---------------------------------------FUNCIONARIO 2--------------------------------------------//
		Funcionario funcionario2 = new Funcionario();
		
		funcionario2.nome = "Gabriel";
		funcionario2.salario = 3000;
		funcionario2.dataEntrada ="05/01/2015";
		funcionario2.mostraSalario();
		funcionario2.recebeAumento(500);
		funcionario2.mostraSalario();
		
		funcionario2.mostraTudo();
		
		//---------------------------------------COMPARANDO FUNCIONARIOS--------------------------------------------//
	
		//descomentando a linha de baixo, o if vai ser true!
		//funcionario2 = funcionario1;
		
		if (funcionario1 == funcionario2){
			System.out.println("iguais");
			System.out.println("REF f1: " + funcionario1 + " | " + "ref f2: " + funcionario2);
		}
		else{
			System.out.println("diferentes");
			System.out.println("REF f1: " + funcionario1 + " | " + "ref f2: " + funcionario2);
		}
	}
}
