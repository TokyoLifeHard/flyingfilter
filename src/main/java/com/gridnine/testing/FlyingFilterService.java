package com.gridnine.testing;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FlyingFilterService {


    public List<Flight> filter(List<Flight> flights, FilterCondition filterCondition) throws RuntimeException{
        if (Objects.isNull(flights)){
            throw new NoFlightsException("No flights");
        }

        if (Objects.isNull(filterCondition)){
            throw new NoFlightsException("No Filter");
        }

        List<Flight> filteringResult = new ArrayList<>(flights.size());

        try {
            filteringResult.addAll(filterCondition.excuteCondtion(flights));
        } catch (NoFlightsException | NoSuchFilteringResultException e) {
            System.out.println(e.getMessage());
        }

        return filteringResult;
    }

}
