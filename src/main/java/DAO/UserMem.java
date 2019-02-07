package DAO;

import Model.User;

import java.util.ArrayList;
import java.util.List;

public class  UserMem implements IUser {

    private List<User> listOfUsers = new ArrayList<>();


    @Override
    public boolean addUser(User user) {
        return listOfUsers.add(user);
    }

    @Override
    public boolean removeUser(int id) {
        listOfUsers.remove(getUserById(id));
        return true;
    }

    @Override
    public boolean editUser(int id, User user) {
        listOfUsers.remove(id);
        return listOfUsers.add(user);
    }

    @Override
    public List<User> getAllUsers() {
        return listOfUsers;
    }

    @Override
    public User getUserById(int id) {
        return listOfUsers.get(id);
    }

    @Override
    public User getUserByName(String name) {
//        return listOfUsers.stream()
//                filter(x -> x.getN);
        return null;
    }
}
