import java.util.Scanner;

public class TestDataTypes {

	public static void main(String[] args) {
		
		int a,b,c; // nothing is allocated to them
		System.out.println("Enter your data");
		Scanner scanner =new Scanner(System.in); //input the data
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=a+b;
		System.out.println("add="+c);  // syntax print the data
		c=a-b;
		System.out.println("Sub="+c);  // syntax print the data
		c=a/b;
		System.out.println("Div="+c);  // syntax print the data
		c=a*b;
		System.out.println("Mul="+c);  // syntax print the data
	}
}
