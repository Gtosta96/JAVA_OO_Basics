package content.fj11.exercicio412.entidade;

public class Funcionario {
	
	public String nome;
	public String departamento;
	public double salario;
	public String dataEntrada;
	public String RG;
	
	public void recebeAumento(double valor){
		this.salario += valor;
	}
	
	public double calculaGanhoAnual (){
		return this.salario * 12;
	}
	
	public void mostraSalario(){
		System.out.println("salario atual " + this.salario);
		System.out.println("salario anual " + this.calculaGanhoAnual());
	}
	public void mostraTudo(){
		System.out.println("nome: " + this.nome);
		System.out.println("dept: " + this.departamento);
		System.out.println("salario: " +this.salario);
		System.out.println("data Entrada: " + this.dataEntrada);
		System.out.println("RG: " + this.RG);
	}
	
}
