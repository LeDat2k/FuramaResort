package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Customer extends Person{
    private String type;
    private String address;

    public String getType() {
        return type;
    }

    public void setType(String type) {
    // must be (Diamond, Platinium, Gold, Silver, Member)
        ArrayList <String> types = new ArrayList(
            Arrays.asList("Diamond", "Platinium", "Gold", "Silver", "Member")
        );
        for (String t : types) {
            if (t.toLowerCase().equals(type.toLowerCase())) {
                this.type = type;
                return;
            }
        }
        System.out.println("Wrong cutomer type");
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", gender=" + gender +
                ", cardId='" + cardId + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", type='" + type + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Customer(
        int id, String name, Date birthDate, boolean gender, String cardId, String phone, String email,
        String type, String address
    ) {
        super(id, name, birthDate, gender, cardId, phone, email);
        setType(type);
        setAddress(address);
    }
}
