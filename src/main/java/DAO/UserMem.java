package DAO;

import Model.User;

import java.util.List;

public class UserMem implements IUser {
    @Override
    public boolean addUser(User user) {
        return false;
    }

    @Override
    public boolean removeUser(int id) {
        return false;
    }

    @Override
    public boolean editUser(int id, User user) {
        return false;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public User getUserByName(String name) {
        return null;
    }
}
