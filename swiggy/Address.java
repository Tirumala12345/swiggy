package swiggy;

public class Address {
    private String flatNo;
    private String street;
    private String city;
    private String pincode;

    public Address(String flatNo, String street, String city, String pincode) {
        this.flatNo = flatNo;
        this.street = street;
        this.city = city;
        this.pincode = pincode;
    }

    public String getFlatNo() {
        return flatNo;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getPincode() {
        return pincode;
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
