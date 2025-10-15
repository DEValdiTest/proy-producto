package pe.edu.dieval.proyproducto.infrastructure.inbound.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.dieval.proyproducto.application.facade.ProductoFacade;
import pe.edu.dieval.proyproducto.domain.dto.Producto;

@RestController
public class ProductoController {

    ProductoFacade productoFacade;

    public ProductoController(ProductoFacade productoFacade) {
        this.productoFacade = productoFacade;
    }

    @GetMapping("/v0/producto/{nombre}")
    public Producto obtenerProducto(@RequestParam(value = "sku", required = false, defaultValue = "141025") String sku,
                                    @PathVariable("nombre") String nombre) {

        return  productoFacade.obtenerProducto(sku, nombre);
    }

}
