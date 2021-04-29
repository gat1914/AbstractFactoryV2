package com.company;

public class FrenchPhoneNumber extends PhoneNumber {
    private String countryCode = "(+33)";
    @Override
    public String getCountryCode() {
        return countryCode;
    }

    @Override
    public String getPhoneNumber(){
        String phone = super.getPhoneNumber();
        phone = format(phone);
        return countryCode + " " + phone;
    }
    @Override
    public void setPhoneNumber(String newNumber) {
        String s = newNumber;
        int cnt = 0;
        if (Character.isDigit(s.charAt(0)))
            for (int i = 0, len = s.length(); i < len; i++) {
                if (Character.isDigit(s.charAt(i))) {
                    cnt++;
                }
            }
        else
            System.out.println("Number is not correct");
        if (cnt > 9)
            System.out.println("Number lenght is not correct");
        else
            super.setPhoneNumber(newNumber);
    }

    protected String format(String phone){
        return phone.substring(0,3) + " " + phone.substring(3,6) + " " + phone.substring(6,9);
    }
}
