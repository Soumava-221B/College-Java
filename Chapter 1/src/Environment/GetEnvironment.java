package Environment;
import java.lang.*;

public class GetEnvironment {

	public static void main(String[] args) {
		System.out.println("system.getenv(\"PATH\")="+System.getenv("C:/Program Files/AdoptOpenJDK/jdk-11.0.8.10-hotspot/bin/client"));
		System.out.println(System.getenv("TEMP"));
		System.out.println(System.getenv("USERNAME"));
		
		System.out.println("user directory:"+System.getProperty("user.dir"));
		System.out.println("HOME"+System.getProperty(""));
		System.out.println("user directory:"+System.getProperty("user.dir"));
		

	}

}
