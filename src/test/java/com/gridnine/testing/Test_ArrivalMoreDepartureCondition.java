package com.gridnine.testing;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import java.util.List;


public class Test_ArrivalMoreDepartureCondition {

    static ArrivalMoreDepartureCondition arrivalMoreDepartureCondition;
    static List<Flight> flights;

    @BeforeAll
    static void initTestData(){
        arrivalMoreDepartureCondition = new ArrivalMoreDepartureCondition();
        flights = FlightBuilder.createFlights();
    }
    @Test
    void testThrowNoFlightException(){
        NoFlightsException noFlightsException = assertThrows(NoFlightsException.class,()->{
            arrivalMoreDepartureCondition.excuteCondtion(null);
        });
        assertEquals("No flights",noFlightsException.getMessage());
    }


}
