package com.taxiagency.domain.DAO;

import com.taxiagency.domain.Passenger;

import java.util.List;

public interface PassengerDao {
    List<Passenger> findByName(String str);
    List<Passenger> findByBhoneRegexp(String str);
}
