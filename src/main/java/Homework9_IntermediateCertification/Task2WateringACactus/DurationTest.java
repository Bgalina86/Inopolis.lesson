package Homework9_IntermediateCertification.Task2WateringACactus;

import java.time.LocalDateTime;

public class DurationTest {

    public static void main(String[] args) throws InterruptedException {
        LocalDateTime currentDate = LocalDateTime.now().now();

        int days = 0;
        int hours = 22;
        int minutes = 0;

        LocalDateTime timestamp = currentDate.minusDays(days).minusHours(hours)
            .minusMinutes(minutes);

        PostTimestamp test123 = new PostTimestamp();
        String timestampString = test123.getTimestamp(timestamp);
        System.out.println(timestampString);
    }

}
