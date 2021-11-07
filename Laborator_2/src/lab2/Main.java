package lab2;

public class Main {
	public static void main(String[] args) {
		
		Book discoTitanic = new Book("Disco Titanic");
		Author rpGheo = new Author("Radu Pavel Gheo");
		Chapter ch1=new Chapter("Chapter 1");
		Paragraph ph1=new Paragraph("Paragraph 1");
		Paragraph ph2=new Paragraph("Paragraph 2");
		Paragraph ph3=new Paragraph("Paragraph 3");
		Paragraph ph4=new Paragraph("Paragraph 4");
		Paragraph ph5=new Paragraph("Paragraph 5");
		Image img1=new Image("Image 1");
		Table tb1=new Table("Table 1");
		SubChapter subch1=new SubChapter("SubChapter 1");
		
		discoTitanic.addAuthor(rpGheo);
		discoTitanic.addChapter(ch1);
		discoTitanic.addSubChapter(subch1);
		discoTitanic.addParagraph(ph1);
		discoTitanic.addParagraph(ph2);
		discoTitanic.addParagraph(ph3);
		discoTitanic.addImage(img1);
		discoTitanic.addParagraph(ph4);
		discoTitanic.addTable(tb1);
		discoTitanic.addParagraph(ph5);
		discoTitanic.print();
	}
}