package Lab7;

import java.util.*;

/**
 * An abstract class representing a student
 * that extends Comparable and includes methods and fields
 * related to student information and courses.
 * It also implements the Comparable interface to
 * enable comparison between Student objects based on their IDs.
 *
 * This class provides basic properties and methods to manage student information and courses.
 * Note that when you implement Comparable, it is possible that a warning
 * is given, which you should ignore for now, until we discuss Generic.
 */
public abstract class Student implements Comparable  { // abstract class can't be instantiated, but can be extended

    /*  Your implementation starts here
     * Recall that :
     * 1. No System.out.println statements should appear here.
     * 	  Instead, you need to return the result.
     * 2. No Scanner operations should appear here (e.g., input.nextInt()).
     *    Instead, refer to the input parameters of this method.
     */
    protected int id;
    protected String name;
    protected ArrayList<Course> courses; // list of courses that the student is enrolled in

    public Student() {}
    public abstract void addCourse(Course course) throws RegistrationException, PrerequisiteException;
    public int compareTo(Object o) { // compares two students
        if (this == o) return 0; // if the two students are the same, return 0
        if (!(o instanceof Student student)) return -1; // if the object is not a student, return -1
        return Integer.compare(this.id, student.id); // if the object is a student, compare the ids of the two students
        // returns 1 if the id of the current student is greater than the id of the other student
    }

    public abstract void dropCourse(Course course);
    public ArrayList<Course> getCourses() {// deep copy
        ArrayList<Course> copy = new ArrayList<Course>();
        for (Course course : this.courses) {
            copy.add(course);
        }
        return copy;
    }
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }

}


/**
 * A class representing a registered student.
 * This class extends the abstract class Student and provides methods and properties
 * specific to registered students and their course registrations.
 */
class RegisteredStudent extends Student {

    /*  Your implementation starts here
     * Recall that :
     * 1. No System.out.println statements should appear here.
     * 	  Instead, you need to return the result.
     * 2. No Scanner operations should appear here (e.g., input.nextInt()).
     *    Instead, refer to the input parameters of this method.
     */
    public RegisteredStudent(int id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new ArrayList<Course>(); // initialize the arraylist of courses
    }
    // this class implements the abstract methods from the abstract class Student

    public void addCourse(Course course) throws RegistrationException, PrerequisiteException {
        // Check if the course is offered
        if (!course.isOffered()) {
            throw new RegistrationException("Course is not offered");
        }

        // Check if the prerequisite is met if there is one
        if (course.getPrerequisite() != null && !this.courses.contains(course.getPrerequisite())) {
            throw new PrerequisiteException("Prerequisite course is not completed");
        }

        // If both checks pass, add the course
        this.courses.add(course);
    }
    public void dropCourse(Course course) {
        this.courses.remove(course);
    }
    @Override
    // compare courses based on their names
    public boolean equals(Object o) { // better way to do it as it takes into account all attributes
        if (this == o) return true;
        if (!(o instanceof RegisteredStudent student)) return false;
        return id == student.id && name.equals(student.name) && courses.equals(student.courses);
    }

    // Computes the hash code for this RegisteredStudent object, taking into account all attributes.
    @Override
    public int hashCode() {
        return Objects.hash(id, name, courses);
        // returns the hash code of the id, name, and courses
    }
}



/**
 * A class representing a course.
 * This class contains information about a course, including its name, prerequisite,
 * and whether it is currently offered.
 */
class Course {
    /*  Your implementation starts here
     * Recall that :
     * 1. No System.out.println statements should appear here.
     * 	  Instead, you need to return the result.
     * 2. No Scanner operations should appear here (e.g., input.nextInt()).
     *    Instead, refer to the input parameters of this method.
     */
    protected String name;
    protected boolean offered;
    protected Course prerequisite;

    public Course(String name, boolean offered) {
        this.name = name;
        this.offered = offered;
    }

    public Course(String name, Course prerequisite, boolean offered) {
        this.name = name;
        this.offered = offered;
        this.prerequisite = prerequisite;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course course)) return false;
        return Objects.equals(name, course.name) && offered == course.offered && Objects.equals(prerequisite, course.prerequisite);
    }

    public String getName() {
        return this.name;
    }
    public Course getPrerequisite() {
        return this.prerequisite;
    }
    public boolean isOffered() {
        return this.offered;
    }
    // Computes the hash code for this Course object, taking into account all attributes.
    @Override
    public int hashCode() {
        return Objects.hash(name, prerequisite, offered);
        // returns the hash code of the name, offered, and prerequisite
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrerequisite(Course prerequisite) {
        this.prerequisite = prerequisite;
    }
}




/**
 * A custom exception class representing an exception related to course registration.
 * This exception can be used to handle registration-related errors.
 */
class RegistrationException extends Exception { // extends Exception means that it inherits from the Exception class
    // so when we use RegistrationException, we can use the methods from the Exception class
    /*  Your implementation starts here
     * Recall that :
     * 1. No System.out.println statements should appear here.
     * 	  Instead, you need to return the result.
     * 2. No Scanner operations should appear here (e.g., input.nextInt()).
     *    Instead, refer to the input parameters of this method.
     */
    //Constructs a new RegistrationException with no detail message.
    public RegistrationException() {
        super(); // calls the constructor of the parent class, Exception
    }
    // Constructs a new RegistrationException with the specified detail message.
    public RegistrationException(String message) { // with this, when we create a new RegistrationException, we can pass a message to it
        super(message); // calls Exception, and passes the message to the parent class
    }
}

/**
 * A custom exception class representing an exception related to course prerequisites.
 * This exception can be used to handle errors related to course prerequisites.
 */
class PrerequisiteException extends RegistrationException {
    /*  Your implementation starts here
     * Recall that :
     * 1. No System.out.println statements should appear here.
     * 	  Instead, you need to return the result.
     * 2. No Scanner operations should appear here (e.g., input.nextInt()).
     *    Instead, refer to the input parameters of this method.
     */

    //Constructs a new PrerequisiteException with no detail message.
    public PrerequisiteException() {
        super(); // calls the constructor of the parent class, RegistrationException
    }
    // Constructs a new PrerequisiteException with the specified detail message.
    public PrerequisiteException(String message) { // with this, when we create a new PrerequisiteException, we can pass a message to it
        super(message); // calls RegistrationException, and passes the message to the parent class
    }
}
