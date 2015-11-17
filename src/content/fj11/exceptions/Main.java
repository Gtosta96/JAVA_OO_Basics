package content.fj11.exceptions;

public class Main {

	public static void main(String[] args) {

		//foo(); stackoverflow
		//System.exit(0);
		System.out.println("inicio do main");
		metodo1();
		System.out.println("fim do main");
	}

	static void metodo1() {
		System.out.println("inicio do metodo1");
		try {
			metodo2();
		} catch (Exception/*|OutraException*/ e) { //multiples catch
			System.out.println(e.getMessage());
		}
		System.out.println("fim do metodo1");
	}

	static void metodo2() {
		System.out.println("inicio do metodo2");
		int[] array = new int[10];
		for (int i = 0; i <= 15; i++) {
			if (i < array.length)
				array[i] = i;
			else
				throw new PilhaEstouradaException("Pilha Estourada - " + i);
			System.out.println(i);
		}

		System.out.println("fim do metodo2");
	}

	static void foo() {
		foo();
	}
}
