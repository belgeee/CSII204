/* File: LibaryrRecord.java
 * ------------------------
 * Class keeps record of library books.
 * Information that it keeps is:
 * - book title
 * - book author
 * - catalog number
 * - publisher
 * - year of publication
 * - circulating or norcirculating
 */

package Chapter6;

public class LibraryRecord {
	
/**
 * Creates new book with specified parameters.
 * @param title
 * @param author
 * @param catalogID
 * @param publisher
 * @param publicationYear
 * @param circa
 */
	public LibraryRecord (String title, String author, int catalogID,
							String publisher, int publicationYear, boolean circa) {
		bookTitle = title;
		bookAuthor = author;
		this.catalogID = catalogID;
		this.publisher = publisher;
	    year = publicationYear;
	    circulating = circa;
		
	}
	
	public LibraryRecord (String title, String author, int catalogID,
			String publisher, int publicationYear) {
		bookTitle = title;
		bookAuthor = author;
		this.catalogID = catalogID;
		this.publisher = publisher;
	    year = publicationYear;
	    circulating = true;
}
	
/**
 * Returns book title.
 * @return
 */
	public String getTitle() {
		return bookTitle;
	}
	
	public String getAuthor() {
		return bookAuthor;
	}
	
	public int getCatalogId() {
		return catalogID;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public int getYear() {
		return year;
	}
	
	public boolean isCirculating() {
		return circulating;
	}
	
	public void setCirculating(boolean flag) {
		circulating = flag;
	}
	
	public String toString() {
		return "\"" + bookTitle + "\", " + bookAuthor + ", ID:" + catalogID + ", "
				+ publisher + ", " + year + ", " + rent();
	}
	
	private String rent() {
		if (circulating) return "Rented Out";
			return "To rent";
	}
	
/* Private instance variables */
	
	private String bookTitle;
	private String bookAuthor;
	private int catalogID;
	private String publisher;
	private int year;				/* year of book publication */
	private boolean circulating;	/* taken out(true) or in library(false) */
	
}
