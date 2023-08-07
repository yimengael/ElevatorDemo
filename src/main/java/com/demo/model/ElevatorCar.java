package com.demo.model;

import java.util.LinkedList;
import java.util.Queue;

public class ElevatorCar {
  private int id;
  private String name;
  private Queue<Integer> floorTobeServiced = new LinkedList<>();
  private Integer floorCurrentlyServiced;

  public ElevatorCar(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Queue<Integer> getFloorTobeServiced() {
    return floorTobeServiced;
  }

  public void setFloorTobeServiced(Queue<Integer> floorTobeServiced) {
    this.floorTobeServiced = floorTobeServiced;
  }

  public Integer getFloorCurrentlyServiced() {
    return floorCurrentlyServiced;
  }

  public void setFloorCurrentlyServiced(Integer floorCurrentlyServiced) {
    this.floorCurrentlyServiced = floorCurrentlyServiced;
  }
}
