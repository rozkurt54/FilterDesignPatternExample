package com.example.Vehicle.abstracts;

import com.example.Vehicle.Vehicle;

import java.util.List;

public interface VehicleFilter {

  List<Vehicle> filter(List<Vehicle> vehicleList);

}
