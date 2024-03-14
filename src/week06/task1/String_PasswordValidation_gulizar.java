package week06.task1;

public class String_PasswordValidation_gulizar {

    public static void main(String[] args) {

        String password = "Password123#";
        System.out.println(valid(password));

    }


   public static boolean valid(String password){
        if (password.length()<6 || password.contains(" ")){
            return false;
        }

        boolean hasUpeerCase = false,
                hasLowerCase = false,
                hasSpecialChar = false,
                hasDigit = false;


       for (int i = 0; i < password.length(); i++) {
           char ch1 = password.charAt(i);

           if (Character.isUpperCase(ch1)) {
               hasUpeerCase = true;
           } else if (Character.isLowerCase(ch1)) {
               hasLowerCase = true;
           } else if (ch1 >= '!' && ch1 <= '~') {
               hasSpecialChar = true;
           } else if (Character.isDigit(ch1)) {
               hasDigit = true;
           }
       }
           return hasUpeerCase && hasLowerCase && hasSpecialChar && hasDigit;
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

