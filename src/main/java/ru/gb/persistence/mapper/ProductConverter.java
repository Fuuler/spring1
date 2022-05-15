package ru.gb.persistence.mapper;

import org.springframework.stereotype.Component;
import ru.gb.persistence.dtos.ProductDto;
import ru.gb.persistence.entities.Product;

@Component
public class ProductConverter {

    public ProductDto fromProduct(Product product) {
        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setTitle(product.getTitle());
        productDto.setPrice(product.getPrice());
        return productDto;
    }

    public Product toProduct(ProductDto productDto) {
        Product product = new Product();
        product.setId(productDto.getId());
        product.setTitle(productDto.getTitle());
        product.setPrice(productDto.getPrice());
        return product;
    }
}
