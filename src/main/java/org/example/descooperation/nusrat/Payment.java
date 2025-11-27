package org.example.descooperation.nusrat;

import java.time.LocalDate;

public class Payment {
    //- paymentId : String
    //- billId : String
    //- customerId : String
    //- amount : double
    //- paymentDate : LocalDate
    //- method : String
    private String paymentId, billId, customerId, method;
    private double amount;
    private LocalDate paymentDate;

    public Payment(String paymentId, String billId, String customerId, String method, double amount, LocalDate paymentDate) {
        this.paymentId = paymentId;
        this.billId = billId;
        this.customerId = customerId;
        this.method = method;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
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

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }
}
