package content.fj11.collections.exercicio.entidade;

public abstract class Conta {

	private int id;
	private double saldo;

	public void deposita(double saldo) {
		this.saldo += saldo;
	}
	
	public double saca(double valor) {
		
		return this.saldo -= valor; 
	}
	
	public void atualiza (double taxa){
		this.saldo += this.saldo * taxa; 
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSaldo() {
		return saldo;
	}
}
