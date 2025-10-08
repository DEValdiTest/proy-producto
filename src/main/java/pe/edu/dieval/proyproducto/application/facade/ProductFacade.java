package pe.edu.dieval.proyproducto.application.facade;

import org.springframework.stereotype.Service;
import pe.edu.dieval.proyproducto.domain.dto.ProductDto;
import pe.edu.dieval.proyproducto.domain.port.ProductRepositoryPort;
import reactor.core.publisher.Mono;

@Service
public class ProductFacade {

    ProductRepositoryPort productRepositoryPort;

    public ProductFacade(ProductRepositoryPort productRepositoryPort) {
        this.productRepositoryPort = productRepositoryPort;
    }

    public Mono<ProductDto> addProduct(ProductDto product) {
        return productRepositoryPort.saveProduct(product);

    }

    public Mono<ProductDto> saveProduct(ProductDto product) {
        return productRepositoryPort.findBySkuInkafarma(product.getSku());

    }
}
