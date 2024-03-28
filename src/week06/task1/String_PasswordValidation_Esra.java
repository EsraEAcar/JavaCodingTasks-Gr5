package week06.task1;

public class String_PasswordValidation_Esra {

    public static void main(String[] args) {

        String password1 = "Pass123!"; // Example password
        String password2 = "password"; // Example password
        String password3 = " "; // Example password

        boolean isValid1 = isValidPassword(password1);
        boolean isValid2 = isValidPassword(password2);
        boolean isValid3 = isValidPassword(password3);

        System.out.println("Is the password: "+password1+" valid ?  " + isValid1);
        System.out.println("Is the password: "+password2+" valid ?  " + isValid2);
        System.out.println("Is the password: "+password3+"        valid ?         "+ isValid3);
    }

    /**
     * Password Verification
     *
     * @param password
     * @return
     */
    public static boolean isValidPassword(String password) {
        // Requirement 1: Password length >= 6 and no spaces
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        // Requirement 2: At least one uppercase letter
        boolean hasUpperCase = false;
        // Requirement 3: At least one lowercase letter
        boolean hasLowerCase = false;
        // Requirement 4: At least one special character
        boolean hasSpecialChar = false;
        // Requirement 5: At least one digit
        boolean hasDigit = false;

        // Loop through each character in the password
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else {
                // Check if the character is a special character
                // Assuming special characters are anything other than letters and digits
                hasSpecialChar = true;
            }
        }

        // Check if all requirements are met
        return hasUpperCase && hasLowerCase && hasSpecialChar && hasDigit;
    }
}











/*

System.out.println("Password must be 6 characters and should not contain space. Try again, please !");


1. Write a return method that can verify if a password is valid or not.
-Requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper-case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special character
5. Password should at least contain a digit
-if all requirements above are met, the method returns true, otherwise returns  false
 */
