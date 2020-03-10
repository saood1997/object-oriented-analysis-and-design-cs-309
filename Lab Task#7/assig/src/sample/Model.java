package sample;

import javafx.beans.property.SimpleStringProperty;

public class Model {
    private SimpleStringProperty Roll_no;
    private SimpleStringProperty Name;
    private SimpleStringProperty FName;
    private SimpleStringProperty Email;
    private SimpleStringProperty Address;
    private SimpleStringProperty Gender;


    public  Model(String Roll_no, String Name, String FName, String Gender, String Email, String Address) {
        this.Roll_no = new SimpleStringProperty(Roll_no);
        this.Name = new SimpleStringProperty(Name);
        this.FName = new SimpleStringProperty(FName);
        this.Gender = new SimpleStringProperty(Gender);
        this.Email = new SimpleStringProperty(Email);
        this.Address = new SimpleStringProperty(Address);
    }

    //GetFunctions

    public String getRollNo() {
        return Roll_no.get();
    }

    public String getName() {
        return Name.get();
    }

    public String getFName() {
        return FName.get();
    }

    public String getGender() {
        return Gender.get();
    }

    public String getEmail() {
        return Email.get();
    }

    public String getAddress() {
        return Address.get();
    }

//Set functions


    public void set_RollNo(String Roll_no) {
        this.Roll_no = new SimpleStringProperty(Roll_no);
    }

    public void set_Name(String Name) {
        this.Name = new SimpleStringProperty(Name);
    }

    public void set_FName(String FName) {
        this.FName = new SimpleStringProperty(FName);
    }

    public void set_Gender(String Gender) {
        this.Gender = new SimpleStringProperty(Gender);
    }

    public void set_Email(String Email) {
        this.Email = new SimpleStringProperty(Email);
    }

    public void set_Address(String Address) {
        this.Address = new SimpleStringProperty(Address);
    }
}
