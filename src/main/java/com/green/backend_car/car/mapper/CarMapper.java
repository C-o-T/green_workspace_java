package com.green.backend_car.car.mapper;

import com.green.backend_car.car.dto.CarDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CarMapper {

  //차량 목록 조회
  public List<CarDTO> getCarList();

  //차량 등록
  public int insertCar(CarDTO carDTO);
}
