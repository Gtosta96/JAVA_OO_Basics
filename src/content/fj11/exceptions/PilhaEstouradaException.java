package content.fj11.exceptions;

/*Exception - checked (obrigatorio tratar)*/
public class PilhaEstouradaException extends RuntimeException /*Exception*/{

	private static final long serialVersionUID = 1L;

	PilhaEstouradaException(String message){
		super(message);
	}
}
