package laboration13;

public class Book extends Media{
	private String author;

	public Book( long id, String title, String author ) {
		super( id, title ); // Anrop av Media( long, String );
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String toString() {

		return super.getTitle() + " skriven av " + author;
	}
	public static void main(String[] args) {
		Book media = new Book( 837884976, "En fantastisk värld", "Alice Green" );
		String res = media.getTitle() + " av " + media.getAuthor() + "\n" +
				"toString-metoden: " + media.toString();
		javax.swing.JOptionPane.showMessageDialog( null, res );
	}
}
