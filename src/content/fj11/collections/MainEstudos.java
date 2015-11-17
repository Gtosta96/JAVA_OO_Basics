package content.fj11.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import content.fj11.collections.estudo.entidade.Diretor;
import content.fj11.collections.estudo.entidade.Funcionario;
import content.fj11.collections.estudo.entidade.Gerente;

public class MainEstudos {

	public static void main(String[] args) {

		
		List<Funcionario> list = new ArrayList<Funcionario>();
		Diretor d = null;
		
		Funcionario fd = new Diretor("Diretor1", 5000);
		if (fd instanceof Diretor){
			d = (Diretor) fd;
			d.setSenhaDiretor(12345);
		}

		//list.add("Uma String"); n�o compila mais, gra�as ao uso de generics
		
		list.add(new Gerente("Gerente1", 2000));
		list.add(new Diretor("Diretor2", 3000));
		list.add(d);
		
		
		for (Funcionario funcionario : list) {
			if(funcionario instanceof Diretor)
				System.out.println(((Diretor) funcionario).toString());
			else
				System.out.println(funcionario.toString());
		}
		
		List<String> lista = new ArrayList<String>();
		lista.add("Jo�o");
		lista.add("Guilherme");
		lista.add("Gabriel");
		
		System.out.println(lista); // ordem de inser��o
		
		Collections.sort(lista); //ordena por ordem alfabetica / diferente dos metodos de string, etc, 
								 //sort transforma o objeto passado como parametro (void) e n�o um retorno.
		
		System.out.println(lista); // ordem alfabetica
		
		System.out.println(list);
		Collections.sort(list); // ordena na ordem decrescente (definido na reescrita do m�todo override)
		System.out.println(list);
		
		
		System.out.println(Collections.binarySearch(list, list.get(2))); // retorna na ordem definida do sort
		System.out.println(Collections.max(list)); // n�o entendi o crit�rio
		System.out.println(Collections.min(list)); // n�o entendi o crit�rio
		
		Collections.reverse(list);
		System.out.println(list); // reverte a ordem da lista
	}
}
