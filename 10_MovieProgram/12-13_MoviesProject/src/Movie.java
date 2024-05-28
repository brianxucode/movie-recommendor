
/**
 * Code description
 *  @author Kendra Walther
 * ITP 265, Fall 2020, Gelato Section
 * Assignment xx, Week xx
 * Email: kwalther@usc.edu
 * Creaated on: Nov 3, 2020
 */
public class Movie {
	private String title;
	private String genre;
	private String studio;
	private int year;
	public Movie(String title, String genre, String studio, int year) {
		this.title = title;
		this.genre = genre;
		this.studio = studio;
		this.year = year;
	}
	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}
	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	/**
	 * @return the studio
	 */
	public String getStudio() {
		return studio;
	}
	/**
	 * @param studio the studio to set
	 */
	public void setStudio(String studio) {
		this.studio = studio;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((studio == null) ? 0 : studio.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + year;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (studio == null) {
			if (other.studio != null)
				return false;
		} else if (!studio.equals(other.studio))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Movie [title=" + title + ", genre=" + genre + ", studio=" + studio + ", year=" + year + "]";
	}
	
	
	

}
