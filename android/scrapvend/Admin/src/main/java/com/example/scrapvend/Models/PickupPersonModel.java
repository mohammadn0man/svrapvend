package com.example.scrapvend.Models;

public class PickupPersonModel {
    String name, adhaar_no, status, Username;
    String id, rating;
    float salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdhaar_no() {
        return adhaar_no;
    }

    public void setAdhaar_no(String adhaar_no) {
        this.adhaar_no = adhaar_no;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public PickupPersonModel(String name, String id , String adhaar_no)
{
    this.name=name;
    this.id=id;
    this.adhaar_no=adhaar_no;
}
}