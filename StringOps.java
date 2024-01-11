public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
    String string= "One two tHRee world";
    System.out.println(capVowelsLowRest(string));
    char chr = 'l';
            int[] result = allIndexOf(string, chr);
        System.out.print("{");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static String capVowelsLowRest (String string) {
        String vowels = "aeiou";
        String sOut= "";
        int i=0;
        
        while (i  < string.length()) {
            char currentChar = string.charAt(i);
            if ((currentChar >= 65 && currentChar <= 90) && (vowels.indexOf(currentChar)!= -1)) {
               sOut += currentChar; 
            } else if (vowels.indexOf(currentChar)!= -1) {
              sOut += (char) (currentChar - 32);
            } else if ((currentChar >= 97) && (currentChar <= 122)) {
              sOut += currentChar;  
            } else if (currentChar == 32) {
                sOut+= currentChar;
            } else {
                sOut += (char) (currentChar + 32);
            }
           
            i++;
        }
        return sOut;
    }

    public static String camelCase (String string) {
        // Write your code here:
        return "";
    }

    public static int[] allIndexOf (String string, char chr) {
    int count = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                count++;
            }
        }

        int[] indexes = new int[count];
        count = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                indexes[count] = i;
                count++;
            }
        }

        return indexes;
    }
}
