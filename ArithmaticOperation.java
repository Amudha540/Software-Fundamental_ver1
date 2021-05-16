// Assignment Data Types and Operations
import java.util.*;
 public class ArithmaticOperation{	
	 public static void main(String[] args) {
		int a,b;
		int addition,subtraction,multiplication,division,increment,decrement,modulus;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 'a' value");
		a=sc.nextInt();
		System.out.println("Enter 'b' value");
		b=sc.nextInt();
		sc.close();
		ArithmaticOperation arith = new ArithmaticOperation();
		addition=arith.addition(a,b);
		subtraction=arith.subtraction(a,b);
		multiplication=arith.multiplication(a,b);
		division=arith.division(a,b);
		increment=arith.increment(a);
		decrement=arith.decrement(a);
		modulus=arith.modulus(a,b);
		System.out.format("\nAddition of two numbers %d, %d is : %d\n",a,b,addition);
		System.out.format("\nSubtraction of two numbers %d, %d is : %d\n",a,b,subtraction);
		System.out.format("\nMultiplication of two numbers %d, %d is : %d\n",a,b,multiplication);
		System.out.format("\nDivision of two numbers %d, %d is : %d\n",a,b,division);
		System.out.format("\nModulus of two numbers %d, %d is : %d\n",a,b,modulus);
		System.out.format("\nIncrement of two numbers %d is : %d\n",a,increment);
		System.out.format("\nDecrement of two numbers %d is : %d\n",a,decrement);
	}
	private int addition(int a, int b) {
		int add;
		add = a+b;
		return add;
	}
	private int subtraction(int a, int b) {
		int sub;
		sub = a-b;
		return sub;
	}
	private int multiplication(int a, int b) {
		int mul;
		mul = a*b;
		return mul;
	}
	private int division(int a, int b) {
		int div;
		div = a/b;
		return div;
	}
	private int modulus(int a, int b) {
		int modu;
		modu = a%b;
		return modu;
	}
	private int increment(int a) {
		int inc;
		inc = ++a;
		return inc;
	}
	private int decrement(int a) {
		int dec;
		dec = --a;
		return dec;
	}
}

 