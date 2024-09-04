public class Currency {
    private String currencyName;
    private String currencyCode;
    private double conversionRateToUSD;

    public Currency(String currencyName, String currencyCode, double conversionRateToUSD) {
        this.currencyName = currencyName;
        this.currencyCode = currencyCode;
        this.conversionRateToUSD = conversionRateToUSD;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public double getConversionRateToUSD() {
        return conversionRateToUSD;
    }

    public double convertToUSD(double amount) {
        return amount * conversionRateToUSD;
    }

    public double convertFromUSD(double amount) {
        return amount / conversionRateToUSD;
    }

    @Override
    public String toString() {
        return "Currency: " + currencyName + " (" + currencyCode + ")";
    }
}
