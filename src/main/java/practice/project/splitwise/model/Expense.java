package practice.project.splitwise.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Expense extends BaseModel {
    private double amount;
    private String description;
    private Settled isSettled;
    private String splitType; // EQUAL, PERCENTAGE, EXACT, SHARES
    private String category; // e.g., food, travel, etc.
    private String notes;
    private Date timestamp;
    private Boolean recurring;
    private String interval;
    private Date nextDueDate;

    @ManyToOne
    private Users paidBy;

    @OneToMany
    private List<UsersSplit> amountSplit;

    public Expense() {
    }

    public Expense(double amount, String description, Users paidBy) {
        this.amount = amount;
        this.description = description;
        this.paidBy = paidBy;
        ArrayList<UsersSplit> newUserSplit = new ArrayList<>();
        newUserSplit.add(new UsersSplit(paidBy, amount, null, null));
        this.amountSplit = newUserSplit;
    }

    /**
     * @param users list of users among whom we have to split equally
     * @return a complete expense object
     */
    public Expense splitEqually(List<Users> users) {
        int totalSplits = users.size();
        double eachSplitAmount = this.getAmount() / totalSplits;

        List<UsersSplit> usersSplits = new ArrayList<>();
        usersSplits.add(new UsersSplit(paidBy, amount, null, null));
        for (Users u : users) {
            usersSplits.add(new UsersSplit(u, -eachSplitAmount, null, null));
        }
        this.setAmountSplit(usersSplits);
        return this;
    }

    // Getters and Setters
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

    public Settled getIsSettled() {
        return isSettled;
    }

    public void setIsSettled(Settled isSettled) {
        this.isSettled = isSettled;
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

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
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

    public Date getNextDueDate() {
        return nextDueDate;
    }

    public void setNextDueDate(Date nextDueDate) {
        this.nextDueDate = nextDueDate;
    }

    public Users getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(Users paidBy) {
        this.paidBy = paidBy;
    }

    public List<UsersSplit> getAmountSplit() {
        return amountSplit;
    }

    public void setAmountSplit(List<UsersSplit> amountSplit) {
        this.amountSplit = amountSplit;
    }
}
