package com.company;

public class FrenchAddressPhoneFactory implements AddressPhoneFactory {
    PhoneNumber frenchPhoneNumber = new FrenchPhoneNumber();
    Address frenchAddress = new FrenchAddress();
    @Override
    public Address createAddress() {
        return frenchAddress;
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return frenchPhoneNumber;
    }
}
