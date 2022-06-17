package Inheritance;

import java.util.Scanner;

public class fact implements inf_demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			fact obj =new fact();
			obj.calc();
	}

	@Override
	public void calc() {
		// TODO Auto-generated method stub
		int n,f=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		while(n>0)
		{
			f*=n;
			n--;
		}
		System.out.println("The factorial is ="+f);
	}

}
