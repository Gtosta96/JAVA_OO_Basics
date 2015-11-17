package content.general.recursividade;

public class Fibonacci {

	public static void main(String[] args) {
		
		int n = 5;
		System.out.println(fatorial(n));
		
		System.out.println(fibonacci(n));
	}
	
	public static int fatorial(int n){
		if(n == 0)return 1;
		return n * fatorial(n-1);
	}
	
	public static int fibonacci(int n){
		if(n == 0 || n == 1)return 1;
		return (fibonacci(n-2)) + fibonacci(n-1);
	}

}
