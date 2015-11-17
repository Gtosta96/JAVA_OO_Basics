package content.fj11.exercicio77.entidade;

public class ContaCorrente extends Conta {
	
	private String nome;
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void atualiza(double taxa){
		super.atualiza(taxa*2);
	}
	
	public void deposita (double valor){
		super.deposita(valor - 0.10);
	}
	
	public void exclusivoCcTransferirPoupanca(){
		//do something
	}
}
