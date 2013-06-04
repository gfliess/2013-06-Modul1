package at.edu.hti.shop.domain;

public class OrderException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1200388814664868465L;

	public OrderException() {
		super();
	}

	public OrderException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public OrderException(String message, Throwable cause) {
		super(message, cause);
	}

	public OrderException(String message) {
		super(message);
	}

	public OrderException(Throwable cause) {
		super(cause);
	}

}
