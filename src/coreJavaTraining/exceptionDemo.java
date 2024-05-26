package coreJavaTraining;

public class exceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=7;
		int b=0;
//		int k=a/b;
//		System.out.println(k);
		
		try {
//			int k=a/b;
//			System.out.println(k);
			int[] arr=new int[5];
			System.out.println(arr[7]);
		}
		catch(IndexOutOfBoundsException ets) {
			 System.out.println("I caught the Index out of bound error/exception.");
		}
		  catch(ArithmeticException et) {
	    	   
	    	   System.out.println("I caught the Arithmetic error/exception.");
	       }
		catch(Exception e){
			System.out.println("I caught the error/exception.");
		}
		finally {
			System.out.println("delete cookies");
		}
     
	}

}
