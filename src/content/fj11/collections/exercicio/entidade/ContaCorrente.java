package content.fj11.collections.exercicio.entidade;

public class ContaCorrente extends Conta {
	
	private String nome;
	
	public ContaCorrente(String nome){
		this.nome = nome;
	}
	
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
