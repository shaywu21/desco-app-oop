package org.example.descooperation.nusrat;

public class User {
    private String  name, userId, contactNo, password,email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String name, String userId, String contactNo, String password, String email) {
        this.name = name;
        this.userId = userId;
        this.contactNo = contactNo;
        this.password = password;
        this.email = email;
    }

    public boolean login(String id,String pass){
        return this.userId.equals(id) && this.password.equals(pass);

    }

    public void logout(){
        System.out.println( "logged out successfully");
    }
}
