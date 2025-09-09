package com.green.backend_car.car.service;

import com.green.backend_car.car.dto.CarDTO;
import com.green.backend_car.car.mapper.CarMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {
  public final CarMapper carMapper;

  //차량 목록 조회
  public List<CarDTO> getCarList(){
    return carMapper.getCarList();
  }

  //차량 등록
  public int insertCar(CarDTO carDTO){
    return carMapper.insertCar(carDTO);
  }
}
