package com.green.backend_car.sales.controller;

import com.green.backend_car.sales.dto.SalesDTO;
import com.green.backend_car.sales.service.SalesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("sales")
public class SalesController {
  public final SalesService salesService;

  //판매 목록 조회 api
  @GetMapping("")
  public List<SalesDTO> getSalesList(){
    return salesService.getSalesList();
  }

  //판매 등록 api
  @PostMapping("")
  public int insertSales(@RequestBody SalesDTO salesDTO){
    return salesService.insertSales(salesDTO);
  }
}
