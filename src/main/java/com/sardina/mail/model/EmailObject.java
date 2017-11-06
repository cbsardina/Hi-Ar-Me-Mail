package com.sardina.mail.model;

import java.time.format.DateTimeFormatter;

public class EmailObject {

    private String visitorEmail;  // sent to:
    private String visitorName;
    private String visitorComments;

    public EmailObject() { }

    public String getVisitorEmail() {
        return visitorEmail;
    }

    public void setVisitorEmail(String visitorEmail) {
        this.visitorEmail = visitorEmail;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public String getVisitorComments() {
        return visitorComments;
    }

    public void setVisitorComments(String visitorComments) {
        this.visitorComments = visitorComments;
    }

    @Override
    public String toString() {
        return "EmailObject{" +
                "visitorEmail='" + visitorEmail + '\'' +
                ", visitorName='" + visitorName + '\'' +
                ", visitorComments='" + visitorComments + '\'' +
                '}';
    }
}
