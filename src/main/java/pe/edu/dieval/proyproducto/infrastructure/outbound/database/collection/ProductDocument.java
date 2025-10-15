package pe.edu.dieval.proyproducto.infrastructure.outbound.database.collection;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(collection = "products")
@Data
public class ProductDocument {

    @Id
    private String id;

    private String skuInkafarma;
    private String label;
    private BigDecimal priceInkafarma;
}
