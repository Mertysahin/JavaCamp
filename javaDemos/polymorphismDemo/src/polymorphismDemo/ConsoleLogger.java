package polymorphismDemo;

public class ConsoleLogger extends BaseLogger
{
	public void Log(String message)
	{
		System.out.println("Logged to Console : " + message);
	}
}
