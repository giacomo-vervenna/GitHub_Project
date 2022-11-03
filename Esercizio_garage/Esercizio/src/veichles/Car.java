package veichles;

public class Car extends Veichle{

	private int door;
	private String alimentation;
	
	public void setAlimentation(String alimentation) {
		this.alimentation = alimentation;
	}
	
	public void setDoor(int door) {
		this.door = door;
	}
	
	public String getAlimentation() {
		return alimentation;
	}
	
	public int getDoor() {
		return door;
	}
	
}
