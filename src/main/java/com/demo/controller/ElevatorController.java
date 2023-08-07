package com.demo.controller;

import com.demo.model.ElevatorCar;
import com.demo.model.ElevatorRequest;
import com.demo.model.Floor;
import com.demo.service.ElevatorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class ElevatorController {

  @Autowired
  private ElevatorService elevatorService;

  /**
   * @param elevatorCarId Elevator car id.
   */
  @GetMapping("/allfloors")
  public List<Floor> getAllFloorsServiced(@RequestParam(value = "elevatorCarId", defaultValue = "1") String elevatorCarId) {
    return elevatorService.getAllFloorServiced(Integer.parseInt(elevatorCarId));
  }

  /**
   * @param elevatorCarId Elevator car id.
   */
  @GetMapping("/nextfloor")
  public Floor getNextFloorServiced(@RequestParam(value = "elevatorCarId", defaultValue = "1") String elevatorCarId) {
    return elevatorService.getNextFloorServiced(Integer.parseInt(elevatorCarId));
  }

  /**
   * @param elevatorReq Elevator request.
   */
  @PostMapping("/callelevator")
  public ElevatorCar callElevatorCar(@RequestBody ElevatorRequest elevatorReq) {
    return elevatorService.callElevatorCar(elevatorReq.getPersonFloor(), elevatorReq.getElevatorCarId());
  }

  /**
   * @param elevatorReq Elevator request.
   */
  @PostMapping("/bringsomeone")
  public ElevatorCar bringSomeoneTo(@RequestBody ElevatorRequest elevatorReq) {
    return elevatorService.callElevatorCar(elevatorReq.getPersonFloor(), elevatorReq.getElevatorCarId());
  }
}
