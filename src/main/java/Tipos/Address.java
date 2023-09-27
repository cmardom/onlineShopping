package Tipos;

public class Address {
    private String street;
    private int number;
    private String city;
    private int postal_code;
    private String country;

    public Address(String street, int number, String city, int postal_code, String country) {
        this.street = street;
        this.number = number;
        this.city = city;
        this.postal_code = postal_code;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(int postal_code) {
        this.postal_code = postal_code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
