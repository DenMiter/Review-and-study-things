package Exercism.BeautySaloonDateTime;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        AppointmentScheduler appointmentScheduler = new AppointmentScheduler();

        LocalDateTime localDateTime = appointmentScheduler.schedule("7/25/2019 13:45:00");

        //System.out.println(appointmentScheduler.hasPassed(localDateTime));

        //System.out.println(appointmentScheduler.isAfternoonAppointment(localDateTime));

        System.out.println(appointmentScheduler.getDescription(localDateTime));

        //System.out.println(appointmentScheduler.getAnniversaryDate());
    }

}
