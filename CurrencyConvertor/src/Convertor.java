/**
 * Class to handle conversions
 */
public class Convertor {
    private double amount;
    private Currency fromCurrency;
    private Currency toCurrency;

    // Constructor to initialize the Convertor with the amount and the currencies
    public Convertor(double amount, Currency fromCurrency, Currency toCurrency) {
        this.amount = amount;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
    }

    // Method to perform the conversion
    public double convert() {
        // Convert amount to USD first
        double amountInUSD = fromCurrency.convertToUSD(amount);
        
        // Convert from USD to the target currency
        double amountInTargetCurrency = toCurrency.convertFromUSD(amountInUSD);
        
        return amountInTargetCurrency;
    }
}
