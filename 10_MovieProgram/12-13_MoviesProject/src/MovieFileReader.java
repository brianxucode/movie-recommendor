import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Code description
 *  @author Kendra Walther
 * ITP 265, Fall 2020, Gelato Section
 * Assignment xx, Week xx
 * Email: kwalther@usc.edu
 * Creaated on: Oct 29, 2020
 */
public class MovieFileReader {

	private static boolean triedWithBin = false;
	/**
	 * 
	 */
	public MovieFileReader() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Reads all the data from the file into a list of Strings
	 * @param filename
	 * @return
	 */
	public static List<Movie> readFile(String filename){
		List<Movie> fileData = new ArrayList<>();
		try(Scanner fileScan = new Scanner(new FileInputStream(filename))){

			while(fileScan.hasNextLine()) {
				String data = fileScan.nextLine();
				Movie m = parseStringToMovie(data);
				fileData.add(m);
			}

		} catch (FileNotFoundException e) {
			System.err.println("Couldn't find the file: " + filename);
			if(!triedWithBin) {
				// what if we forgot the directory??
				//try to recover by calling this method again, and using the new result....
				triedWithBin = true;
				return readFile("bin/" + filename); // try to recover
			}
			else {
				e.printStackTrace();
			}

		}// auto-close

		return fileData;
	}
	/**
	 * @param data
	 * @return
	 */
	private static Movie parseStringToMovie(String data) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Movie> data = readFile("bin/2007-2011_movies.csv");
		System.out.println("Here's the data read from the file:");
		for(Movie row: data) {
			System.out.println(row);
		}
		System.out.println(data.size() +  " movies");
	}

}
