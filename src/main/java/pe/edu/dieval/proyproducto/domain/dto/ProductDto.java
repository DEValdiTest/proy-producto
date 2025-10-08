package pe.edu.dieval.proyproducto.domain.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductDto {

    private int id;
    private String sku;
    private String nombre;
    private String descripcion;
    private BigDecimal precio;

}
