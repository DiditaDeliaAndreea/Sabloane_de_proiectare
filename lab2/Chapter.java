import java.util.ArrayList;
import java.util.List;

public class Chapter {
	public String title;
	public List <SubChapter> subchapters = new ArrayList <SubChapter>();
	
	public Chapter(String title){
		this.title = title;
		subchapters=new ArrayList<SubChapter>();
	}
	
	public int createSubChapter(String c){
		subchapters.add(new SubChapter( c));
	      return subchapters.size()-1;
	}

	public SubChapter getSubChapter(int index){
	      return subchapters.get(index);
	  }
	  
}