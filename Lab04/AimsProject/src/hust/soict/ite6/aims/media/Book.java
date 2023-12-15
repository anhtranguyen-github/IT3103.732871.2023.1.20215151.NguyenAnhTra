package hust.soict.ite6.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<String> authors;
	// Add author method
	public void addAuthor(String authorName) {
		if (!authors.contains(authorName)) {
			authors.add(authorName);
		}
	}
	// Remove author method
	public void removeAuthor(String authorName) {
		authors.remove(authorName);
	}
	// Constructors
	public Book(int id, String title, String category, float cost) {
		this.setId(id);
		this.setTitle(title);
		this.setCategory(category);
		this.setCost(cost);
		this.authors = new ArrayList<>();
	}
	public List<String> getAuthors() {
		return authors;
	}
	@Override
	public String toString() {
		return super.toString() + ", Authors: " + authors;
	}
}
