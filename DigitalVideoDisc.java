package aims;


public class DigitalVideoDisc {

	private static int nDigitalVideoDiscs = 0;
	private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private int id;
    
  //Constructor by title
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
        this.id = ++nDigitalVideoDiscs; 
    }
    //Constructor by category, title and cost
    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = ++nDigitalVideoDiscs; 
    }
    //Constructor by title, category , director, cost
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        this.id = ++nDigitalVideoDiscs;
    }
    // Constructor by all attributes
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        this.id = ++nDigitalVideoDiscs; 
    }
    
    
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public int getId() {
		return id;
	}
    
}
