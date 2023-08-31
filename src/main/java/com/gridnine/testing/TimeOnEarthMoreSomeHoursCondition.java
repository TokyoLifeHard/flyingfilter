package com.gridnine.testing;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class TimeOnEarthMoreSomeHoursCondition implements FilterCondition{

    private int moreThanHours;

    public TimeOnEarthMoreSomeHoursCondition(int moreThanHours) {
        this.moreThanHours = moreThanHours;
    }

    public void setMoreThanHours(int moreThanHours) {
        this.moreThanHours = moreThanHours;
    }

    @Override
    public List<Flight> excuteCondtion(List<Flight> flights) throws RuntimeException{

        if (Objects.isNull(flights)) {
            throw new NoFlightsException("No flights");
        }

        List<Flight> filteringResult = flights.stream()
                .filter(flight -> flight.getSegments().size() > 1)
                .filter(flight -> {
                    List<Segment> segments = flight.getSegments();
                    int sumtime = 0;
                    for (int i = 0; i < segments.size()-1; i++) {
                        LocalDateTime arrDate = segments.get(i).getArrivalDate();
                        LocalDateTime deprDate = segments.get(i+1).getDepartureDate();
                        sumtime += Duration.between(arrDate,deprDate).toHours();
                    }
                    return sumtime>this.moreThanHours;
                })
                .collect(Collectors.toList());

        if (filteringResult.size()==0){
            throw new NoSuchFilteringResultException("No filtering result");
        }

        return filteringResult;
    }


}
