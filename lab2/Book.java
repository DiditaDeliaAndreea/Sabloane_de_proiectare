import java.util.ArrayList;
import java.util.List;

public class Book {
	private String title;
	private List <Author> authors=new ArrayList<Author>();
	private List <Chapter> chapters = new ArrayList <Chapter>();
	
	public Book(String title){
		this.title = title;
	}

		 public void print(){
		      System.out.println(title);
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

}