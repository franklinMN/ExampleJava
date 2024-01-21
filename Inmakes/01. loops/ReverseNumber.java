class ReverseNumber {


    public static void main( String[] args ) {


        int number = 153;
        int reversedNumber=0;
        int quo=0, rem=0;

        while(quo!=0) {
            quo = number / 10;
            rem = number % 10;
            reversedNumber += rem*10;
            number = number / 10;
        }

        System.out.println("Original Number : " + number);
        System.out.println("Reversed Number : " + reversedNumber);

    }
}