package com.gridnine.testing;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ArrivalMoreDepartureCondition implements FilterCondition{

    @Override
    public List<Flight> excuteCondtion(List<Flight> flights) throws RuntimeException {

        if (Objects.isNull(flights)) {
            throw new NoFlightsException("No flights");
        }

        List<Flight> filteringResult = flights.stream().filter(flight -> {
                    for (Segment segment : flight.getSegments()) {
                        if (segment.getArrivalDate().isBefore(segment.getDepartureDate())) return false;
                    }
                    return true;
                })
                .collect(Collectors.toList());

        if (filteringResult.size()==0){
            throw new NoFilteringResultException("No filtering result");
        }

        return filteringResult;
    }
}
