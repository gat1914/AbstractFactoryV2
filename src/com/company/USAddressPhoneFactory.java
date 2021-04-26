package com.company;

public class USAddressPhoneFactory implements AddressPhoneFactory {
    PhoneNumber usPhoneNumber = new USPhoneNumber();
    Address usAddress = new USAddress();
    @Override
    public Address createAddress() {
        return usAddress;
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return usPhoneNumber;
    }
}
