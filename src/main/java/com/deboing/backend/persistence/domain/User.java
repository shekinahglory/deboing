package com.deboing.backend.persistence.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;


@Entity
public class User implements Serializable {

    private final static long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int userId;

    private String username;
    private String email;
    private String password;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "phone_number")
    private String phoneNumber;
    private String description;

    @Column(name = "strip_customer_id")
    private String stripCustomerId;
    private String country;
    @Column(name = "profile_image")
    private String profileImage;
    private boolean enabled;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "plan_id")
    private Plan plan;

    @OneToMany(mappedBy = "user")
    private List<Role> roles = new ArrayList<>();

//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private Set<UserRole> userRoles = new HashSet<>();

    public User(){

    }

    public List<Role> getRoles() {

        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

//    public Set<UserRole> getUserRoles() {
//        return userRoles;
//    }
//
//    public void setUserRoles(Set<UserRole> userRoles) {
//        this.userRoles = userRoles;
//    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phone_number) {
        this.phoneNumber = phone_number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStripCustomerId() {
        return stripCustomerId;
    }

    public void setStripCustomerId(String stripCustomerId) {
        this.stripCustomerId = stripCustomerId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userId == user.userId &&
                enabled == user.enabled &&
                Objects.equals(username, user.username) &&
                Objects.equals(email, user.email) &&
                Objects.equals(password, user.password) &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(phoneNumber, user.phoneNumber) &&
                Objects.equals(description, user.description) &&
                Objects.equals(stripCustomerId, user.stripCustomerId) &&
                Objects.equals(country, user.country) &&
                Objects.equals(profileImage, user.profileImage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, username, email, password, firstName, lastName, phoneNumber, description, stripCustomerId, country, profileImage, enabled);
    }
}
