package aims;

import aims.DigitalVideoDisc;
import aims.Cart;

public class Aims {
	public static void main(String[] args) {
        
        Cart anOrder = new Cart();

        
        DigitalVideoDisc disc1 = new DigitalVideoDisc("The Lion King","Animation",
                "Roger Allers",87,19.95f);
        anOrder.addDigitalVideoDisc(disc1);
        DigitalVideoDisc disc2 = new DigitalVideoDisc("Star wars","Science Fiction",
                "Geogre Lucas",87,24.95f);
        anOrder.addDigitalVideoDisc(disc2);
        DigitalVideoDisc disc3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
        anOrder.addDigitalVideoDisc(disc3);

        anOrder.print();
        
        anOrder.searchById(1);

        anOrder.removeDigitalVideoDisc(disc3);
        
        System.out.printf("Total cost is: %.2f",anOrder.totalCost());
    }
}
