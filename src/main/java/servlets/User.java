package servlets;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String dateBirth;
    private String hearAboutUs;
    private String subscription;
    private String contactMethod;
    
    public User() {
        firstName = "";
        lastName = "";
        email = "";
        dateBirth = "";
    }
    
    public User(String firstName, String lastName, String email, String dateBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateBirth = dateBirth;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }
    
    public String getHearAboutUs() {
        return hearAboutUs;
    }

    public void setHearAboutUs(String hearAboutUs) {
        this.hearAboutUs = hearAboutUs;
    }

    public String getSubscription() {
        return subscription;
    }

    public void setSubscription(String subscription) {
        this.subscription = subscription;
    }

    public String getContactMethod() {
        return contactMethod;
    }

    public void setContactMethod(String contactMethod) {
        this.contactMethod = contactMethod;
    }

}


