import java.util.Scanner;

public class UnitConverter {

    // Length conversion
    public static double convertLength(double value, String from, String to) {
        if (from.equalsIgnoreCase("km") && to.equalsIgnoreCase("miles")) {
            return value * 0.621371;
        } else if (from.equalsIgnoreCase("miles") && to.equalsIgnoreCase("km")) {
            return value * 1.60934;
        } else if (from.equalsIgnoreCase("meters") && to.equalsIgnoreCase("km")) {
            return value / 1000;
        } else if (from.equalsIgnoreCase("km") && to.equalsIgnoreCase("meters")) {
            return value * 1000;
        }
        return -1;
    }

    // Weight conversion
    public static double convertWeight(double value, String from, String to) {
        if (from.equalsIgnoreCase("kg") && to.equalsIgnoreCase("pounds")) {
            return value * 2.20462;
        } else if (from.equalsIgnoreCase("pounds") && to.equalsIgnoreCase("kg")) {
            return value * 0.453592;
        }
        return -1;
    }

    // Temperature conversion
    public static double convertTemperature(double value, String from, String to) {
        if (from.equalsIgnoreCase("celsius") && to.equalsIgnoreCase("fahrenheit")) {
            return (value * 9 / 5) + 32;
        } else if (from.equalsIgnoreCase("fahrenheit") && to.equalsIgnoreCase("celsius")) {
            return (value - 32) * 5 / 9;
        } else if (from.equalsIgnoreCase("celsius") && to.equalsIgnoreCase("kelvin")) {
            return value + 273.15;
        } else if (from.equalsIgnoreCase("kelvin") && to.equalsIgnoreCase("celsius")) {
            return value - 273.15;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Unit Converter ===");
        System.out.print("Enter value: ");
        double value = scanner.nextDouble();

        System.out.print("Enter type (length/weight/temperature): ");
        String type = scanner.next();

        System.out.print("From unit: ");
        String from = scanner.next();

        System.out.print("To unit: ");
        String to = scanner.next();

        double result = -1;

        switch (type.toLowerCase()) {
            case "length":
                result = convertLength(value, from, to);
                break;
            case "weight":
                result = convertWeight(value, from, to);
                break;
            case "temperature":
                result = convertTemperature(value, from, to);
                break;
            default:
                System.out.println("Invalid type!");
                return;
        }

        if (result == -1) {
            System.out.println("Conversion not supported!");
        } else {
            System.out.println("Converted value: " + result + " " + to);
        }

        scanner.close();
    }
}
