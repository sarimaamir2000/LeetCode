class Solution {
    public boolean isPalindrome(int x) {
        String number;
        String reverse = "";
        char ch;
        boolean flag;
        number = Integer.toString(x);
        for (int i = 0 ; i< number.length(); i++){
            ch= number.charAt(i); //extracts each character at index i
            reverse= ch+reverse; //adds each character in front of the existing string
        }

        if (number.equals(reverse)){
            return true;
        }

        return false;       
    }
}