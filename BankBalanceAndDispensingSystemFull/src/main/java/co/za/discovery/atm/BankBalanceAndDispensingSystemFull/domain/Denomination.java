package co.za.discovery.atm.BankBalanceAndDispensingSystemFull.domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Entity
public class Denomination implements Serializable {
    @Id
    private Integer denominationId;
    private Float value;
    @OneToOne
    private DenominationType denominationTypeCode;

    public Denomination() {
    }

    public Denomination(Integer denominationId, Float value, DenominationType denominationTypeCode) {
        this.denominationId = denominationId;
        this.value = value;
        this.denominationTypeCode = denominationTypeCode;
    }

    public Integer getDenominationId() {
        return denominationId;
    }

    public void setDenominationId(Integer denominationId) {
        this.denominationId = denominationId;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public DenominationType getDenominationTypeCode() {
        return denominationTypeCode;
    }

    public void setDenominationTypeCode(DenominationType denominationTypeCode) {
        this.denominationTypeCode = denominationTypeCode;
    }

    @Override
    public String toString() {
        return "Denomination{" +
                "denominationId=" + denominationId +
                ", value=" + value +
                ", denominationTypeCode='" + denominationTypeCode + '\'' +
                '}';
    }
}
