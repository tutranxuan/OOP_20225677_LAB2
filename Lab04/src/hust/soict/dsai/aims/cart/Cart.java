package hust.soict.dsai.aims.cart;

import java.util.*;
import hust.soict.dsai.aims.media.Media;

public class Cart {
	
	public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public int qtyOrdered = 0;

    // Add media from cart
    public void addMedia(Media media) {
        if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full.");
        } else if (itemsOrdered.contains(media)) {
            System.out.println(media.getTitle() + " is already.");
        } else {
            itemsOrdered.add(media);
            System.out.println(media.getTitle() + " has been added.");
            qtyOrdered ++;
        }
    }
    
    // Remove media from cart
    public void removeMedia(Media media) {
        if (itemsOrdered.size() == 0) {
            System.out.println("Your cart is empty.");
        } else {
            if (itemsOrdered.remove(media)) {
                System.out.println(media.getTitle() + " has been removed successfully.");
                qtyOrdered --;
            } else {
                System.out.println("No media match.");
            }
        }
    }

    
    public Media searchToRemove(String title) {
		for (Media media : itemsOrdered) {
			if (media.getTitle().equals(title)) {
				return media;
			}
		}
		return null;
	}

    // Calculate total cost
    public float totalCost() {
        float totalCost = 0;
        for (Media media : itemsOrdered) {
            totalCost += media.getCost();
        }
        return totalCost;
    }

    // Print the cart
    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (Media media : itemsOrdered) {
            System.out.println(media);
        }
        System.out.println("Total items: " + qtyOrdered);
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }
    
    public void empty() {
        if (itemsOrdered.size() == 0) {
            System.out.println("Nothing to remove.");
        } else {
            qtyOrdered = 0;
            itemsOrdered.clear();
            System.out.println("Order created.");
            System.out.println("Now your current cart will be empty.");
            System.out.println();
        }
    }

    // Search by title, category, price (max cost/ min-max cost) and ID
    public void searchByTitle(String title) {
        boolean matchFound = false;
        for (Media media : itemsOrdered) {
            if (media.isMatch(title)) {
                System.out.println("Found " + media);
                matchFound = true;
            }
        }
        if (!matchFound) {
            System.out.println("No media were found with \"" + title + "\" in the title.");
        }
    }

    public void searchByCategory(String category) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media.getCategory().equalsIgnoreCase(category)) {
                System.out.println("Found " + media);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No media were found with \"" + category + "\" in the category.");
        }
    }

    public void searchByPrice(float maxCost) {
        boolean matchFound = false;
        for (Media media : itemsOrdered) {
            if (media.getCost() <= maxCost) {
                System.out.println("Found " + media);
                matchFound = true;
            }
        }
        if (!matchFound) {
            System.out.println("No media were found that match the maximum cost provided.");
        }
    }

    public void searchByPrice(float minCost, float maxCost) {
        boolean matchFound = false;
        for (Media media : itemsOrdered) {
            if (media.getCost() >= minCost && media.getCost() <= maxCost) {
                System.out.println("Found " + media);
                matchFound = true;
            }
        }
        if (!matchFound) {
            System.out.println("No media were found that match the cost range between your specified minimum and maximum.");
        }
    }

    public void searchByID(int id) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                System.out.println("Found " + media);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No media were found that match the ID provided.");
        }
    }

    // Sort media in cart
    public void sortMediaByTitle() {
        Collections.sort((List<Media>)itemsOrdered, Media.COMPARE_BY_TITLE_COST);
        Iterator<Media> iterator = itemsOrdered.iterator();
        iterator = itemsOrdered.iterator();
    
        while (iterator.hasNext()) {
            System.out.println(((Media)iterator.next()).toString());
        }
    }
    public void sortMediaByCost() {
        Collections.sort((List<Media>)itemsOrdered, Media.COMPARE_BY_COST_TITLE);
        Iterator<Media> iterator = itemsOrdered.iterator();
        iterator = itemsOrdered.iterator();
    
        while (iterator.hasNext()) {
            System.out.println(((Media)iterator.next()).toString());
        }
    }
}
