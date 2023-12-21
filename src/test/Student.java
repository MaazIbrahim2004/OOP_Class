package test;

public class Student extends DepartmentPersonnel{

    public Student(Record record, String status, int numofCredits, double financialAid) {
        super(record, status); // basically:
        // super.record = record;
        // super.status = status;
        // whats passed in the super constructor is the record and status that is passed in the constructor of the Student class
        this.numofCredits = numofCredits;
        this.financialAid = financialAid;
    }
    int numofCredits;
    double financialAid;
    @Override
    public double invoice() {
        return (this.numofCredits * this.CREDITRATE) - ((this.numofCredits * this.CREDITRATE) * this.financialAid);
    }
    @Override
    public String toString() {
        return "Student Class no format ";
    }
    public int getNumofCredits() {
        return numofCredits;
    }
    public void setNumofCredits(int numofCredits) {
        this.numofCredits = numofCredits;
    }
    public double getFinancialAid() {
        return financialAid;
    }
    public void setFinancialAid(double financialAid) {
        this.financialAid = financialAid;
    }

}
