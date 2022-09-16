package exceptions;

public class SaqueException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public SaqueException() {
		super();
	}

	public SaqueException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public SaqueException(String message, Throwable cause) {
		super(message, cause);
	}

	public SaqueException(String message) {
		super(message);
	}

	public SaqueException(Throwable cause) {
		super(cause);
	}

}
