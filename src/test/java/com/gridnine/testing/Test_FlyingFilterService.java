package com.gridnine.testing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test_FlyingFilterService {
    static ArrivalMoreDepartureCondition arrivalMoreDepartureCondition;
    static List<Flight> flights;
    static FlyingFilterService flyingFilterService;

    @BeforeAll
    static void initTestData(){
        arrivalMoreDepartureCondition = new ArrivalMoreDepartureCondition();
        flights = FlightBuilder.createFlights();
        flyingFilterService = new FlyingFilterService();
    }

    @Test
    void testThrowNoFlightException(){
        NoFlightsException noFlightsException = assertThrows(NoFlightsException.class,()->{
            flyingFilterService.filter(null,arrivalMoreDepartureCondition);
        });
        assertEquals("No flights",noFlightsException.getMessage());
    }

    @Test
    void testThrowNoFilterException(){
        NoFlightsException noFlightsException = assertThrows(NoFlightsException.class,()->{
            flyingFilterService.filter(flights,null);
        });
        assertEquals("No Filter",noFlightsException.getMessage());
    }
}
