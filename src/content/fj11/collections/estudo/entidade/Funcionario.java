package content.fj11.collections.estudo.entidade;

public abstract class Funcionario implements Comparable<Funcionario> {

	private String nome;
	private double salario;

	public Funcionario(String nome, double salario) { // OBRIGA AS CLASSES
														// FILHAS DE
														// FUNCIONARIOS TEREM UM
														// CONSTRUTOR C/ MESMOS
														// PARAMETROS
		this.nome = nome;
		this.salario = salario;
	}

	public int compareTo(Funcionario outra) {
		if (this.salario < outra.salario)
			return 1;
		else if (this.salario < outra.salario)
			return -1;
		else
			return 0;
		}

	public abstract double bonifica();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + "]";
	}

}
