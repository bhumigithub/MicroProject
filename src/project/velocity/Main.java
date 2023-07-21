package project.velocity;

import java.util.Scanner;

public class Main extends Mathematics {

	public static void main(String[] args) {

		System.out.println("Welcome to console based application\n");
		do {
			
		System.out.println("\n1. Addition of two number");
		System.out.println("2. Subtraction of two number");
		System.out.println("3. Multiplication of two number");
		System.out.println("4. Division of two number");
		System.out.println("5. Modulus of two number");
		System.out.println("6. Square of number");
		System.out.println("7. Cube of number");
		System.out.println("8. Average of number");
		System.out.println("9. Factors of number");
		System.out.println("10. Find out even or odd number\n");
		
		System.out.println("Enter your choice >>");
		
		Scanner scr = new Scanner(System.in);
		int num= scr.nextInt();
		Mathematics math = new Mathematics();
		
		switch(num) {
		case 1:
			math.addition();
			break;
		case 2:
			math.subtraction();
			break;
		case 3:
			math.multiplication();
			break;
		case 4:
			math.division();
			break;
		case 5:
			math.modulus();
			break;
		case 6:
			math.square();
			break;
		case 7:
			math.cube();
			break;
		case 8:
			math.average();
			break;
		case 9:
			math.factors();
			break;
		case 10:
			math.evenOdd();
			break;
		default:
			System.out.println("Sorry !! Enter the correct number >>");
		}
		
		}while(true);
	}

}
