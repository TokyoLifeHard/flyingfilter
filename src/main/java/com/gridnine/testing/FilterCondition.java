package com.gridnine.testing;

import java.util.List;

public interface FilterCondition {
    List<Flight> excuteCondtion(List<Flight> flights) throws RuntimeException;
}
