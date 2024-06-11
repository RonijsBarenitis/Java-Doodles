package Tech;

public class Palindrome {

    public void isPalindrome(){

        String string = "A man, a plan, a canal, Panama!";
        System.out.println("The string is: " +string);
        boolean check = checkPalindrome(string);

        if(check) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }


    }

    private boolean checkPalindrome(String s){

        s = s.toLowerCase();

        int leftChar = 0;
        int rightChar = s.length() - 1;

        while (leftChar < rightChar){

            while (!Character.isLetterOrDigit(s.charAt(leftChar)) && leftChar < rightChar){
                leftChar++;
            }

            while (!Character.isLetterOrDigit(s.charAt(rightChar)) && rightChar > leftChar){
                rightChar--;
            }

            if(s.charAt(leftChar) != s.charAt(rightChar)){
                return false;
            }

            leftChar++;
            rightChar--;

        }
        return true;
    }
}
