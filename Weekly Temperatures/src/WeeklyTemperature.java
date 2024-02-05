import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTemperature {
    public static void main(String[] args) {
        ArrayList<String> days = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        //Input loop to get daily temperatures
        for (int i = 0; i < 7; i++) {
            System.out.println("Enter day of the week: ");
            String day = scanner.nextLine();
            days.add(day);

            System.out.print("Enter the average temperature for " + day + ": ");
            double temperature = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character

            temperatures.add(temperature);
        }

        //Display temperatures for each day
        System.out.println("\nTemperature for each day");
        for (int i = 0; i < 7; i++) {
            System.out.println(days.get(i) + ": " + temperatures.get(i));  
        }

        //Display weekly average
        double weeklyAverage = calculateAverage(temperatures);
        System.out.println("\nWeekly Average Temperature: " + weeklyAverage);
    }

    //Method to calculate the average of an ArrayList of doubles
    private static double calculateAverage(ArrayList<Double> list) {
        double sum = 0;
        for (double value : list) {
            sum += value;
        }
        return sum / list.size();
    }
  
}