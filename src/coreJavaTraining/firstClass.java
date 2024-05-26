package coreJavaTraining;

public class firstClass {


	static int a=4;
	//Method
	public void getData() {
		System.out.println("I am in method");
	}
	//Objects are references/instances of a class.
	//Objects are used to call variables and methods of a class inside main method.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating object of firstClass
		firstClass fn=new firstClass();
		secondClass sn=new secondClass();
		sn.setData();
		fn.getData();
     System.out.println("Hello World");
     System.out.println(fn.a);
     System.out.println("Hi");
     System.out.println(a);
     


	}

}
