package QuestionTwo;

import QuestionTwo.Observers.AttendanceObserver;
import QuestionTwo.Subject.Student;

public class Q2_Driver
{
    public static void main(String[] args)
    {
        // Create a new Person object
        Student person = new Student();

        System.out.println("Initial attendance record: " + person.getAttendanceRecord());

        // Create an AgeChangeObserver and register it with the student
        AttendanceObserver observer = new AttendanceObserver(person);

        // Simulate going to class
        person.goToClass();
        // Simulate going to class again
        person.goToClass();
    }
}