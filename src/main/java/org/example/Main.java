package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MobilePhone mobilePhone = new MobilePhone("123123123", new ArrayList<>());
        mobilePhone.addNewContact(new Contact("dogancan", "132123123123"));
        mobilePhone.printContacts();


    }
}
