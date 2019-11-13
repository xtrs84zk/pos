package com.chumbok.pos.service;

import com.chumbok.pos.dto.ProductDTO;
import com.chumbok.pos.dto.ProductWithStockQuantity;
import com.chumbok.pos.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    Product getProduct(long productId);

    Product createProduct(ProductDTO productDTO);

    void updateProduct(ProductDTO productDTO, long id);

    void deleteProduct(long productId);

    void deleteBulkProduct(List<Long> ids);

    List<Product> searchProduct(String displayName);

    Page<Product> findAllByPage(Pageable pageable);

    Page<ProductWithStockQuantity> findProductWithStockQuantityByPage(Pageable pageable);

    Page<ProductWithStockQuantity> findProductWithStockQuantityByPageGraterThanZero(Pageable pageable);
}