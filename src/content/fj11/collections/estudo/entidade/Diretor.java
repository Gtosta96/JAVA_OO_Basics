package content.fj11.collections.estudo.entidade;

public class Diretor extends /* Funcionario */Gerente {

	private int senhaDiretor;

	public Diretor(String nome, double salario) {
		super(nome, salario);
	}

	// public double bonifica(){
	// return getSalario() * 1.5 + 1000;
	// return super.bonifica() + 1000; n�o funciona mais (caso estenda de funcionario), pois o m�todo de funcion�rio agora � abstrato.
	// }

	public int getSenhaDiretor() {
		return senhaDiretor;
	}

	public void setSenhaDiretor(int senhaDiretor) {
		this.senhaDiretor = senhaDiretor;
	}

	@Override
	public String toString() {
		return super.toString() + " Diretor [senhaDiretor=" + senhaDiretor + "]";
	}
	
	
}
