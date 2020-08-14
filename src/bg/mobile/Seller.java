package bg.mobile;

public class Seller {

    private final boolean PERSON  ;

    private final String name;
    private  String phoneNumber;
    private  String location;

    public boolean isPERSON() {
        return PERSON;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Seller setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public Seller setLocation(String location) {
        this.location = location;
        return this;
    }

    public Seller(boolean PERSON, String name) {
        this.PERSON = PERSON;
        this.name = name;
    }
}
