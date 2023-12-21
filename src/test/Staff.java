package test;

public class Staff extends DepartmentPersonnel{

    public Staff(Record record, String status, int annualSalary) {
        super(record, status);
        this.annualSalary = annualSalary;
    }
    int annualSalary;

    public int getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }
    @Override
    public String toString() {
        return "Staff class no format";
    }
    @Override
    public double invoice() {
        return (this.annualSalary / 12) - ((this.annualSalary / 12) * TAXRATE);
    }
}
