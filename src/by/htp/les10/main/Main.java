package by.htp.les10.main;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import by.htp.les10.entity.Airline;
import by.htp.les10.entity.AirlineList;
import by.htp.les10.logic.AirlineLogic;
import by.htp.les10.view.AirlineViewer;

public class Main {

	public static void main(String[] args) {

		Airline airline1 = new Airline("Moscow", 1263, "Boening747", Time.valueOf("19:36:45"), "Sunday");
		Airline airline2 = new Airline("New York", 5546, "Airbus A320", Time.valueOf("05:11:52"), "Thursday");
		Airline airline3 = new Airline("Minsk", 7894, "Tu 154", Time.valueOf("10:40:55"), "Monday");

		AirlineList airlines = new AirlineList();
		AirlineLogic logic = new AirlineLogic();
		AirlineViewer print = new AirlineViewer();

		airlines.addAirline(airline1);
		airlines.addAirline(airline2);
		airlines.addAirline(airline3);

		List<Airline> temp = new ArrayList<Airline>();
		List<Airline> temp2 = new ArrayList<Airline>();

		temp = airlines.getAirlineList();

		print.printAll(temp);

		temp2 = logic.listOfFlightsForGivenDestination(temp, "Minsk");
		print.printAll(temp2);

		temp2 = logic.listOfFlightsForGivenDayOfTheWeek(temp, "Thursday");
		print.printAll(temp2);

		temp2 = logic.listOfFlightsForGivenDayOfTheWeekWithDeparture(temp, "Sunday", Time.valueOf("00:36:44"));
		print.printAll(temp2);

	}
}
