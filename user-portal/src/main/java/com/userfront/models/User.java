package com.userfront.models;

import java.util.List;

public class User
{
    private Long userId;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private boolean isEnabled = true;
    private PrimaryAccount primaryAccount;
    private SavingsAccount savingsAccount;
    private List<Appointment> appointmentList;
    private List<Recipient> recipientList;

    public Long getUserId()
    {
        return userId;
    }

    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public boolean isEnabled()
    {
        return isEnabled;
    }

    public void setEnabled(boolean enabled)
    {
        isEnabled = enabled;
    }

    public PrimaryAccount getPrimaryAccount()
    {
        return primaryAccount;
    }

    public void setPrimaryAccount(PrimaryAccount primaryAccount)
    {
        this.primaryAccount = primaryAccount;
    }

    public SavingsAccount getSavingsAccount()
    {
        return savingsAccount;
    }

    public void setSavingsAccount(SavingsAccount savingsAccount)
    {
        this.savingsAccount = savingsAccount;
    }

    public List<Appointment> getAppointmentList()
    {
        return appointmentList;
    }

    public void setAppointmentList(List<Appointment> appointmentList)
    {
        this.appointmentList = appointmentList;
    }

    public List<Recipient> getRecipientList()
    {
        return recipientList;
    }

    public void setRecipientList(List<Recipient> recipientList)
    {
        this.recipientList = recipientList;
    }
}
