//Reverse a String
//link:https://www.geeksforgeeks.org/problems/reverse-a-string/1
 public static String reverseWord(String str)
    {
        // Reverse the string str
        String rev="";
        for(int i=0;i<str.length();i++){
            rev=str.charAt(i)+rev;
        }
        return rev;
    }
