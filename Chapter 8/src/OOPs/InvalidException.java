package OOPs;

public class InvalidException extends Exception {
	public InvalidException()
	{
		super("invalid");
	}
	public InvalidException(String message)
	{
		super(message);
	}
}

