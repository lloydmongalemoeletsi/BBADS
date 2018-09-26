package co.za.discovery.atm.BankBalanceAndDispensingSystemFull.domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class ClientSubType implements Serializable {
    @Id
    private String clientSubTypeCode;

    private String clientType;
    private String description;

    public ClientSubType() {
    }

    public ClientSubType(String clientSubTypeCode, String clientType, String description) {
        this.clientSubTypeCode = clientSubTypeCode;
        this.clientType = clientType;
        this.description = description;
    }

    public String getClientSubTypeCode() {
        return clientSubTypeCode;
    }

    public void setClientSubTypeCode(String clientSubTypeCode) {
        this.clientSubTypeCode = clientSubTypeCode;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ClientSubType{" +
                "clientSubTypeCode='" + clientSubTypeCode + '\'' +
                ", clientType='" + clientType + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
