import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature value: ");
        double temp = sc.nextDouble();

        System.out.print("Enter the unit (C for Celsius, F for Fahrenheit): ");
        String unit = sc.next().trim().toUpperCase();

        if (unit.equals("C")) {
            double fahrenheit = (temp * 9.0 / 5.0) + 32;
            System.out.printf("%.2f°C is equal to %.2f°F%n", temp, fahrenheit);
        } else if (unit.equals("F")) {
            double celsius = (temp - 32) * 5.0 / 9.0;
            System.out.printf("%.2f°F is equal to %.2f°C%n", temp, celsius);
        } else {
            System.out.println("Invalid unit entered. Please enter 'C' or 'F'.");
        }

        sc.close();
    }
}