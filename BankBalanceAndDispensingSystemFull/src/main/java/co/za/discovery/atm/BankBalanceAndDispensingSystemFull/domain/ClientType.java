package co.za.discovery.atm.BankBalanceAndDispensingSystemFull.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class ClientType implements Serializable {
    @Id
    private String clientTypeCode;

    private String description;

    public ClientType() {
    }

    public ClientType(String clientTypeCode, String description) {
        this.clientTypeCode = clientTypeCode;
        this.description = description;
    }

    public String getClientType() {
        return clientTypeCode;
    }

    public void setClientTypeCode(String clientTypeCode) {
        this.clientTypeCode = clientTypeCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ClientType{" +
                "clientType='" + clientTypeCode + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
