package week06.task1;

import com.sun.source.tree.IfTree;

public class PasswordValidation_Mahmut {

    public static void main(String[] args) {

        System.out.println(isValidPassword("Abc$123")); // true
        System.out.println(isValidPassword("abc123")); // false
    }

    /**
     *  This method checks the validity of a given password
     * @param password
     * @return boolean
     */

    public static boolean isValidPassword(String password){

        boolean checkLength = password.length()>=6;
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigitChars = false;
        boolean hasSpecialChars = false;


        for (int i = 0; i < password.length(); i++) {

            char currentChar = password.charAt(i);

            if (Character.isUpperCase(currentChar)){

                hasUppercase = true;

            } else if (Character.isLowerCase(currentChar)){

                hasLowercase = true;

            }else if (Character.isDigit(currentChar)){

                hasDigitChars = true;

            }else if (!Character.isLetterOrDigit(currentChar)){

                hasSpecialChars = true;
            }
        }

        return checkLength && hasUppercase && hasLowercase && hasDigitChars && hasSpecialChars;
    }
}
/*
1. Write a return method that can verify if a password is valid or not.
-Requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper-case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special character
5. Password should at least contain a digit
-if all requirements above are met, the method returns true, otherwise returns  false
 */