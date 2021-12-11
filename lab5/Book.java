import java.util.ArrayList;
import java.util.List;

public class Book {
	private List <Author> authors=new ArrayList<Author>();
	private List <Chapter> chapters = new ArrayList <Chapter>();
	private List <Element> elements = new ArrayList <Element>();
	
	public Book(String title){
	}

		 public void print(){
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