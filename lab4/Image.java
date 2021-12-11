import java.util.concurrent.TimeUnit;

public class Image {
	private String name;
	{
	try {
		TimeUnit.SECONDS.sleep(5);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}}
	
	public Image(String name){
		this.name = name;
	}

	public void print(){
	      System.out.println(name);
	    }
}