package coreJavaTraining;

import java.text.*;
import java.util.Date;
//import java.time.DateTimeFormatter;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d=new Date();
	    SimpleDateFormat sd=new SimpleDateFormat("M/d/YYYY");
	    SimpleDateFormat sdf=new SimpleDateFormat("M/d/YYYY hh:mm:ss");

	    
//		SimpleDateFormat sd =new SimpleDateFormat("M/d/YYYY");
//		System.out.println(sd.format(d, null, null));
		System.out.println(d.toString());
		System.out.println(sd.format(d));
		System.out.println(sdf.format(d));
	}

}
