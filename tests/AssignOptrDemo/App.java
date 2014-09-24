package AssignOptrDemo;

public class App {
	public static void main(String[] args) {
		
		int a = 10, b = 15, c = 15;
		System.out.println("Assignment and shourtcut operators");
		System.out.println("a =" + (a=15));
		System.out.println("Addition " + (a+=b));
		System.out.println("Subtraction " + (c-=b));
		System.out.println("Division " + (a/=2));
		System.out.println("Mutli " + (a*=2));
		System.out.println("Shift " +(a<<=b));
		
	}
}
