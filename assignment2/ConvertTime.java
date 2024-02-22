package assignment2;

public class ConvertTime {
	public static void main(String[] args) {
		int total_sec=7500;
		 int remainingSeconds = total_sec % 3600;
		int hours=total_sec/3600;
		int minutes=remainingSeconds/60;
		int seconds=remainingSeconds%60;
		System.out.println("HH: "+hours+" MM: "+minutes+" Sec: "+seconds);
	}

}
