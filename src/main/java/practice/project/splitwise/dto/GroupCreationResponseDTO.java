package practice.project.splitwise.dto;

import practice.project.splitwise.model.Currency;

import java.util.List;

public class GroupCreationResponseDTO {
    private Integer id;
    private String name;
    private String description;
    private Currency currency;
    private Double totalSpending;
    private List<UserResponseDTO> usersList;

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Double getTotalSpending() {
        return totalSpending;
    }

    public void setTotalSpending(Double totalSpending) {
        this.totalSpending = totalSpending;
    }

    public List<UserResponseDTO> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<UserResponseDTO> usersList) {
        this.usersList = usersList;
    }
}
