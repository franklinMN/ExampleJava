import java.util.Scanner;    
public class ScannerDelimiterExample3{    
   public static void main(String args[]){   
     System.out.print("Enter Your Number: ");  
       //Create a scanner with the specified Object  
       Scanner scanner = new Scanner(System.in);      
       Integer i = scanner.nextInt();  
       //Printing the delimiter used  
     System.out.println("Delimiter:"+scanner.delimiter());  
       System.out.println("Number: "+i);   
       //Close the scanner  
       scanner.close();  
       System.out.println("Scanner Closed.");  
   }    
}  