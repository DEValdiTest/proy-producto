package pe.edu.dieval.proyproducto.infrastructure.outbound.database.adapter;

import org.springframework.stereotype.Component;
import pe.edu.dieval.proyproducto.domain.dto.Producto;
import pe.edu.dieval.proyproducto.domain.port.ProductRepositoryPort;
import pe.edu.dieval.proyproducto.infrastructure.outbound.database.collection.ProductDocument;
import pe.edu.dieval.proyproducto.infrastructure.outbound.database.repository.ProductRepository;

import java.util.Optional;

@Component
public class ProductAdapter implements ProductRepositoryPort {

    ProductRepository productRepository;

    public ProductAdapter(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Producto obtenerProductoPorSku(String sku) {
        System.out.println("Esta en adapter");
        Optional<ProductDocument> optionalProduct = productRepository.findBySkuInkafarma(sku);
        Producto producto = new Producto();

        if(optionalProduct.isPresent()) {

            producto.setSku(optionalProduct.get().getSkuInkafarma());
            producto.setNombre(optionalProduct.get().getLabel());
            producto.setPrecio(optionalProduct.get().getPriceInkafarma());
            return producto;
        }
        return producto;
    }
}
