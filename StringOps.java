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
        System.out.println(camelCase(string));
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
        String answer = "";
    int i = 0;

    while (i < string.length()) {
        if (string.charAt(i) == ' ') {
            if (i == (string.length() - 1)) {
                break;
            } else if (i == 0) {
                while (i < string.length() && string.charAt(i) == ' ') {
                    i++;
                }
                int newString = string.charAt(i);
                if (newString >= 65 && newString <= 90) {
                    answer += (char) (newString + 32);
                } else {
                    answer += (char) (newString);
                }
            } else {
                while (i < string.length() && string.charAt(i) == ' ') {
                    i++;
                }
                int newString = string.charAt(i);
                if (newString >= 65 && newString <= 90) {
                    answer += (char) (newString + 32);
                } else {
                    answer += (char) (newString - 32);
                }
            }
        } else {
            int newString = string.charAt(i);
            if (newString >= 65 && newString <= 90) {
                answer += (char) (newString + 32);
            } else {
                answer += (char) (newString);
            }
        }
        i++;
    }

    return answer;
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