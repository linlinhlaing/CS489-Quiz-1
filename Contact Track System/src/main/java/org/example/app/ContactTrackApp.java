package org.example.app;

import org.example.model.Contact;
import org.example.model.EmailAddress;
import org.example.model.PhoneNumber;

import java.util.*;

public class ContactTrackApp {
    public static void main(String[] args) {

        PhoneNumber phoneNumber1 = new PhoneNumber(1l,"1234567","Work");
        PhoneNumber phoneNumber2 = new PhoneNumber(2l,"4567892","Home");
        List<PhoneNumber> phoneNumberOne = new ArrayList<>(Arrays.asList(phoneNumber1,phoneNumber2));

        EmailAddress emailAddress1 = new EmailAddress(1l,"linlin@gmail.com","Home");
        EmailAddress emailAddress2 = new EmailAddress(2l,"linlin@outlook.com","Work");
        List<EmailAddress> emailAddressOne = new ArrayList<>(Arrays.asList(emailAddress1,emailAddress2));

        PhoneNumber phoneNumber3 = new PhoneNumber(3l,"00034567","Mobile");
        PhoneNumber phoneNumber4 = new PhoneNumber(4l,"1117892","Home");
        List<PhoneNumber> phoneNumberTwo = new ArrayList<>(Arrays.asList(phoneNumber3,phoneNumber4));

        EmailAddress emailAddress3 = new EmailAddress(1l,"John@gmail.com","Home");
        EmailAddress emailAddress4 = new EmailAddress(2l,"John@outlook.com","Work");
        List<EmailAddress> emailAddressTwo = new ArrayList<>(Arrays.asList(emailAddress3,emailAddress4));

        Contact contact1 = new Contact(1l,"Lin","Hlaing","Global Walker","Machine Learnig Engineer",phoneNumberOne,emailAddressOne);
        Contact contact2 = new Contact(2l,"John","Smith","ABC","Software Engineer",phoneNumberTwo,emailAddressTwo);
        List<Contact> contacts = new ArrayList<>(Arrays.asList(contact1,contact2));

        Collections.sort(contacts, Comparator.comparing(Contact::getLastName));
        printJson(contacts);
    }



    public static void printJson(List<Contact> contacts){
        for(Contact contact:contacts){
            String jsonString = String.format(
                    "{\"id\": %d, \"first_name\": \"%s\", \"last_name\": \"%s\", \"Company\": \"%s\", \"Job Title\": \"%s\", \"Phone Numbers\": \"%s\",\"Email Addresses\": \"%s\"}",
                    contact.getContactId(), contact.getFirstName(), contact.getLastName(), contact.getCompany(), contact.getJobTitle(), contact.getPhoneNumbers(),contact.getEmailAddresses());
            System.out.println(jsonString);
        }
    }

}
