package bill;
import java.util.Scanner;

class Store {
	static String[] items = { "Lays", "Bingo", "Pringle", "Chips", "Mixture" };
	static double[] prize = { 10.00D, 10.00D, 50.00D, 20.00D, 40.00D };
	Store() {
		//items[] = ;
		//prize[] = ;
		//System.out.print( "Inside Store..." );
	}
}
//****************************************************************************************************************** */
class BillingSystem extends Store {
	int customersOptions [];
	int optionsQuantity [];
	int optionsCount = 0;
	Scanner scan;
	ConsoleColors cc;

	BillingSystem() {
		customersOptions = new int[50];
		optionsQuantity = new int[50];
		cc = new ConsoleColors();
		//System.out.print( "Inside Constructor..." );
	}
//-------------------------------------------------------------------------------------------------------------
	void displayItems() {
		System.out.println( "------------------------------------" );
		System.out.println( "S.N.\tProduct\t\tPrize" );
		System.out.println( "------------------------------------" );
		for(int i=0 ; i<items.length ; i++) {
			System.out.println( (i+1) + "\t" + items[i] + "\t\t" + prize[i] );
		}
		System.out.println( "------------------------------------" );
	}
//-------------------------------------------------------------------------------------------------------------
	void getOptionsFromUser() {
		int count = 0;
		scan = new Scanner(System.in);
		while(true) {
			System.out.println( "Please enter the S.N. of the product you want to purchase : " );
			System.out.println( "*NOTE* - If you want to quit the purchase, press zero - 0" );
			customersOptions[count] = scan.nextInt();
			if(customersOptions[count] == 0) {
				System.out.println( "You pressed 0, hence we have terminated your purchase. Thank you!" );
				//System.out.println( "------------------------------------" );
				break;
			}else if( customersOptions[count] > items.length || customersOptions[count] < 0 ) {
				System.out.println( ConsoleColors.ANSI_RED + "Invalid Input - Try Again" + ConsoleColors.ANSI_RESET );
			}else {
				System.out.println( "Please enter the quatity of this product you want to buy : " );
				optionsQuantity[count] = scan.nextInt();
				count++;
			}
		}
		optionsCount = count;

	}
//-------------------------------------------------------------------------------------------------------------
	void displayBill() {
		double totalPrize = 0;
		double multipleTotal;

		System.out.println( "--------------------------------------------------------------------------");
		System.out.println( "\t\t\t\tB  I  L  L" );
		
		System.out.println( "--------------------------------------------------------------------------" );
		System.out.println( "S.N.\tProduct\t\tPrize\t\tQuantity\tPrize" );
		System.out.println( "--------------------------------------------------------------------------" );

		for( int i = 0 ; i<optionsCount ; i++ ) {
			multipleTotal = prize[customersOptions[i]-1] * optionsQuantity[i];
			System.out.println( (i+1) + "\t" + items[customersOptions[i]-1] + "\t\t" + prize[customersOptions[i]-1] + "\t\t" + optionsQuantity[i] +"\t\t" + multipleTotal);
			totalPrize += multipleTotal;
		}
		System.out.println( "--------------------------------------------------------------------------" );
		System.out.println( "Grand Total : " + totalPrize );
		System.out.println( "--------------------------------------------------------------------------" );
	}
}
//-------------------------------------------------------------------------------------------------------------