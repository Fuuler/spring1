package ru.gb.persistence;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.gb.persistence.entities.Product;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Component
//@Scope("prototype")
public class Cart {

    private final Map<Product, Integer> cartMap = new HashMap<>();

    public Map<Product, Integer> getCartMap() {
        return cartMap;
    }

}
