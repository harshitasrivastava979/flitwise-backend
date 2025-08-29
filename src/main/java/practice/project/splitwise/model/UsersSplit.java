package practice.project.splitwise.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class UsersSplit extends BaseModel {
    @ManyToOne
    private Users user;

    private double amount;
    private Double percentage; // For percentage split
    private Integer shares;    // For shares/ratio split

    public UsersSplit() {
    }

    public UsersSplit(Users user, double amount, Double percentage, Integer shares) {
        this.user = user;
        this.amount = amount;
        this.percentage = percentage;
        this.shares = shares;
    }

    // Getters and Setters
    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public Integer getShares() {
        return shares;
    }

    public void setShares(Integer shares) {
        this.shares = shares;
    }
}
