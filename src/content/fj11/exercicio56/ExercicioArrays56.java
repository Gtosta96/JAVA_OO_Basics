package content.fj11.exercicio56;

public class ExercicioArrays56 {

	public static void main(String[] args) {

		//Uma array bidimensional n�o precisa ser retangular, isto �, cada linha pode ter um n�mero diferente de colunas. Como? Porque?
		int[][] array = new int[5][];
		
		array[0] = new int[1];
		array[1] = new int[4];
		array[2] = new int[2];
		array[3] = new int[3];
		array[4] = new int[5];
		//array[5] = new int[5]; ERRO, ARRAY DE 5 POSI��ES V�O DE 0 A 4
		
		System.out.println(array.length); // O ARRAY TEM 5 POSI��ES (5 LINHAS);
		System.out.println(array[0].length); // O ARRAY 0 TEM 1 POSI��O.
		System.out.println(array[1].length); // O ARRAY 1 TEM 2 POSI��O.
		System.out.println(array[2].length); // O ARRAY 2 TEM 3 POSI��O.
		System.out.println(array[3].length); // O ARRAY 3 TEM 4 POSI��O.
		System.out.println(array[4].length); // O ARRAY 4 TEM 5 POSI��O.
		System.out.println();
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				//System.out.print(array[i].length + " ");
				array[i][j] = 0;
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		//int[] array2 = new int[-1]; ERRO
		
	}
}
