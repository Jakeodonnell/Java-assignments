package p2Granskning;

public class InvalidSendMethodException extends Exception{



	/**
	 * exception for invalid request only LOOP or SET allowed
	 */
	private static final long serialVersionUID = 1L;

	public InvalidSendMethodException(String s) {
		super(s);
	}
}
