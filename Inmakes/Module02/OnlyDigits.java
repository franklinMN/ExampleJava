// 1 Write a java Program to display only digits in an alpha numeric String
// (Input: 75#41* Output:7541)

public class OnlyDigits {

    public static String onlyDigit(String text){

        StringBuilder temp = new StringBuilder();

        for( char c : text.toCharArray() ){
            if( Character.isDigit(c) )
                temp.append(c);
        }
        return temp.toString();
    }
    public static void main(String[] args) {
       
        String text = "75#41*";
        System.out.println("Original string - " + text);
        System.out.println("Only Digit string - " + onlyDigit(text));
    }
}