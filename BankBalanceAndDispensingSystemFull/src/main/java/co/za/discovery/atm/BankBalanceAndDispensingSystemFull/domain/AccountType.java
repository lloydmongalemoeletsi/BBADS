package co.za.discovery.atm.BankBalanceAndDispensingSystemFull.domain;



import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;

import java.io.Serializable;

@Entity
public class AccountType implements Serializable {
    @Id
    @Basic(optional = false)
    @Column(name = "ACCOUNT_TYPE_CODE")
    private String accountTypeCode;
    private String description;
    private Integer transactional;

    public AccountType() {
    }

    public AccountType(String accountTypeCode, String description, Integer transactional){
        this.accountTypeCode = accountTypeCode;
        this.description = description;
        this.transactional = transactional;
    }

    public String getAccountType() {
        return accountTypeCode;
    }

    public void setAccountTypeCode(String accountTypeCode) {
        this.accountTypeCode = accountTypeCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getTransactional() {
        return transactional;
    }

    public void setTransactional(Integer transactional) {
        this.transactional = transactional;
    }

    @Override
    public String toString() {
        return "AccountType{" +
                "accountTypeCode='" + accountTypeCode + '\'' +
                ", description='" + description + '\'' +
                ", transactional=" + transactional +
                '}';
    }
}
