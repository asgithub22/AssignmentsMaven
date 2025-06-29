package Assignments4ArrayCollections;

import java.util.ArrayList;
import java.util.List;

public class Assignment4Q4 {

	public static void main(String[] args) {
		
		List<String> highest_grossing_movies = new ArrayList<String>();
		highest_grossing_movies.add("Avatar (2009)");
		highest_grossing_movies.add("Avengers: Endgame (2019)");
		highest_grossing_movies.add("Titanic (1997)");
		highest_grossing_movies.add("Star Wars: The Force Awakens (2015)");
		highest_grossing_movies.add("Avengers: Infinity War (2018)");
		
		System.out.println("The third movie on the list is :" + highest_grossing_movies.get(2));
		 		

	}

}
