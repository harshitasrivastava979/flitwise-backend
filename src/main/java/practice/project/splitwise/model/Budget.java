package practice.project.splitwise.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Budget extends BaseModel {
    
    @ManyToOne
    @JoinColumn(name = "userId")
    private Users user;
    
    @Column(nullable = false)
    private String category;
    
    @Column(nullable = false)
    private Double monthlyLimit;
    
    @Column(nullable = false)
    private Integer month; // 1-12
    
    @Column(nullable = false)
    private Integer year;
    
    @Column(nullable = false)
    private Double amountSpent = 0.0;
    
    @Column(nullable = false)
    private Boolean isActive = true;
    
    // Manual getters and setters to ensure compilation
    public Users getUser() {
        return user;
    }
    
    public void setUser(Users user) {
        this.user = user;
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
    
    public Boolean getIsActive() {
        return isActive;
    }
    
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
    
    // Helper method to get remaining budget
    public Double getRemainingBudget() {
        return Math.max(0.0, monthlyLimit - amountSpent);
    }
    
    // Helper method to get percentage used
    public Double getPercentageUsed() {
        if (monthlyLimit == 0) return 0.0;
        return (amountSpent / monthlyLimit) * 100;
    }
    
    // Helper method to check if budget is exceeded
    public Boolean isExceeded() {
        return amountSpent > monthlyLimit;
    }
    
    // Helper method to check if budget is nearing limit (80% threshold)
    public Boolean isNearingLimit() {
        return getPercentageUsed() >= 80.0;
    }
} 