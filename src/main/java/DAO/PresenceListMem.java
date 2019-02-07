package DAO;

import Model.TrainingDay;
import Model.User;

import java.util.ArrayList;
import java.util.List;

public class PresenceListMem implements IPresenceList {

    private List<User> presenceUserList = new ArrayList<>();
    private IUser user = new UserMem();

//jebać
    public PresenceListMem(IUser user) {
        this.user = user;
    }


    @Override
    public List<User> checkPresenceByUser(String name) {
//        presenceUserList.stream().filter(x->x.getUser(user.getUserByName(name))).findAny().orElse(null);
//        presenceUserList.stream().findAny().filter(x->x.getUser(user.getUserByName(name)))
        return null;
    }

    @Override
    public List<User> checkPresenceByUser(User user) {
//
        return null;
    }

    @Override
    public List<User> checkPresenceByTrainingDay(TrainingDay trainingDay) {
        return null;
    }

    @Override
    public boolean checkPresenceByAll() {
        return false;
    }

    @Override
    public boolean addPresence(User user, TrainingDay trainingDay) {
        return false;
    }

    @Override
    public boolean editPresence(User user, TrainingDay trainingDay) {
        return false;
    }
}
