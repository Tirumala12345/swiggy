package swiggy;

public class Address {
    public String flatNo;
    public String street;
    public String city;
    public String pincode;

    public Address(String flatNo, String street, String city, String pincode) {
        this.flatNo = flatNo;
        this.street = street;
        this.city = city;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "flatNo='" + flatNo + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
