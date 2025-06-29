package Assignments4ArrayCollections;

import java.util.ArrayList;
import java.util.List;

public class Assignment4Q1 {

	public static void main(String[] args)
	{
		List<Integer> citiesArea = new ArrayList<Integer>();
		citiesArea.add(1484); //Delhi
		citiesArea.add(1276); //Bangalore
		citiesArea.add(650); //Hyderabad
		citiesArea.add(518); //Pune
		citiesArea.add(505); //Ahmedabad
		int sum = citiesArea.get(2) + citiesArea.get(3);
		System.out.println("Total Area of 3rd and 4th Cities : " + sum);
		
	}

}
