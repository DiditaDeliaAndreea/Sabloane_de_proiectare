import java.util.ArrayList;
import java.util.List;

public class Book {
	private String title;
	private List <Author> authors=new ArrayList<Author>();
	private List <Chapter> chapters = new ArrayList <Chapter>();
	private List <Element> elements = new ArrayList <Element>();
	
	public Book(String title){
		this.title = title;
	}

		 public void print(){
			 System.out.println("Book: "+title+"\n"+"\n"+ "Authors:");
			 for(int i=0;i<authors.size();i++){
		          authors.get(i).print();
		        }
			 System.out.println("\n");
			 for(int i=0;i<elements.size();i++){
		          elements.get(i).print();
		        }
		  }
		  public void addAuthor(Author a){
		      authors.add(a);
		  }
		  public int createChapter(String c){
		      chapters.add(new Chapter(c));
		      return chapters.size()-1;
		  }
		  public Chapter getChapter(int index){
		      return chapters.get(index);
		  }
		  public void addContent(Element e){
		      elements.add(e);
		  }

}