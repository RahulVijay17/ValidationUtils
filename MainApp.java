package com.example.demo.collection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

public class MainApp{

    public static void main(String[] args) {
        // Example usage of ValidationUtils methods

        String email = "example@email.com";
        if (ValidationUtils.isValidEmail(email)) {
            System.out.println("Email is valid.");
        } else {
            System.out.println("Email is invalid.");
        }

        String url = "https://www.example.com";
        if (ValidationUtils.isValidUrl(url)) {
            System.out.println("URL is valid.");
        } else {
            System.out.println("URL is invalid.");
        }

        int age = 25;
        if (ValidationUtils.isInRange(age, 18, 99)) {
            System.out.println("Age is within the valid range.");
        } else {
            System.out.println("Age is outside the valid range.");
        }

        String dateString = "2023-08-16";
        if (ValidationUtils.isValidDate(dateString, "yyyy-MM-dd")) {
            System.out.println("Date is valid.");
        } else {
            System.out.println("Date is invalid.");
        }

        String futureDateString = "2023-12-31";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date futureDate = dateFormat.parse(futureDateString);

            if (ValidationUtils.isFutureDate(futureDate)) {
                System.out.println("Date is in the future.");
            } else {
                System.out.println("Date is not in the future.");
            }
        } catch (ParseException e) {
            System.out.println("Invalid date format.");
        }

        String username = "john_doe";

        if (ValidationUtils.isStringLengthValid(username, 4, 20)) {
            System.out.println("Username length is valid.");
        } else {
            System.out.println("Username length is not valid.");
        }

        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        if (ValidationUtils.isCollectionNotEmpty(names)) {
            System.out.println("The collection is not empty.");
        } else {
            System.out.println("The collection is empty.");
        }

        String fileName = "document123.txt";

        if (ValidationUtils.isValidFileName(fileName)) {
            System.out.println("File name is valid.");
        } else {
            System.out.println("File name is not valid.");
        }

        String password = "P@ssw0rd!";

        if (ValidationUtils.isStrongPassword(password)) {
            System.out.println("Password is strong.");
        } else {
            System.out.println("Password is not strong.");
        }

        String phoneNumber = "+1-123-456-7890";
        if (ValidationUtils.isValidPhoneNumber(phoneNumber)) {
            System.out.println("Phone number is valid.");
        } else {
            System.out.println("Phone number is invalid.");
        }

        String alphanumericString = "abc123";
        if (ValidationUtils.isAlphaNumeric(alphanumericString)) {
            System.out.println("String is alphanumeric.");
        } else {
            System.out.println("String contains non-alphanumeric characters.");
        }
    }

}

