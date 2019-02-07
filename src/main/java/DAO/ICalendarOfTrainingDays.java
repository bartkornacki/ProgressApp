package DAO;

import Model.CalendarOfTrainingDays;
import Model.TrainingDay;

public interface ICalendarOfTrainingDays {

    boolean addTrainingDay(TrainingDay trainingDay);

    boolean removeTrainingDay (TrainingDay trainingDay);

    boolean editTrainingDay (TrainingDay trainingDay);

    CalendarOfTrainingDays getCalendarOfTrainingDays ();

}
