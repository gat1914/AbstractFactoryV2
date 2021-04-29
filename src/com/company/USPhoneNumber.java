package com.company;

public class USPhoneNumber extends PhoneNumber {
    @Override
    public String getCountryCode() {
        return "(+1)";
    }

    //Obtiene el numero formateado correctamente
    @Override
    public String getPhoneNumber(){
        String phone = super.getPhoneNumber();
        phone = format(phone);
        return getCountryCode() + " " + phone;
    }

    //Setea el numero y verifica que este tenga 10 digitos
    @Override
    public void setPhoneNumber(String nNumber){
        if (nNumber.length()==10){
            super.setPhoneNumber(nNumber);
        } else {
            System.out.println("US Number is incorrectly entered (It must have 10 digits !)");
        }
    }

    //Metodo auxiliar para formatear el numero
    protected String format(String phone){
        return phone.substring(0,3) + " " + phone.substring(3,6) + " " + phone.substring(6,10);
    }
}
