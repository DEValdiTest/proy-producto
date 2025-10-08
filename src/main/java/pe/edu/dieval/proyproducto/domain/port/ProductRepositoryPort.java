package pe.edu.dieval.proyproducto.domain.port;

import pe.edu.dieval.proyproducto.domain.dto.ProductDto;
import reactor.core.publisher.Mono;

public interface ProductRepositoryPort {

    Mono<ProductDto> findBySkuInkafarma(String skuInkafarma);

    Mono<ProductDto> saveProduct(ProductDto productDto);
}
