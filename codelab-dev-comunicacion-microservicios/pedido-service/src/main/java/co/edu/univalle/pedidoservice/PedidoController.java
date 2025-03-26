package co.edu.univalle.pedidoservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;

import java.util.List;



@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final ProductoCliente productoCliente;

    @Autowired
    public PedidoController(ProductoCliente productoCliente) {
        this.productoCliente = productoCliente;
    }

    @GetMapping("/crear")
    public ResponseEntity<?> crearPedido() {
        List<ProductoDTO> productos = productoCliente.obtenerProductos();
        return ResponseEntity.ok("Pedido creado con productos: " + productos);
    }
}
