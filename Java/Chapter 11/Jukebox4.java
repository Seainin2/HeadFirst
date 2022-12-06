import java.util.*;

public class Jukebox4{

	public static void main(String[] args){
		new Jukebox4().go();
	}

	public void go(){

		List<SongV3> songList = MockSongs.getSongsV3();
		System.out.println("Unsorted list: "+songList);

		Collections.sort(songList);
		System.out.println("SongV3 compareto(): "+songList);

		ArtistCompare ac = new ArtistCompare();
		songList.sort(ac);
		System.out.println("ArtistCompare compare(): "+songList);
	}

}