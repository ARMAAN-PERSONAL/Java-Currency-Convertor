import java.util.HashMap;
import java.util.Map;

public class CurrencyManager {
    private Map<String, Currency> currencies = new HashMap<>();

    public CurrencyManager() {
        currencies.put("USD", new USDollar());
        currencies.put("EUR", new Euro());
        currencies.put("INR", new INR());
        currencies.put("GBP", new Pound());
        currencies.put("CAD", new CAD());
        currencies.put("JPY", new JPY());
        currencies.put("AUD", new AUD());
        currencies.put("CHF", new CHF());
        currencies.put("CNY", new CNY());
        currencies.put("RUB", new RUB());
        currencies.put("SEK", new SEK());
        currencies.put("NOK", new NOK());
        currencies.put("NZD", new NZD());
        currencies.put("ZAR", new ZAR());
        currencies.put("BRL", new BRL());
    }

    public Currency getCurrency(String code) {
        return currencies.get(code.toUpperCase());
    }

    public String[] getCurrencyNames() {
        return currencies.keySet().toArray(new String[0]);
    }
}
