package com.example;

import com.example.Vehicle.ColorType;
import com.example.Vehicle.Vehicle;
import com.example.Vehicle.VehicleType;
import com.example.Vehicle.abstracts.VehicleFilter;
import com.example.Vehicle.concretes.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;

public class Driver {
  public static void main(String[] args) {

    Vehicle bike1 = new Vehicle("Bike1", ColorType.WHITE, VehicleType.BIKE);
    Vehicle bike2 = new Vehicle("Bike2", ColorType.WHITE, VehicleType.BIKE);
    Vehicle bike3 = new Vehicle("Bike3", ColorType.WHITE, VehicleType.BIKE);

    Vehicle truck = new Vehicle("Truck1", ColorType.GRAY, VehicleType.TRUCK);
    Vehicle truck1 = new Vehicle("Truck2", ColorType.WHITE, VehicleType.TRUCK);
    Vehicle truck2 = new Vehicle("Truck3", ColorType.BLUE, VehicleType.TRUCK);

    Vehicle car1 = new Vehicle("Car1", ColorType.RED, VehicleType.CAR);
    car1.setDSG(true);
    Vehicle car3= new Vehicle("Car1", ColorType.WHITE, VehicleType.CAR);
    Vehicle car2 = new Vehicle("Car3", ColorType.BLACK, VehicleType.CAR);


    List<Vehicle> vehicleList = new ArrayList<>();

    vehicleList.addAll(Arrays.asList(bike1, bike2, bike3, truck1, truck2, truck, car1, car2, car3));

    VehicleFilter redFilter = new RedVehicleFilter();
    VehicleFilter blueFilter = new BlueVehicleFilter();

    VehicleFilter blueandredfilter = new OrVehicleFilter(redFilter, blueFilter);

    VehicleFilter bikeFilter = new BikeVehicleFilter();

    VehicleFilter blueBikeFilter = new AndFilterVehicle(blueFilter, bikeFilter);

    System.out.println("DSG Vehicles");
    VehicleFilter dsgFilter = new DsgFilter();
    System.out.println(dsgFilter.filter(vehicleList));




    System.out.println("Red Vehicle List");

    System.out.println(redFilter.filter(vehicleList));

    System.out.println("Blue Vehicle List");

    System.out.println(blueFilter.filter(vehicleList));

    System.out.println("Blue and Red vehicle List");

    System.out.println(blueandredfilter.filter(vehicleList));

    System.out.println("Bike List");

    System.out.println(bikeFilter.filter(vehicleList));

    System.out.println("Blue Bike List");

    System.out.println(blueBikeFilter.filter(vehicleList));














  }
}
