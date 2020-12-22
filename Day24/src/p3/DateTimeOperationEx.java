package p3;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class DateTimeOperationEx {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재 날짜 시간 : "+now);
		
		LocalDateTime tarDateTime = null;
		
//		tarDateTime = now.withMonth(12);	직접 해당 날짜를 변경하는 메소드 with
		
		tarDateTime = now.with(TemporalAdjusters.firstDayOfYear());
		tarDateTime = now.with(TemporalAdjusters.lastDayOfYear());
		tarDateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.WEDNESDAY));
		//지난요일 (오늘 포함)
		tarDateTime = now.with(TemporalAdjusters.previousOrSame(DayOfWeek.THURSDAY));

		
		System.out.println(tarDateTime);
		
		

	}

}
