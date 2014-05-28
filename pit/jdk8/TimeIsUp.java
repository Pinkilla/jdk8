package pit.jdk8;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class TimeIsUp {
    public static void main(String[] args) {
        Instant now = Instant.now();
        Instant twominutes = now.plus(Duration.ofMinutes(2));
        Instant nowagain = Instant.now();
        Duration duration = Duration.between(now, nowagain);
        System.out.println("Duration: " + duration.toMillis() + "ms");

        LocalDate myBirthday = LocalDate.of(1971, Month.AUGUST, 14);
        Period age = myBirthday.until(LocalDate.now());
        System.out.println("My age: " + age.getYears() + " years old");
        System.out.println("My age: " + age.toTotalMonths() + " months");
        DayOfWeek myBirthdayDayOfWeek = DayOfWeek.from(myBirthday);
        System.out.println(myBirthday.format(
                    DateTimeFormatter.ofPattern("d MMMM u"))
                + " was a "
                + myBirthdayDayOfWeek.getDisplayName(TextStyle.FULL,
                        Locale.ENGLISH));
        LocalDate firstMonday =
                myBirthday.with(TemporalAdjusters.firstInMonth(
                        DayOfWeek.MONDAY));
        System.out.println("In 1971, the first monday in august was the "
                + firstMonday.getDayOfMonth());

            
        
        



    }

}
