import java.util.Scanner;

/**
 * Driver of the program
 */
public class ConvertorApps {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Currency Convertor by Armman Singh");

        boolean lcv = true;
        String formatString = "The given currency is %s, the given amount is %.2f  \nThe resulting value in %s is %.2f";

        Currency fromCurrency = null;
        Currency toCurrency = null;

        while (lcv) {
            System.out.println("Enter amount to continue, zero to exit: ");
            
            if (!sc.hasNextDouble()) {
                System.out.println("Invalid input!");
                break;
            }

            double userAmount = sc.nextDouble();
            sc.nextLine(); 

            if (userAmount == 0) {
                System.out.println("Exiting the converter.");
                break;
            }

            System.out.println("Choose the currency you have (USD, EU, CAD, INR, P): ");
            String currentCurrency = sc.nextLine();

            if (currentCurrency.equalsIgnoreCase("USD")) {
                fromCurrency = new USDollar();
            } else if (currentCurrency.equalsIgnoreCase("EU")) {
                fromCurrency = new Euro();
            } else if (currentCurrency.equalsIgnoreCase("CAD")) {
                fromCurrency = new CAD();
            } else if (currentCurrency.equalsIgnoreCase("INR")) {
                fromCurrency = new INR();
            } else if (currentCurrency.equalsIgnoreCase("P")) {
                fromCurrency = new Pound();
            } else {
                System.out.println("Unsupported currency. Exiting.");
                break;
            }

            System.out.println("Enter the currency you want to convert to (USD, EU, CAD, INR, P): ");
            String targetCurrency = sc.nextLine();

            if (targetCurrency.equalsIgnoreCase("USD")) {
                toCurrency = new USDollar();
            } else if (targetCurrency.equalsIgnoreCase("EU")) {
                toCurrency = new Euro();
            } else if (targetCurrency.equalsIgnoreCase("CAD")) {
                toCurrency = new CAD();
            } else if (targetCurrency.equalsIgnoreCase("INR")) {
                toCurrency = new INR();
            } else if (targetCurrency.equalsIgnoreCase("P")) {
                toCurrency = new Pound();
            } else {
                System.out.println("Unsupported currency. Exiting.");
                break;
            }

            Convertor converter = new Convertor(userAmount, fromCurrency, toCurrency);
            double convertedAmount = converter.convert();

            System.out.printf(formatString, currentCurrency, userAmount, targetCurrency, convertedAmount);
            System.out.println();
        }

        sc.close();
        System.out.println("Thank you for using the Currency Convertor!");
    }
}
