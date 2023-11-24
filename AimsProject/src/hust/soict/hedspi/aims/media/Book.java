package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{

	private List<String> authors = new ArrayList<String>();
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public void addAuthor(String authorName) {
		if (authors.contains(authorName)) {
			System.out.println("The author is already in the list.");
			return;
		} else {
			authors.add(authorName);
			System.out.println("The author has been added.");
		}
	}
	
	public void removeAuthor (String authorName) {
		if (authors.contains(authorName)) {
			authors.remove(authorName);
			System.out.println("The author has been removed.");
		} else {
			System.out.println("The author is not in the list.");
		}
	}
	
	// Create accessor and mutator
	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

}
