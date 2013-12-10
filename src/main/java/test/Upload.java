package test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Upload {
	public static void main(String[] args) {
		SimpleDateFormat sdf= new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		long time = 3377746854361l;
		java.util.Date dt = new Date(time);  
		String sDateTime = sdf.format(dt);  
		System.out.println(sDateTime);
	}
}
