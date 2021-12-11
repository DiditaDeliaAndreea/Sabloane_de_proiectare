public class AlignRight implements AlignStrategy {
    Paragraph par;
    public void render(Paragraph x) {
        System.out.println("+++++"+x.text);
    }
}