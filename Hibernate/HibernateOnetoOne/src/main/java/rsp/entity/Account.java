package rsp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Account {

    @Id
    private String accNO;
    private String name;
    private String type;

    public Account() {
        System.out.println("Zero Parameterized constructor for hibernate, Account Class");
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNO='" + accNO + '\n' +
                ", name='" + name + '\n' +
                ", type='" + type + '\n' +
                '}';
    }

    public String getAccNO() {
        return accNO;
    }

    public void setAccNO(String accNO) {
        this.accNO = accNO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
