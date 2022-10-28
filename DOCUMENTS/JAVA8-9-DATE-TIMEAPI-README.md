# Date & Time Api 

---

## java.time.LocalDate
* static now() current date 
* [LOCALDATE DOC](https://docs.oracle.com/javase/8/docs/api/java/time/LocalTime.html)
```
public final class java.time.LocalDate implements java.time.temporal.Temporal,java.time.temporal.TemporalAdjuster,java.time.chrono.ChronoLocalDate,java.io.Serializable {
  public static final java.time.LocalDate MIN;
  public static final java.time.LocalDate MAX;
  public static final java.time.LocalDate EPOCH;
  static final long DAYS_0000_TO_1970;
  public static java.time.LocalDate now();
  public static java.time.LocalDate now(java.time.ZoneId);
  public static java.time.LocalDate now(java.time.Clock);
  public static java.time.LocalDate of(int, java.time.Month, int);
  public static java.time.LocalDate of(int, int, int);
  public static java.time.LocalDate ofYearDay(int, int);
  public static java.time.LocalDate ofInstant(java.time.Instant, java.time.ZoneId);
  public static java.time.LocalDate ofEpochDay(long);
  public static java.time.LocalDate from(java.time.temporal.TemporalAccessor);
  public static java.time.LocalDate parse(java.lang.CharSequence);
  public static java.time.LocalDate parse(java.lang.CharSequence, java.time.format.DateTimeFormatter);
  public boolean isSupported(java.time.temporal.TemporalField);
  public boolean isSupported(java.time.temporal.TemporalUnit);
  public java.time.temporal.ValueRange range(java.time.temporal.TemporalField);
  public int get(java.time.temporal.TemporalField);
  public long getLong(java.time.temporal.TemporalField);
  public java.time.chrono.IsoChronology getChronology();
  public java.time.chrono.IsoEra getEra();
  public int getYear();
  public int getMonthValue();
  public java.time.Month getMonth();
  public int getDayOfMonth();
  public int getDayOfYear();
  public java.time.DayOfWeek getDayOfWeek();
  public boolean isLeapYear();
  public int lengthOfMonth();
  public int lengthOfYear();
  public java.time.LocalDate with(java.time.temporal.TemporalAdjuster);
  public java.time.LocalDate with(java.time.temporal.TemporalField, long);
  public java.time.LocalDate withYear(int);
  public java.time.LocalDate withMonth(int);
  public java.time.LocalDate withDayOfMonth(int);
  public java.time.LocalDate withDayOfYear(int);
  public java.time.LocalDate plus(java.time.temporal.TemporalAmount);
  public java.time.LocalDate plus(long, java.time.temporal.TemporalUnit);
  public java.time.LocalDate plusYears(long);
  public java.time.LocalDate plusMonths(long);
  public java.time.LocalDate plusWeeks(long);
  public java.time.LocalDate plusDays(long);
  public java.time.LocalDate minus(java.time.temporal.TemporalAmount);
  public java.time.LocalDate minus(long, java.time.temporal.TemporalUnit);
  public java.time.LocalDate minusYears(long);
  public java.time.LocalDate minusMonths(long);
  public java.time.LocalDate minusWeeks(long);
  public java.time.LocalDate minusDays(long);
  public <R> R query(java.time.temporal.TemporalQuery<R>);
  public java.time.temporal.Temporal adjustInto(java.time.temporal.Temporal);
  public long until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit);
  long daysUntil(java.time.LocalDate);
  public java.time.Period until(java.time.chrono.ChronoLocalDate);
  public java.util.stream.Stream<java.time.LocalDate> datesUntil(java.time.LocalDate);
  public java.util.stream.Stream<java.time.LocalDate> datesUntil(java.time.LocalDate, java.time.Period);
  public java.lang.String format(java.time.format.DateTimeFormatter);
  public java.time.LocalDateTime atTime(java.time.LocalTime);
  public java.time.LocalDateTime atTime(int, int);
  public java.time.LocalDateTime atTime(int, int, int);
  public java.time.LocalDateTime atTime(int, int, int, int);
  public java.time.OffsetDateTime atTime(java.time.OffsetTime);
  public java.time.LocalDateTime atStartOfDay();
  public java.time.ZonedDateTime atStartOfDay(java.time.ZoneId);
  public long toEpochDay();
  public long toEpochSecond(java.time.LocalTime, java.time.ZoneOffset);
  public int compareTo(java.time.chrono.ChronoLocalDate);
  int compareTo0(java.time.LocalDate);
  public boolean isAfter(java.time.chrono.ChronoLocalDate);
  public boolean isBefore(java.time.chrono.ChronoLocalDate);
  public boolean isEqual(java.time.chrono.ChronoLocalDate);
  static java.time.LocalDate readExternal(java.io.DataInput) throws java.io.IOException;
  public java.time.temporal.Temporal minus(long, java.time.temporal.TemporalUnit);
  public java.time.temporal.Temporal minus(java.time.temporal.TemporalAmount);
  public java.time.temporal.Temporal plus(long, java.time.temporal.TemporalUnit);
  public java.time.temporal.Temporal plus(java.time.temporal.TemporalAmount);
  public java.time.temporal.Temporal with(java.time.temporal.TemporalField, long);
  public java.time.temporal.Temporal with(java.time.temporal.TemporalAdjuster);
  public java.time.chrono.ChronoLocalDateTime atTime(java.time.LocalTime);
  public java.time.chrono.ChronoPeriod until(java.time.chrono.ChronoLocalDate);
  public java.time.chrono.ChronoLocalDate minus(long, java.time.temporal.TemporalUnit);
  public java.time.chrono.ChronoLocalDate minus(java.time.temporal.TemporalAmount);
  public java.time.chrono.ChronoLocalDate plus(long, java.time.temporal.TemporalUnit);
  public java.time.chrono.ChronoLocalDate plus(java.time.temporal.TemporalAmount);
  public java.time.chrono.ChronoLocalDate with(java.time.temporal.TemporalField, long);
  public java.time.chrono.ChronoLocalDate with(java.time.temporal.TemporalAdjuster);
  public java.time.chrono.Era getEra();
  public java.time.chrono.Chronology getChronology();
  public int compareTo(java.lang.Object);
}
```

## java.time.LocalTime
* [LOCALTIME DOC]("https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html")
* static now() current time 

```
public final class java.time.LocalTime implements java.time.temporal.Temporal, java.time.temporal.TemporalAdjuster, java.lang.Comparable<java.time.LocalTime>, java.io.Serializable {
 
  public static final java.time.LocalTime MIN;
  public static final java.time.LocalTime MAX;
  public static final java.time.LocalTime MIDNIGHT;
  public static final java.time.LocalTime NOON;
 
  static final int HOURS_PER_DAY;
  static final int MINUTES_PER_HOUR;
  static final int MINUTES_PER_DAY;
  static final int SECONDS_PER_MINUTE;
  static final int SECONDS_PER_HOUR;
  static final int SECONDS_PER_DAY;
  static final long MILLIS_PER_DAY;
  static final long MICROS_PER_DAY;
  static final long NANOS_PER_MILLI;
  static final long NANOS_PER_SECOND;
  static final long NANOS_PER_MINUTE;
  static final long NANOS_PER_HOUR;
  static final long NANOS_PER_DAY;
 
  public static java.time.LocalTime now();
  public static java.time.LocalTime now(java.time.ZoneId);
  public static java.time.LocalTime now(java.time.Clock);
  public static java.time.LocalTime of(int, int);
  public static java.time.LocalTime of(int, int, int);
  public static java.time.LocalTime of(int, int, int, int);
  public static java.time.LocalTime ofInstant(java.time.Instant, java.time.ZoneId);
  public static java.time.LocalTime ofSecondOfDay(long);
  public static java.time.LocalTime ofNanoOfDay(long);
  public static java.time.LocalTime from(java.time.temporal.TemporalAccessor);
  public static java.time.LocalTime parse(java.lang.CharSequence);
  public static java.time.LocalTime parse(java.lang.CharSequence, java.time.format.DateTimeFormatter);
 
  public boolean isSupported(java.time.temporal.TemporalField);
  public boolean isSupported(java.time.temporal.TemporalUnit);
  public java.time.temporal.ValueRange range(java.time.temporal.TemporalField);
  public int get(java.time.temporal.TemporalField);
  public long getLong(java.time.temporal.TemporalField);
  public int getHour();
  public int getMinute();
  public int getSecond();
  public int getNano();
  public java.time.LocalTime with(java.time.temporal.TemporalAdjuster);
  public java.time.LocalTime with(java.time.temporal.TemporalField, long);
  public java.time.LocalTime withHour(int);
  public java.time.LocalTime withMinute(int);
  public java.time.LocalTime withSecond(int);
  public java.time.LocalTime withNano(int);
  public java.time.LocalTime truncatedTo(java.time.temporal.TemporalUnit);
  public java.time.LocalTime plus(java.time.temporal.TemporalAmount);
  public java.time.LocalTime plus(long, java.time.temporal.TemporalUnit);
  public java.time.LocalTime plusHours(long);
  public java.time.LocalTime plusMinutes(long);
  public java.time.LocalTime plusSeconds(long);
  public java.time.LocalTime plusNanos(long);
  public java.time.LocalTime minus(java.time.temporal.TemporalAmount);
  public java.time.LocalTime minus(long, java.time.temporal.TemporalUnit);
  public java.time.LocalTime minusHours(long);
  public java.time.LocalTime minusMinutes(long);
  public java.time.LocalTime minusSeconds(long);
  public java.time.LocalTime minusNanos(long);
  public <R> R query(java.time.temporal.TemporalQuery<R>);
  public java.time.temporal.Temporal adjustInto(java.time.temporal.Temporal);
  public long until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit);
  public java.lang.String format(java.time.format.DateTimeFormatter);
  public java.time.LocalDateTime atDate(java.time.LocalDate);
  public java.time.OffsetTime atOffset(java.time.ZoneOffset);
  public int toSecondOfDay();
  public long toNanoOfDay();
  public long toEpochSecond(java.time.LocalDate, java.time.ZoneOffset);
  public int compareTo(java.time.LocalTime);
  public boolean isAfter(java.time.LocalTime);
  public boolean isBefore(java.time.LocalTime);
  void writeExternal(java.io.DataOutput) throws java.io.IOException;
  static java.time.LocalTime readExternal(java.io.DataInput) throws java.io.IOException;
  public java.time.temporal.Temporal minus(long, java.time.temporal.TemporalUnit);
  public java.time.temporal.Temporal minus(java.time.temporal.TemporalAmount);
  public java.time.temporal.Temporal plus(long, java.time.temporal.TemporalUnit);
  public java.time.temporal.Temporal plus(java.time.temporal.TemporalAmount);
  public java.time.temporal.Temporal with(java.time.temporal.TemporalField, long);
  public java.time.temporal.Temporal with(java.time.temporal.TemporalAdjuster);
  public int compareTo(java.lang.Object);
}
```
### LocalDateTime
* [LOCALDATETIME DOC]("https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html") 
* data and time combine  

```
public final class java.time.LocalDateTime implements java.time.temporal.Temporal, java.time.temporal.TemporalAdjuster, java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>, java.io.Serializable {
  public static final java.time.LocalDateTime MIN;
  public static final java.time.LocalDateTime MAX;
  public static java.time.LocalDateTime now();
  public static java.time.LocalDateTime now(java.time.ZoneId);
  public static java.time.LocalDateTime now(java.time.Clock);
 
  public static java.time.LocalDateTime of(int, java.time.Month, int, int, int);
  public static java.time.LocalDateTime of(int, java.time.Month, int, int, int, int);
  public static java.time.LocalDateTime of(int, java.time.Month, int, int, int, int, int);
  public static java.time.LocalDateTime of(int, int, int, int, int);
  public static java.time.LocalDateTime of(int, int, int, int, int, int);
  public static java.time.LocalDateTime of(int, int, int, int, int, int, int);
  public static java.time.LocalDateTime of(java.time.LocalDate, java.time.LocalTime);
 
  public static java.time.LocalDateTime ofInstant(java.time.Instant, java.time.ZoneId);
  public static java.time.LocalDateTime ofEpochSecond(long, int, java.time.ZoneOffset);
  public static java.time.LocalDateTime from(java.time.temporal.TemporalAccessor);
  public static java.time.LocalDateTime parse(java.lang.CharSequence);
  public static java.time.LocalDateTime parse(java.lang.CharSequence, java.time.format.DateTimeFormatter);
  public boolean isSupported(java.time.temporal.TemporalField);
  public boolean isSupported(java.time.temporal.TemporalUnit);
  public java.time.temporal.ValueRange range(java.time.temporal.TemporalField);
  public int get(java.time.temporal.TemporalField);
  public long getLong(java.time.temporal.TemporalField);
  public java.time.LocalDate toLocalDate();
 
  public int getYear();
  public int getMonthValue();
  public java.time.Month getMonth();
  public int getDayOfMonth();
  public int getDayOfYear();
  public java.time.DayOfWeek getDayOfWeek();
  public java.time.LocalTime toLocalTime();
  public int getHour();
  public int getMinute();
  public int getSecond();
  public int getNano();
 
  public java.time.LocalDateTime with(java.time.temporal.TemporalAdjuster);
  public java.time.LocalDateTime with(java.time.temporal.TemporalField, long);
  
  public java.time.LocalDateTime withYear(int);
  public java.time.LocalDateTime withMonth(int);
  public java.time.LocalDateTime withDayOfMonth(int);
  public java.time.LocalDateTime withDayOfYear(int);
  public java.time.LocalDateTime withHour(int);
  public java.time.LocalDateTime withMinute(int);
  public java.time.LocalDateTime withSecond(int);
  public java.time.LocalDateTime withNano(int);
 
  public java.time.LocalDateTime truncatedTo(java.time.temporal.TemporalUnit);
  public java.time.LocalDateTime plus(java.time.temporal.TemporalAmount);
  public java.time.LocalDateTime plus(long, java.time.temporal.TemporalUnit);

  public java.time.LocalDateTime plusYears(long);
  public java.time.LocalDateTime plusMonths(long);
  public java.time.LocalDateTime plusWeeks(long);
  public java.time.LocalDateTime plusDays(long);
  public java.time.LocalDateTime plusHours(long);
  public java.time.LocalDateTime plusMinutes(long);
  public java.time.LocalDateTime plusSeconds(long);
  public java.time.LocalDateTime plusNanos(long);
  public java.time.LocalDateTime minus(java.time.temporal.TemporalAmount);
  public java.time.LocalDateTime minus(long, java.time.temporal.TemporalUnit);
  public java.time.LocalDateTime minusYears(long);
  public java.time.LocalDateTime minusMonths(long);
  public java.time.LocalDateTime minusWeeks(long);
  public java.time.LocalDateTime minusDays(long);
  public java.time.LocalDateTime minusHours(long);
  public java.time.LocalDateTime minusMinutes(long);
  public java.time.LocalDateTime minusSeconds(long);
  public java.time.LocalDateTime minusNanos(long);
 
  public <R> R query(java.time.temporal.TemporalQuery<R>);
  public java.time.temporal.Temporal adjustInto(java.time.temporal.Temporal);
  public long until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit);
  public java.lang.String format(java.time.format.DateTimeFormatter);
  public java.time.OffsetDateTime atOffset(java.time.ZoneOffset);
  public java.time.ZonedDateTime atZone(java.time.ZoneId);
  public int compareTo(java.time.chrono.ChronoLocalDateTime<?>);
  public boolean isAfter(java.time.chrono.ChronoLocalDateTime<?>);
  public boolean isBefore(java.time.chrono.ChronoLocalDateTime<?>);
  public boolean isEqual(java.time.chrono.ChronoLocalDateTime<?>);
  
  public java.time.temporal.Temporal minus(long, java.time.temporal.TemporalUnit);
  public java.time.temporal.Temporal minus(java.time.temporal.TemporalAmount);
  public java.time.temporal.Temporal plus(long, java.time.temporal.TemporalUnit);
  public java.time.temporal.Temporal plus(java.time.temporal.TemporalAmount);
  public java.time.temporal.Temporal with(java.time.temporal.TemporalField, long);
  public java.time.temporal.Temporal with(java.time.temporal.TemporalAdjuster);
  public java.time.chrono.ChronoZonedDateTime atZone(java.time.ZoneId);
  public java.time.chrono.ChronoLocalDateTime minus(long, java.time.temporal.TemporalUnit);
  public java.time.chrono.ChronoLocalDateTime minus(java.time.temporal.TemporalAmount);
  public java.time.chrono.ChronoLocalDateTime plus(long, java.time.temporal.TemporalUnit);
  public java.time.chrono.ChronoLocalDateTime plus(java.time.temporal.TemporalAmount);
  public java.time.chrono.ChronoLocalDateTime with(java.time.temporal.TemporalField, long);
  public java.time.chrono.ChronoLocalDateTime with(java.time.temporal.TemporalAdjuster);
  public java.time.chrono.ChronoLocalDate toLocalDate();
  public int compareTo(java.lang.Object);
}
```

## Period 
* [PERIOD DOC ]("https://docs.oracle.com/javase/8/docs/api/java/time/Period.html")
```
public final class java.time.Period implements java.time.chrono.ChronoPeriod,java.io.Serializable {
  public static final java.time.Period ZERO;
  public static java.time.Period ofYears(int);
  public static java.time.Period ofMonths(int);
  public static java.time.Period ofWeeks(int);
  public static java.time.Period ofDays(int);
  public static java.time.Period of(int, int, int);
  public static java.time.Period from(java.time.temporal.TemporalAmount);
  public static java.time.Period parse(java.lang.CharSequence);
  public static java.time.Period between(java.time.LocalDate, java.time.LocalDate);
  public long get(java.time.temporal.TemporalUnit);
  public java.util.List<java.time.temporal.TemporalUnit> getUnits();
  public java.time.chrono.IsoChronology getChronology();
  public boolean isZero();
  public boolean isNegative();
  
  public int getYears();
  public int getMonths();
  public int getDays();
  
  public java.time.Period withYears(int);
  public java.time.Period withMonths(int);
  public java.time.Period withDays(int);
  public java.time.Period plus(java.time.temporal.TemporalAmount);
  public java.time.Period plusYears(long);
  public java.time.Period plusMonths(long);
  public java.time.Period plusDays(long);
  public java.time.Period minus(java.time.temporal.TemporalAmount);
  public java.time.Period minusYears(long);
  public java.time.Period minusMonths(long);
  public java.time.Period minusDays(long);
  public java.time.Period multipliedBy(int);
  public java.time.Period negated();
  public java.time.Period normalized();
  public long toTotalMonths();
  
  public java.time.temporal.Temporal addTo(java.time.temporal.Temporal);
  public java.time.temporal.Temporal subtractFrom(java.time.temporal.Temporal);

  public java.time.chrono.ChronoPeriod normalized();
  public java.time.chrono.ChronoPeriod negated();
  public java.time.chrono.ChronoPeriod multipliedBy(int);
  public java.time.chrono.ChronoPeriod minus(java.time.temporal.TemporalAmount);
  public java.time.chrono.ChronoPeriod plus(java.time.temporal.TemporalAmount);
  public java.time.chrono.Chronology getChronology();
}

```
