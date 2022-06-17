package Inheritance;

public class multi_Demo3 extends multi_demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		disp();
		demo();
		multi_Demo3 obj=new multi_Demo3();
		obj.process();

	}
	public void process()
	{
		System.out.println("This is process method");
		disp();
	}

}
