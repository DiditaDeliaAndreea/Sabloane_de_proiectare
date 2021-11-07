package lab2;

public class Image {
	
	private String url;
	
	public Image(String url) {
		this.url=url;
	}
	
	public void print() {
		System.out.println("Image: " + url);
	}

}
