package content.fj11.javalangmath.entidade;

public class GuardadorDeObjetos {

	private static Object[] arrayDeObjetos = new Object[100];
	private int indice = 0;
	
	public void adicionaObjeto(Object object){
		GuardadorDeObjetos.arrayDeObjetos[this.indice] = object;
		this.indice++;
	}
	
	public Object pegaObjeto(int indice){
		return GuardadorDeObjetos.arrayDeObjetos[indice];
	}
	
	public static int getTamanhoDoArray(){
		return arrayDeObjetos.length;
	}
}
