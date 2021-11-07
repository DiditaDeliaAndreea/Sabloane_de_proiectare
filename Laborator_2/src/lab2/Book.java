package lab2;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private List<Author> Authors=new ArrayList<>();
	private List<Chapter> Chapters=new ArrayList<>();
	private List<SubChapter> SubChapters=new ArrayList<>();
	private List<Paragraph> Paragraphs=new ArrayList<>();
	private List<Image> Images=new ArrayList<>();
	private List<Table> Tables=new ArrayList<>();
	private String title;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(String title) {
		this.title = title;
	}
	
	public void addAuthor(Author author) {
		Authors.add(author);
	}
	
	public void addChapter(Chapter chapter) {
		Chapters.add(chapter);
	}
	
	public void addParagraph(Paragraph paragraph) {
		Paragraphs.add(paragraph);
	}
	
	public void addSubChapter(SubChapter subchapter) {
		SubChapters.add(subchapter);
	}
	
	public void addImage(Image image) {
		Images.add(image);
	}
	
	public void addTable(Table table) {
		Tables.add(table);
	}
	
	public void print() {
		System.out.println("Book: "+title);
		Authors.forEach(Author::print);
		Chapters.forEach(Chapter::print);
		SubChapters.forEach(SubChapter::print);
		Paragraphs.forEach(Paragraph::print);
		Images.forEach(Image::print);
		Tables.forEach(Table::print);
	}

}
