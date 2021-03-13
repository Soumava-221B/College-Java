package OOPs;

public class ShutdownHook_R {

	public static void main(String[] args) {
		
		Runtime.getRuntime().addShutdownHook(new Thread()
		{
			public void run()
			{
				System.out.println("shutdown hook is running");
			}
		}
		
		);
		
		
		System.out.println("Application Terminating------");
		
	}

}
