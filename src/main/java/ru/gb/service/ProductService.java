package ru.gb.service;

import org.springframework.data.domain.Page;
import ru.gb.persistence.entities.Product;

import java.math.BigDecimal;
import java.util.List;

public interface ProductService {

    List<Product> getProductList();

    void saveOrUpdate(Product product);

    Product getProductById(Long id);

    void deleteById(Long id);

    Page<Product> getProductsFiltered(BigDecimal minPrice, BigDecimal maxPrice,
                                      String partName, Integer pageNum,
                                      Integer productsPerPage);
}
