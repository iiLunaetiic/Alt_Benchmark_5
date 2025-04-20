package QuestionTwo.Observers;

import QuestionTwo.Subject.Student;

/**
 * This class implements is the concrete observer that will be notified when the subject (Person) changes. It is responsible for
 * printing the age of the person when notified.
 *
 * @invariant subject != null
 */
public class AttendanceObserver extends AbsObserver
{
    private Student subject;

    /**
     * Constructor for the AttendanceObserver class. Upon creation of the observer, it immediately registers interest
     * with the parameterized subject.
     *
     * @param aSubject the subject to observe
     *
     *  @pre aSubject != null
     *
     *  @post subject = aSubject AND this observer registers interest with the subject aSubject (hint: use the 'this'
     *  keyword to refer to the current instance of the observer so that we can call the subject's addObserver method)
     */
    public AttendanceObserver(Student aSubject)
    {

    }

    /**
     * This method is used to notify the observer of the change.
     *
     * @pre attendanceRecord >= 0
     *
     * @post prints the total number of times the student has gone to class, in the format of
     *
     * "Student has gone to class <attendanceRecord> times"
     */
    @Override
    public void notifyClassAttendance()
    {

    }
}