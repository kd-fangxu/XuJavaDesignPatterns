package test;

/**
 * Created by developer on 2016/11/2.
 */
public class Student extends BaseObserver {
    String name;
    Teacher teacher;

    public Student(Teacher teacher) {

        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void update() {
        System.out.println(this.getName() + "收到" + teacher.getName() + "新手机号是：" + teacher.phoneNumber);
    }
}
