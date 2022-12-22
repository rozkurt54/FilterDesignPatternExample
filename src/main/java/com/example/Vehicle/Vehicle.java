package com.example.Vehicle;

public class Vehicle {

  private String name;

  private ColorType colorType;

  private VehicleType vehicleType;

  private boolean DSG;


  public Vehicle(String name, ColorType colorType, VehicleType vehicleType) {
    this.name = name;
    this.colorType = colorType;
    this.vehicleType = vehicleType;
  }

  @Override
  public String toString() {
    return "Vehicle{" +
        "name='" + name + '\'' +
        ", colorType=" + colorType +
        ", vehicleType=" + vehicleType +
        '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ColorType getColorType() {
    return colorType;
  }

  public void setColorType(ColorType colorType) {
    this.colorType = colorType;
  }

  public VehicleType getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(VehicleType vehicleType) {
    this.vehicleType = vehicleType;
  }

  public boolean isDSG() {
    return DSG;
  }

  public void setDSG(boolean DSG) {
    this.DSG = DSG;
  }
}
