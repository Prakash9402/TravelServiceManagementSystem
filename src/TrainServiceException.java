
/* User defined Exception - DO NOT CHANGE */
class TrainServiceException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TrainServiceException(String message) {
		super(message);
	}

	public TrainServiceException(Throwable throwable) {
		super(throwable);
	}
}