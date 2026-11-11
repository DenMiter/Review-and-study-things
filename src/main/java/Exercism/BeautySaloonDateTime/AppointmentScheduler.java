package Exercism.BeautySaloonDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AppointmentScheduler {

    public LocalDateTime schedule(String str) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy HH:mm:ss");
        return LocalDateTime.parse(str, formatter);
    }

    public boolean hasPassed(LocalDateTime dateTime) {
        LocalDateTime now = LocalDateTime.now();
        if (dateTime.isBefore(now)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isAfternoonAppointment(LocalDateTime dateTime) {
        if (dateTime.getHour() >= 12 && dateTime.getHour() < 18) {
            return true;
        } else {
            return false;
        }
    }

    public String getDescription(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
                "'You have an appointment on' EEEE, MMMM d, yyyy, 'at' HH:mm a."
        );
        return dateTime.format(formatter);
    }

    public LocalDate getAnniversaryDate() {
        int currentYear = LocalDate.now().getYear();
        return LocalDate.of(currentYear, 9, 15);
    }

}