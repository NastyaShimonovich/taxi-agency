package com.taxiagency.domain.DAO;

import com.taxiagency.domain.Driver;

import java.util.List;

public interface DriverDao {
    List<Driver> findAll();
}
