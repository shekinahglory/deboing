package com.deboing.web.domain.frontend;

import java.io.Serializable;

public class FeedBackPojo implements Serializable {

    private static final long serialVersionUID = 1l;

    private String email;
    private String firstName;
    private String lastName;
    private String feedBack;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getFeedBack() {
        return feedBack;
    }

    public void setFeedBack(String feedBack) {
        this.feedBack = feedBack;
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder("Feedback {");
        stringBuilder.append("email='").append(email).append('\'');
        stringBuilder.append("firstName='").append(firstName).append('\'');
        stringBuilder.append("lastName='").append(lastName).append('\'');
        stringBuilder.append("feedback='").append(feedBack).append('\'');
        stringBuilder.append('}');

        return stringBuilder.toString();
    }
}
