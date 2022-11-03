package veichles;

public abstract class Veichle {

	private String brand;
	private int constructionYear;
	private int displacement;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
	
	public void setConstructionYear(int constructionYear) {
		this.constructionYear = constructionYear;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public int getDisplacement() {
		return displacement;
	}
	
	public int getConstructionYear() {
		return constructionYear;
	}
}
