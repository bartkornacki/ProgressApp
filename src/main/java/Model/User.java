package Model;

public class User {
    private int id;
    private String name;
    private String mail;
    private String number;

    public User(int id, String name, String mail, String number) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.number = number;
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
