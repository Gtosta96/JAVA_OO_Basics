package content.fj11.javalangmath.entidade;

public class Conta {

	private String dono;
	private double saldo;

	public Conta (String dono, double saldo){
		this.saldo = saldo;
		this.dono = dono;
	}
	
	public String getDono() {
		return dono;
	}
	
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

	@Override
	public String toString() {
		return "Conta [dono=" + dono + ", saldo=" + saldo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dono == null) ? 0 : dono.hashCode());
		long temp;
		temp = Double.doubleToLongBits(saldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (dono == null) {
			if (other.dono != null)
				return false;
		} else if (!dono.equals(other.dono))
			return false;
		if (Double.doubleToLongBits(saldo) != Double
				.doubleToLongBits(other.saldo))
			return false;
		return true;
	}
	
}
