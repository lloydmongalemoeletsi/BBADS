package co.za.discovery.atm.BankBalanceAndDispensingSystemFull.domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Currency implements Serializable {
    @Id
    private String currencyCode;

    private Integer decimalPlaces;
    private String description;

    public Currency() {
    }

    public Currency(String currencyCode, Integer decimalPlaces, String description) {
        this.currencyCode = currencyCode;
        this.decimalPlaces = decimalPlaces;
        this.description = description;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Integer getDecimalPlaces() {
        return decimalPlaces;
    }

    public void setDecimalPlaces(Integer decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
