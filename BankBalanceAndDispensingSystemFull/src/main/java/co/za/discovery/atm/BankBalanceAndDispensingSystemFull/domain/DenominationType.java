package co.za.discovery.atm.BankBalanceAndDispensingSystemFull.domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class DenominationType implements Serializable {
    @Id
    private String denominationTypeCode;
    private String description;

    public DenominationType() {
    }

    public DenominationType(String denominationTypeCode, String description) {
        this.denominationTypeCode = denominationTypeCode;
        this.description = description;
    }

    public String getDenominationTypeCode() {
        return denominationTypeCode;
    }

    public void setDenominationTypeCode(String denominationTypeCode) {
        this.denominationTypeCode = denominationTypeCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "DenominationType{" +
                "denominationTypeCode='" + denominationTypeCode + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
