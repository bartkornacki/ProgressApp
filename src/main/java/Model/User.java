package Model;

import java.util.List;
import java.util.Objects;

public class User implements Comparable {
    private int id;
    private String user; //połaczenie name + sureName
    private String name;
    private String surname;
    private String mail;
    private String number;


    public User(int id, String user, String name, String surname, String mail, String number) {
        this.id = id;
        this.user = user;
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.number = number;
    }

    public String getUser(List<User> userByName) {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSurname() {
        return surname;
    }

    public void setSureName(String sureName) {
        this.surname = sureName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user1 = (User) o;
        return id == user1.id &&
                Objects.equals(user, user1.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user);
    }

//    @Override
//    public int compareTo(User o) {
//        return this.name.compareToIgnoreCase(o.name);
//    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
