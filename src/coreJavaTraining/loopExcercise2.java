package coreJavaTraining;

public class loopExcercise2 {

	public static void main(String[] args) {
		int k=1;
		for(int i=1;i<4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k*3);
				System.out.print("\t");
				k=k+1;
			}
			System.out.println("");
		}
	}
}
