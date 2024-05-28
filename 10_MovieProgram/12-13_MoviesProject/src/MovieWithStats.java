
/**
 * Movie with additional stats from https://gist.githubusercontent.com/tiangechen/b68782efa49a16edaf07dc2cdaa855ea/raw/0c794a9717f18b094eabab2cd6a6b9a226903577/movies.csv
 *  @author Kendra Walther
 * ITP 265, Fall 2020, Gelato Section
 * Assignment xx, Week xx
 * Email: kwalther@usc.edu
 * Creaated on: Nov 3, 2020
 */
public class MovieWithStats extends Movie {
		private double audienceScore;
	private double profit;
	private double rottenTomatoScore;
	private double worldwideGross;
	
	public MovieWithStats(String title, String genre, String studio,  double audienceScore, double profit,
			double rottenTomatoScore, double worldwideGross, int year) {
		super(title, genre, studio, year);
		this.audienceScore = audienceScore;
		this.profit = profit;
		this.rottenTomatoScore = rottenTomatoScore;
		this.worldwideGross = worldwideGross;
	}

	/**
	 * @return the audienceScore
	 */
	public double getAudienceScore() {
		return audienceScore;
	}

	/**
	 * @return the profit
	 */
	public double getProfit() {
		return profit;
	}

	/**
	 * @return the rottenTomatoScore
	 */
	public double getRottenTomatoScore() {
		return rottenTomatoScore;
	}

	/**
	 * @return the worldwideGross
	 */
	public double getWorldwideGross() {
		return worldwideGross;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(audienceScore);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(profit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(rottenTomatoScore);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(worldwideGross);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieWithStats other = (MovieWithStats) obj;
		if (Double.doubleToLongBits(audienceScore) != Double.doubleToLongBits(other.audienceScore))
			return false;
		if (Double.doubleToLongBits(profit) != Double.doubleToLongBits(other.profit))
			return false;
		if (Double.doubleToLongBits(rottenTomatoScore) != Double.doubleToLongBits(other.rottenTomatoScore))
			return false;
		if (Double.doubleToLongBits(worldwideGross) != Double.doubleToLongBits(other.worldwideGross))
			return false;
		return true;
	}
	
	

}
