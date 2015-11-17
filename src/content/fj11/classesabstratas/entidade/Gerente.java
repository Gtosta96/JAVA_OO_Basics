package content.fj11.classesabstratas.entidade;

public class Gerente extends Funcionario {

	private int senhaDiretor;
	
	public int getSenhaDiretor(){
		return senhaDiretor;
	}
	
	public void setSenhaDiretor(int senhaDiretor){
		this.senhaDiretor = senhaDiretor;
	}
	
	public double bonifica(){
		return getSalario() * 1.0 + 1000;
	} 
}
