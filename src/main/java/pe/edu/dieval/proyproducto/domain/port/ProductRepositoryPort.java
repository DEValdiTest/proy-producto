package pe.edu.dieval.proyproducto.domain.port;

import pe.edu.dieval.proyproducto.domain.dto.Producto;

public interface ProductRepositoryPort {

    Producto obtenerProductoPorSku(String sku);

}
