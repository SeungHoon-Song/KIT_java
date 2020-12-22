package p2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;


public class DateTimeInfoEx {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재 날짜 : "+now);
		
		String strDateTime = now.getYear()+"년";
		strDateTime += now.getMonth() + "월";
		strDateTime += now.getDayOfMonth()+"일";
		strDateTime += now.getDayOfWeek()+" ";
		strDateTime += now.getHour()+"시";
		strDateTime += now.getSecond()+"초";
		strDateTime += now.getNano()+"나노초";
		
		System.out.println(strDateTime);
		
		LocalDate nowDate = now.toLocalDate();	//LocalDateTime --> LocalDate
		if(nowDate.isLeapYear()) {
			System.out.println("윤년");
		}
		else {
			System.out.println("평년");
		}
		
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정 세계시 : "+utcDateTime);
		ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("서울 타임 존 : "+seoulDateTime);
		ZoneId seoulZoneId = seoulDateTime.getZone();
		System.out.println("서울 존 아이디 : "+seoulZoneId);
		ZoneOffset seoulZoneOffset = seoulDateTime.getOffset();
		System.out.println("서울 존 오프셋 : "+seoulZoneOffset);
		

	}

}
