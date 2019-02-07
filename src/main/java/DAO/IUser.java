package DAO;

import Model.User;

import java.util.List;

public interface IUser {

    boolean addUser(User user);

    boolean removeUser(int id);

    boolean editUser(int id, User user); //edit po polu zmiany an ie całośc = zmiana w pliku csv automatyczna

    List<User> getAllUsers();

    User getUserById(int id);

    User getUserByName(String name);


}
