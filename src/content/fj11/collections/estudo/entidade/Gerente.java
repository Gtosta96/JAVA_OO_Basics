package content.fj11.collections.estudo.entidade;

public class Gerente extends Funcionario {

	private int senhaGerente;
	
	public Gerente(String nome, double salario) {
		super(nome, salario);
	}
	
	public int getSenhaDiretor(){
		return senhaGerente;
	}
	
	public void setSenhaDiretor(int senhaDiretor){
		this.senhaGerente = senhaDiretor;
	}
	
	public double bonifica(){
		return getSalario() * 1.0 + 1000;
	} 
}
