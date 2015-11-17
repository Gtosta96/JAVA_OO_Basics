package content.fj11.polimorfismo.entidade;

public class ControleBonificacao {

	private static double totalBonificacao = 0;
	
	public static void registra (Funcionario f){
		ControleBonificacao.totalBonificacao += f.bonifica();
	}
	
	public static double getTotalBonificacao(){
		return ControleBonificacao.totalBonificacao;
	}
}
