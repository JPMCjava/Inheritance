package Inheritance;

import java.util.Scanner;

public class add_demo implements inf_demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add_demo obj=new add_demo();
		obj.calc();

	}

	@Override
	public void calc() {
		// TODO Auto-generated method stub
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number");
		n1=sc.nextInt();
		n2=sc.nextInt();
		System.out.println("The add is ="+ (n1+n2));
	}

}
