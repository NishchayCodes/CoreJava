package coreJavaTraining;

import java.util.ArrayList;

public class PrintUniqueNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,2,2,2,1,4,4,1,9};
		
		ArrayList<Integer> ab=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			int k=0;
			if(!ab.contains(a[i])) {
				ab.add(a[i]);
				k++;
				
				for(int j=i+1;j<a.length;j++) {
					if(a[j]==a[i]) {
						k++;
					}
				}
				System.out.println(a[i]+"-"+k);
				if(k==1) {
					System.out.println(a[i]+" is unique element");
				}
			}
			
		}

	}

}
