package Banque;

public class SoldeInsuffisantException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	public SoldeInsuffisantException(String message) {
		super();
		this.message = message;
	}
	

}
