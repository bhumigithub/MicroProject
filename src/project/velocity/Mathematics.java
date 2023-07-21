package project.velocity;

import java.util.Scanner;

public class Mathematics implements Functionality{
	Scanner scr = new Scanner(System.in);
	@Override
	public void addition() {
		// TODO Auto-generated method stub
		System.out.println("Enter the first number >>");
		int a = scr.nextInt();
		System.out.println("Enter the second number >>");
		int b = scr.nextInt();
		a+=b;
		System.out.println("Addition is >>" +a);
	}

	@Override
	public void subtraction() {
		// TODO Auto-generated method stub
		System.out.println("Enter the first number >>");
		int a = scr.nextInt();
		System.out.println("Enter the second number >>");
		int b = scr.nextInt();
		a-=b;
		System.out.println("Subtraction is >>" +a);
		
	}

	@Override
	public void multiplication() {
		// TODO Auto-generated method stub
		System.out.println("Enter the first number >>");
		int a = scr.nextInt();
		System.out.println("Enter the second number >>");
		int b = scr.nextInt();
		System.out.println("Multiplication is >>" +a*b);	
	}

	@Override
	public void division() {
		// TODO Auto-generated method stub
		System.out.println("Enter the first number >>");
		int a = scr.nextInt();
		System.out.println("Enter the second number >>");
		int b = scr.nextInt();
		System.out.println("Division is >>" +a/b);
	}

	@Override
	public void modulus() {
		// TODO Auto-generated method stub
		System.out.println("Enter the first number >>");
		int a = scr.nextInt();
		System.out.println("Enter the second number >>");
		int b = scr.nextInt();
		System.out.println("Modulus is >>" +a%b);
	}
	@Override
	public void square() {
		System.out.println("Enter the any number >>");
		int a = scr.nextInt();
		System.out.println("Square is >>" +a*a);	
	}
	@Override
	public void cube() {
		// TODO Auto-generated method stub
		System.out.println("Enter the any number >>");
		int a = scr.nextInt();
		System.out.println("Cube is >>" +a*a*a);
	}

	@Override
	public void average() {
		// TODO Auto-generated method stub
		System.out.println("Enter first number >>");
		int a = scr.nextInt();
		System.out.println("Enter second number >>");
		int b = scr.nextInt();
		System.out.println("Enter third number >>");
		int c = scr.nextInt();
		System.out.println("Enter fourth number >>");
		int d = scr.nextInt();
		System.out.println("Enter fifth number >>");
		int e = scr.nextInt();
		float sum =a+b+c+d+e;
		System.out.println("Total sum is >>" +sum);
		System.out.println("Average is >>" +(float)sum/5);
	}

	@Override
	public void factors() {
		// TODO Auto-generated method stub
		System.out.println("Enter the number >>");
		int a = scr.nextInt();
		System.out.println("Factors are >>");
		for(int i=1; i<=a; i++) {
			if(a%i==0) {
				System.out.println(i);
			}
				
		}
	}

	@Override
	public void evenOdd() {
		// TODO Auto-generated method stub
		System.out.println("Enter the number >>" );
		int a = scr.nextInt();
		if(a%2==0) {
			System.out.println("It's even number");
		}else {
			System.out.println("It's odd number");
		}
		
	}
		
	
}
