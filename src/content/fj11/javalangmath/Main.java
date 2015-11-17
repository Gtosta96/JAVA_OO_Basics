package content.fj11.javalangmath;

import content.fj11.javalangmath.entidade.Conta;
import content.fj11.javalangmath.entidade.GuardadorDeObjetos;

public class Main {

	public static void main(String[] args) {
		GuardadorDeObjetos guardador = new GuardadorDeObjetos();

		/*
		 * Integer x = 5; consome mais memória, pois faz wrapper (jvm interno faz umas parada mt louca lá). 
		 * Integer x1 = new Integer(5); consome menos memória pois instancia e referencia o objeto).
		 */ 
		
		Object o = 5;
		String string = "String x";
		Long longo = new Long(23309235);
		guardador.adicionaObjeto(o);
		guardador.adicionaObjeto(new Conta("Gabriel", 5000));
		guardador.adicionaObjeto(new Integer(200));
		guardador.adicionaObjeto(longo);
		guardador.adicionaObjeto(string);
		

		Object objetoConta = guardador.pegaObjeto(0);
		Conta contaDoObjeto = (Conta) objetoConta;
		System.out.println("DONO: " + contaDoObjeto.getDono());
		System.out.println("SALDO: " + contaDoObjeto.getSaldo());

		for (int i = 0; i < GuardadorDeObjetos.getTamanhoDoArray(); i++) {
			if (guardador.pegaObjeto(i) != null && guardador.pegaObjeto(i) instanceof Conta) {
				Conta contaCastada = (Conta) guardador.pegaObjeto(i);
				System.out.println(contaCastada.getDono());
				System.out.println(contaCastada.getSaldo());
			}else if (guardador.pegaObjeto(i) != null){
				System.out.println(guardador.pegaObjeto(i));
			}
			// System.out.println(i);
		}
		
		//P.C: uma string é imutavel, o java cria uma nova variavel string temporária e retorna ela de acordo com o método solicitado. 
		String frase = "java é demais";
		frase.toUpperCase(); // não define frase como uppercase permanentemente
		//System.out.println(frase); aqui, a frase não será impressa em maiuscula.
		//System.out.println(frase.toUpperCase()); aqui, a frase será impressa em maiuscula.
		String palavras[] = frase.split(" ");
		
		for (String forEach : palavras) {
			System.out.println(forEach);
		}
		
		System.out.println(frase.replace("demais", "foda").toUpperCase());
		//System.out.println(frase.toUpperCase().replace("DEMAIS", "FODA"));
		
		
		//aqui tem coisa pra caralho, pesquisar...
		System.out.println(Math.round(4.49));
		System.out.println(Math.abs(-4584));
		
		String exercicio[] = "Socorram-me, subi no ônibus em Marrocos".split(" ");
		
		for (int i = exercicio.length -1; i >= 0; i--) {
			System.out.print(exercicio[i] + " ");
		}
		System.out.println();
	}

}
