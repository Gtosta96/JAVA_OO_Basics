package content.general.basic;


public class Main {

	public static void main(String[] args) {

	//---------------------------------------STRING--------------------------------------------//
		String s1 = new String("a");
		String s2 = new String("a");
		
		System.out.println("String");
			System.out.println(s1);
			System.out.println(s2);
			
			// comparar REFERENCIA (ENDEREÇO)!!
			System.out.println(s1 == s2);
			
			// compara VALORES!!
			System.out.println(s1.equals(s2));
		System.out.println();
		
	//---------------------------------------Não Primitivos--------------------------------------------//

		Integer i1 = 1;
		Integer i2 = i1;
		Integer i3 = i1 + 1;
		Integer i4 = new Integer(1);
		Integer i5 = new Integer(i4);
		Integer i6 = new Integer(i1 + 1);
		
		System.out.println("Não Primitivos");
			System.out.println(i1);
			System.out.println(i2);
			System.out.println(i3);
			System.out.println(i4);
			System.out.println(i5);
			System.out.println(i6);
		System.out.println();
	
		//---------------------------------------OOP--------------------------------------------//
		System.out.println("Referencia de contas");
			System.out.println(new Conta());
			System.out.println(new Conta());
		System.out.println();
			
		Conta minhaConta = new Conta();
		
		minhaConta.dono = "a";
		minhaConta.saldo = 1000.0;
		
		System.out.println("Saldo atual: " + minhaConta.saldo);
		
		System.out.println("Tentativa de Saque (200 reais)");
		System.out.println(minhaConta.saca(200));
		
		
		System.out.println("Efetuando Deposito (500 reais)");
		minhaConta.deposita(500);
		
		System.out.println("Saldo: " + minhaConta.saldo);
		System.out.println();
		
		Conta c1 = new Conta();
		c1.saldo = 1000;
		Conta c2 = c1;
		c2.deposita(100);
		
		
		System.out.println("conta1: " + c1 + " | conta2: " + c2);
		System.out.println("conta1: " + c1.saldo + " | conta2: " + c2.saldo);
		System.out.println();
		
		//---------------------------------------OOP--------------------------------------------//
		
		Cliente c = new Cliente();
		Conta conta = new Conta();
		
		//System.out.println("antes de atribuir 'c' a 'conta'");
		System.out.println(conta.titular); 
		conta.titular = c;
		
		//System.out.println("antes de atribuir 'c' a 'conta', acessando atributo de conta");
		//System.out.println(conta.titular.nome); NULL POINTER 
		conta.titular = c;
		
		System.out.println("depois de atribuir 'c' a 'conta'");
		System.out.println(conta.titular.nome);
	}
}
