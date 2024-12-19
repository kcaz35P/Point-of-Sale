package animeMerchandise;

public class Decoration extends AnimeMerchandise{
	int size; 
	String color;
	
	public  void SetSize(int size) {
		this.size = size;
	}
	public  void SetColor(String color) {
		this.color = color;
	}
	public  int getSize() {
		return size;
	}
	public  String getColor() {
		return color;
	}
	

}
