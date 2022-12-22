package com.example.Vehicle.concretes;

import com.example.Vehicle.Vehicle;
import com.example.Vehicle.abstracts.VehicleFilter;

import java.util.ArrayList;
import java.util.List;

public class OrVehicleFilter implements VehicleFilter {

  private VehicleFilter filterFirst;
  private VehicleFilter filterSecond;

  public OrVehicleFilter(VehicleFilter filterFirst, VehicleFilter filterSecond) {
    this.filterFirst = filterFirst;
    this.filterSecond = filterSecond;
  }

  @Override
  public List<Vehicle> filter(List<Vehicle> vehicleList) {
    List<Vehicle> filteredVehicles  = filterFirst.filter(vehicleList);
    List<Vehicle> filtered2Vehicles = filterSecond.filter(vehicleList);
    for(Vehicle v : filtered2Vehicles) {
      if(!filteredVehicles.contains(v)){
        filteredVehicles.add(v);
      }
    }
    return filteredVehicles;
  }
}
