package animeMerchandise;

public class Reading extends AnimeMerchandise{
	String genre;
	int volume;
	
	public  void SetGenre(String genre) {
		this.genre = genre;
	}
	public  void SetVolume(int volume) {
		this.volume = volume;
	}
	public  String GetGenre() {
		return genre;
	}
	public  int GetVolume() {
		return volume;
	}
}


