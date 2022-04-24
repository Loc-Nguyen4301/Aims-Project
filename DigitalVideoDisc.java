public class DigitalVideoDisc {
	private String title;
	private String director;
	private String category;
	private int length;
	private float cost;

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return this.director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getLength() {
		return this.length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public float getCost() {
		return this.cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public DigitalVideoDisc(String title) {
		this.title = title;

	}

	public DigitalVideoDisc(String title, String category) {
		this.title = title;
		this.category = category;
	}

	public DigitalVideoDisc(String title, String category, String director) {
		this.title = title;
		this.category = category;
		this.director = director;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, int cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
}
