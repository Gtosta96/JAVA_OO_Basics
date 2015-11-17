package content.fj11.exercicio77.entidade;

public class Conta {

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
	
	public double getSaldo() {
		return saldo;
	}
}
