package content.fj11.interfaces;

import content.fj11.interfaces.entidade.AreaCalculavel;
import content.fj11.interfaces.entidade.Quadrado;
import content.fj11.interfaces.entidade.Retangulo;

public class Main {

	public static void main(String[] args) {

		System.out.println(new Quadrado(10).calculaArea());
		System.out.println(new Retangulo(10, 20).calculaArea());
		
		AreaCalculavel ac = new Quadrado(15);
		System.out.println(ac);
		//ac.teste(); nao funciona
	}
}
