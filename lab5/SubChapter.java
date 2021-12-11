import java.util.ArrayList;

public class SubChapter {
	public String title;
	ArrayList<Paragraph> paragraphs;
    ArrayList<Image> images;
    ArrayList<Table> tables;
		

		public SubChapter(String title){
			this.title = title;
			paragraphs=new ArrayList<Paragraph>();
			images=new ArrayList<Image>();
			tables=new ArrayList<Table>();
		}
		
		public void createNewParagraph(String s){
			paragraphs.add(new Paragraph(s));
	    }
	

	public void createNewImage(String s){
		images.add(new Image(s));
	}

	public void createNewTable(String s){
		tables.add(new Table(s));
	}
	 public void print(){
		 System.out.println("Subchapter: " + title);
	      for(int i=0;i<paragraphs.size();i++){
	          System.out.print("Pharagraf: ");
	          paragraphs.get(i).print();
	        }
	        for(int i=0;i<images.size();i++){
	          System.out.print("Image with name: ");
	          images.get(i).print();
	        }
	        for(int i=0;i<tables.size();i++){
	          System.out.print("Table with title: ");
	          tables.get(i).print();
	          }
}
	      
	 }