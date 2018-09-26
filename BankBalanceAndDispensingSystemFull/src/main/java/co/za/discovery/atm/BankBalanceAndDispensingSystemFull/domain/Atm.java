package co.za.discovery.atm.BankBalanceAndDispensingSystemFull.domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Atm implements Serializable {
    @Id
    private Integer atmId;
    private String name;
    private String location;

    public Atm() {
    }

    public Atm(Integer atmId, String name, String location) {
        this.atmId = atmId;
        this.name = name;
        this.location = location;
    }

    public Integer getAtmId() {
        return atmId;
    }

    public void setAtmId(Integer atmId) {
        this.atmId = atmId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Atm{" +
                "atmId=" + atmId +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
