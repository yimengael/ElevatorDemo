package com.demo.service;

import com.demo.model.ElevatorCar;
import com.demo.model.Floor;
import com.demo.repository.ElevatorRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ElevatorService {

  @Autowired
  private ElevatorRepository repository;

  /**
   * This methods will consider that someone is position at the floor `personFloor` and that person calls
   * the elevator car `elevatorCarId` to come to the floor `personFloor`
   * @param personFloor the floor where the customer is located
   * @param elevatorCarId the id of the elevator car.
   * @return ElevatorCar with the properties set.
   */
  public ElevatorCar callElevatorCar(int personFloor, int elevatorCarId) {
    ElevatorCar car = repository.getElevatorCar(elevatorCarId);
    car.getFloorTobeServiced().offer(personFloor);
    return car;
  }

  /**
   *
   * @param destinationFloor
   * @param elevatorCarId
   * @return
   */
  public ElevatorCar bringPersonTo(int destinationFloor, int elevatorCarId) {
    ElevatorCar car = repository.getElevatorCar(elevatorCarId);
    car.getFloorTobeServiced().remove(destinationFloor);
    car.setFloorCurrentlyServiced(destinationFloor);
    return car;
  }


  public List<Floor> getAllFloorServiced(int elevatorCarId) {
    ElevatorCar car = repository.getElevatorCar(elevatorCarId);
    List<Floor> result = new ArrayList<>();
    Queue<Integer> q = car.getFloorTobeServiced();
    while (!q.isEmpty())
      result.add(repository.getFloor(q.poll()));
    return result;
  }

  public Floor getNextFloorServiced(int elevatorCarId) {
    ElevatorCar car = repository.getElevatorCar(elevatorCarId);
    return repository.getFloor(car.getFloorCurrentlyServiced());
  }
}
