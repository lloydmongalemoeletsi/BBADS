package co.za.discovery.atm.BankBalanceAndDispensingSystemFull.domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class AtmLocation implements Serializable {
    @Id
    private Integer atmLocationId;
    private Integer atmId;
    private Integer denominationId;
    private Integer count;

    public AtmLocation() {
    }

    public AtmLocation(Integer atmLocationId, Integer atmId, Integer denominationId, Integer count) {
        this.atmLocationId = atmLocationId;
        this.atmId = atmId;
        this.denominationId = denominationId;
        this.count = count;
    }

    public Integer getAtmLocationId() {
        return atmLocationId;
    }

    public void setAtmLocationId(Integer atmLocationId) {
        this.atmLocationId = atmLocationId;
    }

    public Integer getAtmId() {
        return atmId;
    }

    public void setAtmId(Integer atmId) {
        this.atmId = atmId;
    }

    public Integer getDenominationId() {
        return denominationId;
    }

    public void setDenominationId(Integer denominationId) {
        this.denominationId = denominationId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "AtmLocation{" +
                "atmLocationId=" + atmLocationId +
                ", atmId=" + atmId +
                ", denominationId=" + denominationId +
                ", count=" + count +
                '}';
    }
}
