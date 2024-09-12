import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a temperature in Celsius: ");
        double tempCelsius = input.nextDouble();

        // Gotta remember the double here
        double tempFahrenheit = (9.0 / 5) * tempCelsius + 32;

        System.out.println(tempCelsius + " degrees Celsius is " + tempFahrenheit + " degrees Fahrenheit.");
    }
}