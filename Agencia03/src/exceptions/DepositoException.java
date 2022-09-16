package exceptions;

public class DepositoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DepositoException() {
		super();
	}

	public DepositoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DepositoException(String message, Throwable cause) {
		super(message, cause);
	}

	public DepositoException(String message) {
		super(message);
	}

	public DepositoException(Throwable cause) {
		super(cause);
	}

}
