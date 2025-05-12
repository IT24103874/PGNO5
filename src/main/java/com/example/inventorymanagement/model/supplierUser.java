package com.example.inventorymanagement.model;

public class supplierUser extends user {

    public supplierUser(String userId, String username, String password, String email, String contactNumber) {
        super(userId, username, password, email, contactNumber);
    }

    @Override
    public String getRole(){
        return "Supplier";
    }
}