package Inheritance;

import java.util.Scanner;

public class demo1 extends single_demo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		demo1 obj=new demo1();
		obj.process();
	

	}
	
	public void process()
	{
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		add(num1, num2);
		
	}

}




