package com.company;

import java.util.Objects;

public class User{


    // -------------------------------------------------------------------[ VARs ]----- //
    public int age;
    public String firstname, lastname, email, gender, city, state;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && firstname.equals(user.firstname) && lastname.equals(user.lastname) && email.equals(user.email) && gender.equals(user.gender) && city.equals(user.city) && state.equals(user.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, firstname, lastname, email, gender, city, state);
    }

    // -------------------------------------------------------------------[ Constructor ]----- //
    public User(String  str) {

        String[] userData = str.split(",");

        this.firstname = userData[0];
        this.lastname = userData[1];

        this.age = Integer.valueOf(userData[2]);

        this.email = userData[3];
        this.gender = userData[4];
        this.city = userData[5];
        this.state = userData[6];


    }

    // -------------------------------------------------------------------[ ToString ]----- //

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }



    // -------------------------------------------------------------------[ Getters & Setters ]----- //

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public String getFirstname() { return firstname; }

    public void setFirstname(String firstname) { this.firstname = firstname; }

    public String getLastname() { return lastname; }

    public void setLastname(String lastname) { this.lastname = lastname; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getGender() { return gender; }

    public void setGender(String gender) { this.gender = gender; }

    public String getCity() { return city; }

    public void setCity(String city) { this.city = city; }

    public String getState() { return state; }

    public void setState(String state) { this.state = state; }



}
