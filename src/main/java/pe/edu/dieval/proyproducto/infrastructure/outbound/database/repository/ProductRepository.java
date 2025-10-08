package pe.edu.dieval.proyproducto.infrastructure.outbound.database.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import pe.edu.dieval.proyproducto.infrastructure.outbound.database.collection.ProductDocument;
import reactor.core.publisher.Mono;

public interface ProductRepository extends ReactiveMongoRepository<ProductDocument, String> {

    Mono<ProductDocument> findBySkuInkafarma(String skuInkafarma);

}
