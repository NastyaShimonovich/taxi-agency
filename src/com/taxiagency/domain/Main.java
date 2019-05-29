package com.taxiagency.domain;

import com.taxiagency.domain.DAO.Dao;
import com.taxiagency.domain.DAO.RamDao;

import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (FileWriter fos = new FileWriter("D://stormnet.txt")) {
        Dao<Passenger> passengerDao = new RamDao<>();
        for (int i = 0; i < 10; i++) {
            String id = String.valueOf(i + 1);
            String name = "Nastya";
            String mobilePhone = "+375291234567";
            Passenger passenger = new Passenger(id, name, mobilePhone);
            passengerDao.save(passenger);
        }
        List<Passenger> passengers = passengerDao.findAll();
        System.out.println("Passenger: " + passengers);

        Dao<Driver> driverDao = new RamDao<>();
        for (int i = 0; i < 10; i++) {
            String id = String.valueOf(i + 1);
            //int size = new Random().nextInt(100);
            String name = "Katya";
            Driver driver = new Driver(id, name);
            driverDao.save(driver);
        }
        List<Driver> drivers = driverDao.findAll();
        System.out.println("Driver: " + drivers);
        fos.write(String.valueOf("Passenger: " + passengers));
        fos.write(String.valueOf("\n" + "Driver: " + drivers));
    }
        catch (IOException e) {
        e.printStackTrace();
    }

    }
}
