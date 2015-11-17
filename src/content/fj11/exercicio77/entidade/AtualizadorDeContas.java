package content.fj11.exercicio77.entidade;

public class AtualizadorDeContas {

	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public void roda(Conta c) {
		System.out.println("SALDO ANTERIOR " + c.getSaldo());
		c.deposita(this.selic);
		System.out.println("VALOR DEPOSITADO " + this.selic);
		System.out.println("SALDO ATUAL DA CONTA " + c.getSaldo());
		this.saldoTotal += c.getSaldo();
		System.out.println("Saldo TOTAL DE TODAS AS SOMAS " + this.saldoTotal);
		System.out.println();
	}

	public double getSaldoTotal() {
		return this.saldoTotal;
	}
	
	public void setSaldoTotal(double saldo){
		this.saldoTotal += saldo;
	}
}
