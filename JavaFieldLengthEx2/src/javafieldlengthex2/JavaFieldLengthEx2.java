package javafieldlengthex2;

public class JavaFieldLengthEx2 {

  
    public static void main(String[] args) {
        // Number of days and time slots
        int numDays = 3;
        int numTimeSlots = 4;

        // Create a two-dimensional array to store temperature readings
        double[][] temperatureReadings = new double[numDays][numTimeSlots];

        // Populate the temperature readings (this is just an example)
        temperatureReadings[0] = new double[]{25.0, 26.5, 27.8, 24.5};
        temperatureReadings[1] = new double[]{23.5, 24.0, 22.7, 25.2};
        temperatureReadings[2] = new double[]{26.2, 27.3, 26.0, 25.8};

        // Display the temperature readings for each day and time slot
        for (int day = 0; day < temperatureReadings.length; day++) {
            for (int timeSlot = 0; timeSlot < temperatureReadings[day].length; timeSlot++) {
                System.out.println("Day " + (day + 1) + ", Time Slot " + (timeSlot + 1) +
                                   ": " + temperatureReadings[day][timeSlot] + "°C");
            }
        }
    }
}
