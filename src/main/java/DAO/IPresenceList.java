package DAO;

import Model.TrainingDay;
import Model.User;

import java.util.List;

public interface IPresenceList {


    List<User> checkPresenceByUser(String name);

    List<User> checkPresenceByUser(User user);

    List<User> checkPresenceByTrainingDay(TrainingDay trainingDay);

    boolean checkPresenceByAll();

    boolean addPresence(User user, TrainingDay trainingDay);

    boolean editPresence(User user, TrainingDay trainingDay);
}
