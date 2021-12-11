import java.util.ArrayList;
import java.util.List;

public class Section extends Element{
	public String name;
	private List <Element> elements = new ArrayList <Element>();
	
	Section(String SectionName) {
		name = SectionName;
	}
	
	public void add(Element e) {
            elements.add(e);
    }
	
	public void print() {
		System.out.println(name);
		for(int i=0;i<elements.size();i++){
	          elements.get(i).print();
	        }
	}
}
