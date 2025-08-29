package practice.project.splitwise.dto;

import practice.project.splitwise.model.Currency;
import practice.project.splitwise.model.Settled;

import java.util.List;

public class ExpenseResponseDTO {
    private String name;
    private String description;
    private Currency currency;
    private Double totalSpending;
    private Settled isGroupSettled;
    private List<ExpenseDTO> expenseDTOList;

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

    public Double getTotalSpending() {
        return totalSpending;
    }

    public void setTotalSpending(Double totalSpending) {
        this.totalSpending = totalSpending;
    }

    public Settled getIsGroupSettled() {
        return isGroupSettled;
    }

    public void setIsGroupSettled(Settled isGroupSettled) {
        this.isGroupSettled = isGroupSettled;
    }

    public List<ExpenseDTO> getExpenseDTOList() {
        return expenseDTOList;
    }

    public void setExpenseDTOList(List<ExpenseDTO> expenseDTOList) {
        this.expenseDTOList = expenseDTOList;
    }
}
