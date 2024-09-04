public class Convertor {
    private double amount;
    private Currency fromCurrency;
    private Currency toCurrency;

    public Convertor(double amount, Currency fromCurrency, Currency toCurrency) {
        this.amount = amount;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
    }

    public double convert() {
        double amountInUSD = fromCurrency.convertToUSD(amount);
        return toCurrency.convertFromUSD(amountInUSD);
    }
}
