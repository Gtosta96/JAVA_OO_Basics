package content.fj11.polimorfismo.entidade;

public class Diretor extends Funcionario {

	private int senhaDiretor;
	
	public int getSenhaDiretor(){
		return senhaDiretor;
	}
	
	public void setSenhaDiretor(int senhaDiretor){
		this.senhaDiretor = senhaDiretor;
	}
	
	public double bonifica(){
		return super.bonifica() + 500;
	}
	
	public double bonificaSuper(){
		return super.bonifica() + 1200;
	} 

	//caso bonifica de Diretor estiver comentado, pega referencia de Funcionário, senão pega referencia de Diretor
	public double bonificaThis(){
		return this.bonifica();
	} 
}
