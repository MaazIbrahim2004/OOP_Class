package test;

import java.util.*;

public class Department {
    private int countStudents = 0;
    private int countStaff = 0;
    private ArrayList<DepartmentPersonnel> PersonsList = new ArrayList<DepartmentPersonnel>();
    public Department() {
    }

    public void addPerson(DepartmentPersonnel person) throws Exception {

        if (person instanceof Student) { // if the person is a student
            if (countStudents >= 150) {
                throw new Exception("Too many students");
            }
            else {
                this.PersonsList.add(person);
                this.countStudents++;
            }
        }
        else if (person instanceof Staff) { // if the person is a staff
            if (countStaff >= 50) {
                //do nothing or throw error
            }
            else {
                this.PersonsList.add(person);
                this.countStaff++;
            }
        }
    }


    public boolean deletePerson(DepartmentPersonnel person) {
        for (DepartmentPersonnel desiredPerson: this.PersonsList) {
            if (desiredPerson.getRecord().getName().equals(person.getRecord().getName())) {
                // if the desired person, whose record name is the same as the person's record name
                this.PersonsList.remove(desiredPerson);
                if (desiredPerson instanceof Student) {
                    this.countStudents--;
                    return true;
                }
                if (desiredPerson instanceof Staff) {
                    this.countStaff--;
                    return true;
                }
            }
        }
        return false;
    }

    public ArrayList<Staff> getAllStaff(){
        ArrayList<Staff> returnStaff = new ArrayList<Staff>();
        for (DepartmentPersonnel onePerson: this.PersonsList) {
            if (onePerson instanceof Staff) {
                Staff castStaff = (Staff) onePerson;
                returnStaff.add(castStaff);
                // we must cast because we are returning an arraylist of Staff objects and not DepartmentPersonnel objects
            }
        }

        return returnStaff;
    }


    public ArrayList<Student> getAllStudents(){
        ArrayList<Student> returnStudents = new ArrayList<Student>();
        for (DepartmentPersonnel oneStudent: this.PersonsList) {
            if (oneStudent instanceof Student) {
                Student castStudent = (Student) oneStudent;
                returnStudents.add(castStudent);
            }
        }
        return returnStudents;
    }

    public DepartmentPersonnel getPersonByID(int ID) {
        for (DepartmentPersonnel onePerson: this.PersonsList) {
            int personID = onePerson.getRecord().getID();
            if (personID == ID) {
                return onePerson;
            }
        }
        return null;
    }

    public boolean hasPerson(String name) {
        for (DepartmentPersonnel onePerson: this.PersonsList) {
            String personName = onePerson.getRecord().getName();
            if (name.equals(personName)){
                return true;
            }
        }
        return false;
    }

    public double totalTuititons() {
        double totalTuitionReturn = 0.0;
        for (DepartmentPersonnel onePerson: this.PersonsList) {
            String personStatus = onePerson.getStatus();
            if (personStatus.equals("charged")) {
                totalTuitionReturn += onePerson.invoice();
            }
        }
        return totalTuitionReturn;
    }

    // sort(List, myList)
    // where List is the list you want to sort, and myList is the comparator you want to use
    // myList can be something like: new Comparator<DepartmentPersonnel>() {
    public void sortByName() { // I'm assuming this is what you meant by sort by name
        Collections.sort(this.PersonsList, new Comparator<DepartmentPersonnel>() {
            @Override
            public int compare(DepartmentPersonnel o1, DepartmentPersonnel o2) {
                return o1.getRecord().getName().compareTo(o2.getRecord().getName());
            }
        });
        // this.PersonsList is
    }
    public void printAll() {
        for (DepartmentPersonnel onePerson: this.PersonsList) {
            System.out.println(onePerson.toString());
            // use the toString method from the DepartmentPersonnel class
        }
    }
}


