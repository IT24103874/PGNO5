package com.example.inventorymanagement.model;

public abstract class user {
    protected String userId;
    protected String username;
    protected String password;
    protected String email;
    protected String contactNumber;

    public user(String userId, String username, String password, String email, String contactNumber) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.contactNumber = contactNumber;
    }

    // Getters
    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    // Abstract method for subclass to define role
    public abstract String getRole();

    // String representation for saving to file
    @Override
    public String toString() {
        return userId + "," + username + "," + password + "," + email + "," + contactNumber + "," + getRole();
    }
}
