package com.bosscoder.lld.parkingLot;

public abstract class UserAccount {

    private String userName;
    private String password;
    private AccountStatus status;
    private Person person;

    public abstract boolean resetPassword();

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}

enum AccountStatus{
    ACTIVE,
    BLOCKED;
}
