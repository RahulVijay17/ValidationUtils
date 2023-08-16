package com.example.demo.collection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.regex.Pattern;

public class ValidationUtils {

    // String Validation
    public static boolean isValidEmail(String email) {
        // Basic email validation using a regular expression
        String emailRegex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        return Pattern.matches(emailRegex, email);
    }

    public static boolean isValidUrl(String url) {
        // Basic URL validation using a regular expression
        String urlRegex = "^(http|https)://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}(/\\S*)?$";
        return Pattern.matches(urlRegex, url);
    }

    public static boolean isNonEmptyString(String str) {
        return str != null && !str.isEmpty();
    }

    // Number Validation
    public static boolean isPositiveNumber(double number) {
        return number > 0;
    }

    public static boolean isInRange(int value, int min, int max) {
        return value >= min && value <= max;
    }

    // Date Validation
    public static boolean isValidDate(String date, String format) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            sdf.setLenient(false);
            sdf.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public static boolean isFutureDate(Date date) {
        Date currentDate = new Date();
        return date.after(currentDate);
    }

    // Input Length Validation
    public static boolean isStringLengthValid(String str, int minLength, int maxLength) {
        int length = str.length();
        return length >= minLength && length <= maxLength;
    }

    // Collection Validation
    public static boolean isCollectionNotEmpty(Collection<?> collection) {
        return collection != null && !collection.isEmpty();
    }

    // File Validation
    public static boolean isValidFileName(String fileName) {
        // Basic file name validation to check for special characters
        String fileNameRegex = "^[a-zA-Z0-9._-]+$";
        return Pattern.matches(fileNameRegex, fileName);
    }

    // Password Validation
    public static boolean isStrongPassword(String password) {
        //At least 8 characters, containing uppercase, lowercase, digits, and special characters
        String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        return Pattern.matches(passwordRegex, password);
    }

    // Phone Number Validation
    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Basic phone number validation using a regular expression
        // This  assumes a simple format of "+1-123-456-7890 & 1234567890"
        String phoneRegex = "^\\+\\d{1,3}-\\d{3}-\\d{3}-\\d{4}$|^[0-9]{10}$";
        return Pattern.matches(phoneRegex, phoneNumber);
    }

    public static boolean isAlphaNumeric(String str) {
        return str.matches("^[a-zA-Z0-9]+$");
    }

}
