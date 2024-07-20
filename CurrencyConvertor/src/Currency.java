/**
 * This class is to store information about a currency
 */
public class Currency {
	public String currencyName;
	public String currencyCode;
	public double conversionRateToUSD; // Assuming USD to be the base Currency
	
	/**
	 * Custom constructor
	 * @param currencyName Stores name of the currency
	 * @param currencyCode Stores the currency code
	 * @param conversionRateToUSD Stores nummeric value of conversion rate in USD
	 */
	public Currency(String currencyName, String currencyCode, double conversionRateToUSD) {
		super();
		this.currencyName = currencyName;
		this.currencyCode = currencyCode;
		this.conversionRateToUSD = conversionRateToUSD;
	}

	// Accessors and Mutators
	public String getCurrencyName() {
		return currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public double getConversionRateToUSD() {
		return conversionRateToUSD;
	}

	public void setConversionRateToUSD(double conversionRateToUSD) {
		this.conversionRateToUSD = conversionRateToUSD;
	}
	
	/**
	 * toString to generate the currency description
	 */
	public String toString() {
		return "The currency chosen is " + currencyName;
	}
	
	/**
	 * Method to convert the currency value to USD
	 * @param amount the value of currency given
	 * @return the value of the currency in USD
	 */
	public double convertToUSD(double amount) {
		return amount * conversionRateToUSD;
	}
	
	public double convertFromUSD(double amount) {
		return amount / conversionRateToUSD;
	}

	
}
