package DAO;

import Model.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UserMem implements IUser {

    private List<User> listOfUsers = new ArrayList<>();


    @Override
    public boolean addUser(User user) {
        return listOfUsers.add(user);
    }

    @Override
    public boolean removeUser(int id) {
        return listOfUsers.remove(getUserById(id));
    }

    // to be modified
    @Override
    public boolean editUser(int id, User user) {
        listOfUsers.remove(id);
        return listOfUsers.add(user);
    }

    @Override
    public List<User> getAllUsers() {
        try {
            Collections.sort(listOfUsers);
        } catch (Exception e) {

        }
        return listOfUsers;
    }

    @Override
    public User getUserById(int id) {
        return listOfUsers.get(id);
    }

    @Override
    public List<User> getUserByName(String name) {
        return listOfUsers.stream()
                .filter(x -> x.getName().contains(name))
                .collect(Collectors.toList());
    }
}
