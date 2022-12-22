package com.example.Vehicle.concretes;

import com.example.Vehicle.Vehicle;
import com.example.Vehicle.abstracts.VehicleFilter;

import java.util.List;

public class AndFilterVehicle implements VehicleFilter {

  private VehicleFilter firstFilter;
  private VehicleFilter secondFilter;

  public AndFilterVehicle(VehicleFilter firstFilter, VehicleFilter secondFilter) {
    this.firstFilter = firstFilter;
    this.secondFilter = secondFilter;
  }

  @Override
  public List<Vehicle> filter(List<Vehicle> vehicleList) {
    List<Vehicle> filter1 = firstFilter.filter(vehicleList);
    List<Vehicle> filter2 = secondFilter.filter(filter1);
    return filter2;
  }
}
