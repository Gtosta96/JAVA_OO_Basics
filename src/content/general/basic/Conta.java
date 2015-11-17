package content.general.basic;

public class Conta {

	public int numero;
	public String dono;
	public double saldo;
	public double limite;
	public double salario;
	public Cliente titular;
	
	public String saca(double quantidade){
		if(this.saldo < quantidade)
			return "--Saldo insuficiente";
		else
		this.saldo = this.saldo - quantidade;
		return "--Saque efetuado com sucesso";
	}

	public void deposita (double quantidade){
		this.saldo += quantidade;
	}
}
