package org.example.descooperation.nusrat;

import java.time.LocalDate;

public class Bill {
    private String billId, customerId;
    private int unitsConsumed;
    private double amountDue;
    private LocalDate dueDate;

    public Bill(String billId, String customerId, int unitsConsumed, double amountDue, LocalDate dueDate) {
        this.billId = billId;
        this.customerId = customerId;
        this.unitsConsumed = unitsConsumed;
        this.amountDue = amountDue;
        this.dueDate = dueDate;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getUnitsConsumed() {
        return unitsConsumed;
    }

    public void setUnitsConsumed(int unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
