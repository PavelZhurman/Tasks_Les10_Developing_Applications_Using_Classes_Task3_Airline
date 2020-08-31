package by.htp.les10.view;

import java.util.List;

import by.htp.les10.entity.Airline;

public class AirlineViewer {

	public void printAll(List<Airline> airlines) {
		Airline a1;
		for (int i = 0; i < airlines.size(); i++) {
			a1 = airlines.get(i);
			System.out.println("destination=" + a1.getDestination() + ", FlightNumber=" + a1.getFlightNumber()
					+ ", AircraftType=" + a1.getAircraftType() + ", DepartureTime=" + a1.getDepartureTime()
					+ ", DaysOfTheWeek=" + a1.getDaysOfTheWeek());
		}
		System.out.println();
	}

}
