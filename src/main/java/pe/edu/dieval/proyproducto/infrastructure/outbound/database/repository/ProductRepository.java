package pe.edu.dieval.proyproducto.infrastructure.outbound.database.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import pe.edu.dieval.proyproducto.infrastructure.outbound.database.collection.ProductDocument;

import java.util.Optional;

public interface ProductRepository extends MongoRepository<ProductDocument, String> {

    Optional<ProductDocument> findBySkuInkafarma(String skuInkafarma);


}
