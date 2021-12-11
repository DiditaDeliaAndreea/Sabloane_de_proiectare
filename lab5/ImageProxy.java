import java.util.concurrent.TimeUnit;

public class ImageProxy implements Element {
    public String imageName;


    ImageProxy(String name) {
        imageName = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void print() {
        System.out.println("Image with name: " + this.imageName);
    }
}