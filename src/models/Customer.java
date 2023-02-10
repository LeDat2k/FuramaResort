package models;

import java.util.Date;

public class Customer extends Person{
    private String type;
    // (Diamond, Platinium, Gold, Silver, Member)
    private String address;

    public String getType() {
        return type;
    }

    public void setType(String type) {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
