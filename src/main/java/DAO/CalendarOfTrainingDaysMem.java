package DAO;

import Model.CalendarOfTrainingDays;
import Model.TrainingDay;

import java.util.ArrayList;
import java.util.List;

public class CalendarOfTrainingDaysMem implements ICalendarOfTrainingDays {

    private List<TrainingDay> listOfTrainingDays = new ArrayList<>();

    @Override
    public boolean addTrainingDay(TrainingDay trainingDay) {
        return listOfTrainingDays.add(trainingDay);
    }

    @Override
    public boolean removeTrainingDay(int id) {
        return listOfTrainingDays.remove(getTrainingDayById(id));
    }

    // to be modified
    @Override
    public boolean editTrainingDay(int id, TrainingDay trainingDay) {
//        TrainingDay tempTrainingDay = getTrainingDayById(id);
//        tempTrainingDay
//        removeTrainingDay(id);
//        return listOfTrainingDays.add(id, trainingDay);
        return true;
    }

    @Override
    public TrainingDay getTrainingDayById(int id) {
        return getTrainingDayById(id);
    }

    @Override
    public List<TrainingDay> getCalendarOfTrainingDays() {
        return listOfTrainingDays;
    }
}
