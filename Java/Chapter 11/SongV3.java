public class SongV3 implements Comparable<SongV3>{
	private String title;
	private String artist;
	private int bpm;
	
	static{
		System.out.println("yo dog!");
	}

	public int compareTo(SongV3 s){
		return title.compareTo(s.getTitle());
	}

	SongV3(String title, String artist, int bpm){
		this.title = title;
		this.artist =artist;
		this.bpm = bpm;
	}

	public String getTitle(){
		return title;
	}

	public String getArtist(){
		return artist;
	}

	public int getBpm(){
		return bpm;
	}

	public String toString(){
		return title;
	}
}