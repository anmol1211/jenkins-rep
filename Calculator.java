package basic_calculator;

import java.util.Scanner;

public class Calculator {
	private int percentage(int n9) {
		
		return n9/100;
	}

	
	private int div(int n7, int n8) {
		int res = n7 / n8;
		return res;
	}

	private int mult(int n5, int n6) {
		int res = n5 * n6;
		return res;
	}

	private int sub(int n3, int n4) {
		int res = n3 - n4;
		return res;
	}

	private int add(int n1, int n2) {
		int res = n1 + n2;
		return res;
	}
	
	
	
	public static void main(String[] args) {
		Calculator b = new Calculator();
		int choice;
		//Scanner sc = new Scanner(System.in);
		//do {
			System.out.println("0 Exit :");
			System.out.println("1.Adition :");
			System.out.println("2.Substraction :");
			System.out.println("3.Multiplication :");
			System.out.println("4.Divsion :");
			System.out.println("5.PerCentage :");
			System.out.println("Enter Choice :");
			//choice =sc.nextInt();
//			switch( )
//			{
//			case 1:
				System.out.println("Enter First Number :");
				//int n1 = sc.nextInt();
				System.out.println("Enter Second Number :");
				//int n2 = sc.nextInt();
				
				int res =b.add(5,5);
				System.out.println("Result :"+res);
				//break;
			//case 2:
				System.out.println("Enter First Number :");
				//int n3 = sc.nextInt();
				System.out.println("Enter Second Number :");
				//int n4 = sc.nextInt();
				
				int ress =b.sub(5,5);
				System.out.println("Result :"+ress);
				//break;
			///case 3:
				System.out.println("Enter First Number :");
				//int n5 = sc.nextInt();
				System.out.println("Enter Second Number :");
				//int n6 = sc.nextInt();
				
				int resss =b.mult(5,5);
				System.out.println("Result :"+resss);
			//	break;
			//case 4:
				System.out.println("Enter First Number :");
				//int n7 = sc.nextInt();
				System.out.println("Enter Second Number :");
				//int n8 = sc.nextInt();
				
				int res1 =b.div(5,5);
				System.out.println("Result :"+res1);
				//break;
				
			//case 5:
				System.out.println("Enter total marks to calCulate % :");
				//int n9 = sc.nextInt();
				int res3=b.percentage(500);
				System.out.println("Result :"+res3);
				//break;

				
			//}
			
		//} while (choice != 0);
		
		//sc.close();
		
	}


}
