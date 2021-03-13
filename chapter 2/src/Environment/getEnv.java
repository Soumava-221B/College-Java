package Environment;
import java.util.Map;

public class getEnv {

	public static void main(String[] args) {
		System.out.println("System.getenv(\"PATH\") = "+System.getenv("PATH"));
		System.out.println(System.getenv("Temp"));
		System.out.println(System.getenv("USER NAME"));
		
		System.out.println("User directory "+System.getProperty("user.dir"));
		System.out.println("Home: "+System.getProperty("java.class.path"));
		
		System.out.println("OS:"+System.getProperty("os.name"));
		System.out.println("Version"+System.getenv("java.runtime.version"));
		System.out.println("java jdk"+System.getProperty("java.home"));
		System.out.println("specification"+System.getProperty("java.runtime.version"));
		
		

	}

}
