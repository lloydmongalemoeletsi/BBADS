package co.za.discovery.atm.BankBalanceAndDispensingSystemFull.domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class CurrencyConversionRate implements Serializable {
    @Id
    private String currencyCode;
    private String conversionIndicator;
    private Double rate;

    public CurrencyConversionRate() {
    }

    public CurrencyConversionRate(String currencyCode, String conversionIndicator, Double rate) {
        this.currencyCode = currencyCode;
        this.conversionIndicator = conversionIndicator;
        this.rate = rate;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getConversionIndicator() {
        return conversionIndicator;
    }

    public void setConversionIndicator(String conversionIndicator) {
        this.conversionIndicator = conversionIndicator;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "CurrencyConversionRate{" +
                "currencyCode='" + currencyCode + '\'' +
                ", conversionIndicator='" + conversionIndicator + '\'' +
                ", rate=" + rate +
                '}';
    }
}
