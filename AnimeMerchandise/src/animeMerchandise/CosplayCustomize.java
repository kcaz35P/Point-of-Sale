package animeMerchandise;

public class CosplayCustomize extends AnimeMerchandise {

	String gender;
	String fabric;
	String color;
	
	public void SetGender(String gender) {
		this.gender = gender;
	}
	public void SetFabric(String fabric) {
		this.fabric = fabric;
	}
	public void SetColor(String color) {
		this.color = color;
	}
	public String GetGender() {
		return gender;
	}
	public String GetFabric() {
		return fabric;
	}
	public String GetColor() {
		return color;
	}
}
