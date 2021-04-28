package com.company;

public class FrenchAddress extends Address {
    @Override
    public String getCountry() {
        return "France";
    }

    @Override
    public String getFullAddress(){
        String aux [] = getStreet().split(" ");
        
        String Addr = getStreet().replaceFirst("","," + SPACE) + EOL_STRING;
        String cp = getPostalCode() + SPACE + getCity() + EOL_STRING;
        String country = getCountry();

        return Addr + cp + country;
    }

}
