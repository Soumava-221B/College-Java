package Number;

public class AutoBoxDemo {
	public static Integer foo(Integer i) {
		System.out.println("Object = " + i);
		return Integer.valueOf(123);
	}

	public static void main(String[] args) {
		int i = 42;
		int result = foo(i);
		System.out.println(result);

	}

}
