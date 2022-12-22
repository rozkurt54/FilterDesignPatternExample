package com.example.Vehicle.concretes;

import com.example.Vehicle.Vehicle;
import com.example.Vehicle.abstracts.VehicleFilter;

import java.util.ArrayList;
import java.util.List;

public class DsgFilter implements VehicleFilter {

  @Override
  public List<Vehicle> filter(List<Vehicle> vehicleList) {
    List<Vehicle> filtertedList = new ArrayList<>();
    for(Vehicle v : vehicleList) {
      if(v.isDSG()){
        filtertedList.add(v);
      }
    }
    return filtertedList;
  }
}
