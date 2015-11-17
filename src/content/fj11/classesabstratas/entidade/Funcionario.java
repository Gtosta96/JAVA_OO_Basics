package content.fj11.classesabstratas.entidade;

public abstract class Funcionario {

	private String nome;
	private double salario;
	
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
}
