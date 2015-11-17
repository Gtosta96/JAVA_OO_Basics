package content.fj11.collections.exercicio.entidade;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {

	public ContaPoupanca(int id){
		super.setId(id);
	}
	public void atualiza(double taxa){
		super.atualiza(taxa*3);
	}

	@Override
	public int compareTo(ContaPoupanca o) {
		if(super.getId() < o.getId())
			return -1;
		if(super.getId() > o.getId())
			return 1;
		return 0;
	}
}
