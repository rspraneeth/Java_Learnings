package rsp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Branch {

    @Id
    private String bid;
    private String branchName;
    private String branchLocation;

    public Branch(){
        System.out.println("Branch class, zero param constructor for hibernate internal");
    }

    @Override
    public String toString() {
        return "Branch{" +
                "bid='" + bid + '\'' +
                ", branchName='" + branchName + '\'' +
                ", branchLocation='" + branchLocation + '\'' +
                '}';
    }

    public Branch(String bid, String branchName, String branchLocation) {
        this.bid = bid;
        this.branchName = branchName;
        this.branchLocation = branchLocation;
    }
}
