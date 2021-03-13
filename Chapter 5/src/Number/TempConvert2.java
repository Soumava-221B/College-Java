package Number;

public class TempConvert2 {
	protected void print(float f, float c) {
		System.out.printf("%6.2f %6.2f%n", f, c);
		}
	protected void start() {
		System.out.println("Fahr Centigrade");
		}
	protected void end() {
		System.out.println("-------------------");
		}
	protected void data() {
		for (int i=-40; i<=120; i+=10) {
		float c = (i-32)*(5f/9);
		print(i, c);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TempConvert2 t = new TempConvert2();
		t.start();
		t.data();
		t.end();
		
	}
	

}
