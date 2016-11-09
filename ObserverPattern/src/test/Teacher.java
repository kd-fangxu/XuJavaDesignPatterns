package test;

/**
 * Created by developer on 2016/11/2.
 */
public class Teacher extends BaseSubject<Student> {
    String Name;
    String phoneNumber;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
