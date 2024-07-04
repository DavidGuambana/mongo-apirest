package com.david.apimongodb.controllers;

import com.david.apimongodb.models.ProductoDTO;
import com.david.apimongodb.repositories.IProductoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET,
        RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private IProductoDAO repositorio;

    @PostMapping("/producto")
    public ProductoDTO create(@Validated @RequestBody ProductoDTO producto) {
        return repositorio.insert(producto);
    }

    @GetMapping("/producto")
    public List<ProductoDTO> readAll() {
        return repositorio.findAll();
    }

    @PutMapping("/producto/{id}")
    public ProductoDTO update(@PathVariable String id, @Validated @RequestBody ProductoDTO producto) {
        return repositorio.save(producto);
    }

    @DeleteMapping("/producto/{id}")
    public void delete(@PathVariable String id) {
        repositorio.deleteById(id);
    }

}
