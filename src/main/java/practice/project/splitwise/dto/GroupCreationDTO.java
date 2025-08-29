package practice.project.splitwise.dto;

import practice.project.splitwise.model.Currency;
import practice.project.splitwise.model.Users;

import java.util.List;

public class GroupCreationDTO {
    private String name;
    private String description;
    private Currency currency;
    private List<Users> usersList;

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

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public List<Users> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<Users> usersList) {
        this.usersList = usersList;
    }
}
