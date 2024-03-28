package week04.task2;

public class SameLetters_gulizar {
    public static void main(String[] args) {
        System.out.println(same("abc", "cab"));
        System.out.println(same("abc", "abb"));
    }


    public static boolean same(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            char sameChar = str1.charAt(i);
            boolean result = false;

            for (int j = 0; j < str2.length(); j++) {
                if (str2.charAt(j) == sameChar) {
                    result = true;
                    break;
                }

            }
            if (!result) {
                 return false;
            }
        }
    return true;

    }

}


        /*
        String - Same letters
   Write a return method that checks if a string is built out of the same letters as another string.
   Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
         */


/*
 public static void main(String[] args) {

        System.out.println(isSameLetters1("abc", "cba")); // true
        System.out.println(isSameLetters1("abc", "abb"));  // false

    }

    public static boolean isSameLetters1(String str1, String str2) {

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(str1.split("")));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(str2.split("")));

        Collections.sort(list1);
        Collections.sort(list2);

        return list1.equals(list2);
    }

}
 */