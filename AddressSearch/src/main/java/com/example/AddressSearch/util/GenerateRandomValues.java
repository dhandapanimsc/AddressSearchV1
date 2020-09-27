package com.example.AddressSearch.util;
import java.util.*;

/**
 * @author Dhandapani
 * This class is used to get random values
 */
public class GenerateRandomValues {
    public String getRandomNumber(int size)
    {
        Random rand = new Random();
        // Generate random integers
        int rand_int = rand.nextInt(size);
        String value=String.valueOf(rand_int);
        return value;
    }
    public String getCityName(String countryName) throws InterruptedException {
        String countryCode = getCountryCode(countryName);
        List<String> list = new ArrayList<>();
        switch (countryCode){
            case "USA":
                list.add("Dallas");
                list.add("San Jose");
                break;
            case "CAN":
                list.add("Montreal");
                list.add("Toronto");
                break;
            case "NLD":
                list.add("Amsterdam");
                list.add("Rotterdam");
                break;
            case "MEX":
                list.add("Guadalajara");
                list.add("Mexico City");
                break;
        }
        Random randomizer = new Random();
        String random = list.get(randomizer.nextInt(list.size()));
        return random;
    }
    public String getStreetAddress()
    {
        List<String> list = new ArrayList<>();
        list.add("Medical Dr");
        list.add("DataPoint Rd");
        list.add("2 nd street");
        list.add("Madero Street");
        Random randomizer = new Random();
        String random = list.get(randomizer.nextInt(list.size()));
        return random;
    }
    public String getCountryName()
    {
        List<String> list = new ArrayList<>();
        list.add("United States");
        list.add("Canada");
        list.add("Mexico");
        list.add("Netherlands");
        Random randomizer = new Random();
        String countryName = list.get(randomizer.nextInt(list.size()));
        return countryName;
    }
    public String getCountryCode(String countryName) throws InterruptedException
    {
        String isoCountry = null;
        String[] isoCountries = Locale.getISOCountries();
        for (String country : isoCountries) {
            Locale locale = new Locale("en", country);
            if(locale.getDisplayCountry() == countryName) {
                isoCountry = locale.getISO3Country();
                break;
            }
        }
        return isoCountry;
    }
}
