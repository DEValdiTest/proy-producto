package pe.edu.dieval.proyproducto.application.facade;

import org.springframework.stereotype.Service;
import pe.edu.dieval.proyproducto.domain.dto.Producto;
import pe.edu.dieval.proyproducto.domain.port.ProductRepositoryPort;

@Service
public class ProductoFacade {

    ProductRepositoryPort productRepositoryPort;

    public ProductoFacade(ProductRepositoryPort productRepositoryPort) {
        this.productRepositoryPort = productRepositoryPort;
    }

    public Producto obtenerProducto(String sku, String nombre) {
        System.out.println("Esta en facade");
        return productRepositoryPort.obtenerProductoPorSku(sku);
    }
}
