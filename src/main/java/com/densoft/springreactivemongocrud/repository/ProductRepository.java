package com.densoft.springreactivemongocrud.repository;

import com.densoft.springreactivemongocrud.dto.ProductDto;
import com.densoft.springreactivemongocrud.entity.Product;
import org.springframework.data.domain.Range;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface ProductRepository extends ReactiveMongoRepository<Product, String> {
    Flux<ProductDto> findByPriceBetween(Range<Double> priceRange);
}
