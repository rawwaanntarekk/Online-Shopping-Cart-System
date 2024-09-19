package DAL.Models;

public class ShippingDetails {

    private String address;
    private String city;
    private String country;

    public ShippingDetails( String address, String city, String country) {
        this.address = address;
        this.city = city;
        this.country = country;
    }



    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "ShippingDetails:" +
                "\naddress='" + address + '\'' +
                "\ncity='" + city + '\'' +
                "\ncountry='" + country + '\'' ;
    }
}
