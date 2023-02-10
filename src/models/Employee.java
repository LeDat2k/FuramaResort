package models;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Employee extends Person{
    private String level;
    private String position;
    private double salary;

    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        // level must be "Trung cấp", "Cao đẳng", "Đại học" và "sau đại học"
        ArrayList<String> levels = new ArrayList(
                Arrays.asList("Trung cấp", "Cao đẳng", "Đại học", "Sau đại học")
        );
        for (String lv : levels) {
            if (lv.toLowerCase().equals(level.toLowerCase())) {
                this.level = level;
                return;
            }
        }

        System.out.println("Wrong employee level");
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        //position must be Lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc.
        ArrayList<String> positions = new ArrayList(
           Arrays.asList("Lễ tân", "Phục vụ", "Chuyên viên", "Giám sát", "Quản lý", "Giám đốc")
        );
        for (String pos : positions) {
            if (pos.toLowerCase().equals(position.toLowerCase())) {
                this.position = position;
                return;
            }
        }

        System.out.println("Wrong employee position");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public Employee(
            int id, String name, Date birthDate, boolean gender, String cardId, String phone, String email,
            String level, String position, double salary
    ) {
        super(id, name, birthDate, gender, cardId, phone, email);
        setLevel(level);
        setPosition(position);
        this.salary = salary;
    }

    @Override
    public String toString() {

        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + new SimpleDateFormat("yyyy-MM-dd").format(birthDate) +
                ", gender=" + gender +
                ", cardId='" + cardId + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
