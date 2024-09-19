class test {
     public static boolean isValidFirstName(String firstName) {
        // Check if the name is empty or null
        if (firstName == null || firstName.isEmpty()) {
            return false;
        }

        // Check if the name length is within a reasonable range (e.g., 1 to 50 characters)
        if (firstName.length() < 1 || firstName.length() > 50) {
            return false;
        }

        // Ensure that all characters are alphabetic
        for (int i = 0; i < firstName.length(); i++) {
            char ch = firstName.charAt(i);
            if (!Character.isLetter(ch)) {
                return false;
            }
        }

        // If all checks pass, the first name is valid
        return true;
    }
    public static boolean isValidPassword(String password) {
        // Check if password length is between 8 and 20
        if (password.length() < 8 || password.length() > 20) {
            return false;
        }

        // Flags for each condition
        boolean hasDigit = false;
        boolean hasLowercase = false;
        boolean hasUppercase = false;
        boolean hasSpecialChar = false;
        boolean hasWhitespace = false;

        // Special characters to check for
        String specialChars = "@#$%^&+=!";

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (specialChars.indexOf(ch) >= 0) {
                hasSpecialChar = true;
            } else if (Character.isWhitespace(ch)) {
                hasWhitespace = true;
            }
        }

        // Return false if any whitespace is found
        if (hasWhitespace) {
            return false;
        }

        // Ensure all the required conditions are met
        return hasDigit && hasLowercase && hasUppercase && hasSpecialChar;
    }

    public static boolean isValidEmail(String email) {
        // Check if the email contains exactly one '@'
        int atSymbolIndex = email.indexOf('@');
        int lastAtSymbolIndex = email.lastIndexOf('@');

        // If '@' is not present or occurs more than once, return false
        if (atSymbolIndex == -1 || atSymbolIndex != lastAtSymbolIndex) {
            return false;
        }

        // Split the email into two parts: local part and domain part
        String localPart = email.substring(0, atSymbolIndex);
        String domainPart = email.substring(atSymbolIndex + 1);

        // Check if the local part and domain part are not empty
        if (localPart.isEmpty() || domainPart.isEmpty()) {
            return false;
        }

        // Check if the domain part contains at least one period ('.')
        int dotIndex = domainPart.indexOf('.');
        if (dotIndex == -1 || dotIndex == domainPart.length() - 1) {
            return false;
        }

        // Check if the top-level domain (after the last '.') has at least two characters
        String topLevelDomain = domainPart.substring(dotIndex + 1);
        if (topLevelDomain.length() < 2) {
            return false;
        }

        // Ensure no spaces are present
        if (email.contains(" ")) {
            return false;
        }

        // If all checks pass, the email is valid
        return true;
    }

    public static boolean isValidMobileNumber(String mobileNumber) {
        // Check if the mobile number length is between 10 and 15 digits
        if (mobileNumber.length() < 10 || mobileNumber.length() > 15) {
            return false;
        }

        // Ensure all characters in the mobile number are digits
        for (int i = 0; i < mobileNumber.length(); i++) {
            char ch = mobileNumber.charAt(i);
            if (!Character.isDigit(ch)) {
                return false;
            }
        }

        // If all checks pass, the mobile number is valid
        return true;
    }
}
public class Validation {
    
}
