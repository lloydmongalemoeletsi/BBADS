package co.za.discovery.atm.BankBalanceAndDispensingSystemFull.domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "CLIENT_ACCOUNT")
public class ClientAccount implements Serializable {
    @Id
    private String clientAccountNumber;
    @OneToOne
    @JoinColumn(name="clientId")
    private Client clientId;
    @OneToOne
    @JoinColumn(name="accountTypeCode")
    private AccountType accountTypeCode;
    @OneToOne
    @JoinColumn(name="currencyCode")
    private Currency currencyCode;
    private Float displayBalance;

    public ClientAccount() {
    }

    public ClientAccount(String clientAccountNumber, Client clientId, AccountType accountTypeCode, Currency currencyCode, Float displayBalance) {
        this.clientAccountNumber = clientAccountNumber;
        this.clientId = clientId;
        this.accountTypeCode = accountTypeCode;
        this.currencyCode = currencyCode;
        this.displayBalance = displayBalance;
    }

    public String getClientAccountNumber() {
        return clientAccountNumber;
    }

    public void setClientAccountNumber(String clientAccountNumber) {
        this.clientAccountNumber = clientAccountNumber;
    }

    public Client getClientId() {
        return clientId;
    }

    public void setClientId(Client clientId) {
        this.clientId = clientId;
    }

    public AccountType getAccountTypeCode() {
        return accountTypeCode;
    }

    public void setAccountTypeCode(AccountType accountTypeCode) {
        this.accountTypeCode = accountTypeCode;
    }

    public Currency getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(Currency currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Float getDisplayBalance() {
        return displayBalance;
    }

    public void setDisplayBalance(Float displayBalance) {
        this.displayBalance = displayBalance;
    }

    @Override
    public String toString() {
        return "ClientAccount{" +
                "clientAccountNumber='" + clientAccountNumber + '\'' +
                ", clientId=" + clientId +
                ", accountTypeCode='" + accountTypeCode + '\'' +
                ", currencyCode='" + currencyCode + '\'' +
                ", displayBalance=" + displayBalance +
                '}';
    }
}
