package coreJavaTraining;




final class finalKeywordDemo {
	//final class can not be extended i.e. thiss class can not be used as a parent classs
	final void getData() {
		//final method can not be overridden
	}
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		final int i=4;
//		i=5;  final variable can not be modified.
		
		
		//Below code iss for access modifier lecture
		ArrayListExample ar=new ArrayListExample();
		ar.abc();
	}

}


