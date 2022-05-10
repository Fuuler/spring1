package ru.gb.persistence.dto;

import lombok.Data;
import ru.gb.persistence.entities.Product;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Data
public class CartDto {

    private Map<Product, Integer> cartMap = new HashMap<>();
    private BigDecimal totalSum;
}