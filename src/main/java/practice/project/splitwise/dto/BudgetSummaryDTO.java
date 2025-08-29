package practice.project.splitwise.dto;

import java.util.List;

public class BudgetSummaryDTO {
    private Integer userId;
    private String userName;
    private Integer month;
    private Integer year;
    private Double totalBudget;
    private Double totalSpent;
    private Double totalRemaining;
    private Double overallPercentageUsed;
    private List<BudgetDTO> categoryBudgets;
    private List<String> exceededCategories;
    private List<String> nearingLimitCategories;

    // Getters and Setters
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getTotalBudget() {
        return totalBudget;
    }

    public void setTotalBudget(Double totalBudget) {
        this.totalBudget = totalBudget;
    }

    public Double getTotalSpent() {
        return totalSpent;
    }

    public void setTotalSpent(Double totalSpent) {
        this.totalSpent = totalSpent;
    }

    public Double getTotalRemaining() {
        return totalRemaining;
    }

    public void setTotalRemaining(Double totalRemaining) {
        this.totalRemaining = totalRemaining;
    }

    public Double getOverallPercentageUsed() {
        return overallPercentageUsed;
    }

    public void setOverallPercentageUsed(Double overallPercentageUsed) {
        this.overallPercentageUsed = overallPercentageUsed;
    }

    public List<BudgetDTO> getCategoryBudgets() {
        return categoryBudgets;
    }

    public void setCategoryBudgets(List<BudgetDTO> categoryBudgets) {
        this.categoryBudgets = categoryBudgets;
    }

    public List<String> getExceededCategories() {
        return exceededCategories;
    }

    public void setExceededCategories(List<String> exceededCategories) {
        this.exceededCategories = exceededCategories;
    }

    public List<String> getNearingLimitCategories() {
        return nearingLimitCategories;
    }

    public void setNearingLimitCategories(List<String> nearingLimitCategories) {
        this.nearingLimitCategories = nearingLimitCategories;
    }
} 