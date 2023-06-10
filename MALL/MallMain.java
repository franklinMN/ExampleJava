import mall.Parking;
import mall.ToyShop;
import mall.PVRCinema;
import mall.GamePlay;
import mall.FoodCourt;
//package mall;

class MallMain {
	public static void main ( String [] args ) {
		System.out.println( "This is a main method..." );

		Parking p1 = new Parking();
		p1.parkMyVehical();

		PVRCinema pv1 = new PVRCinema();
		pv1.BookTickets();
		pv1.buyFood();
		pv1.watchMovie();
		FoodCourt f1 = new FoodCourt();
		f1.buyFood();
		p1.takeMyVehical();
	}
}