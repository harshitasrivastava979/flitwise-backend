package practice.project.splitwise.dto;

public class BudgetDTO {
    private Integer id;
    private Integer userId;
    private String userName;
    private String category;
    private Double monthlyLimit;
    private Integer month;
    private Integer year;
    private Double amountSpent;
    private Double remainingBudget;
    private Double percentageUsed;
    private Boolean isExceeded;
    private Boolean isNearingLimit;
    private Boolean isActive;

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getMonthlyLimit() {
        return monthlyLimit;
    }

    public void setMonthlyLimit(Double monthlyLimit) {
        this.monthlyLimit = monthlyLimit;
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

    public Double getAmountSpent() {
        return amountSpent;
    }

    public void setAmountSpent(Double amountSpent) {
        this.amountSpent = amountSpent;
    }

    public Double getRemainingBudget() {
        return remainingBudget;
    }

    public void setRemainingBudget(Double remainingBudget) {
        this.remainingBudget = remainingBudget;
    }

    public Double getPercentageUsed() {
        return percentageUsed;
    }

    public void setPercentageUsed(Double percentageUsed) {
        this.percentageUsed = percentageUsed;
    }

    public Boolean getIsExceeded() {
        return isExceeded;
    }

    public void setIsExceeded(Boolean isExceeded) {
        this.isExceeded = isExceeded;
    }

    public Boolean getIsNearingLimit() {
        return isNearingLimit;
    }

    public void setIsNearingLimit(Boolean isNearingLimit) {
        this.isNearingLimit = isNearingLimit;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
} 