package test;

public class Record {
    int ID;
    String name;
    String address;
    String dateofbirth;

    public Record(int iD, String name, String address, String dateofbirth) {
        ID = iD;
        this.name = name;
        this.address = address;
        this.dateofbirth = dateofbirth;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    @Override
    public String toString() {
        return "This is the record class. No format provided but I'm assuming the fields are necessary";
    }
}
