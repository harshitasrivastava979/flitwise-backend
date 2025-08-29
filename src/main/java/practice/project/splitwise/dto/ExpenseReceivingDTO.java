package practice.project.splitwise.dto;

import java.util.List;

public class ExpenseReceivingDTO {
    private Integer groupID;
    private double amount;
    private String description;
    private Integer paidByUserID;
    private String splitType; // EQUAL, PERCENTAGE, EXACT, SHARES
    private String category;
    private String notes;
    private String timestamp;
    private Boolean recurring;
    private String interval;
    private String nextDueDate;
    private List<UserSplitReceivingDTO> userSplit;

    // Getters and Setters
    public Integer getGroupID() {
        return groupID;
    }

    public void setGroupID(Integer groupID) {
        this.groupID = groupID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPaidByUserID() {
        return paidByUserID;
    }

    public void setPaidByUserID(Integer paidByUserID) {
        this.paidByUserID = paidByUserID;
    }

    public String getSplitType() {
        return splitType;
    }

    public void setSplitType(String splitType) {
        this.splitType = splitType;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Boolean getRecurring() {
        return recurring;
    }

    public void setRecurring(Boolean recurring) {
        this.recurring = recurring;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public String getNextDueDate() {
        return nextDueDate;
    }

    public void setNextDueDate(String nextDueDate) {
        this.nextDueDate = nextDueDate;
    }

    public List<UserSplitReceivingDTO> getUserSplit() {
        return userSplit;
    }

    public void setUserSplit(List<UserSplitReceivingDTO> userSplit) {
        this.userSplit = userSplit;
    }
}
