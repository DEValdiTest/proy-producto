package pe.edu.dieval.proyproducto.infrastructure.outbound.database.collection;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "products1")
public class ProductDocument {

    @Id
    private String id;
    private String skuInkafarma;
    private String name;
    private String description;
}
