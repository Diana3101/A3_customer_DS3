package com.example.customer.dto;


import java.util.UUID;

public class CustomerDTO {

    private UUID id;
    private String firstName;
    private String lastName;
    private String size;

    public CustomerDTO() {
    }

    public CustomerDTO(String firstName, String lastName, String size) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.size = size;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


}
