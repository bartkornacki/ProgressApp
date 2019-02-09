package Model;

import java.util.List;

public class PresenceList {

    private List<CalendarOfTrainingDays> trainingDays;
    private List<User> listOfUsers;
    private boolean presentOrNot;

    public List<CalendarOfTrainingDays> getTrainingDays() {
        return trainingDays;
    }

    public void setTrainingDays(List<CalendarOfTrainingDays> trainingDays) {
        this.trainingDays = trainingDays;
    }

    public List<User> getListOfUsers() {
        return listOfUsers;
    }

    public void setListOfUsers(List<User> listOfUsers) {
        this.listOfUsers = listOfUsers;
    }

    public boolean isPresentOrNot() {
        return presentOrNot;
    }

    public void setPresentOrNot(boolean presentOrNot) {
        this.presentOrNot = presentOrNot;
    }
}
