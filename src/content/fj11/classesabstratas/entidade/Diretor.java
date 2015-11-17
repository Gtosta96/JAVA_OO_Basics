package content.fj11.classesabstratas.entidade;

public class Diretor extends /*Funcionario*/ Gerente {

	private int senhaDiretor;
	
	public int getSenhaDiretor(){
		return senhaDiretor;
	}
	
	public void setSenhaDiretor(int senhaDiretor){
		this.senhaDiretor = senhaDiretor;
	}
	
//	public double bonifica(){
//		return getSalario() * 1.5 + 1000;
//		return super.bonifica() + 1000; não funciona mais (caso estenda de funcionario), pois o método de funcionário agora é abstrato.
//	} 
}
