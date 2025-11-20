package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTImeMain {

    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2000,3, 26, 5,26,13);
        System.out.println("현재 날짜와 시간 : " + nowDt);
        System.out.println("지정된 현재 날짜와 시간 : " + ofDt);

        //날짜와 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println(localTime);
        System.out.println(localDate);

        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println(localDateTime);

        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println(ofDtPlus);
        LocalDateTime ofDtPlus1Year = ofDt.plusYears(1);
        System.out.println(ofDtPlus1Year);

        //비교
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이전인가?" + nowDt.isBefore((ofDt)));
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이전인가?" + nowDt.isAfter((ofDt)));
        System.out.println("현재 날짜 시간이 지정 날짜 시간과 같은가?" + nowDt.isEqual((ofDt)));


    }
}
