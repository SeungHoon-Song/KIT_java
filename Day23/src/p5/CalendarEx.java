package p5;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarEx {

	public static void main(String[] args) {
		String[] availableeDs = TimeZone.getAvailableIDs();
		for(String id : availableeDs ) {
			System.out.println(id);
		}
		
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		year = now.get(5);
		System.out.println(year);
		
		int month=now.get(2);	//Calendar.MONTH
		System.out.println(month+1);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		System.out.println(Calendar.WEDNESDAY);
		if(week==Calendar.WEDNESDAY)
			System.out.println("수요일");
		else
			System.out.println("수요일이 아닙니다.");
		
		int am_pm = now.get(Calendar.AM_PM);
		System.out.println(am_pm);
		System.out.println(Calendar.AM);
		System.out.println(Calendar.PM);
		//오전인가 오후인가를 나타내는 프로그램 작성
		if(Calendar.AM==now.get(Calendar.AM_PM))
			System.out.println("오전입니다.");
		else
			System.out.println("오후입니다.");
		System.out.println(now.get(Calendar.HOUR)+"시 "+now.get(Calendar.MINUTE)+"분 "+now.get(Calendar.SECOND)+"초");
		
	}
}
