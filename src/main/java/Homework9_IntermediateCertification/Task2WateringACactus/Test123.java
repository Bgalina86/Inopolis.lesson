package Homework9_IntermediateCertification.Task2WateringACactus;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class Test123 {
    public static void main(String[] args) {
        YearMonth month = YearMonth.now();
        String firstDay = month.atDay(1).toString(),
                endDay = month.atEndOfMonth().toString();
        //System.out.println(firstAndLastDaysOfMonths(LocalDate.now()));
        System.out.println(firstDay);
        System.out.println(endDay);
    }
    static List<String> firstAndLastDaysOfMonths(final LocalDate date) {
        final LocalDate first = date.withDayOfMonth(2);
        final LocalDate last = first.plusMonths(1).minusDays(1);

        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd");
        return Arrays.asList(first.format(formatter), last.format(formatter));
    }
}
