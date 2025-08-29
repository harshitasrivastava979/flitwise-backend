package practice.project.splitwise.dto;

import java.util.List;

public class ExpenseDTO {
    private Integer id;
    private double amount;
    private String description;
    private String userName;
    private String splitType;
    private String category;
    private String notes;
    private String timestamp;
    private Boolean recurring;
    private String interval;
    private String nextDueDate;
    
    // Additional fields for frontend compatibility
    private Integer paidByUserID;
    private Integer groupID;
    private String groupName;
    private List<UserSplitReceivingDTO> userSplit;

    public ExpenseDTO() {
    }

    public ExpenseDTO(Integer id, double amount, String description, String userName, String splitType, String category, String notes, String timestamp, Boolean recurring, String interval, String nextDueDate, Integer paidByUserID, Integer groupID, String groupName, List<UserSplitReceivingDTO> userSplit) {
        this.id = id;
        this.amount = amount;
        this.description = description;
        this.userName = userName;
        this.splitType = splitType;
        this.category = category;
        this.notes = notes;
        this.timestamp = timestamp;
        this.recurring = recurring;
        this.interval = interval;
        this.nextDueDate = nextDueDate;
        this.paidByUserID = paidByUserID;
        this.groupID = groupID;
        this.groupName = groupName;
        this.userSplit = userSplit;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public Integer getPaidByUserID() {
        return paidByUserID;
    }

    public void setPaidByUserID(Integer paidByUserID) {
        this.paidByUserID = paidByUserID;
    }

    public Integer getGroupID() {
        return groupID;
    }

    public void setGroupID(Integer groupID) {
        this.groupID = groupID;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<UserSplitReceivingDTO> getUserSplit() {
        return userSplit;
    }

    public void setUserSplit(List<UserSplitReceivingDTO> userSplit) {
        this.userSplit = userSplit;
    }
}
