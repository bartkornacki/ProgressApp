package DAO;

import Model.TrainingDay;
import Model.User;
import Model.PresenceList;


import java.util.List;

public interface IPresenceList {


    List<PresenceList> checkPresenceByUser(String name);

    List<PresenceList> checkPresenceByUser(User user);

    List<PresenceList> checkPresenceByTrainingDay(TrainingDay trainingDay);

    boolean checkPresenceByAll();

    boolean addPresence(User user, TrainingDay trainingDay);

    boolean editPresence(User user, TrainingDay trainingDay);
}
