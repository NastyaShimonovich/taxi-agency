package com.taxiagency.domain.DAO;

import com.taxiagency.domain.Car;
import com.taxiagency.domain.Color;

import java.util.List;

public interface CarDao {
    Car findByNumber(String str);
    List<Car> findByColor(Color color);
}
