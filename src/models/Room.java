package models;

public class Room extends Facility{
    private String additionalService;

    public String getAdditionalService() {
        return additionalService;
    }

    public void setAdditionalService(String additionalService) {
        this.additionalService = additionalService;
    }

    public Room() {
    }

    public Room(String additionalService) {
        this.additionalService = additionalService;
    }
}
