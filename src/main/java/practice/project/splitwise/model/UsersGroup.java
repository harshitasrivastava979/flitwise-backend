package practice.project.splitwise.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class UsersGroup extends BaseModel {
    private String name;
    private String description;
    private double totalAmountSpent;
    @Enumerated(EnumType.STRING)
    private Settled isSettled;
    @Enumerated(EnumType.STRING)
    private Currency defaultCurrency;

    @OneToMany
    private List<Expense> expenses;

    @ManyToMany(mappedBy = "usersGroups", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Users> users;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTotalAmountSpent() {
        return totalAmountSpent;
    }

    public void setTotalAmountSpent(double totalAmountSpent) {
        this.totalAmountSpent = totalAmountSpent;
    }

    public Settled getIsSettled() {
        return isSettled;
    }

    public void setIsSettled(Settled isSettled) {
        this.isSettled = isSettled;
    }

    public Currency getDefaultCurrency() {
        return defaultCurrency;
    }

    public void setDefaultCurrency(Currency defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
    }

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }
}
