package p1;

import java.util.Calendar;

public class EnumEx01 {

	public static void main(String[] args) {
		
		Week today = null;
		Week reservationDay = null;
		
		Calendar cal = Calendar.getInstance();	//Calender클래스를 사용하게 힙 메모리에 올림
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);	//일:1 월:2 화:3 ...
		
		switch(week) {
		case 1:
			today=Week.SUNDAY;
			break;
		case 2: 
			today=Week.MONDAY;
			break;
		case 3:
			today=Week.TUESDAY;
			break;
		case 4: 
			today=Week.WEDNESDAY;
			break;
		case 5:
			today=Week.THURSDAY;
			break;
		case 6: 
			today=Week.FRIDAY;
			break;
		case 7: 
			today=Week.SATURDAY;
			break;		
		}
		System.out.println("오늘 요일 : "+today);
		String name = today.name();	//열거 객체의 문자열을 리턴
		System.out.println(name);
		today = Week.FRIDAY;
		int ord = today.ordinal();
		System.out.println(ord);	//열거 객체의 순번을 리턴
		int com =today.compareTo(Week.MONDAY);	//FRIDAY SUNDAY 비교 -2 FRIDAY FRIDAY 비교 0
		//FRIDAY SATURDAY 비교 -1 FRIDAY MONDAY 비교 4
		if(com==0)System.out.println("같은 날");
		else if(com<0)System.out.println("뒤에 있는 날");
		else System.out.println("앞에 있는 날");
		System.out.println(com);
		
		Week newToday = today.valueOf("TUESDAY");
		System.out.println(newToday);
		
		Week[] weekArray = newToday.values();
		//첨자변수 for문으로 출력
		for(int i=0;i<weekArray.length;i++) {
		System.out.print(weekArray[i]+" ");
		}
		System.out.println();
		//향상된 for문으로 출력
		for(Week fweekArray:weekArray) {
			System.out.print(fweekArray+" ");
		}
	}

}
