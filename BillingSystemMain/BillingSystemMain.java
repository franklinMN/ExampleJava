package bill;

class BillingSystemMain {
	public static void main ( String [] args ) {
		BillingSystem bs = new BillingSystem();
		bs.displayItems();
        	bs.getOptionsFromUser();
        	bs.displayBill();
	}
}