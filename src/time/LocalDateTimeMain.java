package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {

        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2016, 8, 16, 8, 10, 1);

        System.out.println("현재 날짜시간 = " + nowDt);
        System.out.println("지정 날짜시간 = " + ofDt);

        System.out.println("==============");

        // 날짜와 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println(localDate);
        System.out.println(localTime);

        System.out.println("==============");

        // 날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime : " + localDateTime);

        System.out.println("==============");

        // 계산 (불변)
        LocalDateTime localDateTime1 = ofDt.plusDays(1000);
        System.out.println("지정 날짜시간 + 1000Days = " + localDateTime1);

        System.out.println("==============");

        LocalDateTime localDateTime2 = ofDt.plusYears(20);
        System.out.println("지정 날짜시간 + 100years = " + localDateTime2);


        System.out.println("==============");

        // 비교
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이전인가? = " + nowDt.isBefore(ofDt));
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이후인가? = " + nowDt.isAfter(ofDt));
        System.out.println("현재 날짜시간과 지정 날짜시간이 같은가? = " + nowDt.isEqual(ofDt));

    }
}
