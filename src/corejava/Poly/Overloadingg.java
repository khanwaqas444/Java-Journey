package corejava.Poly;

public class Overloadingg {
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int add(int a, int b, int c) {
		return a + b + c;
	}
	
	public static void main(String[] args) {
		Overloading obj = new Overloading();
		
		System.out.println(obj.add(6, 4));
		
		System.out.println(obj.add(7, 7));
	}

}
