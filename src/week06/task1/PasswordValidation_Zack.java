package week06.task1;

public class PasswordValidation_Zack {
    /*
     ========== String_PasswordValidation ===================
        1. Write a return method that can verify if a password is valid or not.
        -Requirements:
        1. Password MUST be at least have 6 characters and should not contain space
        2. PassWord should at least contain one upper-case letter
        3. PassWord should at least contain one lowercase letter
        4. Password should at least contain one special character
        5. Password should at least contain a digit
        -if all requirements above are met, the method returns true, otherwise returns false
     */
    public static void main(String[] args) {
        String password_1 = "Zack_MyPassword01";
        String password_2 = "Zack_MyPassword"; // with no numeric values

        System.out.println("checkPassword(pasword_1) = " + checkPassword_1(password_1));
        System.out.println("checkPassword(pasword_2) = " + checkPassword_2(password_2));
    }

    // ============= SOLUTION 1 - without regex =============================
    /**
     * verifies if a password is valid or not based on the given requirements
     * @param password String
     * @return boolean value
     */
    public static boolean checkPassword_1(String password){

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;


        if(password.length()>=6 && !password.contains(" ")){

            for (char ch:password.toCharArray()) {

                if (Character.isUpperCase(ch)) {
                    hasUpperCase = true;

                } else if (Character.isLowerCase(ch)) {
                    hasLowerCase = true;

                } else if (!Character.isLetterOrDigit(ch)) {
                    hasSpecialChar = true;

                } else if (Character.isDigit(ch)){

                    hasDigit = true;
                }
            }
        }

        return hasDigit && hasLowerCase && hasUpperCase && hasSpecialChar;

    }


    // ============= SOLUTION 2 - with regex =============================
    /**
     * verifies if a password is valid or not based on the given requirements
     * @param password String
     * @return boolean value
     */
    public static boolean checkPassword_2(String password){

        String lowercase="(.*[a-z].*)";
        String uppercase="(.*[A-Z].*)";
        String numbers="(.*[0-9].*)";
        String specialchars="(.*[ -/, :-@].*)";

        boolean HasLower = password.matches(lowercase),
                HasUppere = password.matches(uppercase),
                HasDigits = password.matches(numbers),
                HasSpecial = password.matches(specialchars),
                Valid = false;

        if(password.length() >= 6 && !password.contains(" "))
            if( HasLower && HasUppere && HasDigits && HasSpecial)
                Valid = true;

        return Valid;

    }



}
