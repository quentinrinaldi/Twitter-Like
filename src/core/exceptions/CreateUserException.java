package core.exceptions;

public class CreateUserException extends Exception {
	
	private int code;
	
	public CreateUserException (int code) {
		super();
		this.code = code;
	}
	
	public int getCode() {
		return this.code;
	}
}
