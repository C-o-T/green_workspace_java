package com.green.backend_car.car.controller;

import com.green.backend_car.car.dto.CarDTO;
import com.green.backend_car.car.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("car")
public class CarController {
  public final CarService carService;


  //차량 목록 조회 api
  @GetMapping("")
  public List<CarDTO> getCarList(){
    return carService.getCarList();
  }

  //차량 등록 api
  @PutMapping("")
  public int insertCar(@RequestBody CarDTO carDTO){
    return carService.insertCar(carDTO);
  }
}