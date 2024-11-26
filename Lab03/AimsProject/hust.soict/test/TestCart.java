package aims;

import aims.DigitalVideoDisc;
import aims.Cart;

public class TestCart {
	 public static void main(String[] args) {
	        Cart cart = new Cart();
	        DigitalVideoDisc disc1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
	        cart.addDigitalVideoDisc(disc1);
	        DigitalVideoDisc disc2 = new DigitalVideoDisc("Star wars","Science Fiction", "Geogre Lucas",87,24.95f);
	        cart.addDigitalVideoDisc(disc2);
	        DigitalVideoDisc disc3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
	        cart.addDigitalVideoDisc(disc3);

	        cart.print();

	        cart.searchById(3);
	        cart.searchById(6);


	        cart.searchByTitle("The Lion King");
	        cart.searchByTitle("The Rose");
	    }
}
