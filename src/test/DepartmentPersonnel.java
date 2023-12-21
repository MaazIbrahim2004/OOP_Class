package test;

public abstract class DepartmentPersonnel implements Payable{
    Record record;
    String status;
    public Record getRecord() {
        return record;
    }
    public void setRecord(Record record) {
        this.record = record;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public abstract double invoice();

    @Override
    public String toString() {
        return "DepartmentPersonnel [record=" + record + ", status=" + status + "]";
    }
    public DepartmentPersonnel(Record record, String status) {
        this.record = record;
        this.status = status;
    }

}

