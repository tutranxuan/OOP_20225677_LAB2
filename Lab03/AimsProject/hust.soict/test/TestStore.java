package aims;

import aims.DigitalVideoDisc;
import aims.Store;

	public class TestStore {
	    public static void main(String[] args) {
	        Store store = new Store();
	        DigitalVideoDisc disc1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
	        DigitalVideoDisc disc2 = new DigitalVideoDisc("Star wars", "Science Fiction",  "Geogre Lucas", 87, 24.95f);
	        DigitalVideoDisc disc3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
	        store.addDVD(disc1);
	        store.addDVD(disc2);
	        store.addDVD(disc3);

	        System.out.println(store.toString());

	        store.removeDVD(disc1);
	        store.removeDVD(disc2);
	        store.addDVD(disc3);
	        
	        System.out.println(store.toString());
	        
	        store.removeDVD(disc3);

	        System.out.println(store.toString());
	    }
	}

