package com.company;

public class FrenchAddress extends Address {
    @Override
    public String getCountry() {
        return "France";
    }

    @Override
    public String getFullAddress(){
        String Addr = null;
        String cp = null;
        String aux [] = getStreet().split(" ");
        try{
            Integer.parseInt(aux[0]);
            Addr = getStreet().replaceFirst(" ","," + SPACE) + EOL_STRING;
        }catch(Exception e){
            System.out.print("Insert a valid Address");
            Addr = "";
        }
        try{
            int e = Integer.parseInt(getPostalCode());
            cp = e + SPACE + getCity() + EOL_STRING;
        }catch(Exception e){
            System.out.print("Insert a valid Postal Code");
            Addr = "";
        }

        String country = getCountry();

        return Addr + cp + country;
    }

}
