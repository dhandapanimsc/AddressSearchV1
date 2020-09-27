package com.example.AddressSearch.Controller;
import java.util.List;
import com.example.AddressSearch.util.GenerateRandomValues;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;

/**
 * @author Dhandapani
 * This class is used to mapping request data to the defined request
 */
@RestController
public class AddressController {
    @GetMapping("/randomizer/address")
    public List<Address> getAllAddress() throws InterruptedException {
        GenerateRandomValues randomValues = new GenerateRandomValues();
        String CountryName = randomValues.getCountryName();
        return Arrays.asList(new Address(randomValues.getRandomNumber(999),randomValues.getStreetAddress(),randomValues.getRandomNumber(99999),randomValues.getCityName(CountryName),CountryName,randomValues.getCountryCode(CountryName)));
    }
}
