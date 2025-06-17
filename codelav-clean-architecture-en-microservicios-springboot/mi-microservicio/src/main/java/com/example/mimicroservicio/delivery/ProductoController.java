package com.example.mimicroservicio.delivery;

import java.util.List;
import com.example.mimicroservicio.application.usecase.ListarProductosUseCase;
import com.example.mimicroservicio.domain.model.Producto;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/productos")
public class ProductoController {
    private final ListarProductosUseCase listarProductosUseCase;

    public ProductoController(ListarProductosUseCase listarProductosUseCase) {
        this.listarProductosUseCase = listarProductosUseCase;
    }

    @GetMapping
    public List<Producto> obtenerProductos() {
        return listarProductosUseCase.ejecutar();
    }
}
