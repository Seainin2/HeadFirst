import java.util.*;

public class Jukebox2{

	public static void main(String[] args){
		new Jukebox2().go();
	}

	public void go(){

		List<SongV3> songList = MockSongs.getSongsV3();
		System.out.println(songList);

		Collections.sort(songList);
		System.out.println(songList);

		System.out.println("here");
	}

}