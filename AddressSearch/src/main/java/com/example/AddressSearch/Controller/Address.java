package com.example.AddressSearch.Controller;

/**
 * @author Dhandapani
 * This class is used to define the variable and override the values
 */
public class Address {

    private String house;
    private String street;
    private String postalCode;
    private String city;
    private String country;
    private String countryCode;

    public Address(String house, String street, String postcode, String city, String country, String countrycode) {

        this.house = house;
        this.street = street;
        this.postalCode = postcode;
        this.city = city;
        this.country = country;
        this.countryCode = countrycode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getPostcode() {
        return postalCode;
    }

    public void setPostcode(String postcode) {
        this.postalCode = postcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "house='" + house + '\'' +
                ", street='" + street + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", countryCode='" + countryCode + '\'' +
                '}';
    }
}
