package co.za.discovery.atm.BankBalanceAndDispensingSystemFull.domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Client implements Serializable {
    @Id
    private Integer clientId;
    private String title;
    private String name;
    private String surname;
    private Date dob;
    private String clientSubTypeCode;

    public Client() {
    }

    public Client(Integer clientId, String title, String name, String surname, Date dob, String clientSubTypeCode) {
        this.clientId = clientId;
        this.title = title;
        this.name = name;
        this.surname = surname;
        this.dob = dob;
        this.clientSubTypeCode = clientSubTypeCode;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDate() {
        return dob;
    }

    public void setDate(Date date) {
        this.dob = dob;
    }

    public String getClientSubTypeCode() {
        return clientSubTypeCode;
    }

    public void setClientSubTypeCode(String clientSubTypeCode) {
        this.clientSubTypeCode = clientSubTypeCode;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dob=" + dob +
                ", clientSubTypeCode='" + clientSubTypeCode + '\'' +
                '}';
    }
}
