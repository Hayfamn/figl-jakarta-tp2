package Banque;

public class MontantInvalideException extends Exception{
	private String message;

	public MontantInvalideException(String message) {
		super();
		this.message = message;
	}
	
}
