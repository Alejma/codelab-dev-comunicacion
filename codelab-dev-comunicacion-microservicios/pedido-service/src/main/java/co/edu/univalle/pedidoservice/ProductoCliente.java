package co.edu.univalle.pedidoservice;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "producto-service")
public interface ProductoCliente {
    @GetMapping("/productos")
    List<ProductoDTO> obtenerProductos();
}
