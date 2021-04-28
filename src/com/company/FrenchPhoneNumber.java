package com.company;

public class FrenchPhoneNumber extends PhoneNumber {
    private String countryCode = "33";
    @Override
    public String getCountryCode() {
        return countryCode;
    }
}
