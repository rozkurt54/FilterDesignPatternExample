package com.example.Vehicle.concretes;

import com.example.Vehicle.Vehicle;
import com.example.Vehicle.VehicleType;
import com.example.Vehicle.abstracts.VehicleFilter;

import java.util.ArrayList;
import java.util.List;

public class CarVehicleFilter implements VehicleFilter {

  @Override
  public List<Vehicle> filter(List<Vehicle> vehicleList) {
    List<Vehicle> filteredVehicle = new ArrayList<>();
    for(Vehicle v : vehicleList) {
      if(v.getVehicleType().equals(VehicleType.CAR)) {
        filteredVehicle.add(v);
      }
    }
    return filteredVehicle;
  }
}
