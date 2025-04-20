package QuestionTwo.Subject;

import QuestionTwo.Observers.AbsObserver;
import java.util.List;
import java.util.LinkedList;


public class Student
{
    private List<AbsObserver> observers;
    private int attendanceRecord;

    /**
     * Constructor for the Student class. As the subject we're interested in, we need to set the default attendance record
     * and initialize the observers list to a new LinkedList.
     *
     * @pre none
     *
     * @post observers = new LinkedList AND age = "0"
     */
    public Student() {

    }

    /**
     * This method updates the student subject with a new attendance record equivalent to the current record + 1.
     * It also notifies all observers of this change.
     *
     * @pre none
     *
     * @post attendanceRecord = attendanceRecord + 1 AND notifies all observers to invoke their notifyClassAttendance method
     */
    public void goToClass() {

    }

    /**
     * This method adds an observer to the list of observers.
     *
     * @pre anObs != null
     *
     * @post observers = observers now includes the interested observer given by anObs AND age = #age
     */
    public void addObserver(AbsObserver anObs) {

    }

    /**
     * This method removes an observer from the list of observers.
     *
     * @pre anObs != null
     *
     * @post observers = observers now excludes the observer given by anObs AND age = #age
     */
    public void removeObserver(AbsObserver anObs) {

    }

    /**
     * This method returns the current attendance record of the student.
     *
     * @pre none
     *
     * @post getAge = attendanceRecord AND observers = #observers AND attendanceRecord = #attendanceRecord
     */
    public int getAttendanceRecord() {
        return -1; //note, this is just here to help you compile. You need to implement this method
    }

    /**
     * This method notifies all observers of the current state of the subject.
     *
     * @pre none
     *
     * @post invokes all interested observers' notifyClassAttendance method AND attendanceRecord = #attendanceRecord
     */
    public void notifyAllObservers() {

    }

}
