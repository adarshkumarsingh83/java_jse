package com.espark.adarsh.utils;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * Created by Adarsh on 8/20/15.
 */
public class TimeApiExample {

    /**
     * java.time.Period
     * Period is the amount of time in different unit like year, month or days.
     * An example of period can be like 1 year 5 month 10 days.
     */
    @Test
    public void period() {
        LocalDate start = LocalDate.now();
        System.out.println("Period.between:" + Period.between(start, LocalDate.MAX).getDays());
        System.out.println("Period.ofDays:" + Period.ofDays(5).getDays());
    }

    /**
     * java.time.Year
     * Year class represents year like 2014.
     * This class plays only with year. We can use it to know leap year or can fetch the current year.
     */
    @Test
    public void yearExample() {
        System.out.println("Year.now():" + Year.now());
        System.out.println("Year.MAX_VALUE:" + Year.MAX_VALUE);
        System.out.println("Year.isLeap(2014):" + Year.isLeap(2014));
        System.out.println("Year.isLeap(2016):" + Year.isLeap(2016));
    }

    /**
     * java.time.YearMonth
     * YearMonth is the class that represents the combination of year and month like 2014-09.
     * This class provides methods to get year and month for a given date string.
     */
    @Test
    public void yearMonth() {
        System.out.println("YearMonth.now():" + YearMonth.now());
        System.out.println("getMonthValue():" + YearMonth.parse("2014-09").getMonthValue());
        System.out.println("getYear():" + YearMonth.parse("2014-09").getYear());
        System.out.println("isLeapYear():" + YearMonth.parse("2014-09").isLeapYear());
    }

    /**
     * java.time.ZonedDateTime
     * ZonedDateTime class represents date and time with zone.
     * The example can be 2014-09-12T18:32:29.636+05:30[Asia/Calcutta].
     * This class provides the methods to get year, month, day, hour, minute, seconds and zone offset.
     */
    @Test
    public void zonedDateTimeExample() {
        System.out.println(ZonedDateTime.now());
        ZonedDateTime zdt = ZonedDateTime.parse("2014-09-12T10:15:30+01:00[Europe/Paris]");
        System.out.println("getDayOfYear:" + zdt.getDayOfYear());
        System.out.println("zdt.getYear():" + zdt.getYear());
    }

    /**
     * java.time.MonthDay
     * MonthDay represents the combination of the month and day. This class does not provide year.
     */
    @Test
    public void monthDay() {
        MonthDay mday = MonthDay.now();
        System.out.println(mday.getDayOfMonth());
        System.out.println(mday.getMonth());
        System.out.println(mday.atYear(2014));
    }

    /**
     * java.time.Month
     * Month is an enum and represents the complete months of the year.
     */
    @Test
    public void month() {
        System.out.println(Month.MARCH);
        System.out.println(Month.MARCH.getValue());
        System.out.println(Month.of(3));
        System.out.println(Month.valueOf("MARCH"));
    }

    /**
     * java.time.OffsetDateTime
     * OffsetDateTime represents all date and time fields.
     * This class represents date and time with an offset.
     */
    @Test
    public void offsetDateTime() {
        OffsetDateTime offsetDT = OffsetDateTime.now();
        System.out.println(offsetDT.getDayOfMonth());
        System.out.println(offsetDT.getDayOfYear());
        System.out.println(offsetDT.getDayOfWeek());
        System.out.println(offsetDT.toLocalDate());
    }

    /**
     * java.time.OffsetTime
     * OffsetTime represents time with an offset that can be viewed as hour-minute-second-offset.
     */
    @Test
    public void offSetTime() {
        OffsetTime offTime = OffsetTime.now();
        System.out.println(offTime.getHour() + " hour");
        System.out.println(offTime.getMinute() + " minute");
        System.out.println(offTime.getSecond() + " second");
    }

    /**
     * DateTimeFormatter Example
     * java.time.format.DateTimeFormatter provides formatting pattern to parse a character sequence.
     * There are many constant fields in DateTimeFormatter that can be used to format a date or time or
     * combination of both. In the example we are using some constant of DateTimeFormatter
     */
    @Test
    public void dateTimeFormatter() {
        LocalTime time = LocalTime.parse("10:15:30", DateTimeFormatter.ISO_TIME);
        System.out.println(time);
        LocalDate date = LocalDate.parse("20131206", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(date);
        LocalDateTime dateTime1 = LocalDateTime.parse("Thu, 5 Jun 2014 05:10:40 GMT", DateTimeFormatter.RFC_1123_DATE_TIME);
        System.out.println(dateTime1);
        LocalDateTime dateTime2 = LocalDateTime.parse("2014-11-03T11:15:30", DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(dateTime2);
        LocalDateTime dateTime3 = LocalDateTime.parse("2014-10-05T08:15:30+02:00", DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        System.out.println(dateTime3);
    }


    /**
     * DateTimeFormatterBuilder Example
     * If we want to create our own DateTimeFormatter object, then java.time.format.DateTimeFormatterBuilder
     * will help. All the formatter has been created using DateTimeFormatterBuilder.
     * There are different methods like appendValue, appendLiteral and appendText etc that is used to
     * generate a formatter
     */
    @Test
    public void dateTimeFormatterBuilder() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        DateTimeFormatter formatter = builder.appendLiteral("Day is:")
                .appendValue(ChronoField.DAY_OF_MONTH)
                .appendLiteral(", month is:")
                .appendValue(ChronoField.MONTH_OF_YEAR)
                .appendLiteral(", and year:")
                .appendPattern("u")
                .appendLiteral(" with the time:")
                .appendValue(ChronoField.HOUR_OF_DAY)
                .appendLiteral(":")
                .appendText(ChronoField.MINUTE_OF_HOUR, TextStyle.NARROW_STANDALONE)
                .toFormatter();
        LocalDateTime dateTime = LocalDateTime.now();
        String str = dateTime.format(formatter);
        System.out.println(str);
    }

    /**
     * LocalTime in Java 8
     * java.time.LocalTime is a time without time- zone that can be represented like hour-minute-second.
     * LocalTime is immutable and represents only time. It does not represent date or time zone.
     */
    @Test
    public void localTime() {
        LocalTime localt1 = LocalTime.now();
        System.out.println(localt1);
        LocalTime localt2 = LocalTime.now(Clock.systemDefaultZone());
        System.out.println(localt2);
        System.out.println(LocalTime.now(ZoneId.of("Indian/Cocos")));
        System.out.println(LocalTime.now(ZoneId.of("America/Caracas")));
        System.out.println(LocalTime.now(ZoneId.of("Pacific/Norfolk")));
    }


    /**
     * LocalDate in Java 8
     * java.time.LocalDate is an immutable class that represents local date like YYYY-MM-dd.
     * This class does not store time and time zone.
     */
    @Test
    public void localDate() {
        LocalDate localDate1 = LocalDate.now();
        System.out.println(localDate1);
        LocalDate localDate2 = LocalDate.now(Clock.systemDefaultZone());
        System.out.println(localDate2);
        System.out.println(LocalDate.now(ZoneId.of("Indian/Cocos")));
        System.out.println(LocalDate.now(ZoneId.of("America/Caracas")));
        System.out.println(LocalDate.now(ZoneId.of("Pacific/Norfolk")));
    }

    /**
     * LocalDateTime in Java 8
     * java.time.LocalDateTime is an immutable class that represents the combination of local date and local
     * time like 2009-11-06T10:18:30. LocalDateTime does not represent time zone
     */
    @Test
    public void localDateTime() {
        LocalDateTime localdt1 = LocalDateTime.now();
        System.out.println(localdt1);
        LocalDateTime localdt2 = LocalDateTime.now(Clock.systemDefaultZone());
        System.out.println(localdt2);
        System.out.println(LocalDateTime.now(ZoneId.of("Indian/Cocos")));
        System.out.println(LocalDateTime.now(ZoneId.of("America/Caracas")));
        System.out.println(LocalDateTime.now(ZoneId.of("Pacific/Norfolk")));

    }


    /**
     * DayOfWeek in Java 8
     * java.time.DayOfWeek is an immutable and thread-safe enum in java 8.
     * DayOfWeek represents the day of the week like MONDAY, TUESDAY etc.
     * DayOfWeek day has a numeric value too. We can get day name by numeric
     * value and can get numeric value by DAY also.
     */
    @Test
    public void dayOfWeek() {
        System.out.print(DayOfWeek.MONDAY.getValue());
        System.out.println(DayOfWeek.of(1));
        System.out.print(DayOfWeek.THURSDAY.getValue());
        System.out.println(DayOfWeek.of(2));
        System.out.print(DayOfWeek.SUNDAY.getValue());
        System.out.println(DayOfWeek.of(7));
    }

    /**
     * Duration in Java 8
     * java.time.Duration is an amount of time.
     * For example 20 minute is an amount of time that can be represented by Duration class.
     */
    @Test
    public void duration() {
        Duration duration = Duration.of(2, ChronoUnit.DAYS);
        System.out.println(duration.getSeconds());
        System.out.println(Duration.ofHours(1).getSeconds());
        System.out.println(Duration.ofDays(1).getSeconds());
    }

    /**
     * Instant in Java 8
     * java.time.Instant is same as its name. Instant can be used to record event time stamp in any application.
     * Instant object represents instantaneous point on a time scale.
     */
    @Test
    public void instant() {
        Instant inst1 = Instant.now();
        System.out.println(inst1.getEpochSecond());
        Instant inst2 = Instant.EPOCH;
        System.out.println(inst1.isAfter(inst2));
        Instant inst3 = Instant.now(Clock.systemUTC());
        System.out.println(inst3.isAfter(inst1));
        System.out.println(Instant.MAX.getNano());
        System.out.println(Instant.MIN.getNano());
    }


}
