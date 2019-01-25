package laboration13;

public class CD extends Media {
	
	private String artist;
	private String[] songs;
	
	public CD(long id, String title, String artist, String[] songs) {
		super(id, title);
		this.artist = artist;
		this.songs = songs;
	}
	
	public void setArtist( String artist) {
		this.artist = artist;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void setSongs(String[] songs) {
		this.songs = songs;
	}
	
	public String[] getSongs() {
		return songs;
	}
	
	public String toString() {
		
		String list = "", res;
		for(int i = 0; i < songs.length; i++) {
			list += (i + 1) + ". " + songs[i] + "\n";
		}
		res = "Artist: " + this.artist + "\nAlbum: " + super.getTitle() + "\nMelodier: \n" + list;
		return res;
	}
	
	public static void main(String[] args) {
		String[] mel = { "Mel 1", "Melodi 2", "Melodi 3", "Mel 4" };
		CD cd = new CD( 39488852, "TITEL" ,"ARTIST", mel );
		System.out.println( "----- Test av get-metoder -----" );
		System.out.println( cd.getId() + ", " + cd.getArtist() + ", " +
		 cd.getTitle() );
		System.out.println( "----- Test av toString -----" );
		System.out.println( cd.toString() );
		System.out.println( "----- Test av set-metoder -----" );
		cd.setArtist( "Ulf Lundell" );
		cd.setTitle( "Vargmåne" );
		cd.setSongs( new String[]{ "M1", "M2", "M3", "M4", "M5", "M6" } );
		System.out.println( cd.toString() );
	}
}
