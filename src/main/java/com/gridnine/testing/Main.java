package com.gridnine.testing;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flight> flights = FlightBuilder.createFlights();

        ArrivalMoreDepartureCondition arrivalMoreDepartureCondition = new ArrivalMoreDepartureCondition();
        DepartureBeforeCurrentTimeCondition departureBeforeCurrentTimeCondition = new DepartureBeforeCurrentTimeCondition();
        TimeOnEarthMoreSomeHoursCondition timeOnEarthMoreSomeHoursCondition= new TimeOnEarthMoreSomeHoursCondition(2);

        FlyingFilterService flyingFilterService = new FlyingFilterService();

        System.out.println(flyingFilterService.filter(flights, arrivalMoreDepartureCondition));
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println(flyingFilterService.filter(flights, departureBeforeCurrentTimeCondition));
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println(flyingFilterService.filter(flights, timeOnEarthMoreSomeHoursCondition));


        System.out.println(flyingFilterService.filter(null, timeOnEarthMoreSomeHoursCondition));




    }
}
