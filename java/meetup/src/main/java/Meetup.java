import java.time.DayOfWeek;
import java.time.LocalDate;

public class Meetup {
    private final int year;
    private final int month;

    public Meetup(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public LocalDate day(DayOfWeek day, MeetupSchedule schedule) {
        LocalDate meetupDate = LocalDate.of(year, month, 1); // Start with the first day of the month

        switch (schedule) {
            case FIRST -> {
                while (meetupDate.getDayOfWeek() != day) {
                    meetupDate = meetupDate.plusDays(1);
                }
            }
            case SECOND -> {
                meetupDate = meetupDate.withDayOfMonth(8); // Start with the 8th day of the month
                while (meetupDate.getDayOfWeek() != day) {
                    meetupDate = meetupDate.plusDays(1);
                }
            }
            case THIRD -> {
                meetupDate = meetupDate.withDayOfMonth(15); // Start with the 15th day of the month
                while (meetupDate.getDayOfWeek() != day) {
                    meetupDate = meetupDate.plusDays(1);
                }
            }
            case FOURTH -> {
                meetupDate = meetupDate.withDayOfMonth(22); // Start with the 22nd day of the month
                while (meetupDate.getDayOfWeek() != day) {
                    meetupDate = meetupDate.plusDays(1);
                }
            }
            case LAST -> {
                meetupDate = meetupDate.withDayOfMonth(meetupDate.lengthOfMonth()); // Last day of the month
                while (meetupDate.getDayOfWeek() != day) {
                    meetupDate = meetupDate.minusDays(1);
                }
            }
            case TEENTH -> {
                meetupDate = meetupDate.withDayOfMonth(13); // Start with the 13th day of the month
                while (meetupDate.getDayOfWeek() != day) {
                    meetupDate = meetupDate.plusDays(1);
                }
            }
        }

        return meetupDate;
    }
}