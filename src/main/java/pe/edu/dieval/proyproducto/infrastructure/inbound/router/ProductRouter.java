package pe.edu.dieval.proyproducto.infrastructure.inbound.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import pe.edu.dieval.proyproducto.infrastructure.inbound.handler.ProductHandler;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class ProductRouter {

    @Bean
    public RouterFunction<ServerResponse> routesProduct(ProductHandler productHandler) {
        return route(GET("/product"), productHandler::getProduct)
                .andRoute(POST("/product"), productHandler::addProduct)
                .andRoute(DELETE("/product"), productHandler::deleteProduct);
    }
}
