package com.green.backend_car.sales.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SalesDTO {

  private int saleNum;
  private String buyerName;
  private String buyerContact;
  private String color;
  private LocalDateTime saleDate;

  private int modelNum;

  private String modelName;
  private int price;
}