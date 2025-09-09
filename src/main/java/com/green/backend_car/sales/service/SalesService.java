package com.green.backend_car.sales.service;

import com.green.backend_car.sales.dto.SalesDTO;
import com.green.backend_car.sales.mapper.SalesMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SalesService {
  public final SalesMapper salesMapper;

  //판매 목록 조회
  public List<SalesDTO> getSalesList(){
    return salesMapper.getSalesList();
  }

  //판매 정보 등록
  public int insertSales(SalesDTO salesDTO){
    return salesMapper.insertSales(salesDTO);
  }
}
