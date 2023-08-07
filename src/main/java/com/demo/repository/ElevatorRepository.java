package com.demo.repository;

import com.demo.model.ElevatorCar;
import com.demo.model.Floor;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class ElevatorRepository {

  List<ElevatorCar> elevatorCarList = new ArrayList<>();
  List<Floor> floorList = new ArrayList<>();

  public Floor getFloor(Integer floorId) {
    return null;
  }

  public ElevatorCar getElevatorCar(int elevatorCarId) {
    return null;
  }

  public void addCar(ElevatorCar car) {
    elevatorCarList.add(car);
  }

  public void addFloor(Floor floor) {
    floorList.add(floor);
  }
}
