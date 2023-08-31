package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class DepartureBeforeCurrentTimeCondition implements FilterCondition{

    @Override
    public List<Flight> excuteCondtion(List<Flight> flights) throws RuntimeException {

        if(Objects.isNull(flights)){
            throw new NoFlightsException("No flights");
        }

        LocalDateTime now = LocalDateTime.now();
        List<Flight> filteringResult = flights.stream().filter(flight -> {
                    for (Segment segment : flight.getSegments()) {
                        if (segment.getDepartureDate().isAfter(now)) return false;
                    }
                    return true;
                })
                .collect(Collectors.toList());

        if (filteringResult.size()==0){
            throw new NoSuchFilteringResultException("No filtering result");
        }
        return filteringResult;
    }
}
