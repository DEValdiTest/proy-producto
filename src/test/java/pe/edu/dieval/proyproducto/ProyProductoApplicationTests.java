package pe.edu.dieval.proyproducto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pe.edu.dieval.proyproducto.application.facade.ProductoFacade;
import pe.edu.dieval.proyproducto.domain.dto.Producto;
import pe.edu.dieval.proyproducto.domain.port.ProductRepositoryPort;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
class ProyProductoApplicationTests {

    ProductoFacade productoFacade;
    ProductRepositoryPort productRepositoryPort;
    @BeforeEach
    void setUp(){
        productRepositoryPort = mock(ProductRepositoryPort.class);
        productoFacade = new ProductoFacade(productRepositoryPort);
    }
    @Test
    void contextLoads() {

        Producto producto = new Producto();
        producto.setSku("154236");
        producto.setNombre("Panadol para dolor de cabeza");
        producto.setPrecio(new BigDecimal("3.2"));

        when(productRepositoryPort.obtenerProductoPorSku("154236")).thenReturn(producto);

        Producto productoResponse = productoFacade.obtenerProducto("154236","panad");

        assertFalse(productoResponse.getPrecio().compareTo(BigDecimal.ZERO)>0);


    }

}
