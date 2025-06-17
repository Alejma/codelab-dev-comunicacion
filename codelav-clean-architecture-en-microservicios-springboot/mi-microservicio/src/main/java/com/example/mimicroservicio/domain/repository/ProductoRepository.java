package com.example.mimicroservicio.domain.repository;

import java.util.Optional;
import com.example.mimicroservicio.domain.model.Producto;
import java.util.List;

public interface ProductoRepository {
    List<Producto> listarProductos();
    Optional<Producto> findById(Long id);

}
