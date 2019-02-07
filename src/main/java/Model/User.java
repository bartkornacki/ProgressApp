package Model;

public class User {
    private int id;
    private String user; //połaczenie name + sureName
    private String name;
    private String sureName;
    private String mail;
    private String number;


    public User(int id, String user, String name, String sureName, String mail, String number) {
        this.id = id;
        this.user = user;
        this.name = name;
        this.sureName = sureName;
        this.mail = mail;
        this.number = number;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
