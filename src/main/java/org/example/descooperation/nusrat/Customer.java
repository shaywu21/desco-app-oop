package org.example.descooperation.nusrat;

public class Customer {
    private String  customerId, name, address, nid, contactNo, email;

    public Customer(String customerId, String name, String address, String nid, String contactNo, String email) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.nid = nid;
        this.contactNo = contactNo;
        this.email = email;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", nid='" + nid + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
