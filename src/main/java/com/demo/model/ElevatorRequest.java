package com.demo.model;

public class ElevatorRequest {
  private int personFloor;
  private int elevatorCarId;

  public int getPersonFloor() {
    return personFloor;
  }

  public void setPersonFloor(int personFloor) {
    this.personFloor = personFloor;
  }

  public int getElevatorCarId() {
    return elevatorCarId;
  }

  public void setElevatorCarId(int elevatorCarId) {
    this.elevatorCarId = elevatorCarId;
  }
}
