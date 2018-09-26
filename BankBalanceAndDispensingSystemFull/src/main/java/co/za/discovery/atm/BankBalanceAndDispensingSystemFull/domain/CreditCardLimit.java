package co.za.discovery.atm.BankBalanceAndDispensingSystemFull.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class CreditCardLimit implements Serializable {
    @Id
    private String clientAccountNumber;
    private Double accountLimit;

    public CreditCardLimit() {
    }

    public CreditCardLimit(String clientAccountNumber, Double accountLimit) {
        this.clientAccountNumber = clientAccountNumber;
        this.accountLimit = accountLimit;
    }

    public String getClientAccountNumber() {
        return clientAccountNumber;
    }

    public void setClientAccountNumber(String clientAccountNumber) {
        this.clientAccountNumber = clientAccountNumber;
    }

    public Double getAccountLimit() {
        return accountLimit;
    }

    public void setAccountLimit(Double accountLimit) {
        this.accountLimit = accountLimit;
    }

    @Override
    public String toString() {
        return "CreditCardLimit{" +
                "clientAccountNumber='" + clientAccountNumber + '\'' +
                ", accountLimit=" + accountLimit +
                '}';
    }
}
