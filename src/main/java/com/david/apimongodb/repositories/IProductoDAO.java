package com.david.apimongodb.repositories;

import com.david.apimongodb.models.ProductoDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoDAO extends MongoRepository<ProductoDTO, String> {
}
