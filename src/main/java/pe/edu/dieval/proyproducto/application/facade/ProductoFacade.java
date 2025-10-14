package pe.edu.dieval.proyproducto.application.facade;

import org.springframework.stereotype.Service;
import pe.edu.dieval.proyproducto.domain.dto.Producto;

@Service
public class ProductoFacade {

    public Producto obtenerProducto(String sku, String nombre) {
        System.out.println("esta en el facade");
        Producto producto = new Producto();
        producto.setSku(sku);
        producto.setNombre(nombre);
        return producto;
    }



}
