package DAO;

import Model.CalendarOfTrainingDays;
import Model.TrainingDay;

import java.util.List;

public interface ICalendarOfTrainingDays {

    boolean addTrainingDay(TrainingDay trainingDay);

    boolean removeTrainingDay (int id);

    boolean editTrainingDay (int id, TrainingDay trainingDay);

    TrainingDay getTrainingDayById (int id);

    List<TrainingDay> getCalendarOfTrainingDays ();

}
