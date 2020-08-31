package by.htp.les10.logic;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import by.htp.les10.entity.Airline;

public class AirlineLogic {

	public List<Airline> listOfFlightsForGivenDestination(List<Airline> airlines, String destination) {
		Airline a1;
		List<Airline> result = new ArrayList<Airline>();

		for (int i = 0; i < airlines.size(); i++) {

			a1 = airlines.get(i);
			if (a1.getDestination().equals(destination)) {
				result.add(a1);
			}
		}
		return result;

	}

	public List<Airline> listOfFlightsForGivenDayOfTheWeek(List<Airline> airlines, String dayOfTheWeek) {
		Airline a1;
		List<Airline> result = new ArrayList<Airline>();

		for (int i = 0; i < airlines.size(); i++) {
			a1 = airlines.get(i);
			if (a1.getDaysOfTheWeek().equals(dayOfTheWeek)) {
				result.add(a1);
			}
		}
		return result;
	}

	public List<Airline> listOfFlightsForGivenDayOfTheWeekWithDeparture(List<Airline> airlines, String dayOfTheWeek,
			Time departureTime) {
		List<Airline> temp = new ArrayList<Airline>();
		List<Airline> result = new ArrayList<Airline>();
		temp = listOfFlightsForGivenDayOfTheWeek(airlines, dayOfTheWeek);
		for (int i = 0; i < temp.size(); i++) {
			Airline a1 = temp.get(i);
			Time t1 = a1.getDepartureTime();
			if (t1.getTime() > departureTime.getTime()) {
				result.add(a1);
			}
		}
		return result;

	}
}
