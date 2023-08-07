package com.demo.config;

import com.demo.model.ElevatorCar;
import com.demo.model.Floor;
import com.demo.repository.ElevatorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

  @Bean
  CommandLineRunner initDb(ElevatorRepository repository) {
    return args -> {
      repository.addCar(new ElevatorCar(1, "Car_One"));
      repository.addCar(new ElevatorCar(2, "Car_Two"));
      repository.addCar(new ElevatorCar(3, "Car_Three"));

      repository.addFloor(new Floor(1, "Floor_One"));
      repository.addFloor(new Floor(2, "Floor_Two"));
      repository.addFloor(new Floor(3, "Floor_Three"));
    };
  }
}
