package Inheritance;

public class interface_imp1 implements inf_demo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		interface_imp1 obj=new interface_imp1();
		obj.disp();
		

	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("Hii this is my class method used from interface");
		
	}

}
