package coreJavaTraining;

public class ChildclassDemo extends ParentclassDemo {

	public void getdata(int a) {
		System.out.println(a);
	}
	
	public void getdata(int a,int b) {
		System.out.println(b);
	}
	public void getdata(String a) {
		System.out.println(a);
	}
	
	public void engine() {
		System.out.println("Engine code is implemented.");
	}
	public void colour() {
		System.out.println(colour);
	}
	
	//Overriding Gear method
	public void gear() {
		System.out.println("child class gear");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ChildclassDemo c=new ChildclassDemo();
      c.engine();
      c.gear();
      c.colour();
      //Overloading getdata method
      c.getdata(2);
      c.getdata("hello");
      c.getdata(1, 3);
	}

}
