package content.fj11.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import content.fj11.collections.exercicio.entidade.ContaCorrente;
import content.fj11.collections.exercicio.entidade.ContaPoupanca;

public class MainExercicios {

	public static void main(String[] args) {

		// ******************************************************//
		List<ContaPoupanca> list = new ArrayList<ContaPoupanca>();

		// List pode conter elementos repetidos
		ContaPoupanca c0 = new ContaPoupanca(15654);
		ContaPoupanca c1 = new ContaPoupanca(20144);
		ContaPoupanca c2 = new ContaPoupanca(11449);
		list.add(c0);
		list.add(c1);
		list.add(c2);

		for (ContaPoupanca contaPoupanca : list) {
			System.out.println(contaPoupanca.getId());
		}
		System.out.println();
		Collections.sort(list);
		System.out.println();

		for (ContaPoupanca contaPoupanca : list) {
			System.out.println(contaPoupanca.getId());
		}

		// ******************************************************//

		List<Boolean> listaSet = new ArrayList<Boolean>();
		Set<String> set = new HashSet<String>();

		// set não pode conter elementos repetidos
		listaSet.add(set.add("Gabriel")); // true
		listaSet.add(set.add("Guilherme")); // true
		listaSet.add(set.add("Luis")); // true
		listaSet.add(set.add("Danilo")); // true
		listaSet.add(set.add("Luis")); // false (não vai ser adicionado)
		
		System.out.println(set);
		System.out.println(listaSet);
		
		// ******************************************************//
		
		Map<String, ContaCorrente> mapaContas = new HashMap<String, ContaCorrente>();
		
		mapaContas.put("gerente", new ContaCorrente("GerenteXYZ"));
		mapaContas.put("diretor", new ContaCorrente("DiretorGGG"));
		
		ContaCorrente conta = mapaContas.get("gerente"); // sem casting, graças ao generics
		System.out.println(conta.getNome());
		
		System.out.println(mapaContas.keySet()); // retorna keys do MAP
		System.out.println(mapaContas.values()); // retorna Objetos passados no set
		mapaContas.containsKey("gerente"); // true
		mapaContas.containsValue(mapaContas.get("gerente")); // true
	}
}
