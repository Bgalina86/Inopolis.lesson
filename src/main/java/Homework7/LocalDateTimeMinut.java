package Homework7;

public class LocalDateTimeMinut implements HumanReadableTimestamp
{
        @Override
        public String getTimestamp(java.time.LocalDateTime eventTimestamp)
        {
            return (String.valueOf(System.currentTimeMillis() / 1000L / 60));
        }
}
