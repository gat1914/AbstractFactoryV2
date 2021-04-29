package com.company;

public class USAddress extends Address {
    @Override
    public String getCountry(){
        return "United States";
    }

    // Se obtiene la direccion compleat formateada correctamente
    @Override
    public String getFullAddress(){
        String street = getStreet().replaceFirst(" ",", ") + "\n";
        String city = getCity() + ", " + " " + getRegion() + " " + getPostalCode() + "\n";
        String country = getCountry();
        return street+city+country;
    }

}
