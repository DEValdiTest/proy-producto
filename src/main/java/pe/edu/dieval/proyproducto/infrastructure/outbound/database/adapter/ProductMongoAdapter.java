package pe.edu.dieval.proyproducto.infrastructure.outbound.database.adapter;

import org.springframework.stereotype.Component;
import pe.edu.dieval.proyproducto.domain.dto.ProductDto;
import pe.edu.dieval.proyproducto.domain.port.ProductRepositoryPort;
import pe.edu.dieval.proyproducto.infrastructure.outbound.database.collection.ProductDocument;
import pe.edu.dieval.proyproducto.infrastructure.outbound.database.repository.ProductRepository;
import reactor.core.publisher.Mono;

@Component
public class ProductMongoAdapter implements ProductRepositoryPort{

    ProductRepository productRepository;

    public ProductMongoAdapter(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Mono<ProductDto> findBySkuInkafarma(String skuInkafarma) {
        return productRepository.findBySkuInkafarma(skuInkafarma).flatMap(product->{
            ProductDto productDto = new ProductDto();
            productDto.setNombre(product.getName());
            productDto.setDescripcion(product.getDescription());
            return Mono.just(productDto);
        });
    }

    @Override
    public Mono<ProductDto> saveProduct(ProductDto productDtoReq) {
        System.out.println("Llego aqui");
        ProductDocument productDocument = new ProductDocument();
        productDocument.setSkuInkafarma(productDtoReq.getSku());
        productDocument.setName(productDtoReq.getNombre());
        productDocument.setDescription(productDtoReq.getDescripcion());

        return productRepository.save(productDocument).flatMap(product->{
            ProductDto productDto = new ProductDto();
            productDto.setNombre(product.getName());
            productDto.setDescripcion(product.getDescription());
            return Mono.just(productDto);
        });
    }
}
