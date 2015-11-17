package content.fj11.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import content.fj11.collections.exercicio.entidade.Conta;
import content.fj11.collections.exercicio.entidade.ContaCorrente;
import content.fj11.collections.exercicio.entidade.ContaPoupanca;

public class MainExercicios2 {

	public static void main(String[] args) {
		
		System.out.println("Carregando...");
		List<Integer> list = new ArrayList<Integer>();
		//Collection<Integer> list = new HashSet<Integer>();
		long inicio = System.currentTimeMillis();
		
		
		for (int i = 0; i < 30000; i++) {
			list.add(i);
		}
		
		for (int i = 0; i < 30000; i++) {
			list.contains(i); // verificar se contém, leva muito mais tempo que adicionar
		}
		
		long fim = System.currentTimeMillis();
		
		System.out.println("INICIO: " + inicio);
		System.out.println("FIM: " + fim);
		
		System.out.println("TEMPO GASTO: " + TimeUnit.MILLISECONDS.toSeconds(fim-inicio) + " segundos");
		System.out.println("Exatos " + (fim-inicio) + " milésimos");
	
		
		/* CONCEITUAL
		 * 
		 * Um ArrayList do tipo Collection
		 * Collection<Integer> list1 = new HashSet<Integer>();
		 * contém métodos mais genéricos, como: 
		 * list1.remove(OBJECT);
		 * 
		 * enquanto um ArrayList do tipo List
		 * List<Integer> list1 = new ArrayList<Integer>();
		 * contém métodos mais específicos, como:
		 * list2.remove(OBJECT);
		 * list2.remove(INT);
		 */
	
		Map<String, Conta> map = new HashMap<String, Conta>();
		map.put("ContaGabriel", new ContaCorrente("Gabriel"));
		map.put("ContaLuis", new ContaPoupanca(10));
		

		if (map.get("ContaGabriel") instanceof ContaCorrente){
			ContaCorrente c1 = (ContaCorrente) map.get("ContaGabriel");
			System.out.println(c1.getNome());
		}
		
		if (map.get("ContaLuis") instanceof Conta /*ContaPoupanca*/){
			Conta c2 =  map.get("ContaLuis");
			System.out.println(c2.getId());
		}
		
		//ITERATOR
		System.out.println();
		HashSet<ContaPoupanca> dset = new HashSet<ContaPoupanca>();
		dset.add(new ContaPoupanca(15));
		dset.add(new ContaPoupanca(2));
		dset.add(new ContaPoupanca(6));
		dset.add(new ContaPoupanca(4));
		dset.add(new ContaPoupanca(9));
		
		Iterator<ContaPoupanca> iterator = dset.iterator(); // Caso tire o Generics (<ContaPoupanca>) não consigo mais acessar o método getId();
		while (iterator.hasNext()) {
			System.out.print(iterator.next().getId() + " ");
		}
		
		System.out.println();
		
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(12);
		tree.add(63);
		tree.add(34);
		tree.add(45);

		for (Integer treeSetInteger : tree) {
			System.out.print(treeSetInteger + " "); // ordena automaticamente, porém, tem um custo muito maior que HashSet
		}
		
		System.out.println();
		
		TreeSet<Conta> tree2 = new TreeSet<Conta>();
		tree2.add(new ContaPoupanca(1)); // new ContaCorrente("") = EXCEPTION, pois um TreeSet necessita implements Comparable!
		tree2.add(new ContaPoupanca(5)); // new ContaPoupanca(1) = Ok, pois ContaPoupanca tem Comparable!!
		tree2.add(new ContaPoupanca(2));
		
		for (Conta conta : tree2) {
			System.out.print(conta.getId() + " ");
		}
		
		System.out.println();
		System.out.println();
		
		List<Integer> list1 = new ArrayList<Integer>();
		for (int i = 1; i <= 1000; i++) {
			list1.add(i);	
		}
		
		for (int i = (list1.size() -1); i > 0; i--) { // INDEX == 999[0-999], SIZE = 1000;
			System.out.print(list1.get(i));
		}
		
		System.out.println();
		
		TreeSet<Integer> tree3 = new TreeSet<Integer>();
		for (int i = 1; i <= 1000; i++) {
			tree3.add(i);	
		}
		
		Iterator<Integer> it3 = tree3.descendingIterator(); // VERIFICAR COMO FAZER ISSO C/ FOREACH
		while(it3.hasNext()){
			System.out.print(it3.next());	
		}
	}	
}