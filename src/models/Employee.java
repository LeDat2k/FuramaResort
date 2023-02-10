package models;

import java.util.Date;

public class Employee extends Person{
    private String level;
    private String position;
    private double salary;

    public String getLevel() {
        return level;
    }
    //    Trung cấp, Cao đẳng, Đại học và sau đại học
    public void setLevel(String level) {
        if (level =="Trung cấp" || level=="Đại học" || level=="Sau đại học" || level=="Cao đẳng")
            this.level = level;

    }

    public String getPosition() {
        return position;
    }

//    Lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc.
    public void setPosition(String position) {
        if (position == "Lễ tân" || position == "phục vụ" || position == "chuyên viên" || position == "giám sát" || position == "quản lý" || position == "giám đốc")
            this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

//    public Employee() {
//    }

    public Employee(
            int id, String name, Date birthDate, boolean gender, String cardId, String phone, String email,
            String level, String position, double salary
    ) {
        super(id, name, birthDate, gender, cardId, phone, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    // khong theo tao con
}
